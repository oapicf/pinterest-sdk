namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module ImageDetails =

  //#region ImageDetails

  [<CLIMutable>]
  type ImageDetails = {
    [<JsonProperty(PropertyName = "width")>]
    Width : int;
    [<JsonProperty(PropertyName = "height")>]
    Height : int option;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
