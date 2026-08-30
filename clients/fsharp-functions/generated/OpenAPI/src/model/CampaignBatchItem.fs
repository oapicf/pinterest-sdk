namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignBatchResponseData
open OpenAPI.Model.Exception

module CampaignBatchItem =

  //#region CampaignBatchItem

  [<CLIMutable>]
  type CampaignBatchItem = {
    [<JsonProperty(PropertyName = "data")>]
    Data : CampaignBatchResponseData;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : Exception[];
  }

  //#endregion
