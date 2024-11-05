namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AudienceSharingApiHandlerParams
open AudienceSharingApiServiceInterface
open AudienceSharingApiServiceImplementation
open OpenAPI.Model.AdAccountsAudiencesSharedAccountsList200Response
open OpenAPI.Model.AudienceAccountType
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.BusinessSharedAudience
open OpenAPI.Model.BusinessSharedAudienceResponse
open OpenAPI.Model.Error
open OpenAPI.Model.SharedAudience
open OpenAPI.Model.SharedAudienceResponse

module AudienceSharingApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountsAudiencesSharedAccountsList
    /// <summary>
    /// List accounts with access to an audience owned by an ad account
    /// </summary>

    let AdAccountsAudiencesSharedAccountsList (pathParams:AdAccountsAudiencesSharedAccountsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdAccountsAudiencesSharedAccountsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdAccountsAudiencesSharedAccountsListArgs
          let result = AudienceSharingApiService.AdAccountsAudiencesSharedAccountsList ctx serviceArgs
          return! (match result with
                      | AdAccountsAudiencesSharedAccountsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsAudiencesSharedAccountsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountsAudiencesSharedAccountsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdAccountsAudiencesSharedAccountsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessAccountAudiencesSharedAccountsList
    /// <summary>
    /// List accounts with access to an audience owned by a business
    /// </summary>

    let BusinessAccountAudiencesSharedAccountsList (pathParams:BusinessAccountAudiencesSharedAccountsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BusinessAccountAudiencesSharedAccountsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BusinessAccountAudiencesSharedAccountsListArgs
          let result = AudienceSharingApiService.BusinessAccountAudiencesSharedAccountsList ctx serviceArgs
          return! (match result with
                      | BusinessAccountAudiencesSharedAccountsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessAccountAudiencesSharedAccountsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BusinessAccountAudiencesSharedAccountsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BusinessAccountAudiencesSharedAccountsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SharedAudiencesForBusinessList
    /// <summary>
    /// List received audiences for a business
    /// </summary>

    let SharedAudiencesForBusinessList (pathParams:SharedAudiencesForBusinessListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SharedAudiencesForBusinessListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : SharedAudiencesForBusinessListArgs
          let result = AudienceSharingApiService.SharedAudiencesForBusinessList ctx serviceArgs
          return! (match result with
                      | SharedAudiencesForBusinessListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SharedAudiencesForBusinessListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SharedAudiencesForBusinessListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateAdAccountToAdAccountSharedAudience
    /// <summary>
    /// Update audience sharing between ad accounts
    /// </summary>

    let UpdateAdAccountToAdAccountSharedAudience (pathParams:UpdateAdAccountToAdAccountSharedAudiencePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateAdAccountToAdAccountSharedAudienceBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateAdAccountToAdAccountSharedAudienceArgs
          let result = AudienceSharingApiService.UpdateAdAccountToAdAccountSharedAudience ctx serviceArgs
          return! (match result with
                      | UpdateAdAccountToAdAccountSharedAudienceStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateAdAccountToAdAccountSharedAudienceStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateAdAccountToBusinessSharedAudience
    /// <summary>
    /// Update audience sharing from an ad account to businesses
    /// </summary>

    let UpdateAdAccountToBusinessSharedAudience (pathParams:UpdateAdAccountToBusinessSharedAudiencePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateAdAccountToBusinessSharedAudienceBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateAdAccountToBusinessSharedAudienceArgs
          let result = AudienceSharingApiService.UpdateAdAccountToBusinessSharedAudience ctx serviceArgs
          return! (match result with
                      | UpdateAdAccountToBusinessSharedAudienceStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateAdAccountToBusinessSharedAudienceStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateAdAccountToBusinessSharedAudienceDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateBusinessToAdAccountSharedAudience
    /// <summary>
    /// Update audience sharing from a business to ad accounts
    /// </summary>

    let UpdateBusinessToAdAccountSharedAudience (pathParams:UpdateBusinessToAdAccountSharedAudiencePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateBusinessToAdAccountSharedAudienceBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateBusinessToAdAccountSharedAudienceArgs
          let result = AudienceSharingApiService.UpdateBusinessToAdAccountSharedAudience ctx serviceArgs
          return! (match result with
                      | UpdateBusinessToAdAccountSharedAudienceStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateBusinessToAdAccountSharedAudienceStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateBusinessToAdAccountSharedAudienceDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateBusinessToBusinessSharedAudience
    /// <summary>
    /// Update audience sharing between businesses
    /// </summary>

    let UpdateBusinessToBusinessSharedAudience (pathParams:UpdateBusinessToBusinessSharedAudiencePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateBusinessToBusinessSharedAudienceBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateBusinessToBusinessSharedAudienceArgs
          let result = AudienceSharingApiService.UpdateBusinessToBusinessSharedAudience ctx serviceArgs
          return! (match result with
                      | UpdateBusinessToBusinessSharedAudienceStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateBusinessToBusinessSharedAudienceStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateBusinessToBusinessSharedAudienceDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

