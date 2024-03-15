namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.TermsOfService
open TermsOfServiceApiHandlerParams
open TermsOfServiceApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module TermsOfServiceApiServiceImplementation =

    //#region Service implementation
    type TermsOfServiceApiServiceImpl() =
      interface ITermsOfServiceApiService with

        member this.TermsOfServiceGet ctx args =
          if true then
            let content = "Success" :> obj :?> TermsOfService // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetDefaultStatusCode { content = content }

      //#endregion

    let TermsOfServiceApiService = TermsOfServiceApiServiceImpl() :> ITermsOfServiceApiService