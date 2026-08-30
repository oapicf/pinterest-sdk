namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignBatchItem

module CampaignBatchWriteResponseModel =

  //#region CampaignBatchWriteResponseModel

  [<CLIMutable>]
  type CampaignBatchWriteResponseModel = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CampaignBatchItem[];
  }

  //#endregion
