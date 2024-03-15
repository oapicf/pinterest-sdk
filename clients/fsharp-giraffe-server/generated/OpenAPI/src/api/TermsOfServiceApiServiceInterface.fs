namespace OpenAPI
open TermsOfServiceApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module TermsOfServiceApiServiceInterface =

    //#region Service interface
    type ITermsOfServiceApiService =
      abstract member TermsOfServiceGet:HttpContext -> TermsOfServiceGetArgs->TermsOfServiceGetResult
    //#endregion