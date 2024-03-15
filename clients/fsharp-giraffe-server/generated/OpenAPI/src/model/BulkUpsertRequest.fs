namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkUpsertRequestCreate
open OpenAPI.Model.BulkUpsertRequestUpdate

module BulkUpsertRequest =

  //#region BulkUpsertRequest


  type BulkUpsertRequest = {
    Create : BulkUpsertRequestCreate;
    Update : BulkUpsertRequestUpdate;
  }
  //#endregion
