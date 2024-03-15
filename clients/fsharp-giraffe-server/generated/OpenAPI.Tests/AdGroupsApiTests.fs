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
open AdGroupsApiHandlerTestsHelper
open OpenAPI.AdGroupsApiHandler
open OpenAPI.AdGroupsApiHandlerParams
open OpenAPI.Model.AdGroupArrayResponse
open OpenAPI.Model.AdGroupAudienceSizingRequest
open OpenAPI.Model.AdGroupAudienceSizingResponse
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdGroupsAnalyticsResponseInner
open OpenAPI.Model.AdGroupsList200Response
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.BidFloor
open OpenAPI.Model.BidFloorRequest
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse

module AdGroupsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdGroupsAnalytics - Get ad group analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&adGroupIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsAnalytics - Get ad group analytics returns 400 where Invalid ad account group analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&adGroupIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsAnalytics - Get ad group analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics".Replace("adAccountId", "ADDME") + "?startDate=ADDME&endDate=ADDME&adGroupIds=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsAudienceSizing - Get audience sizing returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsAudienceSizingExample "application/json")
      // or pass a body of type AdGroupAudienceSizingRequest
      let body = obj() :?> AdGroupAudienceSizingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsAudienceSizing - Get audience sizing returns 400 where Invalid ad group audience sizing parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsAudienceSizingExample "application/json")
      // or pass a body of type AdGroupAudienceSizingRequest
      let body = obj() :?> AdGroupAudienceSizingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsAudienceSizing - Get audience sizing returns 403 where No access to requested audience list or product group.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsAudienceSizingExample "application/json")
      // or pass a body of type AdGroupAudienceSizingRequest
      let body = obj() :?> AdGroupAudienceSizingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsAudienceSizing - Get audience sizing returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsAudienceSizingExample "application/json")
      // or pass a body of type AdGroupAudienceSizingRequest
      let body = obj() :?> AdGroupAudienceSizingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsBidFloorGet - Get bid floors returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/bid_floor".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsBidFloorGetExample "application/json")
      // or pass a body of type BidFloorRequest
      let body = obj() :?> BidFloorRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsBidFloorGet - Get bid floors returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/bid_floor".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsBidFloorGetExample "application/json")
      // or pass a body of type BidFloorRequest
      let body = obj() :?> BidFloorRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsCreate - Create ad groups returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsCreateExample "application/json")
      // or pass a body of type AdGroupCreateRequest[]
      let body = obj() :?> AdGroupCreateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsCreate - Create ad groups returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsCreateExample "application/json")
      // or pass a body of type AdGroupCreateRequest[]
      let body = obj() :?> AdGroupCreateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsGet - Get ad group returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".Replace("adAccountId", "ADDME").Replace("adGroupId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsGet - Get ad group returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".Replace("adAccountId", "ADDME").Replace("adGroupId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsList - List ad groups returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups".Replace("adAccountId", "ADDME") + "?campaignIds=ADDME&adGroupIds=ADDME&entityStatuses=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME&translateInterestsToNames=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsList - List ad groups returns 400 where Invalid ad account group parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups".Replace("adAccountId", "ADDME") + "?campaignIds=ADDME&adGroupIds=ADDME&entityStatuses=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME&translateInterestsToNames=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsList - List ad groups returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups".Replace("adAccountId", "ADDME") + "?campaignIds=ADDME&adGroupIds=ADDME&entityStatuses=ADDME&pageSize=ADDME&order=ADDME&bookmark=ADDME&translateInterestsToNames=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsTargetingAnalyticsGet - Get targeting analytics for ad groups returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".Replace("adAccountId", "ADDME") + "?adGroupIds=ADDME&startDate=ADDME&endDate=ADDME&targetingTypes=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME&attributionTypes=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsTargetingAnalyticsGet - Get targeting analytics for ad groups returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".Replace("adAccountId", "ADDME") + "?adGroupIds=ADDME&startDate=ADDME&endDate=ADDME&targetingTypes=ADDME&columns=ADDME&granularity=ADDME&clickWindowDays=ADDME&engagementWindowDays=ADDME&viewWindowDays=ADDME&conversionReportTime=ADDME&attributionTypes=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdGroupsUpdate - Update ad groups returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsUpdateExample "application/json")
      // or pass a body of type AdGroupUpdateRequest[]
      let body = obj() :?> AdGroupUpdateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdGroupsUpdate - Update ad groups returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ad_groups".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdGroupsUpdateExample "application/json")
      // or pass a body of type AdGroupUpdateRequest[]
      let body = obj() :?> AdGroupUpdateRequest[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

