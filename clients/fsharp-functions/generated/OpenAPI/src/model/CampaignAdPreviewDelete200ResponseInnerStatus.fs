namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibStatus204

module CampaignAdPreviewDelete200ResponseInnerStatus =

  //#region CampaignAdPreviewDelete200ResponseInnerStatus

  [<CLIMutable>]
  type CampaignAdPreviewDelete200ResponseInnerStatus = {
    [<JsonProperty(PropertyName = "statusCode")>]
    StatusCode : decimal;
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
