namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ErrorDetail
open OpenAPI.Model.RecordCounts
open OpenAPI.Model.UserListOperationType

module CustomerListUpload =

  //#region CustomerListUpload

  [<CLIMutable>]
  type CustomerListUpload = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "creation_time")>]
    CreationTime : int;
    [<JsonProperty(PropertyName = "customer_list_id")>]
    CustomerListId : string;
    [<JsonProperty(PropertyName = "error_counts")>]
    ErrorCounts : ErrorDetail[];
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : UserListOperationType;
    [<JsonProperty(PropertyName = "record_counts")>]
    RecordCounts : RecordCounts;
    [<JsonProperty(PropertyName = "state")>]
    State : string;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
  }

  //#endregion
