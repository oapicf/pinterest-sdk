namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageDetails

module ImageMetadataImages =

  //#region ImageMetadataImages

  [<CLIMutable>]
  type ImageMetadataImages = {
    [<JsonProperty(PropertyName = "150x150")>]
    _150x150 : ImageDetails;
    [<JsonProperty(PropertyName = "400x300")>]
    _400x300 : ImageDetails;
    [<JsonProperty(PropertyName = "600x")>]
    _600x : ImageDetails;
    [<JsonProperty(PropertyName = "1200x")>]
    _1200x : ImageDetails;
  }

  //#endregion
