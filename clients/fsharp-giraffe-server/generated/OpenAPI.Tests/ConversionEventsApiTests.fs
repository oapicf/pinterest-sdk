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
open ConversionEventsApiHandlerTestsHelper
open OpenAPI.ConversionEventsApiHandler
open OpenAPI.ConversionEventsApiHandlerParams
open OpenAPI.Model.ConversionEvents
open OpenAPI.Model.ConversionEventsCreate
open OpenAPI.Model.DetailedError
open OpenAPI.Model.PinterestLibError

module ConversionEventsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``EventsCreate - Send conversions returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 422 where The request was well-formed but was unable to be followed due to semantic errors.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(422))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 503 where The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(503))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``EventsCreate - Send conversions returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/events".Replace("adAccountId", "ADDME") + "?test=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getEventsCreateExample "application/json")
      // or pass a body of type ConversionEventsCreate
      let body = obj() :?> ConversionEventsCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

