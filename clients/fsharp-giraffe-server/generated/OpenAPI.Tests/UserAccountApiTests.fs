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
open UserAccountApiHandlerTestsHelper
open OpenAPI.UserAccountApiHandler
open OpenAPI.UserAccountApiHandlerParams
open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error

module UserAccountApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``UserAccountAnalytics - Get user account analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics" + "?startDate=ADDME&endDate=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalytics - Get user account analytics returns 403 where Not authorized to access the user account analytics.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics" + "?startDate=ADDME&endDate=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalytics - Get user account analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics" + "?startDate=ADDME&endDate=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountGet - Get user account returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account" + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountGet - Get user account returns 403 where Not authorized to access the user account.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account" + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountGet - Get user account returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account" + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

