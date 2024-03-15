namespace OpenAPI
open TermsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module TermsApiServiceInterface =

    //#region Service interface
    type ITermsApiService =
      abstract member TermsRelatedList:HttpContext -> TermsRelatedListArgs->TermsRelatedListResult
      abstract member TermsSuggestedList:HttpContext -> TermsSuggestedListArgs->TermsSuggestedListResult
    //#endregion