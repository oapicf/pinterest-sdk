namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BusinessAccessRelationshipsApiHandlerParams
open BusinessAccessRelationshipsApiServiceInterface
open BusinessAccessRelationshipsApiServiceImplementation
open OpenAPI.Model.BrandAccountsCreate200Response
open OpenAPI.Model.BrandAccountsCreateRequest
open OpenAPI.Model.BrandAccountsUpdateRequest
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
open OpenAPI.Model.SystemUserUpdateRequest
open OpenAPI.Model.UpdateMemberBusinessRoleBody
open OpenAPI.Model.UpdateMemberResultsResponseArray

module BusinessAccessRelationshipsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BrandAccountsCreate
    /// <summary>
    /// Create a Brand Account
    /// </summary>

    let BrandAccountsCreate (pathParams:BrandAccountsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<BrandAccountsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : BrandAccountsCreateArgs
          let result = BusinessAccessRelationshipsApiService.BrandAccountsCreate ctx serviceArgs
          return! (match result with
                      | BrandAccountsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BrandAccountsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BrandAccountsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BrandAccountsUpdate
    /// <summary>
    /// Update a Brand Account
    /// </summary>

    let BrandAccountsUpdate (pathParams:BrandAccountsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<BrandAccountsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : BrandAccountsUpdateArgs
          let result = BusinessAccessRelationshipsApiService.BrandAccountsUpdate ctx serviceArgs
          return! (match result with
                      | BrandAccountsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BrandAccountsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BrandAccountsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BrandAccountsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BrandAccountsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BrandAccountsUpdateStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | BrandAccountsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BrandAccountsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

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

    //#region SystemUserUpdate
    /// <summary>
    /// Update a system user information.
    /// </summary>

    let SystemUserUpdate (pathParams:SystemUserUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SystemUserUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SystemUserUpdateArgs
          let result = BusinessAccessRelationshipsApiService.SystemUserUpdate ctx serviceArgs
          return! (match result with
                      | SystemUserUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | SystemUserUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SystemUserUpdateDefaultStatusCode resolved ->
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

