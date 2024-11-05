namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsRetailProductGroupProductCounts =

  //#region CatalogsRetailProductGroupProductCounts

  [<CLIMutable>]
  type CatalogsRetailProductGroupProductCounts = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "in_stock")>]
    InStock : decimal;
    [<JsonProperty(PropertyName = "out_of_stock")>]
    OutOfStock : decimal;
    [<JsonProperty(PropertyName = "preorder")>]
    Preorder : decimal;
    [<JsonProperty(PropertyName = "total")>]
    Total : decimal;
    [<JsonProperty(PropertyName = "videos")>]
    Videos : decimal;
  }

  //#endregion
