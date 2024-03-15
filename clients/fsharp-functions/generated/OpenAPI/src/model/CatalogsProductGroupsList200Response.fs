namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupsList200ResponseAllOfItemsInner
open OpenAPI.Model.string option

module CatalogsProductGroupsList200Response =

  //#region CatalogsProductGroupsList200Response

  [<CLIMutable>]
  type CatalogsProductGroupsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsProductGroupsList200ResponseAllOfItemsInner[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
