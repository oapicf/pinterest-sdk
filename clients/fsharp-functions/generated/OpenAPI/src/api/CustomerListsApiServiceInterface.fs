namespace OpenAPI
open CustomerListsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CustomerListsApiServiceInterface =

    //#region Service interface
    type ICustomerListsApiService =
      abstract member CustomerListsCreate : CustomerListsCreateBodyParams -> CustomerListsCreateResult
      abstract member CustomerListsGet : unit -> CustomerListsGetResult
      abstract member CustomerListsList : unit -> CustomerListsListResult
      abstract member CustomerListsUpdate : CustomerListsUpdateBodyParams -> CustomerListsUpdateResult
    //#endregion