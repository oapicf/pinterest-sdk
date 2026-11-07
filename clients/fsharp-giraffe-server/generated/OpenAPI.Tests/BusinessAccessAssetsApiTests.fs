namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open BusinessAccessAssetsApiHandlerTestsHelper
open OpenAPI.BusinessAccessAssetsApiHandler
open OpenAPI.BusinessAccessAssetsApiHandlerParams
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

module BusinessAccessAssetsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type AssetGroupInputCreate
      let body = obj() :?> AssetGroupInputCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupDelete - Delete asset groups. returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupDeleteExample "application/json")
      // or pass a body of type AssetGroupDeletionDelete
      let body = obj() :?> AssetGroupDeletionDelete |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupDelete - Delete asset groups. returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupDeleteExample "application/json")
      // or pass a body of type AssetGroupDeletionDelete
      let body = obj() :?> AssetGroupDeletionDelete |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type AssetGroupModificationReadOrUpdate
      let body = obj() :?> AssetGroupModificationReadOrUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type AssetGroupModificationReadOrUpdate
      let body = obj() :?> AssetGroupModificationReadOrUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type AssetGroupModificationReadOrUpdate
      let body = obj() :?> AssetGroupModificationReadOrUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type AssetGroupModificationReadOrUpdate
      let body = obj() :?> AssetGroupModificationReadOrUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type AssetGroupModificationReadOrUpdate
      let body = obj() :?> AssetGroupModificationReadOrUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type AssetGroupModificationReadOrUpdate
      let body = obj() :?> AssetGroupModificationReadOrUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type AssetGroupModificationReadOrUpdate
      let body = obj() :?> AssetGroupModificationReadOrUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&fetchSystemUsers=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&fetchSystemUsers=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&fetchSystemUsers=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&fetchSystemUsers=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&fetchSystemUsers=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&fetchSystemUsers=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&fetchSystemUsers=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&assetPermissionType=ADDME&adAccountStatuses=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&assetPermissionType=ADDME&adAccountStatuses=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&assetPermissionType=ADDME&adAccountStatuses=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&assetPermissionType=ADDME&adAccountStatuses=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&assetPermissionType=ADDME&adAccountStatuses=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&assetPermissionType=ADDME&adAccountStatuses=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&assetPermissionType=ADDME&adAccountStatuses=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessDelete - Delete member access to asset returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessDeleteExample "application/json")
      // or pass a body of type BusinessMembersAssetAccessDeleteBody
      let body = obj() :?> BusinessMembersAssetAccessDeleteBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessDelete - Delete member access to asset returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessDeleteExample "application/json")
      // or pass a body of type BusinessMembersAssetAccessDeleteBody
      let body = obj() :?> BusinessMembersAssetAccessDeleteBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&sortBy=ADDME&sortAscending=ADDME&searchBy=ADDME&searchValue=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeletePartnerAssetAccessHandlerImpl - Delete partner access to asset returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type DeletePartnerAssetAccessBody
      let body = obj() :?> DeletePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePartnerAssetAccessHandlerImpl - Delete partner access to asset returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type DeletePartnerAssetAccessBody
      let body = obj() :?> DeletePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

