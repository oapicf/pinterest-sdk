namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributesRequest

module ItemUpsertBatchRecord =

  //#region ItemUpsertBatchRecord

  [<CLIMutable>]
  type ItemUpsertBatchRecord = {
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributesRequest;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
  }

  //#endregion
