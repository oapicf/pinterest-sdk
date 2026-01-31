namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UpdatableItemAttributes
open OpenAPI.Model.UpdateMaskFieldType

module ItemUpdateBatchRecord =

  //#region ItemUpdateBatchRecord


  type ItemUpdateBatchRecord = {
    Attributes : UpdatableItemAttributes;
    ItemId : string;
    UpdateMask : UpdateMaskFieldType[];
  }
  //#endregion
