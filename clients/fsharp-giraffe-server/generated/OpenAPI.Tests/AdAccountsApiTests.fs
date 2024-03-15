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
open AdAccountsApiHandlerTestsHelper
open OpenAPI.AdAccountsApiHandler
open OpenAPI.AdAccountsApiHandlerParams
open OpenAPI.Model.AdAccount
open OpenAPI.Model.AdAccountAnalyticsResponseInner
open OpenAPI.Model.AdAccountCreateRequest
open OpenAPI.Model.AdAccountsList200Response
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.CreateMMMReportRequest
open OpenAPI.Model.CreateMMMReportResponse
open OpenAPI.Model.Error
open OpenAPI.Model.GetMMMReportResponse
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.TemplatesList200Response

module AdAccountsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdAccountAnalytics - Get ad account analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountAnalytics - Get ad account analytics returns 400 where Invalid ad account analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountAnalytics - Get ad account analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountTargetingAnalyticsGet - Get targeting analytics for an ad account returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/targeting_analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&targetingTypes=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME&attributionTypes=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountTargetingAnalyticsGet - Get targeting analytics for an ad account returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/targeting_analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&targetingTypes=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME&attributionTypes=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsCreate - Create ad account returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdAccountsCreateExample "application/json")
      // or pass a body of type AdAccountCreateRequest
      let body = obj() :?> AdAccountCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdAccountsCreate - Create ad account returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdAccountsCreateExample "application/json")
      // or pass a body of type AdAccountCreateRequest
      let body = obj() :?> AdAccountCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdAccountsGet - Get ad account returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}".Replace("adAccountId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsGet - Get ad account returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}".Replace("adAccountId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsList - List ad accounts returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts" + "?bookmark=ADDME&pageSize=ADDME&includeSharedAccounts=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsList - List ad accounts returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts" + "?bookmark=ADDME&pageSize=ADDME&includeSharedAccounts=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsCreateMmmReport - Create a request for a Marketing Mix Modeling (MMM) report returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/mmm_reports".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAnalyticsCreateMmmReportExample "application/json")
      // or pass a body of type CreateMMMReportRequest
      let body = obj() :?> CreateMMMReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AnalyticsCreateMmmReport - Create a request for a Marketing Mix Modeling (MMM) report returns 400 where Invalid ad account ads analytics mmm parameters`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/mmm_reports".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAnalyticsCreateMmmReportExample "application/json")
      // or pass a body of type CreateMMMReportRequest
      let body = obj() :?> CreateMMMReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AnalyticsCreateMmmReport - Create a request for a Marketing Mix Modeling (MMM) report returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/mmm_reports".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAnalyticsCreateMmmReportExample "application/json")
      // or pass a body of type CreateMMMReportRequest
      let body = obj() :?> CreateMMMReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AnalyticsCreateReport - Create async request for an account analytics report returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/reports".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAnalyticsCreateReportExample "application/json")
      // or pass a body of type AdsAnalyticsCreateAsyncRequest
      let body = obj() :?> AdsAnalyticsCreateAsyncRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AnalyticsCreateReport - Create async request for an account analytics report returns 400 where Invalid ad account ads analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/reports".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAnalyticsCreateReportExample "application/json")
      // or pass a body of type AdsAnalyticsCreateAsyncRequest
      let body = obj() :?> AdsAnalyticsCreateAsyncRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AnalyticsCreateReport - Create async request for an account analytics report returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/reports".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAnalyticsCreateReportExample "application/json")
      // or pass a body of type AdsAnalyticsCreateAsyncRequest
      let body = obj() :?> AdsAnalyticsCreateAsyncRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AnalyticsCreateTemplateReport - Create async request for an analytics report using a template returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports".Replace("adAccountId", "ADDME").Replace("templateId", "ADDME") + "?startDate=ADDME&endDate=ADDME&granularity=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsCreateTemplateReport - Create async request for an analytics report using a template returns 400 where Invalid ad account ads analytics template parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports".Replace("adAccountId", "ADDME").Replace("templateId", "ADDME") + "?startDate=ADDME&endDate=ADDME&granularity=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsCreateTemplateReport - Create async request for an analytics report using a template returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports".Replace("adAccountId", "ADDME").Replace("templateId", "ADDME") + "?startDate=ADDME&endDate=ADDME&granularity=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsGetMmmReport - Get advertiser Marketing Mix Modeling (MMM) report. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/mmm_reports".Replace("adAccountId", "ADDME") + "?token=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsGetMmmReport - Get advertiser Marketing Mix Modeling (MMM) report. returns 400 where Invalid ad account ads analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/mmm_reports".Replace("adAccountId", "ADDME") + "?token=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsGetMmmReport - Get advertiser Marketing Mix Modeling (MMM) report. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/mmm_reports".Replace("adAccountId", "ADDME") + "?token=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsGetReport - Get the account analytics report created by the async call returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/reports".Replace("adAccountId", "ADDME") + "?token=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsGetReport - Get the account analytics report created by the async call returns 400 where Invalid ad account ads analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/reports".Replace("adAccountId", "ADDME") + "?token=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AnalyticsGetReport - Get the account analytics report created by the async call returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/reports".Replace("adAccountId", "ADDME") + "?token=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SandboxDelete - Delete ads data for ad account in API Sandbox returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/sandbox".Replace("adAccountId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SandboxDelete - Delete ads data for ad account in API Sandbox returns 400 where Invalid ad account id.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/sandbox".Replace("adAccountId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SandboxDelete - Delete ads data for ad account in API Sandbox returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/sandbox".Replace("adAccountId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TemplatesList - List templates returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/templates".Replace("adAccountId", "ADDME") + "?pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TemplatesList - List templates returns 400 where Invalid ad account template parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/templates".Replace("adAccountId", "ADDME") + "?pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TemplatesList - List templates returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/templates".Replace("adAccountId", "ADDME") + "?pageSize=ADDME&order=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

