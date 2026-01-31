namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserListOperationType

module CustomerListUploadCreateRequest =

  //#region CustomerListUploadCreateRequest

  [<CLIMutable>]
  type CustomerListUploadCreateRequest = {
    [<JsonProperty(PropertyName = "operation")>]
    Operation : UserListOperationType;
    [<JsonProperty(PropertyName = "total_parts")>]
    TotalParts : int;
  }

  //#endregion
