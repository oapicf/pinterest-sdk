namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecAgeBucket
open OpenAPI.Model.TargetingSpecAppType
open OpenAPI.Model.TargetingSpecGender
open OpenAPI.Model.TargetingSpecShoppingRetargeting

module TargetingSpec =

  //#region TargetingSpec

  //#region enums
  type TARGETINGSTRATEGYEnum[] = CHOOSEYOUROWNEnum of string[]  |  FINDNEWCUSTOMERSEnum of string[]  |  RECONNECTWITHUSERSEnum of string[]  
  //#endregion

  type TargetingSpec = {
    AGE_BUCKET : TargetingSpecAgeBucket[];
    APPTYPE : TargetingSpecAppType[];
    AUDIENCE_EXCLUDE : string[];
    AUDIENCE_INCLUDE : string[];
    GENDER : TargetingSpecGender[];
    GEO : string[];
    INTEREST : string[];
    LOCALE : string[];
    LOCATION : string[];
    MAXIMUM_AGE : string;
    MINIMUM_AGE : string;
    SHOPPING_RETARGETING : TargetingSpecShoppingRetargeting[];
    TARGETING_STRATEGY : TARGETINGSTRATEGYEnum[];
  }
  //#endregion
