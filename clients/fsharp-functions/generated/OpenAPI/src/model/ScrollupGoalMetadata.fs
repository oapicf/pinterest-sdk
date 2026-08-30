namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module ScrollupGoalMetadata =

  //#region ScrollupGoalMetadata

  [<CLIMutable>]
  type ScrollupGoalMetadata = {
    [<JsonProperty(PropertyName = "scrollup_goal_value_in_micro_currency")>]
    ScrollupGoalValueInMicroCurrency : string option;
  }

  //#endregion
