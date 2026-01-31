namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageSize

module PinMediaWithImage =

  //#region PinMediaWithImage

  [<CLIMutable>]
  type PinMediaWithImage = {
    [<JsonProperty(PropertyName = "images")>]
    Images : ImageSize;
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : string;
  }

  //#endregion
