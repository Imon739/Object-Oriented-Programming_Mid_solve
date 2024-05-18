package Num03.transport;

public class Vehicle {
    int noOfWheels;
    public Vehicle(int noOfWheels){
    this.noOfWheels = noOfWheels;
    }

    public class Bus extends Vehicle {
        private int licenseNo;
        Bus(int licenseNo){
        super(4);
        this.licenseNo = licenseNo;
        }
        public void setLicenseNo(int a){
        licenseNo=a;
        }
        public int getLicenseNo(){
        return licenseNo;
        }
        public int getnoOfwheels(){
        return noOfWheels;
        }
       }
   }
    
