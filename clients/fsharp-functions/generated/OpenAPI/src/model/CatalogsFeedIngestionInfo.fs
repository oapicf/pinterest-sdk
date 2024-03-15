namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedIngestionInfo =

  //#region CatalogsFeedIngestionInfo

  [<CLIMutable>]
  type CatalogsFeedIngestionInfo = {
    [<JsonProperty(PropertyName = "IN_STOCK")>]
    IN_STOCK : int;
    [<JsonProperty(PropertyName = "OUT_OF_STOCK")>]
    OUT_OF_STOCK : int;
    [<JsonProperty(PropertyName = "PREORDER")>]
    PREORDER : int;
  }

  //#endregion
