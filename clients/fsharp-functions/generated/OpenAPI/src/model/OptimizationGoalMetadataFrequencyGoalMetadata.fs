namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OptimizationGoalMetadataFrequencyGoalMetadata =

  //#region OptimizationGoalMetadataFrequencyGoalMetadata

  [<CLIMutable>]
  type OptimizationGoalMetadataFrequencyGoalMetadata = {
    [<JsonProperty(PropertyName = "frequency")>]
    Frequency : int;
    [<JsonProperty(PropertyName = "timerange")>]
    Timerange : string;
  }

  //#endregion
