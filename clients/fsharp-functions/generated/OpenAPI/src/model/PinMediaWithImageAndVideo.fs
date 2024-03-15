namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMedia
open OpenAPI.Model.PinMediaMetadata

module PinMediaWithImageAndVideo =

  //#region PinMediaWithImageAndVideo

  [<CLIMutable>]
  type PinMediaWithImageAndVideo = {
    [<JsonProperty(PropertyName = "items")>]
    Items : PinMediaMetadata[];
  }

  //#endregion
