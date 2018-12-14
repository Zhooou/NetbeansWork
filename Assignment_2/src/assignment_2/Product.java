/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

/**
 *
 * @author runyangzhou
 */
class Product {
    private String name;
    private double price;
    private int availNum;
    private String description;
    private Supplier supplier;

    public Product(String name, String price, String availNum, String description, Supplier supplier) {
        this.name = name;
        this.price = Double.parseDouble(price);
        this.availNum = Integer.parseInt(availNum);
        this.description = description;
        this.supplier = supplier;
    }
    
    public void view(){
        System.out.println("Name:" + this.getName() + "           Price:" + this.getPrice());
        System.out.println("Avaliable Number:" + this.getAvailNum() + "    Descripition:" + this.getDescription());
        System.out.println("Supplier Name:" + this.getSupplier().getName() + "    Supplier Address:" + this.getSupplier().getAddress());
    }
    
    public void update(String input){
        String[] info = input.split(",");
        switch(info.length){
            case 1:
                if(!info[0].equals("")){
                    this.name = info[0];
                }
                break;
            case 2:
                if(!info[0].equals("")){
                    this.name = info[0];
                }
                if(!info[1].equals("")){
                    this.price = Double.parseDouble(info[1]);
                }
                break;
            case 3:
                if(!info[0].equals("")){
                    this.name = info[0];
                }
                if(!info[1].equals("")){
                    this.price = Double.parseDouble(info[1]);
                }
                if(!info[2].equals("")){
                    this.availNum = Integer.parseInt(info[2]);
                }
                break;
            case 4:
                if(!info[0].equals("")){
                    this.name = info[0];
                }
                if(!info[1].equals("")){
                    this.price = Double.parseDouble(info[1]);
                }
                if(!info[2].equals("")){
                    this.availNum = Integer.parseInt(info[2]);
                }
                if(!info[3].equals("")){
                    this.description = info[3];
                }
                break;
            case 5:
                if(!info[0].equals("")){
                    this.name = info[0];
                }
                if(!info[1].equals("")){
                    this.price = Double.parseDouble(info[1]);
                }
                if(!info[2].equals("")){
                    this.availNum = Integer.parseInt(info[2]);
                }
                if(!info[3].equals("")){
                    this.description = info[3];
                }
                if(!info[4].equals("")){
                    this.getSupplier().setName(info[4]);
                }
                break;
            case 6:
                if(!info[0].equals("")){
                    this.name = info[0];
                }
                if(!info[1].equals("")){
                    this.price = Double.parseDouble(info[1]);
                }
                if(!info[2].equals("")){
                    this.availNum = Integer.parseInt(info[2]);
                }
                if(!info[3].equals("")){
                    this.description = info[3];
                }
                if(!info[4].equals("")){
                    this.getSupplier().setName(info[4]);
                }
                if(!info[5].equals("")){
                    this.getSupplier().setAddress(info[5]);
                }break;    
        };
    }
    
//    public void update(String name, String price, String availNum, String description, String supplierName, String supplierAddress){
//        if(!name.equals("")){
//            this.name = name;
//        }
//        if(!price.equals("")){
//            this.price = price;
//        }
//        if(!availNum.equals("")){
//            this.availNum = availNum;
//        }
//        if(!description.equals("")){
//            this.description = description;
//        }
//        if(!supplierName.equals("")){
//            this.getSupplier().setName(name);
//        }
//        if(!supplierAddress.equals("")){
//            this.getSupplier().setAddress(supplierAddress);
//        }
//    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return String.valueOf(price);
    }

    public void setPrice(String price) {
        this.price = Double.parseDouble(price);
    }

    public String getAvailNum() {
        return String.valueOf(availNum);
    }

    public void setAvailNum(String availNum) {
        this.availNum = Integer.valueOf(availNum);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    
}
