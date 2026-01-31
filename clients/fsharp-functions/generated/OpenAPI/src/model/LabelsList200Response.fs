namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelsResponse
open OpenAPI.Model.string option

module LabelsList200Response =

  //#region LabelsList200Response

  [<CLIMutable>]
  type LabelsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : LabelsResponse[];
  }

  //#endregion
