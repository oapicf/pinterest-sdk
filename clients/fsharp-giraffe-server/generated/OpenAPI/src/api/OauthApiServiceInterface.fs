namespace OpenAPI
open OauthApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OauthApiServiceInterface =

    //#region Service interface
    type IOauthApiService =
      abstract member OauthConversionToken:HttpContext ->OauthConversionTokenResult
      abstract member OauthToken:HttpContext -> OauthTokenArgs->OauthTokenResult
      abstract member TokenRevoke:HttpContext -> TokenRevokeArgs->TokenRevokeResult
    //#endregion