package SystemClasses;

import java.io.Serializable;

public class ContractFactorty implements Serializable {
    public Contract makeContract(String contractType){
        if(contractType == "Rent")
            return new RentContract();
        else if(contractType == "Share")
            return new ShairingContract();
        else if(contractType == "Buy")
            return new SaleContract();
        
        else return null;      
    }
}
