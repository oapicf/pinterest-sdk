namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemAttributes
open OpenAPI.Model.Pin

module CatalogsRetailItemResponse =

  //#region CatalogsRetailItemResponse

  [<CLIMutable>]
  type CatalogsRetailItemResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributes;
  }

  //#endregion
