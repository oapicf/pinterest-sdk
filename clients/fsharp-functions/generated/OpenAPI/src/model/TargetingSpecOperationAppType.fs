namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecAppType
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationAppType =

  //#region TargetingSpecOperationAppType

  [<CLIMutable>]
  type TargetingSpecOperationAppType = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : TargetingSpecListOperation;
    [<JsonProperty(PropertyName = "values")>]
    Values : TargetingSpecAppType[];
  }

  //#endregion
