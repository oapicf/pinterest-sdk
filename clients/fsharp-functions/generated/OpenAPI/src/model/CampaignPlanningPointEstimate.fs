namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.double option
open OpenAPI.Model.int option

module CampaignPlanningPointEstimate =

  //#region CampaignPlanningPointEstimate

  [<CLIMutable>]
  type CampaignPlanningPointEstimate = {
    [<JsonProperty(PropertyName = "budget")>]
    Budget : int;
    [<JsonProperty(PropertyName = "double_y")>]
    DoubleY : double option;
    [<JsonProperty(PropertyName = "max_y")>]
    MaxY : int option;
    [<JsonProperty(PropertyName = "min_y")>]
    MinY : int option;
    [<JsonProperty(PropertyName = "y")>]
    Y : int option;
  }

  //#endregion
