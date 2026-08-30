namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocalStore
open OpenAPI.Model.string option

module CatalogsLocalStoresList200Response =

  //#region CatalogsLocalStoresList200Response

  [<CLIMutable>]
  type CatalogsLocalStoresList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : LocalStore[];
  }

  //#endregion
