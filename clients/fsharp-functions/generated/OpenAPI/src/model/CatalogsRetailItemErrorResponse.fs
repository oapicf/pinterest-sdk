namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemValidationEvent

module CatalogsRetailItemErrorResponse =

  //#region CatalogsRetailItemErrorResponse

  [<CLIMutable>]
  type CatalogsRetailItemErrorResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "item_response_kind")>]
    ItemResponseKind : string;
  }

  //#endregion
