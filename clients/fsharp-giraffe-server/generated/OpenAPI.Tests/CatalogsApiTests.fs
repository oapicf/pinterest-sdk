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
open CatalogsApiHandlerTestsHelper
open OpenAPI.CatalogsApiHandler
open OpenAPI.CatalogsApiHandlerParams
open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.CatalogsItemValidationIssue
open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsFilters
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCounts
open OpenAPI.Model.CatalogsProductGroupsCreate201Response
open OpenAPI.Model.CatalogsProductGroupsCreateRequest
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.Error
open OpenAPI.Model.FeedProcessingResultsList200Response
open OpenAPI.Model.FeedsCreateRequest
open OpenAPI.Model.FeedsList200Response
open OpenAPI.Model.FeedsUpdateRequest
open OpenAPI.Model.ItemsBatchPostRequest
open OpenAPI.Model.ItemsIssuesList200Response

module CatalogsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CatalogsList - List catalogs returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsList - List catalogs returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsList - List catalogs returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsList - List catalogs returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products for a Product Group returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products for a Product Group returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products for a Product Group returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products for a Product Group returns 404 where Catalogs product group not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products for a Product Group returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 201 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequest
      let body = obj() :?> CatalogsProductGroupsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 400 where Invalid body.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequest
      let body = obj() :?> CatalogsProductGroupsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequest
      let body = obj() :?> CatalogsProductGroupsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequest
      let body = obj() :?> CatalogsProductGroupsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 409 where Conflict. Can&#39;t create this catalogs product group with this value.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequest
      let body = obj() :?> CatalogsProductGroupsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequest
      let body = obj() :?> CatalogsProductGroupsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 204 where Catalogs Product Group deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 400 where Invalid catalogs product group id parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 404 where Catalogs product group not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 409 where Conflict. Can&#39;t delete this catalogs product group.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 400 where Invalid catalogs product group id parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 404 where Catalogs product group not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 409 where Conflict. Can&#39;t get a catalogs product group without an existing catalog.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 400 where Invalid feed parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 404 where Data feed not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 409 where Conflict. Can&#39;t create this catalogs product group with this value.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts for a Product Group returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts for a Product Group returns 404 where Product Group Not Found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts for a Product Group returns 409 where Can&#39;t access this feature without an existing catalog.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts for a Product Group returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequest
      let body = obj() :?> CatalogsProductGroupsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequest
      let body = obj() :?> CatalogsProductGroupsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequest
      let body = obj() :?> CatalogsProductGroupsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequest
      let body = obj() :?> CatalogsProductGroupsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 404 where Catalogs product group not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequest
      let body = obj() :?> CatalogsProductGroupsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 409 where Conflict. Can&#39;t update this catalogs product group to this value.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequest
      let body = obj() :?> CatalogsProductGroupsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequest
      let body = obj() :?> CatalogsProductGroupsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedProcessingResultsList - List processing results for a given feed returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedProcessingResultsList - List processing results for a given feed returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedProcessingResultsList - List processing results for a given feed returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedProcessingResultsList - List processing results for a given feed returns 404 where Feed not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedProcessingResultsList - List processing results for a given feed returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 201 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 400 where Invalid feed parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 403 where Business account required.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 409 where User website required.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 422 where Unique feed name is required.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(422))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 501 where Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;).`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(501))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type FeedsCreateRequest
      let body = obj() :?> FeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsDelete - Delete feed returns 204 where Feed deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsDelete - Delete feed returns 400 where Invalid feed parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsDelete - Delete feed returns 403 where Forbidden. Account not approved for feed mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsDelete - Delete feed returns 404 where Data feed not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsDelete - Delete feed returns 409 where Conflict. Can&#39;t delete a feed with active promotions.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsDelete - Delete feed returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsGet - Get feed returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsGet - Get feed returns 400 where Invalid feed parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsGet - Get feed returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsGet - Get feed returns 404 where Data feed not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsGet - Get feed returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsList - List feeds returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME&catalogId=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsList - List feeds returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME&catalogId=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsList - List feeds returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME&catalogId=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsList - List feeds returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME&catalogId=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FeedsUpdate - Update feed returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type FeedsUpdateRequest
      let body = obj() :?> FeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsUpdate - Update feed returns 400 where Invalid feed parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type FeedsUpdateRequest
      let body = obj() :?> FeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsUpdate - Update feed returns 403 where Forbidden. Account not approved for feed mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type FeedsUpdateRequest
      let body = obj() :?> FeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsUpdate - Update feed returns 404 where Data feed not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type FeedsUpdateRequest
      let body = obj() :?> FeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsUpdate - Update feed returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type FeedsUpdateRequest
      let body = obj() :?> FeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs item batch status returns 200 where Response containing the requested catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs item batch status returns 401 where Not authenticated to access catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs item batch status returns 403 where Not authorized to access catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs item batch status returns 404 where Catalogs items batch not found`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs item batch status returns 405 where Method Not Allowed.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(405))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs item batch status returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchPost - Operate on item batch returns 200 where Response containing the requested catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type ItemsBatchPostRequest
      let body = obj() :?> ItemsBatchPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchPost - Operate on item batch returns 400 where Invalid request parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type ItemsBatchPostRequest
      let body = obj() :?> ItemsBatchPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchPost - Operate on item batch returns 401 where Not authenticated to post catalogs items`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type ItemsBatchPostRequest
      let body = obj() :?> ItemsBatchPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchPost - Operate on item batch returns 403 where Not authorized to post catalogs items`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type ItemsBatchPostRequest
      let body = obj() :?> ItemsBatchPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchPost - Operate on item batch returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type ItemsBatchPostRequest
      let body = obj() :?> ItemsBatchPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsGet - Get catalogs items returns 200 where Response containing the requested catalogs items`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items" + "?adAccountId=ADDME&country=ADDME&language=ADDME&itemIds=ADDME&filters=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsGet - Get catalogs items returns 400 where Invalid request parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items" + "?adAccountId=ADDME&country=ADDME&language=ADDME&itemIds=ADDME&filters=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsGet - Get catalogs items returns 401 where Not authorized to access catalogs items`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items" + "?adAccountId=ADDME&country=ADDME&language=ADDME&itemIds=ADDME&filters=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsGet - Get catalogs items returns 403 where Not authorized to access catalogs items`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items" + "?adAccountId=ADDME&country=ADDME&language=ADDME&itemIds=ADDME&filters=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsGet - Get catalogs items returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items" + "?adAccountId=ADDME&country=ADDME&language=ADDME&itemIds=ADDME&filters=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsIssuesList - List item issues for a given processing result returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/processing_results/{processing_result_id}/item_issues".Replace("processingResultId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&itemNumbers=ADDME&itemValidationIssue=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsIssuesList - List item issues for a given processing result returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/processing_results/{processing_result_id}/item_issues".Replace("processingResultId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&itemNumbers=ADDME&itemValidationIssue=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsIssuesList - List item issues for a given processing result returns 404 where Processing Result not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/processing_results/{processing_result_id}/item_issues".Replace("processingResultId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&itemNumbers=ADDME&itemValidationIssue=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsIssuesList - List item issues for a given processing result returns 501 where Not implemented.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/processing_results/{processing_result_id}/item_issues".Replace("processingResultId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&itemNumbers=ADDME&itemValidationIssue=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(501))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsIssuesList - List item issues for a given processing result returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/processing_results/{processing_result_id}/item_issues".Replace("processingResultId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&itemNumbers=ADDME&itemValidationIssue=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List filtered products returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductsByProductGroupFilterListExample "application/json")
      // or pass a body of type CatalogsListProductsByFilterRequest
      let body = obj() :?> CatalogsListProductsByFilterRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List filtered products returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductsByProductGroupFilterListExample "application/json")
      // or pass a body of type CatalogsListProductsByFilterRequest
      let body = obj() :?> CatalogsListProductsByFilterRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List filtered products returns 409 where Conflict. Can&#39;t get products.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductsByProductGroupFilterListExample "application/json")
      // or pass a body of type CatalogsListProductsByFilterRequest
      let body = obj() :?> CatalogsListProductsByFilterRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List filtered products returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductsByProductGroupFilterListExample "application/json")
      // or pass a body of type CatalogsListProductsByFilterRequest
      let body = obj() :?> CatalogsListProductsByFilterRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

