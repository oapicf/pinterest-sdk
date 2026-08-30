namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LocalInventoryDeleteOperation =

  //#region LocalInventoryDeleteOperation

  [<CLIMutable>]
  type LocalInventoryDeleteOperation = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "store_code")>]
    StoreCode : string;
  }

  //#endregion
