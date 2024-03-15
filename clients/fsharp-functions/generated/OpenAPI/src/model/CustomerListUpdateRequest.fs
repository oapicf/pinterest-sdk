namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Exception
open OpenAPI.Model.UserListOperationType

module CustomerListUpdateRequest =

  //#region CustomerListUpdateRequest

  [<CLIMutable>]
  type CustomerListUpdateRequest = {
    [<JsonProperty(PropertyName = "records")>]
    Records : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : UserListOperationType;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : Exception;
  }

  //#endregion
