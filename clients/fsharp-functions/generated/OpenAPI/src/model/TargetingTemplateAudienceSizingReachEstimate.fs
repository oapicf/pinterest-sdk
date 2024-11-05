namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TargetingTemplateAudienceSizingReachEstimate =

  //#region TargetingTemplateAudienceSizingReachEstimate

  [<CLIMutable>]
  type TargetingTemplateAudienceSizingReachEstimate = {
    [<JsonProperty(PropertyName = "estimate")>]
    Estimate : int64;
    [<JsonProperty(PropertyName = "lower_bound")>]
    LowerBound : int64;
    [<JsonProperty(PropertyName = "upper_bound")>]
    UpperBound : int64;
  }

  //#endregion
