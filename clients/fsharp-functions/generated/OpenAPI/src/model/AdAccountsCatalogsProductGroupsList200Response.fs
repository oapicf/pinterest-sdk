namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogProductGroup
open OpenAPI.Model.string option

module AdAccountsCatalogsProductGroupsList200Response =

  //#region AdAccountsCatalogsProductGroupsList200Response

  [<CLIMutable>]
  type AdAccountsCatalogsProductGroupsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogProductGroup[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
