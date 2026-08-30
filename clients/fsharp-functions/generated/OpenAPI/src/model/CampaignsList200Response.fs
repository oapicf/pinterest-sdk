namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Campaign
open OpenAPI.Model.string option

module CampaignsList200Response =

  //#region CampaignsList200Response

  [<CLIMutable>]
  type CampaignsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Campaign[];
  }

  //#endregion
