namespace OpenAPI

open BusinessAccessAssetsApiHandlerParams
open BusinessAccessAssetsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BusinessAccessAssetsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AssetGroupCreate
    /// <summary>
    /// Create a new asset group.
    /// </summary>
   [<FunctionName("AssetGroupCreate")>]
    let AssetGroupCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/businesses/{business_id}/asset_groups")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AssetGroupCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessAssetsApiService.AssetGroupCreate bodyParams
      match result with
      | AssetGroupCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AssetGroupCreateStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AssetGroupCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AssetGroupDelete
    /// <summary>
    /// Delete asset groups.
    /// </summary>
   [<FunctionName("AssetGroupDelete")>]
    let AssetGroupDelete
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/businesses/{business_id}/asset_groups")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AssetGroupDeleteBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessAssetsApiService.AssetGroupDelete bodyParams
      match result with
      | AssetGroupDeleteStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AssetGroupDeleteStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AssetGroupDeleteDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AssetGroupUpdate
    /// <summary>
    /// Update asset groups.
    /// </summary>
   [<FunctionName("AssetGroupUpdate")>]
    let AssetGroupUpdate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/businesses/{business_id}/asset_groups")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AssetGroupUpdateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessAssetsApiService.AssetGroupUpdate bodyParams
      match result with
      | AssetGroupUpdateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AssetGroupUpdateStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AssetGroupUpdateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessAssetMembersGet
    /// <summary>
    /// Get members with access to asset
    /// </summary>
   [<FunctionName("BusinessAssetMembersGet")>]
    let BusinessAssetMembersGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/assets/{asset_id}/members")>]
        req:HttpRequest ) =

      let result = BusinessAccessAssetsApiService.BusinessAssetMembersGet ()
      match result with
      | BusinessAssetMembersGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessAssetMembersGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessAssetPartnersGet
    /// <summary>
    /// Get partners with access to asset
    /// </summary>
   [<FunctionName("BusinessAssetPartnersGet")>]
    let BusinessAssetPartnersGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/assets/{asset_id}/partners")>]
        req:HttpRequest ) =

      let result = BusinessAccessAssetsApiService.BusinessAssetPartnersGet ()
      match result with
      | BusinessAssetPartnersGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessAssetPartnersGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessAssetsGet
    /// <summary>
    /// List business assets
    /// </summary>
   [<FunctionName("BusinessAssetsGet")>]
    let BusinessAssetsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/assets")>]
        req:HttpRequest ) =

      let result = BusinessAccessAssetsApiService.BusinessAssetsGet ()
      match result with
      | BusinessAssetsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessAssetsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessMemberAssetsGet
    /// <summary>
    /// Get assets assigned to a member
    /// </summary>
   [<FunctionName("BusinessMemberAssetsGet")>]
    let BusinessMemberAssetsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/members/{member_id}/assets")>]
        req:HttpRequest ) =

      let result = BusinessAccessAssetsApiService.BusinessMemberAssetsGet ()
      match result with
      | BusinessMemberAssetsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessMemberAssetsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessMembersAssetAccessDelete
    /// <summary>
    /// Delete member access to asset
    /// </summary>
   [<FunctionName("BusinessMembersAssetAccessDelete")>]
    let BusinessMembersAssetAccessDelete
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/businesses/{business_id}/members/assets/access")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<BusinessMembersAssetAccessDeleteBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessAssetsApiService.BusinessMembersAssetAccessDelete bodyParams
      match result with
      | BusinessMembersAssetAccessDeleteStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessMembersAssetAccessDeleteDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessMembersAssetAccessUpdate
    /// <summary>
    /// Assign/Update member asset permissions
    /// </summary>
   [<FunctionName("BusinessMembersAssetAccessUpdate")>]
    let BusinessMembersAssetAccessUpdate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/businesses/{business_id}/members/assets/access")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<BusinessMembersAssetAccessUpdateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessAssetsApiService.BusinessMembersAssetAccessUpdate bodyParams
      match result with
      | BusinessMembersAssetAccessUpdateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessMembersAssetAccessUpdateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessPartnerAssetAccessGet
    /// <summary>
    /// Get assets assigned to a partner or assets assigned by a partner
    /// </summary>
   [<FunctionName("BusinessPartnerAssetAccessGet")>]
    let BusinessPartnerAssetAccessGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/partners/{partner_id}/assets")>]
        req:HttpRequest ) =

      let result = BusinessAccessAssetsApiService.BusinessPartnerAssetAccessGet ()
      match result with
      | BusinessPartnerAssetAccessGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessPartnerAssetAccessGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region DeletePartnerAssetAccessHandlerImpl
    /// <summary>
    /// Delete partner access to asset
    /// </summary>
   [<FunctionName("DeletePartnerAssetAccessHandlerImpl")>]
    let DeletePartnerAssetAccessHandlerImpl
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/businesses/{business_id}/partners/assets")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<DeletePartnerAssetAccessHandlerImplBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessAssetsApiService.DeletePartnerAssetAccessHandlerImpl bodyParams
      match result with
      | DeletePartnerAssetAccessHandlerImplStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | DeletePartnerAssetAccessHandlerImplDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UpdatePartnerAssetAccessHandlerImpl
    /// <summary>
    /// Assign/Update partner asset permissions
    /// </summary>
   [<FunctionName("UpdatePartnerAssetAccessHandlerImpl")>]
    let UpdatePartnerAssetAccessHandlerImpl
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/businesses/{business_id}/partners/assets")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<UpdatePartnerAssetAccessHandlerImplBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessAssetsApiService.UpdatePartnerAssetAccessHandlerImpl bodyParams
      match result with
      | UpdatePartnerAssetAccessHandlerImplStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UpdatePartnerAssetAccessHandlerImplDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

