namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingTemplateAudienceSizingReachEstimate

module TargetingTemplateAudienceSizing =

  //#region TargetingTemplateAudienceSizing

  [<CLIMutable>]
  type TargetingTemplateAudienceSizing = {
    [<JsonProperty(PropertyName = "reach_estimate")>]
    ReachEstimate : TargetingTemplateAudienceSizingReachEstimate;
  }

  //#endregion
