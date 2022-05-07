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
open OpenAPI.Model.CatalogsFeedsCreateRequest
open OpenAPI.Model.CatalogsFeedsUpdateRequest
open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsBatchRequest
open OpenAPI.Model.CatalogsProductGroup
open OpenAPI.Model.CatalogsProductGroupCreateRequest
open OpenAPI.Model.CatalogsProductGroupUpdateRequest
open OpenAPI.Model.Error
open OpenAPI.Model.Paginated

module CatalogsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 201 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupCreateRequest
      let body = obj() :?> CatalogsProductGroupCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupCreateRequest
      let body = obj() :?> CatalogsProductGroupCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupCreateRequest
      let body = obj() :?> CatalogsProductGroupCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsCreate - Create product group returns 403 where Forbidden. Account not approved for feed mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupCreateRequest
      let body = obj() :?> CatalogsProductGroupCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupCreateRequest
      let body = obj() :?> CatalogsProductGroupCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsCreateExample "application/json")
      // or pass a body of type CatalogsProductGroupCreateRequest
      let body = obj() :?> CatalogsProductGroupCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsDelete - Delete product group returns 403 where Forbidden. Account not approved for feed mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - Get product groups list returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - Get product groups list returns 400 where Invalid feed parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - Get product groups list returns 401 where Unauthorized access.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - Get product groups list returns 403 where Forbidden. Account not approved for feed mutations yet.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - Get product groups list returns 404 where Data feed not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - Get product groups list returns 409 where Conflict. Can&#39;t create this catalogs product group with this value.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsProductGroupsList - Get product groups list returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups" + "?feedId=ADDME&bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupUpdateRequest
      let body = obj() :?> CatalogsProductGroupUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupUpdateRequest
      let body = obj() :?> CatalogsProductGroupUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupUpdateRequest
      let body = obj() :?> CatalogsProductGroupUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsProductGroupsUpdate - Update product group returns 404 where Catalogs product group not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupUpdateRequest
      let body = obj() :?> CatalogsProductGroupUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupUpdateRequest
      let body = obj() :?> CatalogsProductGroupUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/product_groups/{product_group_id}".Replace("productGroupId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsProductGroupsUpdateExample "application/json")
      // or pass a body of type CatalogsProductGroupUpdateRequest
      let body = obj() :?> CatalogsProductGroupUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds/{feed_id}/processing_results".Replace("feedId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type CatalogsFeedsCreateRequest
      let body = obj() :?> CatalogsFeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type CatalogsFeedsCreateRequest
      let body = obj() :?> CatalogsFeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type CatalogsFeedsCreateRequest
      let body = obj() :?> CatalogsFeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type CatalogsFeedsCreateRequest
      let body = obj() :?> CatalogsFeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type CatalogsFeedsCreateRequest
      let body = obj() :?> CatalogsFeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type CatalogsFeedsCreateRequest
      let body = obj() :?> CatalogsFeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(422))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FeedsCreate - Create feed returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/feeds"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsCreateExample "application/json")
      // or pass a body of type CatalogsFeedsCreateRequest
      let body = obj() :?> CatalogsFeedsCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

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

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds" + "?bookmark=ADDME&pageSize=ADDME"

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type CatalogsFeedsUpdateRequest
      let body = obj() :?> CatalogsFeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type CatalogsFeedsUpdateRequest
      let body = obj() :?> CatalogsFeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type CatalogsFeedsUpdateRequest
      let body = obj() :?> CatalogsFeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type CatalogsFeedsUpdateRequest
      let body = obj() :?> CatalogsFeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/feeds/{feed_id}".Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFeedsUpdateExample "application/json")
      // or pass a body of type CatalogsFeedsUpdateRequest
      let body = obj() :?> CatalogsFeedsUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs items batch returns 200 where Response containing the requested catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs items batch returns 401 where Not authorized to access catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs items batch returns 403 where Not authorized to access catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs items batch returns 404 where Catalogs items batch not found`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchGet - Get catalogs items batch returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch/{batch_id}".Replace("batchId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemsBatchPost - Perform an operation on an item batch returns 200 where Response containing the requested catalogs items batch`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type CatalogsItemsBatchRequest
      let body = obj() :?> CatalogsItemsBatchRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchPost - Perform an operation on an item batch returns 401 where Not authorized to post catalogs items`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type CatalogsItemsBatchRequest
      let body = obj() :?> CatalogsItemsBatchRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchPost - Perform an operation on an item batch returns 403 where Not authorized to post catalogs items`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type CatalogsItemsBatchRequest
      let body = obj() :?> CatalogsItemsBatchRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ItemsBatchPost - Perform an operation on an item batch returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/items/batch"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getItemsBatchPostExample "application/json")
      // or pass a body of type CatalogsItemsBatchRequest
      let body = obj() :?> CatalogsItemsBatchRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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

      let path = "/v5/catalogs/items" + "?country=ADDME&itemIds=ADDME&language=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
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

      let path = "/v5/catalogs/items" + "?country=ADDME&itemIds=ADDME&language=ADDME"

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

      let path = "/v5/catalogs/items" + "?country=ADDME&itemIds=ADDME&language=ADDME"

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

      let path = "/v5/catalogs/items" + "?country=ADDME&itemIds=ADDME&language=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

