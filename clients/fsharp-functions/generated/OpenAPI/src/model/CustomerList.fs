namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CustomerList =

  //#region CustomerList

  [<CLIMutable>]
  type CustomerList = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : decimal;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "num_batches")>]
    NumBatches : decimal;
    [<JsonProperty(PropertyName = "num_removed_user_records")>]
    NumRemovedUserRecords : decimal;
    [<JsonProperty(PropertyName = "num_uploaded_user_records")>]
    NumUploadedUserRecords : decimal;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : decimal;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : obj;
  }

  //#endregion
