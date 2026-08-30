namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinterestLibError

module CampaignAdPreviewCreate200ResponseInnerDataOneOf =

  //#region CampaignAdPreviewCreate200ResponseInnerDataOneOf

  [<CLIMutable>]
  type CampaignAdPreviewCreate200ResponseInnerDataOneOf = {
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : PinterestLibError;
  }

  //#endregion
