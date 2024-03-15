namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UpdatableItemAttributes
open OpenAPI.Model.UpdateMaskFieldType

module ItemUpdateBatchRecord =

  //#region ItemUpdateBatchRecord


  type ItemUpdateBatchRecord = {
    ItemId : string;
    Attributes : UpdatableItemAttributes;
    UpdateMask : UpdateMaskFieldType[];
  }
  //#endregion
