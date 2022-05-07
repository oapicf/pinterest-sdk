namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.OauthAccessTokenResponse
open OauthApiHandlerParams
open OauthApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module OauthApiServiceImplementation =

    //#region Service implementation
    type OauthApiServiceImpl() =
      interface IOauthApiService with

        member this.OauthToken ctx args =
          if true then
            let content = "response" :> obj :?> OauthAccessTokenResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenDefaultStatusCode { content = content }

      //#endregion

    let OauthApiService = OauthApiServiceImpl() :> IOauthApiService