/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.PackageDetails;

import java.util.ArrayList;

/**
 *
 * @author asr
 */
public class PackageDetailsList {
    private ArrayList<PackageDetails> detailsList;

public PackageDetailsList(){
detailsList=new ArrayList<>();
}

public ArrayList<PackageDetails> getDetailsList() {
return detailsList;
}

public void setDetailsList(ArrayList<PackageDetails> detailsList) {
this.detailsList = detailsList;
}

public PackageDetails addDetails(){
PackageDetails p=new PackageDetails();
detailsList.add(p);
return p;

}
    
}
