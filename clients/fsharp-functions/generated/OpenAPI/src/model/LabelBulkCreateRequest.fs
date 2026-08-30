namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelCreateItem

module LabelBulkCreateRequest =

  //#region LabelBulkCreateRequest

  [<CLIMutable>]
  type LabelBulkCreateRequest = {
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelCreateItem[];
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string;
  }

  //#endregion
