namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Label

module LabelError =

  //#region LabelError

  [<CLIMutable>]
  type LabelError = {
    [<JsonProperty(PropertyName = "data")>]
    Data : Label;
    [<JsonProperty(PropertyName = "error_messages")>]
    ErrorMessages : string[];
  }

  //#endregion
