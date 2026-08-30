namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignAdPreviewDelete200ResponseInnerStatus

module CampaignAdPreviewDelete200ResponseInner =

  //#region CampaignAdPreviewDelete200ResponseInner

  [<CLIMutable>]
  type CampaignAdPreviewDelete200ResponseInner = {
    [<JsonProperty(PropertyName = "status")>]
    Status : CampaignAdPreviewDelete200ResponseInnerStatus;
  }

  //#endregion
