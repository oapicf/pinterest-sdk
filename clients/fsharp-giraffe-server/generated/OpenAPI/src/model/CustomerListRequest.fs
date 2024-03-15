namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserListType

module CustomerListRequest =

  //#region CustomerListRequest


  type CustomerListRequest = {
    Name : string;
    Records : string;
    ListType : UserListType;
    Exceptions : obj;
  }
  //#endregion
