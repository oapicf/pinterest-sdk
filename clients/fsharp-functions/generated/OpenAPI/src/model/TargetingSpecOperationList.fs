namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TargetingSpecOperationList =

  //#region TargetingSpecOperationList

  [<CLIMutable>]
  type TargetingSpecOperationList = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : string[];
  }

  //#endregion
