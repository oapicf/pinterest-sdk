namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BusinessAccessRelationshipsApiHandlerParams
open BusinessAccessRelationshipsApiServiceInterface
open BusinessAccessRelationshipsApiServiceImplementation
open OpenAPI.Model.DeletePartnersRequest
open OpenAPI.Model.DeletePartnersResponse
open OpenAPI.Model.DeletedMembersResponse
open OpenAPI.Model.Error
open OpenAPI.Model.GetBusinessEmployers200Response
open OpenAPI.Model.GetBusinessMembers200Response
open OpenAPI.Model.GetBusinessPartners200Response
open OpenAPI.Model.MemberBusinessRole
open OpenAPI.Model.MembersToDeleteBody
open OpenAPI.Model.PartnerType
open OpenAPI.Model.UpdateMemberBusinessRoleBody
open OpenAPI.Model.UpdateMemberResultsResponseArray

module BusinessAccessRelationshipsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteBusinessMembership
    /// <summary>
    /// Terminate business memberships
    /// </summary>

    let DeleteBusinessMembership (pathParams:DeleteBusinessMembershipPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteBusinessMembershipBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteBusinessMembershipArgs
          let result = BusinessAccessRelationshipsApiService.DeleteBusinessMembership ctx serviceArgs
          return! (match result with
                      | DeleteBusinessMembershipStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteBusinessMembershipDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteBusinessPartners
    /// <summary>
    /// Terminate business partnerships
    /// </summary>

    let DeleteBusinessPartners (pathParams:DeleteBusinessPartnersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteBusinessPartnersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteBusinessPartnersArgs
          let result = BusinessAccessRelationshipsApiService.DeleteBusinessPartners ctx serviceArgs
          return! (match result with
                      | DeleteBusinessPartnersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteBusinessPartnersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteBusinessPartnersDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBusinessEmployers
    /// <summary>
    /// List business employers for user
    /// </summary>

    let GetBusinessEmployers  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetBusinessEmployersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetBusinessEmployersArgs
          let result = BusinessAccessRelationshipsApiService.GetBusinessEmployers ctx serviceArgs
          return! (match result with
                      | GetBusinessEmployersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBusinessEmployersDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBusinessMembers
    /// <summary>
    /// Get business members
    /// </summary>

    let GetBusinessMembers (pathParams:GetBusinessMembersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetBusinessMembersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetBusinessMembersArgs
          let result = BusinessAccessRelationshipsApiService.GetBusinessMembers ctx serviceArgs
          return! (match result with
                      | GetBusinessMembersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBusinessMembersDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBusinessPartners
    /// <summary>
    /// Get business partners
    /// </summary>

    let GetBusinessPartners (pathParams:GetBusinessPartnersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetBusinessPartnersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetBusinessPartnersArgs
          let result = BusinessAccessRelationshipsApiService.GetBusinessPartners ctx serviceArgs
          return! (match result with
                      | GetBusinessPartnersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBusinessPartnersDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateBusinessMemberships
    /// <summary>
    /// Update member&#39;s business role
    /// </summary>

    let UpdateBusinessMemberships (pathParams:UpdateBusinessMembershipsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateBusinessMembershipsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateBusinessMembershipsArgs
          let result = BusinessAccessRelationshipsApiService.UpdateBusinessMemberships ctx serviceArgs
          return! (match result with
                      | UpdateBusinessMembershipsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateBusinessMembershipsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

