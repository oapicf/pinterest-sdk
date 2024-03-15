namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdPreviewCreateFromImage =

  //#region AdPreviewCreateFromImage

  [<CLIMutable>]
  type AdPreviewCreateFromImage = {
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
