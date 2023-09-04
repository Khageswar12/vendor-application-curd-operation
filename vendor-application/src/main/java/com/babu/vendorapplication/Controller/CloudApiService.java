package com.babu.vendorapplication.Controller;

import com.babu.vendorapplication.Model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cldv")
public class CloudApiService {
    CloudVendor cloudVendor;
     @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
//     return new CloudVendor("c1","suraj","bangle","764374844") ;
         return cloudVendor;
    }
    @PostMapping
    public String creatCloudVendorDetails(@RequestBody CloudVendor  cloudVendor){
         this.cloudVendor=cloudVendor;
         return "cloud vendor create successfully...";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor  cloudVendor){
        this.cloudVendor=cloudVendor;
        return "cloud vendor Updated successfully...";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor=null;
        return "cloud vendor deleted successfully...";
    }



}
