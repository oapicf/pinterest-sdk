namespace OpenAPI.Model

open System
open System.Collections.Generic

module BillingProfilesResponse =

  //#region BillingProfilesResponse

  //#region enums
  type BillingTypeEnum = CREDITCARDEnum of string  |  INVOICEEnum of string  |  INTERNALEnum of string  |  RECURRINGEnum of string  |  PREPAIDEnum of string  
  //#endregion
  //#region enums
  type CardTypeEnum = UNKNOWNEnum of string  |  VISAEnum of string  |  MASTERCARDEnum of string  |  AMERICANEXPRESSEnum of string  |  DISCOVEREnum of string  |  ELOEnum of string  
  //#endregion
  //#region enums
  type PaymentMethodBrandEnum = UNKNOWNEnum of string  |  VISAEnum of string  |  MASTERCARDEnum of string  |  AMERICANEXPRESSEnum of string  |  DISCOVEREnum of string  |  SOFORTEnum of string  |  DINERSCLUBEnum of string  |  ELOEnum of string  |  CARTEBANCAIREEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = UNSPECIFIEDEnum of string  |  VALIDEnum of string  |  INVALIDEnum of string  |  PENDINGEnum of string  |  DELETEDEnum of string  |  SECONDARYEnum of string  |  PENDINGSECONDARYEnum of string  
  //#endregion

  type BillingProfilesResponse = {
    AdvertiserId : string;
    BillingType : BillingTypeEnum;
    CardType : CardTypeEnum;
    Id : string;
    PaymentMethodBrand : PaymentMethodBrandEnum;
    Status : StatusEnum;
  }
  //#endregion
