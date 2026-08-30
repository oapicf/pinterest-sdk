namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RetailLocalInventoryItemAttributesOptional

module LocalInventoryUpdateOperation =

  //#region LocalInventoryUpdateOperation

  [<CLIMutable>]
  type LocalInventoryUpdateOperation = {
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : RetailLocalInventoryItemAttributesOptional;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "store_code")>]
    StoreCode : string;
  }

  //#endregion
