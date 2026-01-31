namespace OpenAPI
open CustomerListUploadsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CustomerListUploadsApiServiceInterface =

    //#region Service interface
    type ICustomerListUploadsApiService =
      abstract member CustomerListUploadsCreate : CustomerListUploadsCreateBodyParams -> CustomerListUploadsCreateResult
      abstract member CustomerListUploadsGet : unit -> CustomerListUploadsGetResult
      abstract member CustomerListUploadsRun : unit -> CustomerListUploadsRunResult
    //#endregion