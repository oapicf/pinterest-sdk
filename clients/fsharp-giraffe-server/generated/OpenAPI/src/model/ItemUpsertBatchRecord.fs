namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributesRequest

module ItemUpsertBatchRecord =

  //#region ItemUpsertBatchRecord


  type ItemUpsertBatchRecord = {
    ItemId : string;
    Attributes : ItemAttributesRequest;
  }
  //#endregion
