namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributes

module ItemUpsertBatchRecord =

  //#region ItemUpsertBatchRecord


  type ItemUpsertBatchRecord = {
    ItemId : string;
    Attributes : ItemAttributes;
  }
  //#endregion
