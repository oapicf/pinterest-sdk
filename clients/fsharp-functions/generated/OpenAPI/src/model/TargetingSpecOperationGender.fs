namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecGender

module TargetingSpecOperationGender =

  //#region TargetingSpecOperationGender

  [<CLIMutable>]
  type TargetingSpecOperationGender = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : TargetingSpecGender[];
  }

  //#endregion
