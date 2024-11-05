namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMedia
open OpenAPI.Model.PinMediaWithImageAllOfImages

module PinMediaWithImage =

  //#region PinMediaWithImage

  [<CLIMutable>]
  type PinMediaWithImage = {
    [<JsonProperty(PropertyName = "images")>]
    Images : PinMediaWithImageAllOfImages;
  }

  //#endregion
