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
open OpenAPI.Model.CatalogsProductGroupsCreateManyRequestItems
open OpenAPI.Model.CatalogsProductGroupsCreateRequestSchema
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequestSchema
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.PinterestLibError

module CatalogProductGroupsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME&pinMetrics=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME&pinMetrics=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME&pinMetrics=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME&pinMetrics=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME&pinMetrics=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME&pinMetrics=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupPinsList - List products by product group returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/products".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME&pinMetrics=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateRequestSchema
      let body = obj() :?> CatalogsProductGroupsCreateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 201 where The request has succeeded and a new resource has been created as a result.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateManyRequestItems[]
      let body = obj() :?> CatalogsProductGroupsCreateManyRequestItems[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateManyRequestItems[]
      let body = obj() :?> CatalogsProductGroupsCreateManyRequestItems[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateManyRequestItems[]
      let body = obj() :?> CatalogsProductGroupsCreateManyRequestItems[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateManyRequestItems[]
      let body = obj() :?> CatalogsProductGroupsCreateManyRequestItems[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateManyRequestItems[]
      let body = obj() :?> CatalogsProductGroupsCreateManyRequestItems[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateManyRequestItems[]
      let body = obj() :?> CatalogsProductGroupsCreateManyRequestItems[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreateMany - Create product groups returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateManyExample "application/json")
      // or pass a body of type CatalogsProductGroupsCreateManyRequestItems[]
      let body = obj() :?> CatalogsProductGroupsCreateManyRequestItems[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 204 where Resource deleted successfully.`` () =
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
  let ``CatalogsProductGroupsDelete - Delete product group returns 400 where The request could not be understood by the server due to unexpected data.`` () =
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
  let ``CatalogsProductGroupsDelete - Delete product group returns 401 where Authentication is required and has either failed or not been provided.`` () =
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
  let ``CatalogsProductGroupsDelete - Delete product group returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
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
  let ``CatalogsProductGroupsDelete - Delete product group returns 404 where The requested resource could not be found on this server.`` () =
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
  let ``CatalogsProductGroupsDelete - Delete product group returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 0 where An unexpected error response.`` () =
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
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 204 where Resource deleted successfully.`` () =
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
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 401 where Authentication is required and has either failed or not been provided.`` () =
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
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
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
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 404 where The requested resource could not be found on this server.`` () =
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
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/multiple" + "?id=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDeleteMany - Delete product groups returns 0 where An unexpected error response.`` () =
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
  let ``CatalogsProductGroupsGet - Get product group returns 200 where The request has succeeded.`` () =
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
  let ``CatalogsProductGroupsGet - Get product group returns 400 where The request could not be understood by the server due to unexpected data.`` () =
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
  let ``CatalogsProductGroupsGet - Get product group returns 401 where Authentication is required and has either failed or not been provided.`` () =
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
  let ``CatalogsProductGroupsGet - Get product group returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
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
  let ``CatalogsProductGroupsGet - Get product group returns 404 where The requested resource could not be found on this server.`` () =
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
  let ``CatalogsProductGroupsGet - Get product group returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsGet - Get product group returns 0 where An unexpected error response.`` () =
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
  let ``CatalogsProductGroupsList - List product groups returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - List product groups returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?id=ADDME&feedId=ADDME&catalogId=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 200 where The request has succeeded.`` () =
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
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 404 where The requested resource could not be found on this server.`` () =
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
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}/product_counts".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsProductCountsGet - Get product counts returns 0 where An unexpected error response.`` () =
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
  let ``CatalogsProductGroupsUpdate - Update single product group returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequestSchema
      let body = obj() :?> CatalogsProductGroupsUpdateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update single product group returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequestSchema
      let body = obj() :?> CatalogsProductGroupsUpdateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update single product group returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequestSchema
      let body = obj() :?> CatalogsProductGroupsUpdateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update single product group returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequestSchema
      let body = obj() :?> CatalogsProductGroupsUpdateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update single product group returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequestSchema
      let body = obj() :?> CatalogsProductGroupsUpdateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update single product group returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequestSchema
      let body = obj() :?> CatalogsProductGroupsUpdateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update single product group returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupsUpdateRequestSchema
      let body = obj() :?> CatalogsProductGroupsUpdateRequestSchema |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List products by filter returns 200 where The request has succeeded.`` () =
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
  let ``ProductsByProductGroupFilterList - List products by filter returns 400 where The request could not be understood by the server due to unexpected data.`` () =
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
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List products by filter returns 401 where Authentication is required and has either failed or not been provided.`` () =
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
  let ``ProductsByProductGroupFilterList - List products by filter returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
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
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List products by filter returns 404 where The requested resource could not be found on this server.`` () =
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
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List products by filter returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
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
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductsByProductGroupFilterList - List products by filter returns 0 where An unexpected error response.`` () =
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

