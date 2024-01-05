package com.rpc.$h_hashmap;

import java.util.HashMap;

public class ExcerAHashMap {

    public static void main(String[] args) {
        HashMap<Student, String> stuFath = new HashMap<>();
        Student ramesh = Student.builder()
                .name("ramesh").rollNo(1)
                .build();

        stuFath.put(ramesh, "manishchandra");

        String fathname = stuFath.get(ramesh);
        System.out.println(fathname);
        /**
         * Here Student class doesn't override equals and hashcode method.
         * we are able to get the value using the reference of Student as key, which is used to store value. By using map.get() method
         */


        /**
         * if we change anything in the object referenced by that variable, for now name, and try to retrieve value using it will still return the stored value
         */
        ramesh.setName("prakash");

        fathname = stuFath.get(ramesh);
        System.out.println("changed student's name and trying to retrieve value");
        System.out.println(fathname);
        /**
         * we got the same result. We are able to retrieve stored value.
         */


        /**
         * Now we create Student object using same field values
         * and try to retrieve value from map
         */

        Student sameStu = Student.builder().name("prakash").rollNo(1).build();
        fathname = stuFath.get(sameStu);
        System.out.println("created new Student object using same field value");
        System.out.println("and retrieving value");
        System.out.println(fathname);

        /**
         * manishchandra
         * changed student's name and trying to retrieve value
         * manishchandra
         * created new Student object using same field value
         * and retrieving value
         * null
         */

        com.rpc.$g_hashset.Student parag = com.rpc.$g_hashset.Student.builder()
                .name("parag")
                .rollNo(66)
                .build();

        HashMap<com.rpc.$g_hashset.Student, String> stuFath2 = new HashMap<com.rpc.$g_hashset.Student, String>();
        stuFath2.put(parag, "panparag");
        System.out.println("lets print stufath2");
        System.out.println(stuFath2);
        /**
         * {Student(name=parag, rollNo=66)=panparag}
         */

        /**
         * Lets retrieve data using Student having name parag and rollNo, 66
         */
        fathname = stuFath2.get(com.rpc.$g_hashset.Student.builder().name("parag").rollNo(66).build());
        System.out.println(fathname);
        /**
         * we got panparag
         */


        /**
         * Assume someone knows stored value and using that it has change the password (Our Key)
         */
        stuFath2.keySet().forEach((com.rpc.$g_hashset.Student stu) -> {
            if(stuFath2.get(stu).equals("panparag"))
                stu.setRollNo(-1);
        });

        /**
         * Lets retrieve data using Student having name parag and rollNo, 66 AGAIN
         * after someone has changed the password
         */
        fathname = stuFath2.get(com.rpc.$g_hashset.Student.builder().name("parag").rollNo(66).build());
        System.out.println(fathname);
        /**
         * we got null here as password got changed
         */


        /**
         * but what if we use the key (reference variable) using which value was stored earlier
         * first check what that reference variable has as its value
         */

        System.out.println(parag);
        fathname = stuFath2.get(parag);
        System.out.println(fathname);

        /**
         * asked chatgpt
         * ^
         * |
         * |
         * can you explain in details why this behavior - is there anything to do with the way hashmap stores value?
         * ChatGPT
         *
         * Certainly! The behavior observed is primarily due to how HashMap works internally.
         *
         * When an object is used as a key in a HashMap, its hash code is calculated and used to determine the bucket where the key-value pair should be stored. Later, when you try to retrieve a value using a key, the HashMap uses the key's hash code to locate the appropriate bucket and then compares the keys using their equals() method to find the correct entry within that bucket.
         *
         * In your scenario:
         *
         * Initially, parag is used as a key, and its hash code determines its storage location in the HashMap.
         *
         * Later, when parag's rollNo is changed, its hash code changes too (if hashCode() method considers the rollNo). This means that the location calculated based on the original hash code no longer matches the modified hash code of parag.
         *
         * When you attempt to retrieve the value using a new instance of Student (with the same attributes as the original parag), its hash code might differ due to the modified rollNo, leading to a different bucket lookup. Consequently, the HashMap cannot find the associated value, resulting in a null return.
         * Even when you use the original parag reference to retrieve the value from the HashMap, if the hash code of parag has changed, the HashMap might still fail to locate the value associated with the modified parag, resulting in null.
         *
         * This behavior highlights the importance of using immutable objects as keys in HashMap or any other hash-based collection. Modifying a key object after it's been used as a key in a HashMap can lead to unpredictable behavior, as the hash code, and consequently the retrieval mechanism, might no longer match the original structure.
         *
         *
         *
         */






    }
}
