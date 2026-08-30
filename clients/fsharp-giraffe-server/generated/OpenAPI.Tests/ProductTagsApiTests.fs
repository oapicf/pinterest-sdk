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
open ProductTagsApiHandlerTestsHelper
open OpenAPI.ProductTagsApiHandler
open OpenAPI.ProductTagsApiHandlerParams
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ProductTagsBulkAddRequest
open OpenAPI.Model.ProductTagsBulkDeleteRequest
open OpenAPI.Model.ProductTagsError
open OpenAPI.Model.ProductTagsResponse

module ProductTagsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ProductTagsBulkAdd - Add product tags to pin returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkAddExample "application/json")
      // or pass a body of type ProductTagsBulkAddRequest
      let body = obj() :?> ProductTagsBulkAddRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkAdd - Add product tags to pin returns 400 where The request contains ineligible product tags.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkAddExample "application/json")
      // or pass a body of type ProductTagsBulkAddRequest
      let body = obj() :?> ProductTagsBulkAddRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkAdd - Add product tags to pin returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkAddExample "application/json")
      // or pass a body of type ProductTagsBulkAddRequest
      let body = obj() :?> ProductTagsBulkAddRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkAdd - Add product tags to pin returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkAddExample "application/json")
      // or pass a body of type ProductTagsBulkAddRequest
      let body = obj() :?> ProductTagsBulkAddRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkAdd - Add product tags to pin returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkAddExample "application/json")
      // or pass a body of type ProductTagsBulkAddRequest
      let body = obj() :?> ProductTagsBulkAddRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkAdd - Add product tags to pin returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkAddExample "application/json")
      // or pass a body of type ProductTagsBulkAddRequest
      let body = obj() :?> ProductTagsBulkAddRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkDelete - Delete product tags from pin returns 204 where Resource deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags/bulk-delete".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkDeleteExample "application/json")
      // or pass a body of type ProductTagsBulkDeleteRequest
      let body = obj() :?> ProductTagsBulkDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkDelete - Delete product tags from pin returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags/bulk-delete".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkDeleteExample "application/json")
      // or pass a body of type ProductTagsBulkDeleteRequest
      let body = obj() :?> ProductTagsBulkDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkDelete - Delete product tags from pin returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags/bulk-delete".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkDeleteExample "application/json")
      // or pass a body of type ProductTagsBulkDeleteRequest
      let body = obj() :?> ProductTagsBulkDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkDelete - Delete product tags from pin returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags/bulk-delete".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkDeleteExample "application/json")
      // or pass a body of type ProductTagsBulkDeleteRequest
      let body = obj() :?> ProductTagsBulkDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkDelete - Delete product tags from pin returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags/bulk-delete".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkDeleteExample "application/json")
      // or pass a body of type ProductTagsBulkDeleteRequest
      let body = obj() :?> ProductTagsBulkDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkDelete - Delete product tags from pin returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags/bulk-delete".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkDeleteExample "application/json")
      // or pass a body of type ProductTagsBulkDeleteRequest
      let body = obj() :?> ProductTagsBulkDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsBulkDelete - Delete product tags from pin returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags/bulk-delete".Replace("pinId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductTagsBulkDeleteExample "application/json")
      // or pass a body of type ProductTagsBulkDeleteRequest
      let body = obj() :?> ProductTagsBulkDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductTagsList - Get product tags for pin returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductTagsList - Get product tags for pin returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductTagsList - Get product tags for pin returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductTagsList - Get product tags for pin returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductTagsList - Get product tags for pin returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductTagsList - Get product tags for pin returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductTagsList - Get product tags for pin returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/product_tags".Replace("pinId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

