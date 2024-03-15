namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.RelatedTerms
open TermsApiHandlerParams
open TermsApiServiceInterface
open System.Collections.Generic
open System

module TermsApiServiceImplementation =

    //#region Service implementation
    type TermsApiServiceImpl() =
      interface ITermsApiService with

        member this.TermsRelatedList () =
          if true then
            let content = "Success" :> obj :?> RelatedTerms // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsRelatedListStatusCode200 { content = content }
          else if true then
            let content = "Invalid terms related parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsRelatedListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsRelatedListDefaultStatusCode { content = content }

        member this.TermsSuggestedList () =
          if true then
            let content = "Success" :> obj :?> string[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsSuggestedListStatusCode200 { content = content }
          else if true then
            let content = "Invalid terms suggested parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsSuggestedListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsSuggestedListDefaultStatusCode { content = content }

      //#endregion

    let TermsApiService = TermsApiServiceImpl() :> ITermsApiService