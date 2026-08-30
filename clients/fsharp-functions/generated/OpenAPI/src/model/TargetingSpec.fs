namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecAgeBucket
open OpenAPI.Model.TargetingSpecAppType
open OpenAPI.Model.TargetingSpecGender
open OpenAPI.Model.TargetingSpecShoppingRetargeting

module TargetingSpec =

  //#region TargetingSpec

  [<CLIMutable>]
  type TargetingSpec = {
    [<JsonProperty(PropertyName = "AGE_BUCKET")>]
    AGE_BUCKET : TargetingSpecAgeBucket[];
    [<JsonProperty(PropertyName = "APPTYPE")>]
    APPTYPE : TargetingSpecAppType[];
    [<JsonProperty(PropertyName = "AUDIENCE_EXCLUDE")>]
    AUDIENCE_EXCLUDE : string[];
    [<JsonProperty(PropertyName = "AUDIENCE_INCLUDE")>]
    AUDIENCE_INCLUDE : string[];
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : TargetingSpecGender[];
    [<JsonProperty(PropertyName = "GEO")>]
    GEO : string[];
    [<JsonProperty(PropertyName = "GEO_EXCLUDE")>]
    GEO_EXCLUDE : string[];
    [<JsonProperty(PropertyName = "INTEREST")>]
    INTEREST : string[];
    [<JsonProperty(PropertyName = "LOCALE")>]
    LOCALE : string[];
    [<JsonProperty(PropertyName = "LOCATION")>]
    LOCATION : string[];
    [<JsonProperty(PropertyName = "LOCATION_EXCLUDE")>]
    LOCATION_EXCLUDE : string[];
    [<JsonProperty(PropertyName = "MAXIMUM_AGE")>]
    MAXIMUM_AGE : string;
    [<JsonProperty(PropertyName = "MINIMUM_AGE")>]
    MINIMUM_AGE : string;
    [<JsonProperty(PropertyName = "SHOPPING_RETARGETING")>]
    SHOPPING_RETARGETING : TargetingSpecShoppingRetargeting[];
    [<JsonProperty(PropertyName = "TARGETING_STRATEGY")>]
    TARGETING_STRATEGY : string[];
  }

  //#endregion
