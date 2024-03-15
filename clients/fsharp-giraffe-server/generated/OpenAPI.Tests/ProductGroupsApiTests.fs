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
open ProductGroupsApiHandlerTestsHelper
open OpenAPI.ProductGroupsApiHandler
open OpenAPI.ProductGroupsApiHandlerParams
open OpenAPI.Model.AdAccountsCatalogsProductGroupsList200Response
open OpenAPI.Model.Error

module ProductGroupsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdAccountsCatalogsProductGroupsList - Get catalog product groups returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/catalogs".Replace("adAccountId", "ADDME") + "?feedProfileId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsCatalogsProductGroupsList - Get catalog product groups returns 400 where Invalid ad account ads parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/catalogs".Replace("adAccountId", "ADDME") + "?feedProfileId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsCatalogsProductGroupsList - Get catalog product groups returns 401 where Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/catalogs".Replace("adAccountId", "ADDME") + "?feedProfileId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsCatalogsProductGroupsList - Get catalog product groups returns 404 where Merchant data not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/catalogs".Replace("adAccountId", "ADDME") + "?feedProfileId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsCatalogsProductGroupsList - Get catalog product groups returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/catalogs".Replace("adAccountId", "ADDME") + "?feedProfileId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

