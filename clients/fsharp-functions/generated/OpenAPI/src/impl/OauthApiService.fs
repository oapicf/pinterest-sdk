namespace OpenAPI
open OpenAPI.Model.ConversionAccessTokenResponse
open OpenAPI.Model.Error
open OpenAPI.Model.OauthAccessTokenResponse
open OauthApiHandlerParams
open OauthApiServiceInterface
open System.Collections.Generic
open System

module OauthApiServiceImplementation =

    //#region Service implementation
    type OauthApiServiceImpl() =
      interface IOauthApiService with

        member this.OauthConversionToken () =
          if true then
            let content = "response" :> obj :?> ConversionAccessTokenResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenDefaultStatusCode { content = content }

        member this.OauthToken () =
          if true then
            let content = "response" :> obj :?> OauthAccessTokenResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenDefaultStatusCode { content = content }

        member this.TokenRevoke () =
          if true then
            let content = "Successful token revocation. No content is returned." 
            TokenRevokeStatusCode200 { content = content }
          else if true then
            let content = "Client authentication error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TokenRevokeStatusCode401 { content = content }
          else if true then
            let content = "Client is not allowed to revoke token." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TokenRevokeStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TokenRevokeDefaultStatusCode { content = content }

      //#endregion

    let OauthApiService = OauthApiServiceImpl() :> IOauthApiService