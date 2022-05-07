namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageDetails
open OpenAPI.Model.PinMedia
open OpenAPI.Model.PinMediaWithImageAllOf
open System.Collections.Generic

module PinMediaWithImage =

  //#region PinMediaWithImage

  [<CLIMutable>]
  type PinMediaWithImage = {
    [<JsonProperty(PropertyName = "images")>]
    Images : IDictionary<string, ImageDetails>;
  }

  //#endregion
