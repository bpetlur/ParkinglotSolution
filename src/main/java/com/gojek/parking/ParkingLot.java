package com.gojek.parking;

import java.io.*;

public class ParkingLot {

    public static void main(String args[]){


        //Read input command and read from file.

        BufferedReader reader = null;
        String inputCmd;

        int noOfArgs = args.length;

        try{

            if(noOfArgs == 0){  //Interactive mode : read command from terminal

                while(true){

                    reader = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        inputCmd = reader.readLine().trim();
                        System.out.println("inputCmd :"+inputCmd);

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }

            }else if(noOfArgs == 1){ //Read commands from arguement list

                File inputFile = new File(args[0]);
                try {
                    reader = new BufferedReader(new FileReader(inputFile));
                    while((inputCmd = reader.readLine()) != null) {
                        inputCmd = inputCmd.trim();
                        System.out.println("inputCmd :"+inputCmd);
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(reader !=null)
                    reader.close();
            }catch (IOException e){

            }
        }

    }
}
