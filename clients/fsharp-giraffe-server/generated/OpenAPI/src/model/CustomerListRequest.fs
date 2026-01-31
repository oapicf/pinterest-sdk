namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserListType

module CustomerListRequest =

  //#region CustomerListRequest


  type CustomerListRequest = {
    ListType : UserListType;
    Name : string;
    Records : string;
  }
  //#endregion
