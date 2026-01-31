namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecAgeBucket

module TargetingSpecOperationAgeBucket =

  //#region TargetingSpecOperationAgeBucket

  [<CLIMutable>]
  type TargetingSpecOperationAgeBucket = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : TargetingSpecAgeBucket[];
  }

  //#endregion
