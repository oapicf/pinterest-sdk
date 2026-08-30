namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BusinessAccessAssetsApiHandlerParams
open BusinessAccessAssetsApiServiceInterface
open BusinessAccessAssetsApiServiceImplementation
open OpenAPI.Model.AssetGroupDeletion
open OpenAPI.Model.AssetGroupDeletionDelete
open OpenAPI.Model.AssetGroupInput
open OpenAPI.Model.AssetGroupInputCreate
open OpenAPI.Model.AssetGroupModification
open OpenAPI.Model.AssetGroupModificationReadOrUpdate
open OpenAPI.Model.AssetPermissionType
open OpenAPI.Model.AssetSearchBy
open OpenAPI.Model.AssetSortBy
open OpenAPI.Model.BusinessAssetMembersGet200Response
open OpenAPI.Model.BusinessAssetsGet200Response
open OpenAPI.Model.BusinessMemberAssetsGetResponse
open OpenAPI.Model.BusinessMembersAssetAccessDeleteBody
open OpenAPI.Model.BusinessPartnerAssetAccessGet200Response
open OpenAPI.Model.DeleteMemberAccessResultsResponseArray
open OpenAPI.Model.DeletePartnerAssetAccessBody
open OpenAPI.Model.DeletePartnerAssetAccessResultsResponseArray
open OpenAPI.Model.NonDraftEntityStatus
open OpenAPI.Model.PermissionsWithOwner
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.UpdateMemberAssetAccessBody
open OpenAPI.Model.UpdateMemberAssetsResultsResponseArray
open OpenAPI.Model.UpdatePartnerAssetAccessBody
open OpenAPI.Model.UpdatePartnerAssetsResultsResponseArray

module BusinessAccessAssetsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AssetGroupCreate
    /// <summary>
    /// Create a new asset group.
    /// </summary>

    let AssetGroupCreate (pathParams:AssetGroupCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AssetGroupCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AssetGroupCreateArgs
          let result = BusinessAccessAssetsApiService.AssetGroupCreate ctx serviceArgs
          return! (match result with
                      | AssetGroupCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AssetGroupCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | AssetGroupCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AssetGroupCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AssetGroupCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AssetGroupCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AssetGroupCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AssetGroupCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AssetGroupDelete
    /// <summary>
    /// Delete asset groups.
    /// </summary>

    let AssetGroupDelete (pathParams:AssetGroupDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AssetGroupDeleteBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AssetGroupDeleteArgs
          let result = BusinessAccessAssetsApiService.AssetGroupDelete ctx serviceArgs
          return! (match result with
                      | AssetGroupDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AssetGroupDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AssetGroupUpdate
    /// <summary>
    /// Update asset groups.
    /// </summary>

    let AssetGroupUpdate (pathParams:AssetGroupUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AssetGroupUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AssetGroupUpdateArgs
          let result = BusinessAccessAssetsApiService.AssetGroupUpdate ctx serviceArgs
          return! (match result with
                      | AssetGroupUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AssetGroupUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AssetGroupUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AssetGroupUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AssetGroupUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AssetGroupUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AssetGroupUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessAssetMembersGet
    /// <summary>
    /// Get members with access to asset
    /// </summary>

    let BusinessAssetMembersGet (pathParams:BusinessAssetMembersGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BusinessAssetMembersGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BusinessAssetMembersGetArgs
          let result = BusinessAccessAssetsApiService.BusinessAssetMembersGet ctx serviceArgs
          return! (match result with
                      | BusinessAssetMembersGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessAssetMembersGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BusinessAssetMembersGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BusinessAssetMembersGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BusinessAssetMembersGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BusinessAssetMembersGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BusinessAssetMembersGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessAssetPartnersGet
    /// <summary>
    /// Get partners with access to asset
    /// </summary>

    let BusinessAssetPartnersGet (pathParams:BusinessAssetPartnersGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BusinessAssetPartnersGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BusinessAssetPartnersGetArgs
          let result = BusinessAccessAssetsApiService.BusinessAssetPartnersGet ctx serviceArgs
          return! (match result with
                      | BusinessAssetPartnersGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessAssetPartnersGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BusinessAssetPartnersGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BusinessAssetPartnersGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BusinessAssetPartnersGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BusinessAssetPartnersGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BusinessAssetPartnersGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessAssetsGet
    /// <summary>
    /// List business assets
    /// </summary>

    let BusinessAssetsGet (pathParams:BusinessAssetsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BusinessAssetsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BusinessAssetsGetArgs
          let result = BusinessAccessAssetsApiService.BusinessAssetsGet ctx serviceArgs
          return! (match result with
                      | BusinessAssetsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessAssetsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BusinessAssetsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BusinessAssetsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BusinessAssetsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BusinessAssetsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BusinessAssetsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessMemberAssetsGet
    /// <summary>
    /// Get assets assigned to a member
    /// </summary>

    let BusinessMemberAssetsGet (pathParams:BusinessMemberAssetsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BusinessMemberAssetsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BusinessMemberAssetsGetArgs
          let result = BusinessAccessAssetsApiService.BusinessMemberAssetsGet ctx serviceArgs
          return! (match result with
                      | BusinessMemberAssetsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessMemberAssetsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BusinessMemberAssetsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BusinessMemberAssetsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BusinessMemberAssetsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BusinessMemberAssetsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BusinessMemberAssetsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessMembersAssetAccessDelete
    /// <summary>
    /// Delete member access to asset
    /// </summary>

    let BusinessMembersAssetAccessDelete (pathParams:BusinessMembersAssetAccessDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<BusinessMembersAssetAccessDeleteBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : BusinessMembersAssetAccessDeleteArgs
          let result = BusinessAccessAssetsApiService.BusinessMembersAssetAccessDelete ctx serviceArgs
          return! (match result with
                      | BusinessMembersAssetAccessDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessMembersAssetAccessDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessMembersAssetAccessUpdate
    /// <summary>
    /// Assign/Update member asset permissions
    /// </summary>

    let BusinessMembersAssetAccessUpdate (pathParams:BusinessMembersAssetAccessUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<BusinessMembersAssetAccessUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : BusinessMembersAssetAccessUpdateArgs
          let result = BusinessAccessAssetsApiService.BusinessMembersAssetAccessUpdate ctx serviceArgs
          return! (match result with
                      | BusinessMembersAssetAccessUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessMembersAssetAccessUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BusinessMembersAssetAccessUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BusinessMembersAssetAccessUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BusinessMembersAssetAccessUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BusinessMembersAssetAccessUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BusinessMembersAssetAccessUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BusinessPartnerAssetAccessGet
    /// <summary>
    /// Get assets assigned to a partner or assets assigned by a partner
    /// </summary>

    let BusinessPartnerAssetAccessGet (pathParams:BusinessPartnerAssetAccessGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BusinessPartnerAssetAccessGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BusinessPartnerAssetAccessGetArgs
          let result = BusinessAccessAssetsApiService.BusinessPartnerAssetAccessGet ctx serviceArgs
          return! (match result with
                      | BusinessPartnerAssetAccessGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BusinessPartnerAssetAccessGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BusinessPartnerAssetAccessGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BusinessPartnerAssetAccessGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BusinessPartnerAssetAccessGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BusinessPartnerAssetAccessGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BusinessPartnerAssetAccessGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeletePartnerAssetAccessHandlerImpl
    /// <summary>
    /// Delete partner access to asset
    /// </summary>

    let DeletePartnerAssetAccessHandlerImpl (pathParams:DeletePartnerAssetAccessHandlerImplPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeletePartnerAssetAccessHandlerImplBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeletePartnerAssetAccessHandlerImplArgs
          let result = BusinessAccessAssetsApiService.DeletePartnerAssetAccessHandlerImpl ctx serviceArgs
          return! (match result with
                      | DeletePartnerAssetAccessHandlerImplStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeletePartnerAssetAccessHandlerImplDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdatePartnerAssetAccessHandlerImpl
    /// <summary>
    /// Assign/Update partner asset permissions
    /// </summary>

    let UpdatePartnerAssetAccessHandlerImpl (pathParams:UpdatePartnerAssetAccessHandlerImplPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdatePartnerAssetAccessHandlerImplBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdatePartnerAssetAccessHandlerImplArgs
          let result = BusinessAccessAssetsApiService.UpdatePartnerAssetAccessHandlerImpl ctx serviceArgs
          return! (match result with
                      | UpdatePartnerAssetAccessHandlerImplStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdatePartnerAssetAccessHandlerImplStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdatePartnerAssetAccessHandlerImplStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdatePartnerAssetAccessHandlerImplStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdatePartnerAssetAccessHandlerImplStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdatePartnerAssetAccessHandlerImplStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | UpdatePartnerAssetAccessHandlerImplDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

