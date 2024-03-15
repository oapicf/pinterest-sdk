namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AdsCreditDiscountsResponse =

  //#region AdsCreditDiscountsResponse

  //#region enums
  type DiscountTypeEnum = COUPONEnum of string option  |  CREDITEnum of string option  |  COUPONAPPLIEDEnum of string option  |  CREDITAPPLIEDEnum of string option  |  MARKETINGOFFERCREDITEnum of string option  |  MARKETINGOFFERCREDITAPPLIEDEnum of string option  |  GOODWILLCREDITEnum of string option  |  GOODWILLCREDITAPPLIEDEnum of string option  |  INTERNALCREDITEnum of string option  |  INTERNALCREDITAPPLIEDEnum of string option  |  PREPAIDCREDITEnum of string option  |  PREPAIDCREDITAPPLIEDEnum of string option  |  SALESINCENTIVECREDITEnum of string option  |  SALESINCENTIVECREDITAPPLIEDEnum of string option  |  CREDITEXPIREDEnum of string option  |  FUTURECREDITEnum of string option  |  REFERRALCREDITEnum of string option  |  INVOICESALESINCENTIVECREDITEnum of string option  |  INVOICESALESINCENTIVECREDITAPPLIEDEnum of string option  |  PREPAIDCREDITREFUNDEnum of string option  |  NullEnum of string option  
  //#endregion

  type AdsCreditDiscountsResponse = {
    Active : bool;
    AdvertiserId : string;
    DiscountType : DiscountTypeEnum;
    DiscountInMicroCurrency : decimal option;
    DiscountCurrency : string option;
    Title : string option;
    RemainingDiscountInMicroCurrency : decimal option;
  }
  //#endregion
