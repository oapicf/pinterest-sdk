namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsRetailItemsPostFilter =

  //#region CatalogsRetailItemsPostFilter

  [<CLIMutable>]
  type CatalogsRetailItemsPostFilter = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "item_ids")>]
    ItemIds : string[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
