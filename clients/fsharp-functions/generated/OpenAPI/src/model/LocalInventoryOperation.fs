namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocalInventoryCreateOperation
open OpenAPI.Model.LocalInventoryDeleteOperation
open OpenAPI.Model.LocalInventoryUpdateOperation
open OpenAPI.Model.LocalInventoryUpsertOperation
open OpenAPI.Model.RetailLocalInventoryItemAttributes

module LocalInventoryOperation =

  //#region LocalInventoryOperation

  [<CLIMutable>]
  type LocalInventoryOperation = {
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : RetailLocalInventoryItemAttributes;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "store_code")>]
    StoreCode : string;
  }

  //#endregion
