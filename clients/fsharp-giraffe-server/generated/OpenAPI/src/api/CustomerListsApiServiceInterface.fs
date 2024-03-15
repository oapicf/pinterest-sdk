namespace OpenAPI
open CustomerListsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CustomerListsApiServiceInterface =

    //#region Service interface
    type ICustomerListsApiService =
      abstract member CustomerListsCreate:HttpContext -> CustomerListsCreateArgs->CustomerListsCreateResult
      abstract member CustomerListsGet:HttpContext -> CustomerListsGetArgs->CustomerListsGetResult
      abstract member CustomerListsList:HttpContext -> CustomerListsListArgs->CustomerListsListResult
      abstract member CustomerListsUpdate:HttpContext -> CustomerListsUpdateArgs->CustomerListsUpdateResult
    //#endregion