namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributes

module ItemUpsertBatchRecord =

  //#region ItemUpsertBatchRecord

  [<CLIMutable>]
  type ItemUpsertBatchRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributes;
  }

  //#endregion
