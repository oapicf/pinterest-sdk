namespace OpenAPI
open CustomerSegmentApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CustomerSegmentApiServiceInterface =

    //#region Service interface
    type ICustomerSegmentApiService =
      abstract member CustomerSegmentCreate:HttpContext -> CustomerSegmentCreateArgs->CustomerSegmentCreateResult
      abstract member CustomerSegmentList:HttpContext -> CustomerSegmentListArgs->CustomerSegmentListResult
      abstract member CustomerSegmentUpdate:HttpContext -> CustomerSegmentUpdateArgs->CustomerSegmentUpdateResult
    //#endregion