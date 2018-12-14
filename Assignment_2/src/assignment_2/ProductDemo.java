/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

import java.util.Scanner;

/**
 *
 * @author runyangzhou
 */
public class ProductDemo {
    public static void main(String args[]){
//        System.out.println("test");
        System.out.println("-----------Product demo start-----------");
        System.out.println("--------------------------------------------");
        
        int productNo = 0;
        Product product;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("While input information, use comma as separator.");
        System.out.println("--------------------------------------------");
        System.out.println("Please create new product first:");
        String input = sc.nextLine();
        String[] info = input.split(",");
        while(info.length != 6 || info[0].equals("")||info[1].equals("")||info[2].equals("")||info[3].equals("")||info[4].equals("")){
            
            System.out.println("Wrong information format, please re-enter.");
            input = sc.nextLine();
            info = input.split(",");
        }
        product = new Product(info[0], info[1], info[2], info[3], new Supplier(info[4], info[5]));
        productNo ++;
        
        String demoControl = "1";
        while (demoControl.equals("1") || demoControl.equals("2") || demoControl.equals("3")){
            
            System.out.println("Please choose function:");
            System.out.println("1.Create 2.View 3.Update");
            
            demoControl = sc.nextLine();
            
            if(demoControl.equals("1")){
                System.out.println("Create new product");
                input = sc.nextLine();
                info = input.split(",");
                if(info.length != 6 || info[0].equals("")||info[1].equals("")||info[2].equals("")||info[3].equals("")||info[4].equals("")){
                    System.out.println("Wrong information format, create failed.");
                }
                else{
                    product = new Product(info[0], info[1], info[2], info[3], new Supplier(info[4], info[5]));
                    productNo++;
                }
            }
            else if(demoControl.equals("2")){
                System.out.println("Here is product information:");
                System.out.println("Product Number:"+ productNo);
                product.view();
            }
            else if(demoControl.equals("3")){
                input = sc.nextLine();
                info = input.split(",");
                System.out.println("Please input update information");
                product.update(input);
            }
            
        }
        System.out.println("--------------------------------------------");
        System.out.println("-----------Thanks for using demo-----------");
    }
}
