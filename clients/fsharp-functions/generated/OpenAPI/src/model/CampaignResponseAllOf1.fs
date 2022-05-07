namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ObjectiveType

module CampaignResponseAllOf1 =

  //#region CampaignResponseAllOf1

  [<CLIMutable>]
  type CampaignResponseAllOf1 = {
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ObjectiveType;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
