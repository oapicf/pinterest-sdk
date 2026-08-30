namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FrequencyGoalMetadataTimerange

module FrequencyGoalMetadata =

  //#region FrequencyGoalMetadata

  [<CLIMutable>]
  type FrequencyGoalMetadata = {
    [<JsonProperty(PropertyName = "frequency")>]
    Frequency : int;
    [<JsonProperty(PropertyName = "timerange")>]
    Timerange : FrequencyGoalMetadataTimerange;
  }

  //#endregion
