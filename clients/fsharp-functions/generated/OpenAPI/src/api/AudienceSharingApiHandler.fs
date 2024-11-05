namespace OpenAPI

open AudienceSharingApiHandlerParams
open AudienceSharingApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AudienceSharingApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountsAudiencesSharedAccountsList
    /// <summary>
    /// List accounts with access to an audience owned by an ad account
    /// </summary>
   [<FunctionName("AdAccountsAudiencesSharedAccountsList")>]
    let AdAccountsAudiencesSharedAccountsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts")>]
        req:HttpRequest ) =

      let result = AudienceSharingApiService.AdAccountsAudiencesSharedAccountsList ()
      match result with
      | AdAccountsAudiencesSharedAccountsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsAudiencesSharedAccountsListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdAccountsAudiencesSharedAccountsListStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | AdAccountsAudiencesSharedAccountsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BusinessAccountAudiencesSharedAccountsList
    /// <summary>
    /// List accounts with access to an audience owned by a business
    /// </summary>
   [<FunctionName("BusinessAccountAudiencesSharedAccountsList")>]
    let BusinessAccountAudiencesSharedAccountsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/audiences/shared/accounts")>]
        req:HttpRequest ) =

      let result = AudienceSharingApiService.BusinessAccountAudiencesSharedAccountsList ()
      match result with
      | BusinessAccountAudiencesSharedAccountsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BusinessAccountAudiencesSharedAccountsListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | BusinessAccountAudiencesSharedAccountsListStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | BusinessAccountAudiencesSharedAccountsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SharedAudiencesForBusinessList
    /// <summary>
    /// List received audiences for a business
    /// </summary>
   [<FunctionName("SharedAudiencesForBusinessList")>]
    let SharedAudiencesForBusinessList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/audiences")>]
        req:HttpRequest ) =

      let result = AudienceSharingApiService.SharedAudiencesForBusinessList ()
      match result with
      | SharedAudiencesForBusinessListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SharedAudiencesForBusinessListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SharedAudiencesForBusinessListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UpdateAdAccountToAdAccountSharedAudience
    /// <summary>
    /// Update audience sharing between ad accounts
    /// </summary>
   [<FunctionName("UpdateAdAccountToAdAccountSharedAudience")>]
    let UpdateAdAccountToAdAccountSharedAudience
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<UpdateAdAccountToAdAccountSharedAudienceBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AudienceSharingApiService.UpdateAdAccountToAdAccountSharedAudience bodyParams
      match result with
      | UpdateAdAccountToAdAccountSharedAudienceStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UpdateAdAccountToAdAccountSharedAudienceStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UpdateAdAccountToBusinessSharedAudience
    /// <summary>
    /// Update audience sharing from an ad account to businesses
    /// </summary>
   [<FunctionName("UpdateAdAccountToBusinessSharedAudience")>]
    let UpdateAdAccountToBusinessSharedAudience
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<UpdateAdAccountToBusinessSharedAudienceBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AudienceSharingApiService.UpdateAdAccountToBusinessSharedAudience bodyParams
      match result with
      | UpdateAdAccountToBusinessSharedAudienceStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UpdateAdAccountToBusinessSharedAudienceStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | UpdateAdAccountToBusinessSharedAudienceDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UpdateBusinessToAdAccountSharedAudience
    /// <summary>
    /// Update audience sharing from a business to ad accounts
    /// </summary>
   [<FunctionName("UpdateBusinessToAdAccountSharedAudience")>]
    let UpdateBusinessToAdAccountSharedAudience
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/businesses/{business_id}/audiences/ad_accounts/shared")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<UpdateBusinessToAdAccountSharedAudienceBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AudienceSharingApiService.UpdateBusinessToAdAccountSharedAudience bodyParams
      match result with
      | UpdateBusinessToAdAccountSharedAudienceStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UpdateBusinessToAdAccountSharedAudienceStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | UpdateBusinessToAdAccountSharedAudienceDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UpdateBusinessToBusinessSharedAudience
    /// <summary>
    /// Update audience sharing between businesses
    /// </summary>
   [<FunctionName("UpdateBusinessToBusinessSharedAudience")>]
    let UpdateBusinessToBusinessSharedAudience
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/businesses/{business_id}/audiences/businesses/shared")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<UpdateBusinessToBusinessSharedAudienceBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AudienceSharingApiService.UpdateBusinessToBusinessSharedAudience bodyParams
      match result with
      | UpdateBusinessToBusinessSharedAudienceStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UpdateBusinessToBusinessSharedAudienceStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | UpdateBusinessToBusinessSharedAudienceDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

