namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsProductGroupProductCounts =

  //#region CatalogsProductGroupProductCounts

  [<CLIMutable>]
  type CatalogsProductGroupProductCounts = {
    [<JsonProperty(PropertyName = "in_stock")>]
    InStock : decimal;
    [<JsonProperty(PropertyName = "out_of_stock")>]
    OutOfStock : decimal;
    [<JsonProperty(PropertyName = "preorder")>]
    Preorder : decimal;
    [<JsonProperty(PropertyName = "total")>]
    Total : decimal;
  }

  //#endregion
