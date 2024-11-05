namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributesRequest

module ItemCreateBatchRecord =

  //#region ItemCreateBatchRecord


  type ItemCreateBatchRecord = {
    ItemId : string;
    Attributes : ItemAttributesRequest;
  }
  //#endregion
