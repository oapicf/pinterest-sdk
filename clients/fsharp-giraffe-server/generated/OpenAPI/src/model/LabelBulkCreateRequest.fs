namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelCreateItem

module LabelBulkCreateRequest =

  //#region LabelBulkCreateRequest


  type LabelBulkCreateRequest = {
    Labels : LabelCreateItem[];
    ParentId : string;
  }
  //#endregion
