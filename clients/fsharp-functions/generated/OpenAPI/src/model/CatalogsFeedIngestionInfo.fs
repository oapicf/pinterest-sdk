namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedIngestionInfo =

  //#region CatalogsFeedIngestionInfo

  [<CLIMutable>]
  type CatalogsFeedIngestionInfo = {
    [<JsonProperty(PropertyName = "in_stock")>]
    InStock : int;
    [<JsonProperty(PropertyName = "out_of_stock")>]
    OutOfStock : int;
    [<JsonProperty(PropertyName = "preorder")>]
    Preorder : int;
  }

  //#endregion
