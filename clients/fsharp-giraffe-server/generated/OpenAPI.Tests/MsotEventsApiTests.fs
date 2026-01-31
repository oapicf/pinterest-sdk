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
open MsotEventsApiHandlerTestsHelper
open OpenAPI.MsotEventsApiHandler
open OpenAPI.MsotEventsApiHandlerParams
open OpenAPI.Model.ConversionMSOTEvents
open OpenAPI.Model.Error

module MsotEventsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``MsotEventsCreate - Send Measurement Source Of Truth (MSOT) attributed conversion events returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/msot/events".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMsotEventsCreateExample "application/json")
      // or pass a body of type ConversionMSOTEvents
      let body = obj() :?> ConversionMSOTEvents |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``MsotEventsCreate - Send Measurement Source Of Truth (MSOT) attributed conversion events returns 400 where The request was invalid`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/msot/events".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMsotEventsCreateExample "application/json")
      // or pass a body of type ConversionMSOTEvents
      let body = obj() :?> ConversionMSOTEvents |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``MsotEventsCreate - Send Measurement Source Of Truth (MSOT) attributed conversion events returns 401 where Not authorized to send MSOT conversion events`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/msot/events".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMsotEventsCreateExample "application/json")
      // or pass a body of type ConversionMSOTEvents
      let body = obj() :?> ConversionMSOTEvents |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``MsotEventsCreate - Send Measurement Source Of Truth (MSOT) attributed conversion events returns 403 where Unauthorized access`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/msot/events".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMsotEventsCreateExample "application/json")
      // or pass a body of type ConversionMSOTEvents
      let body = obj() :?> ConversionMSOTEvents |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``MsotEventsCreate - Send Measurement Source Of Truth (MSOT) attributed conversion events returns 429 where This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/msot/events".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMsotEventsCreateExample "application/json")
      // or pass a body of type ConversionMSOTEvents
      let body = obj() :?> ConversionMSOTEvents |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``MsotEventsCreate - Send Measurement Source Of Truth (MSOT) attributed conversion events returns 0 where Unexpected errors`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/msot/events".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMsotEventsCreateExample "application/json")
      // or pass a body of type ConversionMSOTEvents
      let body = obj() :?> ConversionMSOTEvents |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

