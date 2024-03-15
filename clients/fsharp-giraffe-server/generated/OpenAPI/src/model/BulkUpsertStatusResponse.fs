namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkUpsertStatus

module BulkUpsertStatusResponse =

  //#region BulkUpsertStatusResponse


  type BulkUpsertStatusResponse = {
    Status : BulkUpsertStatus;
    ResultUrl : string;
  }
  //#endregion
