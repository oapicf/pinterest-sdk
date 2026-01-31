namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelCreateRequestLabelsInner

module LabelCreateRequest =

  //#region LabelCreateRequest

  [<CLIMutable>]
  type LabelCreateRequest = {
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelCreateRequestLabelsInner[];
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string;
  }

  //#endregion
