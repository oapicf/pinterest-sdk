namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Label
open OpenAPI.Model.LabelError

module LabelsResponse =

  //#region LabelsResponse

  [<CLIMutable>]
  type LabelsResponse = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : LabelError[];
    [<JsonProperty(PropertyName = "labels")>]
    Labels : Label[];
  }

  //#endregion
