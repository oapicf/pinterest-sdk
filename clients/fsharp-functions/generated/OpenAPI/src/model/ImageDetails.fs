namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module ImageDetails =

  //#region ImageDetails

  [<CLIMutable>]
  type ImageDetails = {
    [<JsonProperty(PropertyName = "height")>]
    Height : int option;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "width")>]
    Width : int option;
  }

  //#endregion
