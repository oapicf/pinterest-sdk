namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdPreviewCreateFromImage
open OpenAPI.Model.AdPreviewCreateFromPin

module AdPreviewRequest =

  //#region AdPreviewRequest

  [<CLIMutable>]
  type AdPreviewRequest = {
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
