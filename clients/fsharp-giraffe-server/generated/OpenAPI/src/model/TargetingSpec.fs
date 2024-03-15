namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecSHOPPINGRETARGETING

module TargetingSpec =

  //#region TargetingSpec

  //#region enums
  type AGEBUCKETEnum[] = _1824Enum of string[]  |  _21Enum of string[]  |  _2534Enum of string[]  |  _3544Enum of string[]  |  _4549Enum of string[]  |  _5054Enum of string[]  |  _5564Enum of string[]  |  _65Enum of string[]  
  //#endregion
  //#region enums
  type APPTYPEEnum[] = AndroidMobileEnum of string[]  |  AndroidTabletEnum of string[]  |  IpadEnum of string[]  |  IphoneEnum of string[]  |  WebEnum of string[]  |  WebMobileEnum of string[]  
  //#endregion
  //#region enums
  type GENDEREnum[] = UnknownEnum of string[]  |  MaleEnum of string[]  |  FemaleEnum of string[]  
  //#endregion
  //#region enums
  type TARGETINGSTRATEGYEnum[] = CHOOSEYOUROWNEnum of string[]  |  FINDNEWCUSTOMERSEnum of string[]  |  RECONNECTWITHUSERSEnum of string[]  
  //#endregion

  type TargetingSpec = {
    AGE_BUCKET : AGEBUCKETEnum[];
    APPTYPE : APPTYPEEnum[];
    AUDIENCE_EXCLUDE : string[];
    AUDIENCE_INCLUDE : string[];
    GENDER : GENDEREnum[];
    GEO : string[];
    INTEREST : string[];
    LOCALE : string[];
    LOCATION : string[];
    SHOPPING_RETARGETING : TargetingSpecSHOPPINGRETARGETING[];
    TARGETING_STRATEGY : TARGETINGSTRATEGYEnum[];
  }
  //#endregion
