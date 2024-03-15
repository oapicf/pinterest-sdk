namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributes
open OpenAPI.Model.ItemCreateBatchRecord
open OpenAPI.Model.ItemDeleteBatchRecord
open OpenAPI.Model.ItemDeleteDiscontinuedBatchRecord
open OpenAPI.Model.ItemUpdateBatchRecord
open OpenAPI.Model.ItemUpsertBatchRecord
open OpenAPI.Model.UpdateMaskFieldType

module ItemBatchRecord =

  //#region ItemBatchRecord

  [<CLIMutable>]
  type ItemBatchRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributes;
    [<JsonProperty(PropertyName = "update_mask")>]
    UpdateMask : UpdateMaskFieldType[];
  }

  //#endregion
