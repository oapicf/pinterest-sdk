namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributes

module ItemBatchRecord =

  //#region ItemBatchRecord


  type ItemBatchRecord = {
    ItemId : string;
    Attributes : ItemAttributes;
  }
  //#endregion
