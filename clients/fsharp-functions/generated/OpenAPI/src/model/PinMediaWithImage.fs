namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageMetadataImages
open OpenAPI.Model.PinMedia

module PinMediaWithImage =

  //#region PinMediaWithImage

  [<CLIMutable>]
  type PinMediaWithImage = {
    [<JsonProperty(PropertyName = "images")>]
    Images : ImageMetadataImages;
  }

  //#endregion
