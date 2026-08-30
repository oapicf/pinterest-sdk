namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CustomerListStatus

module CustomerList =

  //#region CustomerList

  [<CLIMutable>]
  type CustomerList = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : decimal;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : obj;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "is_nca")>]
    IsNca : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "num_batches")>]
    NumBatches : decimal;
    [<JsonProperty(PropertyName = "num_removed_user_records")>]
    NumRemovedUserRecords : decimal;
    [<JsonProperty(PropertyName = "num_uploaded_user_records")>]
    NumUploadedUserRecords : decimal;
    [<JsonProperty(PropertyName = "status")>]
    Status : CustomerListStatus;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : decimal;
  }

  //#endregion
