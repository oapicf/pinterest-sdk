namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationLocation =

  //#region TargetingSpecOperationLocation

  [<CLIMutable>]
  type TargetingSpecOperationLocation = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : TargetingSpecListOperation;
    [<JsonProperty(PropertyName = "values")>]
    Values : string[];
  }

  //#endregion
