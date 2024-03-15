namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecSHOPPINGRETARGETING

module TargetingSpec =

  //#region TargetingSpec

  [<CLIMutable>]
  type TargetingSpec = {
    [<JsonProperty(PropertyName = "AGE_BUCKET")>]
    AGE_BUCKET : string[];
    [<JsonProperty(PropertyName = "APPTYPE")>]
    APPTYPE : string[];
    [<JsonProperty(PropertyName = "AUDIENCE_EXCLUDE")>]
    AUDIENCE_EXCLUDE : string[];
    [<JsonProperty(PropertyName = "AUDIENCE_INCLUDE&#39;")>]
    AUDIENCE_INCLUDE : string[];
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : string[];
    [<JsonProperty(PropertyName = "GEO")>]
    GEO : string[];
    [<JsonProperty(PropertyName = "INTEREST")>]
    INTEREST : string[];
    [<JsonProperty(PropertyName = "LOCALE")>]
    LOCALE : string[];
    [<JsonProperty(PropertyName = "LOCATION")>]
    LOCATION : string[];
    [<JsonProperty(PropertyName = "SHOPPING_RETARGETING")>]
    SHOPPING_RETARGETING : TargetingSpecSHOPPINGRETARGETING[];
    [<JsonProperty(PropertyName = "TARGETING_STRATEGY")>]
    TARGETING_STRATEGY : string[];
  }

  //#endregion
