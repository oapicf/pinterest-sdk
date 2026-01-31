namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageDetails

module ImageSize =

  //#region ImageSize

  [<CLIMutable>]
  type ImageSize = {
    [<JsonProperty(PropertyName = "1200x")>]
    _1200x : ImageDetails;
    [<JsonProperty(PropertyName = "150x150")>]
    _150x150 : ImageDetails;
    [<JsonProperty(PropertyName = "400x300")>]
    _400x300 : ImageDetails;
    [<JsonProperty(PropertyName = "600x")>]
    _600x : ImageDetails;
  }

  //#endregion
