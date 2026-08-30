namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelUpdateItem

module LabelUpdateRequest =

  //#region LabelUpdateRequest

  [<CLIMutable>]
  type LabelUpdateRequest = {
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelUpdateItem[];
  }

  //#endregion
