namespace OpenAPI

open BusinessAccessInviteApiHandlerParams
open BusinessAccessInviteApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BusinessAccessInviteApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AssetAccessRequestsCreate
    /// <summary>
    /// Create a request to access an existing partner&#39;s assets.
    /// </summary>
   [<FunctionName("AssetAccessRequestsCreate")>]
    let AssetAccessRequestsCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/businesses/{business_id}/requests/assets/access")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AssetAccessRequestsCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessInviteApiService.AssetAccessRequestsCreate bodyParams
      match result with
      | AssetAccessRequestsCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AssetAccessRequestsCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CancelInvitesOrRequests
    /// <summary>
    /// Cancel invites/requests
    /// </summary>
   [<FunctionName("CancelInvitesOrRequests")>]
    let CancelInvitesOrRequests
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/businesses/{business_id}/invites")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CancelInvitesOrRequestsBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessInviteApiService.CancelInvitesOrRequests bodyParams
      match result with
      | CancelInvitesOrRequestsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CancelInvitesOrRequestsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CreateAssetInvites
    /// <summary>
    /// Update invite/request with an asset permission
    /// </summary>
   [<FunctionName("CreateAssetInvites")>]
    let CreateAssetInvites
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/businesses/{business_id}/invites/assets/access")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateAssetInvitesBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessInviteApiService.CreateAssetInvites bodyParams
      match result with
      | CreateAssetInvitesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CreateAssetInvitesDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CreateMembershipOrPartnershipInvites
    /// <summary>
    /// Create invites or requests
    /// </summary>
   [<FunctionName("CreateMembershipOrPartnershipInvites")>]
    let CreateMembershipOrPartnershipInvites
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/businesses/{business_id}/invites")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateMembershipOrPartnershipInvitesBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessInviteApiService.CreateMembershipOrPartnershipInvites bodyParams
      match result with
      | CreateMembershipOrPartnershipInvitesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CreateMembershipOrPartnershipInvitesDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetInvites
    /// <summary>
    /// Get invites/requests
    /// </summary>
   [<FunctionName("GetInvites")>]
    let GetInvites
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/invites")>]
        req:HttpRequest ) =

      let result = BusinessAccessInviteApiService.GetInvites ()
      match result with
      | GetInvitesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetInvitesDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region RespondBusinessAccessInvites
    /// <summary>
    /// Accept or decline an invite/request
    /// </summary>
   [<FunctionName("RespondBusinessAccessInvites")>]
    let RespondBusinessAccessInvites
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/businesses/invites")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<RespondBusinessAccessInvitesBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessInviteApiService.RespondBusinessAccessInvites bodyParams
      match result with
      | RespondBusinessAccessInvitesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | RespondBusinessAccessInvitesDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

