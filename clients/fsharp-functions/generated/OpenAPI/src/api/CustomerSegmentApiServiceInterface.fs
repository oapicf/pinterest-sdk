namespace OpenAPI
open CustomerSegmentApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CustomerSegmentApiServiceInterface =

    //#region Service interface
    type ICustomerSegmentApiService =
      abstract member CustomerSegmentCreate : CustomerSegmentCreateBodyParams -> CustomerSegmentCreateResult
      abstract member CustomerSegmentList : unit -> CustomerSegmentListResult
      abstract member CustomerSegmentUpdate : CustomerSegmentUpdateBodyParams -> CustomerSegmentUpdateResult
    //#endregion