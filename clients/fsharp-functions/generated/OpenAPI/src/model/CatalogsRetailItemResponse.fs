namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributes
open OpenAPI.Model.Pin

module CatalogsRetailItemResponse =

  //#region CatalogsRetailItemResponse

  [<CLIMutable>]
  type CatalogsRetailItemResponse = {
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributes;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "item_response_kind")>]
    ItemResponseKind : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
  }

  //#endregion
