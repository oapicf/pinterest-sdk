namespace OpenAPI.Model

open System
open System.Collections.Generic

module BillingProfilesResponse =

  //#region BillingProfilesResponse

  //#region enums
  type CardTypeEnum = UNKNOWNEnum of string  |  VISAEnum of string  |  MASTERCARDEnum of string  |  AMERICANEXPRESSEnum of string  |  DISCOVEREnum of string  |  ELOEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = UNSPECIFIEDEnum of string  |  VALIDEnum of string  |  INVALIDEnum of string  |  PENDINGEnum of string  |  DELETEDEnum of string  |  SECONDARYEnum of string  |  PENDINGSECONDARYEnum of string  
  //#endregion
  //#region enums
  type PaymentMethodBrandEnum = UNKNOWNEnum of string  |  VISAEnum of string  |  MASTERCARDEnum of string  |  AMERICANEXPRESSEnum of string  |  DISCOVEREnum of string  |  SOFORTEnum of string  |  DINERSCLUBEnum of string  |  ELOEnum of string  |  CARTEBANCAIREEnum of string  
  //#endregion

  type BillingProfilesResponse = {
    Id : string;
    CardType : CardTypeEnum;
    Status : StatusEnum;
    AdvertiserId : string;
    PaymentMethodBrand : PaymentMethodBrandEnum;
  }
  //#endregion
