namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributes
open OpenAPI.Model.ItemCreateBatchRecord
open OpenAPI.Model.ItemDeleteBatchRecord
open OpenAPI.Model.ItemDeleteDiscontinuedBatchRecord
open OpenAPI.Model.ItemUpdateBatchRecord
open OpenAPI.Model.ItemUpsertBatchRecord
open OpenAPI.Model.UpdateMaskFieldType

module ItemBatchRecord =

  //#region ItemBatchRecord


  type ItemBatchRecord = {
    ItemId : string;
    Attributes : ItemAttributes;
    UpdateMask : UpdateMaskFieldType[];
  }
  //#endregion
