namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributesRequest

module CatalogsUpsertRetailItem =

  //#region CatalogsUpsertRetailItem

  [<CLIMutable>]
  type CatalogsUpsertRetailItem = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributesRequest;
  }

  //#endregion
