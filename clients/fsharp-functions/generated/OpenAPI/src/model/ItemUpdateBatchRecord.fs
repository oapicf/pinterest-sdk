namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdatableItemAttributes
open OpenAPI.Model.UpdateMaskFieldType

module ItemUpdateBatchRecord =

  //#region ItemUpdateBatchRecord

  [<CLIMutable>]
  type ItemUpdateBatchRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : UpdatableItemAttributes;
    [<JsonProperty(PropertyName = "update_mask")>]
    UpdateMask : UpdateMaskFieldType[];
  }

  //#endregion
