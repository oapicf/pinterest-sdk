namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProduct
open OpenAPI.Model.string option

module CatalogsProductGroupPinsList200Response =

  //#region CatalogsProductGroupPinsList200Response

  [<CLIMutable>]
  type CatalogsProductGroupPinsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsProduct[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
