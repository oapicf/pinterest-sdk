namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TargetingTemplateUpdateRequest =

  //#region TargetingTemplateUpdateRequest

  [<CLIMutable>]
  type TargetingTemplateUpdateRequest = {
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
