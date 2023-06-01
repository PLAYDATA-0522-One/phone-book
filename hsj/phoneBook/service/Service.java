package service;

import controller.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Service {
    private static Service instance;
    public Scanner sc = new Scanner(System.in);
    static private List<PhoneNumber> list = new ArrayList<>();

    public void insert(String number, String region, String name, String sex) {
        PhoneNumber phoneNumber = new PhoneNumber(number, region, name, sex);
        list.add(phoneNumber);
    }

    public void find(String number) {
        int count = 0;
        while (true) {
            if (list.get(count).getNumber().equals(number)) {
                System.out.println(list.get(count));
                break;
            } else {
                count++;
            }
        }

    }

    public void update(String number, String region, String name, String sex) {
        int count = 0;
        while (true) {
            if (list.get(count).getNumber().equals(number)) {
                System.out.println(list.get(count));
                list.get(count).setRegion(region);
                list.get(count).setName(name);
                list.get(count).setSex(sex);
                System.out.println(list.get(count));
                break;
            } else {
                count++;
            }
        }
    }

    public void delete(String number) {
        int count = 0;
        while (true) {
            if (list.get(count).getNumber().equals(number)) {
                System.out.println(list.get(count));
                list.remove(count);
                System.out.println(list);
                break;
            } else {
                count++;
            }
        }

    }

    public void findAll() {
        System.out.println(list);
    }

    public void filter(String str) {
        for (PhoneNumber phoneNumber : list) {
            if (phoneNumber.getRegion().equals(str)) {
                System.out.println(phoneNumber);
            }
            else if (phoneNumber.getName().equals(str)) {
                System.out.println(phoneNumber);
            }
            else if (phoneNumber.getSex().equals(str)) {
                System.out.println(phoneNumber);
            }
        }
    }
    public static Service getInstance() {
        if (instance == null) instance = new Service();
        return instance;
    }

}

class PhoneNumber {
    String  number;
    String region;
    String name;
    String sex;

    public PhoneNumber(String number, String region, String name, String sex) {
        this.number = number;
        this.region = region;
        this.name = name;
        this.sex = sex;
    }

    public String getNumber() {
        return number;
    }

    public String getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number=" + number +
                ", region='" + region + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}