namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignCreateResponseData
open OpenAPI.Model.Exception

module CampaignCreateResponseItem =

  //#region CampaignCreateResponseItem

  [<CLIMutable>]
  type CampaignCreateResponseItem = {
    [<JsonProperty(PropertyName = "data")>]
    Data : CampaignCreateResponseData;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : Exception[];
  }

  //#endregion
