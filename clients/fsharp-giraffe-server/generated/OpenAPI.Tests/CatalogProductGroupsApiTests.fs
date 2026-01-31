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
open CatalogProductGroupsApiHandlerTestsHelper
open OpenAPI.CatalogProductGroupsApiHandler
open OpenAPI.CatalogProductGroupsApiHandlerParams
open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCountsVertical
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.Error
open OpenAPI.Model.MultipleProductGroupsInner

module CatalogProductGroupsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 404 where Catalogs product group not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

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
      // or pass a body of type MultipleProductGroupsInner
      let body = obj() :?> MultipleProductGroupsInner |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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
      // or pass a body of type MultipleProductGroupsInner
      let body = obj() :?> MultipleProductGroupsInner |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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
      // or pass a body of type MultipleProductGroupsInner
      let body = obj() :?> MultipleProductGroupsInner |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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
      // or pass a body of type MultipleProductGroupsInner
      let body = obj() :?> MultipleProductGroupsInner |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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
      // or pass a body of type MultipleProductGroupsInner
      let body = obj() :?> MultipleProductGroupsInner |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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
      // or pass a body of type MultipleProductGroupsInner
      let body = obj() :?> MultipleProductGroupsInner |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 201 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type MultipleProductGroupsInner[]
      let body = obj() :?> MultipleProductGroupsInner[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 400 where Invalid body.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type MultipleProductGroupsInner[]
      let body = obj() :?> MultipleProductGroupsInner[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type MultipleProductGroupsInner[]
      let body = obj() :?> MultipleProductGroupsInner[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type MultipleProductGroupsInner[]
      let body = obj() :?> MultipleProductGroupsInner[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 409 where Conflict. Can&#39;t create this catalogs product group with this value.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type MultipleProductGroupsInner[]
      let body = obj() :?> MultipleProductGroupsInner[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type MultipleProductGroupsInner[]
      let body = obj() :?> MultipleProductGroupsInner[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 204 where Catalogs Product Groups deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 404 where Catalogs product group not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 409 where Conflict. Can&#39;t delete this catalogs product group.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

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

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

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

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

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

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

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

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

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

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

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

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

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

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 200 where Success`` () =
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
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 404 where Product Group Not Found.`` () =
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
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 409 where Can&#39;t access this feature without an existing catalog.`` () =
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
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 0 where Unexpected error.`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 200 where Success`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 400 where Invalid parameters.`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 401 where Unauthorized access.`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 403 where Forbidden. Account not approved for catalog product group mutations yet.`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 404 where Catalogs product group not found.`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 409 where Conflict. Can&#39;t update this catalogs product group to this value.`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 0 where Unexpected error.`` () =
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
  let ``ProductsByProductGroupFilterList - List products by filter returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

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
  let ``ProductsByProductGroupFilterList - List products by filter returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

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
  let ``ProductsByProductGroupFilterList - List products by filter returns 409 where Conflict. Can&#39;t get products.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

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
  let ``ProductsByProductGroupFilterList - List products by filter returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/products/get_by_product_group_filters" + "?bookmark=ADDME&pageSize=ADDME&adAccountId=ADDME&pinMetrics=ADDME"

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

