namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserListType

module CustomerListRequest =

  //#region CustomerListRequest

  [<CLIMutable>]
  type CustomerListRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "records")>]
    Records : string;
    [<JsonProperty(PropertyName = "list_type")>]
    ListType : UserListType;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : obj;
  }

  //#endregion
