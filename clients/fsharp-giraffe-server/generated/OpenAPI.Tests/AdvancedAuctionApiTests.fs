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
open OpenAPI.Model.Error

module AdvancedAuctionApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 200 where Response containing the bid option values for the requested retail catalog items. Items that don&#39;t exist or do not have bid options set won&#39;t be present in the response.`` () =
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
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 400 where Invalid request parameters.`` () =
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
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 401 where Not authenticated to get item bid options`` () =
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
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 403 where Not authorized to get item bid options`` () =
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
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 500 where Internal error`` () =
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
  let ``AdvancedAuctionItemsGetPost - Get item bid options (POST) returns 0 where Unexpected error`` () =
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
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 200 where Response containing the results of the item bid options operations`` () =
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
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 400 where Invalid request parameters.`` () =
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
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 401 where Not authenticated to post item bid options`` () =
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
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 403 where Not authorized to post item bid options`` () =
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
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 500 where Internal error`` () =
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
  let ``AdvancedAuctionItemsSubmitPost - Operate on item level bid options returns 0 where Unexpected error`` () =
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

