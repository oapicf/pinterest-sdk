namespace OpenAPI
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.TermsOfService
open TermsOfServiceApiHandlerParams
open TermsOfServiceApiServiceInterface
open System.Collections.Generic
open System

module TermsOfServiceApiServiceImplementation =

    //#region Service implementation
    type TermsOfServiceApiServiceImpl() =
      interface ITermsOfServiceApiService with

        member this.TermsOfServiceGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> TermsOfService // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TermsOfServiceGetDefaultStatusCode { content = content }

      //#endregion

    let TermsOfServiceApiService = TermsOfServiceApiServiceImpl() :> ITermsOfServiceApiService