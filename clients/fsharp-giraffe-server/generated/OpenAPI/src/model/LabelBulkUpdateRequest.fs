namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelStatusBulkUpdate

module LabelBulkUpdateRequest =

  //#region LabelBulkUpdateRequest


  type LabelBulkUpdateRequest = {
    Id : string;
    ParentId : string;
    Status : LabelStatusBulkUpdate;
  }
  //#endregion
