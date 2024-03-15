namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignCreateResponseItem

module CampaignCreateResponse =

  //#region CampaignCreateResponse

  [<CLIMutable>]
  type CampaignCreateResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CampaignCreateResponseItem[];
  }

  //#endregion
