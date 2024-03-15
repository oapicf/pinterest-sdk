namespace OpenAPI
open TermsOfServiceApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module TermsOfServiceApiServiceInterface =

    //#region Service interface
    type ITermsOfServiceApiService =
      abstract member TermsOfServiceGet : unit -> TermsOfServiceGetResult
    //#endregion