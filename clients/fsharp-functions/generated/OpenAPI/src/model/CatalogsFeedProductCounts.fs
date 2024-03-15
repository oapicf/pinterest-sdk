namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedProductCounts =

  //#region CatalogsFeedProductCounts

  [<CLIMutable>]
  type CatalogsFeedProductCounts = {
    [<JsonProperty(PropertyName = "original")>]
    Original : int;
    [<JsonProperty(PropertyName = "ingested")>]
    Ingested : int;
  }

  //#endregion
