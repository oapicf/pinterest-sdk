namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RetailLocalInventoryItemAttributes

module LocalInventoryUpsertOperation =

  //#region LocalInventoryUpsertOperation

  [<CLIMutable>]
  type LocalInventoryUpsertOperation = {
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
