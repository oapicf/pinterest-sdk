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
open PinsApiHandlerTestsHelper
open OpenAPI.PinsApiHandler
open OpenAPI.PinsApiHandlerParams
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error
open OpenAPI.Model.Pin

module PinsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``PinsAnalytics - Get Pin analytics returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/analytics".Replace("pinId", "ADDME") + "?startDate=ADDME&endDate=ADDME&appTypes=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsAnalytics - Get Pin analytics returns 403 where Not authorized to access board or Pin.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/analytics".Replace("pinId", "ADDME") + "?startDate=ADDME&endDate=ADDME&appTypes=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsAnalytics - Get Pin analytics returns 404 where Pin not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/analytics".Replace("pinId", "ADDME") + "?startDate=ADDME&endDate=ADDME&appTypes=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsAnalytics - Get Pin analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}/analytics".Replace("pinId", "ADDME") + "?startDate=ADDME&endDate=ADDME&appTypes=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsCreate - Create Pin returns 201 where Successful pin creation.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPinsCreateExample "application/json")
      // or pass a body of type Pin
      let body = obj() :?> Pin |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PinsCreate - Create Pin returns 400 where Invalid Pin parameters response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPinsCreateExample "application/json")
      // or pass a body of type Pin
      let body = obj() :?> Pin |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PinsCreate - Create Pin returns 403 where The Pin&#39;s image is too small, too large or is broken`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPinsCreateExample "application/json")
      // or pass a body of type Pin
      let body = obj() :?> Pin |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PinsCreate - Create Pin returns 404 where Board or section not found`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPinsCreateExample "application/json")
      // or pass a body of type Pin
      let body = obj() :?> Pin |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PinsCreate - Create Pin returns 429 where This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPinsCreateExample "application/json")
      // or pass a body of type Pin
      let body = obj() :?> Pin |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PinsCreate - Create Pin returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPinsCreateExample "application/json")
      // or pass a body of type Pin
      let body = obj() :?> Pin |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PinsDelete - Delete Pin returns 204 where Successfully deleted Pin`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsDelete - Delete Pin returns 403 where Not authorized to access board or Pin.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsDelete - Delete Pin returns 404 where Pin not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsDelete - Delete Pin returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsGet - Get Pin returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsGet - Get Pin returns 403 where Not authorized to access board or Pin.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsGet - Get Pin returns 404 where Pin not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PinsGet - Get Pin returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/pins/{pin_id}".Replace("pinId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

