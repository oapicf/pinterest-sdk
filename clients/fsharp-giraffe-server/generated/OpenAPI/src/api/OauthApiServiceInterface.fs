namespace OpenAPI
open OauthApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OauthApiServiceInterface =

    //#region Service interface
    type IOauthApiService =
      abstract member OauthToken:HttpContext -> OauthTokenArgs->OauthTokenResult
    //#endregion