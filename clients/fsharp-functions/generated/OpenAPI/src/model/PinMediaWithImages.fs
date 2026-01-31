namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageMetadata

module PinMediaWithImages =

  //#region PinMediaWithImages

  [<CLIMutable>]
  type PinMediaWithImages = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ImageMetadata[];
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : string;
  }

  //#endregion
