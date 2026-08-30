namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationGeo =

  //#region TargetingSpecOperationGeo

  [<CLIMutable>]
  type TargetingSpecOperationGeo = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : TargetingSpecListOperation;
    [<JsonProperty(PropertyName = "values")>]
    Values : string[];
  }

  //#endregion
