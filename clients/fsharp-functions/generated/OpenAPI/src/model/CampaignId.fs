namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignId =

  //#region CampaignId

  [<CLIMutable>]
  type CampaignId = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
