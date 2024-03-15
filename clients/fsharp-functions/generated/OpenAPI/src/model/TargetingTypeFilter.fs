namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdsAnalyticsTargetingType

module TargetingTypeFilter =

  //#region TargetingTypeFilter

  [<CLIMutable>]
  type TargetingTypeFilter = {
    [<JsonProperty(PropertyName = "targeting_types")>]
    TargetingTypes : AdsAnalyticsTargetingType[];
  }

  //#endregion
