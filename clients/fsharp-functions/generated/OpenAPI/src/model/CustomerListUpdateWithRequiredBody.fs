namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CustomerListRecordRow
open OpenAPI.Model.UserListOperationType

module CustomerListUpdateWithRequiredBody =

  //#region CustomerListUpdateWithRequiredBody

  [<CLIMutable>]
  type CustomerListUpdateWithRequiredBody = {
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : UserListOperationType;
    [<JsonProperty(PropertyName = "records")>]
    Records : string;
    [<JsonProperty(PropertyName = "records_v2")>]
    RecordsV2 : CustomerListRecordRow[];
  }

  //#endregion
