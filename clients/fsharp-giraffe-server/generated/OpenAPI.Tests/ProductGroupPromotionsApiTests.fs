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
open ProductGroupPromotionsApiHandlerTestsHelper
open OpenAPI.ProductGroupPromotionsApiHandler
open OpenAPI.ProductGroupPromotionsApiHandlerParams
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.ProductGroupAnalyticsResponseInner
open OpenAPI.Model.ProductGroupPromotionCreateRequest
open OpenAPI.Model.ProductGroupPromotionResponse
open OpenAPI.Model.ProductGroupPromotionUpdateRequest
open OpenAPI.Model.ProductGroupPromotionsList200Response

module ProductGroupPromotionsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ProductGroupPromotionsCreate - Create product group promotions returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductGroupPromotionsCreateExample "application/json")
      // or pass a body of type ProductGroupPromotionCreateRequest
      let body = obj() :?> ProductGroupPromotionCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductGroupPromotionsCreate - Create product group promotions returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductGroupPromotionsCreateExample "application/json")
      // or pass a body of type ProductGroupPromotionCreateRequest
      let body = obj() :?> ProductGroupPromotionCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductGroupPromotionsGet - Get a product group promotion by id returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}".Replace("adAccountId", "ADDME").Replace("productGroupPromotionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductGroupPromotionsGet - Get a product group promotion by id returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}".Replace("adAccountId", "ADDME").Replace("productGroupPromotionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductGroupPromotionsList - Get product group promotions returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions".Replace("adAccountId", "ADDME") + "?productGroupPromotionIds=ADDME&entityStatuses=ADDME&adGroupId=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductGroupPromotionsList - Get product group promotions returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions".Replace("adAccountId", "ADDME") + "?productGroupPromotionIds=ADDME&entityStatuses=ADDME&adGroupId=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductGroupPromotionsUpdate - Update product group promotions returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductGroupPromotionsUpdateExample "application/json")
      // or pass a body of type ProductGroupPromotionUpdateRequest
      let body = obj() :?> ProductGroupPromotionUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductGroupPromotionsUpdate - Update product group promotions returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_group_promotions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProductGroupPromotionsUpdateExample "application/json")
      // or pass a body of type ProductGroupPromotionUpdateRequest
      let body = obj() :?> ProductGroupPromotionUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProductGroupsAnalytics - Get product group analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&productGroupIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductGroupsAnalytics - Get product group analytics returns 400 where Invalid ad account ads analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&productGroupIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProductGroupsAnalytics - Get product group analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/product_groups/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&productGroupIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

