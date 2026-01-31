namespace OpenAPI
open CustomerListUploadsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CustomerListUploadsApiServiceInterface =

    //#region Service interface
    type ICustomerListUploadsApiService =
      abstract member CustomerListUploadsCreate:HttpContext -> CustomerListUploadsCreateArgs->CustomerListUploadsCreateResult
      abstract member CustomerListUploadsGet:HttpContext -> CustomerListUploadsGetArgs->CustomerListUploadsGetResult
      abstract member CustomerListUploadsRun:HttpContext -> CustomerListUploadsRunArgs->CustomerListUploadsRunResult
    //#endregion