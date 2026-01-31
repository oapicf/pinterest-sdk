namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TemplateResponse
open OpenAPI.Model.string option

module TemplatesList200Response =

  //#region TemplatesList200Response

  [<CLIMutable>]
  type TemplatesList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : TemplateResponse[];
  }

  //#endregion
