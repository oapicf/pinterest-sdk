namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignAdPreviewCreate200ResponseInnerData

module CampaignAdPreviewCreate200ResponseInner =

  //#region CampaignAdPreviewCreate200ResponseInner

  [<CLIMutable>]
  type CampaignAdPreviewCreate200ResponseInner = {
    [<JsonProperty(PropertyName = "data")>]
    Data : CampaignAdPreviewCreate200ResponseInnerData;
  }

  //#endregion
