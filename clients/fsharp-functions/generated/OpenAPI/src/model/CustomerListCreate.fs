namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CustomerListRecordRow
open OpenAPI.Model.UserListType

module CustomerListCreate =

  //#region CustomerListCreate

  [<CLIMutable>]
  type CustomerListCreate = {
    [<JsonProperty(PropertyName = "is_nca")>]
    IsNca : bool;
    [<JsonProperty(PropertyName = "list_type")>]
    ListType : UserListType;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "records")>]
    Records : string;
    [<JsonProperty(PropertyName = "records_v2")>]
    RecordsV2 : CustomerListRecordRow[];
  }

  //#endregion
