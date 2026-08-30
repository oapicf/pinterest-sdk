namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelStatus

module LabelUpdateItem =

  //#region LabelUpdateItem

  [<CLIMutable>]
  type LabelUpdateItem = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : LabelStatus;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
