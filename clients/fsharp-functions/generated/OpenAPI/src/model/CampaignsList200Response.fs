namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignResponse
open OpenAPI.Model.string option

module CampaignsList200Response =

  //#region CampaignsList200Response

  [<CLIMutable>]
  type CampaignsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CampaignResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
