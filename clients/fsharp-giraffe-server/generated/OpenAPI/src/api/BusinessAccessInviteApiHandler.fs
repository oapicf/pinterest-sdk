namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BusinessAccessInviteApiHandlerParams
open BusinessAccessInviteApiServiceInterface
open BusinessAccessInviteApiServiceImplementation
open OpenAPI.Model.AuthRespondInvitesBody
open OpenAPI.Model.CancelInvitesBody
open OpenAPI.Model.CreateAssetAccessRequestBody
open OpenAPI.Model.CreateAssetAccessRequestResponse
open OpenAPI.Model.CreateAssetInvitesRequest
open OpenAPI.Model.CreateInvitesResultsResponseArray
open OpenAPI.Model.CreateMembershipOrPartnershipInvitesBody
open OpenAPI.Model.DeleteInvitesResultsResponseArray
open OpenAPI.Model.Error
open OpenAPI.Model.GetInvites200Response
open OpenAPI.Model.InviteType
open OpenAPI.Model.RespondToInvitesResponseArray
open OpenAPI.Model.UpdateInvitesResultsResponseArray

module BusinessAccessInviteApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AssetAccessRequestsCreate
    /// <summary>
    /// Create a request to access an existing partner&#39;s assets.
    /// </summary>

    let AssetAccessRequestsCreate (pathParams:AssetAccessRequestsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AssetAccessRequestsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AssetAccessRequestsCreateArgs
          let result = BusinessAccessInviteApiService.AssetAccessRequestsCreate ctx serviceArgs
          return! (match result with
                      | AssetAccessRequestsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AssetAccessRequestsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CancelInvitesOrRequests
    /// <summary>
    /// Cancel invites/requests
    /// </summary>

    let CancelInvitesOrRequests (pathParams:CancelInvitesOrRequestsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CancelInvitesOrRequestsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CancelInvitesOrRequestsArgs
          let result = BusinessAccessInviteApiService.CancelInvitesOrRequests ctx serviceArgs
          return! (match result with
                      | CancelInvitesOrRequestsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CancelInvitesOrRequestsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateAssetInvites
    /// <summary>
    /// Update invite/request with an asset permission
    /// </summary>

    let CreateAssetInvites (pathParams:CreateAssetInvitesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateAssetInvitesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateAssetInvitesArgs
          let result = BusinessAccessInviteApiService.CreateAssetInvites ctx serviceArgs
          return! (match result with
                      | CreateAssetInvitesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateAssetInvitesDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateMembershipOrPartnershipInvites
    /// <summary>
    /// Create invites or requests
    /// </summary>

    let CreateMembershipOrPartnershipInvites (pathParams:CreateMembershipOrPartnershipInvitesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateMembershipOrPartnershipInvitesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateMembershipOrPartnershipInvitesArgs
          let result = BusinessAccessInviteApiService.CreateMembershipOrPartnershipInvites ctx serviceArgs
          return! (match result with
                      | CreateMembershipOrPartnershipInvitesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateMembershipOrPartnershipInvitesDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetInvites
    /// <summary>
    /// Get invites/requests
    /// </summary>

    let GetInvites (pathParams:GetInvitesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetInvitesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetInvitesArgs
          let result = BusinessAccessInviteApiService.GetInvites ctx serviceArgs
          return! (match result with
                      | GetInvitesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetInvitesDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RespondBusinessAccessInvites
    /// <summary>
    /// Accept or decline an invite/request
    /// </summary>

    let RespondBusinessAccessInvites  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<RespondBusinessAccessInvitesBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : RespondBusinessAccessInvitesArgs
          let result = BusinessAccessInviteApiService.RespondBusinessAccessInvites ctx serviceArgs
          return! (match result with
                      | RespondBusinessAccessInvitesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | RespondBusinessAccessInvitesDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

