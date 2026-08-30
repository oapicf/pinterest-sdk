namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelCreateItem

module LabelCreateRequest =

  //#region LabelCreateRequest

  [<CLIMutable>]
  type LabelCreateRequest = {
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelCreateItem[];
  }

  //#endregion
