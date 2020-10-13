package com.company;

public class LuckySkyScraper {

    static public void floorList(int totalRealFloors){

        //loop through real floor numbers
        var fakeFloor = 1;
        for( var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("real floor: "  + realFloor + " --- " + "fake floor: " + fakeFloor);

            // add 1 to fakeFloor and continue to add 1 as long as fake floor ends with 4 or 13
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }
}
