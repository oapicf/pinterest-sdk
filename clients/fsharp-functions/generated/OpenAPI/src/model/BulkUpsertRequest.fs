namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkUpsertRequestCreate
open OpenAPI.Model.BulkUpsertRequestUpdate

module BulkUpsertRequest =

  //#region BulkUpsertRequest

  [<CLIMutable>]
  type BulkUpsertRequest = {
    [<JsonProperty(PropertyName = "create")>]
    Create : BulkUpsertRequestCreate;
    [<JsonProperty(PropertyName = "update")>]
    Update : BulkUpsertRequestUpdate;
  }

  //#endregion
