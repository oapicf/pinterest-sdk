namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelStatusBulkUpdate

module LabelBulkUpdateRequest =

  //#region LabelBulkUpdateRequest

  [<CLIMutable>]
  type LabelBulkUpdateRequest = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : LabelStatusBulkUpdate;
  }

  //#endregion
