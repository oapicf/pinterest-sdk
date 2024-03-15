namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageMetadata
open OpenAPI.Model.PinMedia

module PinMediaWithImages =

  //#region PinMediaWithImages

  [<CLIMutable>]
  type PinMediaWithImages = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ImageMetadata[];
  }

  //#endregion
