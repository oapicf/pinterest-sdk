namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module TargetingSpecOperationMinMaxAge =

  //#region TargetingSpecOperationMinMaxAge

  [<CLIMutable>]
  type TargetingSpecOperationMinMaxAge = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string option;
  }

  //#endregion
