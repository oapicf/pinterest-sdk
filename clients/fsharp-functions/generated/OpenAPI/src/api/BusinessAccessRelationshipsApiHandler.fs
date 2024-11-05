namespace OpenAPI

open BusinessAccessRelationshipsApiHandlerParams
open BusinessAccessRelationshipsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BusinessAccessRelationshipsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteBusinessMembership
    /// <summary>
    /// Terminate business memberships
    /// </summary>
   [<FunctionName("DeleteBusinessMembership")>]
    let DeleteBusinessMembership
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/businesses/{business_id}/members")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<DeleteBusinessMembershipBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessRelationshipsApiService.DeleteBusinessMembership bodyParams
      match result with
      | DeleteBusinessMembershipStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | DeleteBusinessMembershipDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region DeleteBusinessPartners
    /// <summary>
    /// Terminate business partnerships
    /// </summary>
   [<FunctionName("DeleteBusinessPartners")>]
    let DeleteBusinessPartners
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/businesses/{business_id}/partners")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<DeleteBusinessPartnersBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessRelationshipsApiService.DeleteBusinessPartners bodyParams
      match result with
      | DeleteBusinessPartnersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | DeleteBusinessPartnersStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | DeleteBusinessPartnersDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetBusinessEmployers
    /// <summary>
    /// List business employers for user
    /// </summary>
   [<FunctionName("GetBusinessEmployers")>]
    let GetBusinessEmployers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/employers")>]
        req:HttpRequest ) =

      let result = BusinessAccessRelationshipsApiService.GetBusinessEmployers ()
      match result with
      | GetBusinessEmployersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetBusinessEmployersDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetBusinessMembers
    /// <summary>
    /// Get business members
    /// </summary>
   [<FunctionName("GetBusinessMembers")>]
    let GetBusinessMembers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/members")>]
        req:HttpRequest ) =

      let result = BusinessAccessRelationshipsApiService.GetBusinessMembers ()
      match result with
      | GetBusinessMembersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetBusinessMembersDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetBusinessPartners
    /// <summary>
    /// Get business partners
    /// </summary>
   [<FunctionName("GetBusinessPartners")>]
    let GetBusinessPartners
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/businesses/{business_id}/partners")>]
        req:HttpRequest ) =

      let result = BusinessAccessRelationshipsApiService.GetBusinessPartners ()
      match result with
      | GetBusinessPartnersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetBusinessPartnersDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UpdateBusinessMemberships
    /// <summary>
    /// Update member&#39;s business role
    /// </summary>
   [<FunctionName("UpdateBusinessMemberships")>]
    let UpdateBusinessMemberships
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/businesses/{business_id}/members")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<UpdateBusinessMembershipsBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BusinessAccessRelationshipsApiService.UpdateBusinessMemberships bodyParams
      match result with
      | UpdateBusinessMembershipsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UpdateBusinessMembershipsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

