namespace OpenAPI
open OauthApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OauthApiServiceInterface =

    //#region Service interface
    type IOauthApiService =
      abstract member OauthConversionToken : unit -> OauthConversionTokenResult
      abstract member OauthToken : unit -> OauthTokenResult
      abstract member TokenRevoke : unit -> TokenRevokeResult
    //#endregion