namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module OptimizationGoalMetadataScrollupGoalMetadata =

  //#region OptimizationGoalMetadataScrollupGoalMetadata

  [<CLIMutable>]
  type OptimizationGoalMetadataScrollupGoalMetadata = {
    [<JsonProperty(PropertyName = "scrollup_goal_value_in_micro_currency")>]
    ScrollupGoalValueInMicroCurrency : string option;
  }

  //#endregion
