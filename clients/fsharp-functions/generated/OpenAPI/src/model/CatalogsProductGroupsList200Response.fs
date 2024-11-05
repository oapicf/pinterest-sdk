namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.string option

module CatalogsProductGroupsList200Response =

  //#region CatalogsProductGroupsList200Response

  [<CLIMutable>]
  type CatalogsProductGroupsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsVerticalProductGroup[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
