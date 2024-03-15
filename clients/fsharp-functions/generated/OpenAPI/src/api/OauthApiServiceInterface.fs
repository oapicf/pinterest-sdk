namespace OpenAPI
open OauthApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OauthApiServiceInterface =

    //#region Service interface
    type IOauthApiService =
      abstract member OauthToken : unit -> OauthTokenResult
    //#endregion