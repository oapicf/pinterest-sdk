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
open ConversionEqsApiHandlerTestsHelper
open OpenAPI.ConversionEqsApiHandler
open OpenAPI.ConversionEqsApiHandlerParams
open OpenAPI.Model.EventQualityScore
open OpenAPI.Model.IngestionSourceOptions
open OpenAPI.Model.LookbackPeriodOptions
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SourcePlatformOptions

module ConversionEqsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ConversionEqsList - Get event quality score (EQS) returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/conversion_eqs".Replace("adAccountId", "ADDME") + "?lookbackPeriod=ADDME&sourcePlatform=ADDME&ingestionSource=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ConversionEqsList - Get event quality score (EQS) returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/conversion_eqs".Replace("adAccountId", "ADDME") + "?lookbackPeriod=ADDME&sourcePlatform=ADDME&ingestionSource=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ConversionEqsList - Get event quality score (EQS) returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/conversion_eqs".Replace("adAccountId", "ADDME") + "?lookbackPeriod=ADDME&sourcePlatform=ADDME&ingestionSource=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ConversionEqsList - Get event quality score (EQS) returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/conversion_eqs".Replace("adAccountId", "ADDME") + "?lookbackPeriod=ADDME&sourcePlatform=ADDME&ingestionSource=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ConversionEqsList - Get event quality score (EQS) returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/conversion_eqs".Replace("adAccountId", "ADDME") + "?lookbackPeriod=ADDME&sourcePlatform=ADDME&ingestionSource=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ConversionEqsList - Get event quality score (EQS) returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/conversion_eqs".Replace("adAccountId", "ADDME") + "?lookbackPeriod=ADDME&sourcePlatform=ADDME&ingestionSource=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ConversionEqsList - Get event quality score (EQS) returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/conversion_eqs".Replace("adAccountId", "ADDME") + "?lookbackPeriod=ADDME&sourcePlatform=ADDME&ingestionSource=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

