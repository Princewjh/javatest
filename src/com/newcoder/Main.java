package com.newcoder;

import java.util.*;

public class Main {

    /**
     *
     * @param index 索引
     * @param object 对象
     */
    public static void print(int index, Object object){
        System.out.println(String.format("{%d}, %s",index,object.toString()));
    }

    public static void demoString(){
        String str = "Hello World";
        print(1, str.indexOf('x'));
        print(2,str.charAt(3));
        print(3,str.codePointAt(1)); //对应位置的ascii码
        print(4,str.compareToIgnoreCase("HELLO worLd"));
        print(5,str.compareTo("Hello Xorld"));
        print(6,str.compareTo("Hello Vorld"));
        print(7,str.contains("hello"));
        print(8,str.concat("!!!"));
        print(9,str.toUpperCase());
        print(10,str.endsWith("World"));
        print(11,str.startsWith("Hell"));
        print(12,str.replace('o','e'));
        print(13,str.replaceAll("o|l","a"));
        print(14,str.replaceAll("Hello","hi"));

        StringBuilder sb = new StringBuilder(); //可变的string对象，多线程不安全
        sb.append("x ");
        sb.append(1.3);
        sb.append(true);
        print(15,sb);
    }

    public static void demoControlFlow(){
        int a = 4;
        int target = a == 2 ? 1 : 3;
        print(1,target);

        //ABC
        String grade = "A";
        switch (grade){
            case "A" :
                print(2,">80");
                break;
            case "B":
                print(3,"60-80");
                break;
            case "C":
                print(4,"<60");
                break;
            default:
                print(5,"unkown");
                break;

        }
    }

    public static void demoList(){
        List<String> strList = new ArrayList<String>(10); //创建列表
        for(int i=0; i<4; ++i){
            strList.add(String.valueOf(i));
        }
        print(1,strList);
        List<String> strListB = new ArrayList<String>(10);
        for(int i=0; i<4; ++i){
            strListB.add(String.valueOf(i*i));
        }
        strList.addAll(strListB);//两个list合并
        print(2,strList);
        strList.remove(0);
        print(3,strList);
        strList.remove(String.valueOf(1));
        print(4,strList);
        print(5,strList.get(1));

        Collections.reverse(strList);//倒序
        print(6,strList);

        Collections.sort(strList);  //排序
        print(7,strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8,strList);

        for(String obj : strList){
            print(9,obj);
        }

        int[] array = new int[] {1,2,3,4};
        print(10,array[1]);


     }

     public static void demoMapTable(){
        Map<String, String> map = new HashMap<String,String>();
        for(int i=0; i<4; i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);
        for(Map.Entry<String,String> entry : map.entrySet()){
            print(2, entry.getKey() + "|" + entry.getValue());
         }
        print(3,map.values());
        print(4,map.keySet());
        print(5,map.get("3"));
        print(6,map.containsKey("A"));
        map.replace("3","27");
        print(7,map.get("3"));
     }

     public static void demoSet(){
        Set<String> strSet = new HashSet<>();
        for (int i=0;i<3;i++){
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        strSet.remove(String.valueOf(1));
        print(2,strSet);
        print(3,strSet.contains(String.valueOf(1)));
        print(4,strSet.isEmpty());
        print(5,strSet.size());

        strSet.addAll(Arrays.asList(new String[]{"A","B","C"}));
        print(6,strSet);
     }

     public static void demoException(){
        try{
            int k = 2;
//            k = k/0;
            if(k==2){
                throw new Exception("我故意");
            }
        }catch (Exception e){
            print(2,e.getMessage());

        }finally {
            print(3,"finally");
            //关掉一些东西
        }
     }
    public static void demoOO(){
        Animal a = new Animal("Jim",3);
        a.say();
    }
    public static void main(String[] args) {
//        print(1,"hello world");
//        demoString();
//        demoControlFlow();
//        demoList();
//        demoMapTable();
//        demoSet();
//        demoException();
        demoOO();

    }
}
