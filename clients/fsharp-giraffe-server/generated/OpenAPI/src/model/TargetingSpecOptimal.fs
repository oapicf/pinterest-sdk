namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecAgeBucket
open OpenAPI.Model.TargetingSpecAppType
open OpenAPI.Model.TargetingSpecGender
open OpenAPI.Model.TargetingSpecShoppingRetargeting
open OpenAPI.Model.TargetingStrategy

module TargetingSpecOptimal =

  //#region TargetingSpecOptimal


  type TargetingSpecOptimal = {
    AGE_BUCKET : TargetingSpecAgeBucket[];
    APPTYPE : TargetingSpecAppType[];
    AUDIENCE_EXCLUDE : string[];
    AUDIENCE_INCLUDE : string[];
    GENDER : TargetingSpecGender[];
    GEO : string[];
    GEO_EXCLUDE : string[];
    INTEREST : string[];
    LOCALE : string[];
    LOCATION : string[];
    LOCATION_EXCLUDE : string[];
    MAXIMUM_AGE : string;
    MINIMUM_AGE : string;
    SHOPPING_RETARGETING : TargetingSpecShoppingRetargeting[];
    TARGETING_STRATEGY : TargetingStrategy[];
  }
  //#endregion
