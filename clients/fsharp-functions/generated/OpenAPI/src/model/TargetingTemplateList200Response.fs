namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingTemplateResponseData
open OpenAPI.Model.string option

module TargetingTemplateList200Response =

  //#region TargetingTemplateList200Response

  [<CLIMutable>]
  type TargetingTemplateList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : TargetingTemplateResponseData[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
