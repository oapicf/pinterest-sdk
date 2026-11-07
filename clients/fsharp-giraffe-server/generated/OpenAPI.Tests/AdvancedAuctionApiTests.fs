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
open AdvancedAuctionApiHandlerTestsHelper
open OpenAPI.AdvancedAuctionApiHandler
open OpenAPI.AdvancedAuctionApiHandlerParams
open OpenAPI.Model.AdvancedAuctionItems
open OpenAPI.Model.AdvancedAuctionItemsGetRequest
open OpenAPI.Model.AdvancedAuctionItemsSubmitRequest
open OpenAPI.Model.AdvancedAuctionProcessedItems
open OpenAPI.Model.PinterestLibError

module AdvancedAuctionApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 500 where The server encountered an unexpected condition that prevented it from fulfilling the request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/get" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsGetPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsGetRequest
      let body = obj() :?> AdvancedAuctionItemsGetRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 206 where Successful`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(206))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 500 where The server encountered an unexpected condition that prevented it from fulfilling the request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/advanced_auction/items/submit" + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdvancedAuctionItemsSubmitPostExample "application/json")
      // or pass a body of type AdvancedAuctionItemsSubmitRequest
      let body = obj() :?> AdvancedAuctionItemsSubmitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

