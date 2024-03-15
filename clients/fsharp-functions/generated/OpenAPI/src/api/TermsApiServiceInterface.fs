namespace OpenAPI
open TermsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module TermsApiServiceInterface =

    //#region Service interface
    type ITermsApiService =
      abstract member TermsRelatedList : unit -> TermsRelatedListResult
      abstract member TermsSuggestedList : unit -> TermsSuggestedListResult
    //#endregion