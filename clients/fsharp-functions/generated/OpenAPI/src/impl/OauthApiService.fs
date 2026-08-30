namespace OpenAPI
open OpenAPI.Model.ConversionAccessToken
open OpenAPI.Model.OauthAccessToken
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.TokenGrantType
open OpenAPI.Model.TokenTypeHint
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
            let content = "The request has succeeded." :> obj :?> ConversionAccessToken // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthConversionTokenDefaultStatusCode { content = content }

        member this.OauthToken () =
          if true then
            let content = "The request has succeeded." :> obj :?> OauthAccessToken // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> OauthAccessToken // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OauthTokenDefaultStatusCode { content = content }

        member this.TokenRevoke () =
          if true then
            let content = "The request has succeeded." 
            TokenRevokeStatusCode200 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TokenRevokeStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TokenRevokeStatusCode403 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TokenRevokeDefaultStatusCode { content = content }

      //#endregion

    let OauthApiService = OauthApiServiceImpl() :> IOauthApiService