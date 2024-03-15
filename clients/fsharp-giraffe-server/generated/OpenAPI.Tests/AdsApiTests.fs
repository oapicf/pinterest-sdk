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
open AdsApiHandlerTestsHelper
open OpenAPI.AdsApiHandler
open OpenAPI.AdsApiHandlerParams
open OpenAPI.Model.AdArrayResponse
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdPreviewRequest
open OpenAPI.Model.AdPreviewURLResponse
open OpenAPI.Model.AdResponse
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.AdsAnalyticsResponseInner
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.AdsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse

module AdsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdPreviewsCreate - Create ad preview with pin or image returns 200 where Successful ad preview creation.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_previews".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdPreviewsCreateExample "application/json")
      // or pass a body of type AdPreviewRequest
      let body = obj() :?> AdPreviewRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdPreviewsCreate - Create ad preview with pin or image returns 400 where Invalid Pin parameters response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_previews".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdPreviewsCreateExample "application/json")
      // or pass a body of type AdPreviewRequest
      let body = obj() :?> AdPreviewRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdPreviewsCreate - Create ad preview with pin or image returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_previews".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdPreviewsCreateExample "application/json")
      // or pass a body of type AdPreviewRequest
      let body = obj() :?> AdPreviewRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdTargetingAnalyticsGet - Get targeting analytics for ads returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics".Replace("adAccountId", "ADDME") + "?adIds=ADDME&startDate=ADDME&endDate=ADDME&targetingTypes=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME&attributionTypes=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdTargetingAnalyticsGet - Get targeting analytics for ads returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics".Replace("adAccountId", "ADDME") + "?adIds=ADDME&startDate=ADDME&endDate=ADDME&targetingTypes=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME&attributionTypes=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsAnalytics - Get ad analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&adIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsAnalytics - Get ad analytics returns 400 where Invalid ad account ads analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&adIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsAnalytics - Get ad analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&adIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsCreate - Create ads returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdsCreateExample "application/json")
      // or pass a body of type AdCreateRequest[]
      let body = obj() :?> AdCreateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdsCreate - Create ads returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdsCreateExample "application/json")
      // or pass a body of type AdCreateRequest[]
      let body = obj() :?> AdCreateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdsGet - Get ad returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads/{ad_id}".Replace("adAccountId", "ADDME").Replace("adId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsGet - Get ad returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads/{ad_id}".Replace("adAccountId", "ADDME").Replace("adId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsList - List ads returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads".Replace("adAccountId", "ADDME") + "?campaignIds=ADDME&adGroupIds=ADDME&adIds=ADDME&entityStatuses=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsList - List ads returns 400 where Invalid ad account ads parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads".Replace("adAccountId", "ADDME") + "?campaignIds=ADDME&adGroupIds=ADDME&adIds=ADDME&entityStatuses=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsList - List ads returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads".Replace("adAccountId", "ADDME") + "?campaignIds=ADDME&adGroupIds=ADDME&adIds=ADDME&entityStatuses=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsUpdate - Update ads returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdsUpdateExample "application/json")
      // or pass a body of type AdUpdateRequest[]
      let body = obj() :?> AdUpdateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdsUpdate - Update ads returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdsUpdateExample "application/json")
      // or pass a body of type AdUpdateRequest[]
      let body = obj() :?> AdUpdateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

