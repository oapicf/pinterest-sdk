namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CustomerListRecordRow
open OpenAPI.Model.UserListType

module CustomerListCreate =

  //#region CustomerListCreate


  type CustomerListCreate = {
    IsNca : bool;
    ListType : UserListType;
    Name : string;
    Records : string;
    RecordsV2 : CustomerListRecordRow[];
  }
  //#endregion
