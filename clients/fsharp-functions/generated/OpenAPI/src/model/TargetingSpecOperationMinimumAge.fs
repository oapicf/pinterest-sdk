namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module TargetingSpecOperationMinimumAge =

  //#region TargetingSpecOperationMinimumAge

  [<CLIMutable>]
  type TargetingSpecOperationMinimumAge = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string option;
  }

  //#endregion
