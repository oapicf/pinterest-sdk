namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelStatus

module LabelUpdateRequestLabelsInner =

  //#region LabelUpdateRequestLabelsInner

  [<CLIMutable>]
  type LabelUpdateRequestLabelsInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : LabelStatus;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
