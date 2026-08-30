namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module TargetingSpecOperationMaximumAge =

  //#region TargetingSpecOperationMaximumAge

  [<CLIMutable>]
  type TargetingSpecOperationMaximumAge = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string option;
  }

  //#endregion
