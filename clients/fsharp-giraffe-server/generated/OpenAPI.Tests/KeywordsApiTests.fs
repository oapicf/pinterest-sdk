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
open KeywordsApiHandlerTestsHelper
open OpenAPI.KeywordsApiHandler
open OpenAPI.KeywordsApiHandlerParams
open OpenAPI.Model.Error
open OpenAPI.Model.KeywordUpdateBody
open OpenAPI.Model.KeywordsGet200Response
open OpenAPI.Model.KeywordsMetricsArrayResponse
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.KeywordsResponse
open OpenAPI.Model.MatchType
open OpenAPI.Model.TrendType
open OpenAPI.Model.TrendingKeywordsResponse
open OpenAPI.Model.TrendsSupportedRegion

module KeywordsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CountryKeywordsMetricsGet - Get country&#39;s keyword metrics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords/metrics".Replace("adAccountId", "ADDME") + "?countryCode=ADDME&keywords=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CountryKeywordsMetricsGet - Get country&#39;s keyword metrics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords/metrics".Replace("adAccountId", "ADDME") + "?countryCode=ADDME&keywords=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``KeywordsCreate - Create keywords returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getKeywordsCreateExample "application/json")
      // or pass a body of type KeywordsRequest
      let body = obj() :?> KeywordsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``KeywordsCreate - Create keywords returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getKeywordsCreateExample "application/json")
      // or pass a body of type KeywordsRequest
      let body = obj() :?> KeywordsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``KeywordsGet - Get keywords returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords".Replace("adAccountId", "ADDME") + "?campaignId=ADDME&adGroupId=ADDME&matchTypes=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``KeywordsGet - Get keywords returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords".Replace("adAccountId", "ADDME") + "?campaignId=ADDME&adGroupId=ADDME&matchTypes=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``KeywordsUpdate - Update keywords returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getKeywordsUpdateExample "application/json")
      // or pass a body of type KeywordUpdateBody
      let body = obj() :?> KeywordUpdateBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``KeywordsUpdate - Update keywords returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/keywords".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getKeywordsUpdateExample "application/json")
      // or pass a body of type KeywordUpdateBody
      let body = obj() :?> KeywordUpdateBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TrendingKeywordsList - List trending keywords returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/keywords/{region}/top/{trend_type}".Replace("region", "ADDME").Replace("trendType", "ADDME") + "?interests=ADDME&genders=ADDME&ages=ADDME&normalizeAgainstGroup=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendingKeywordsList - List trending keywords returns 400 where Invalid trending keywords request parameters`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/keywords/{region}/top/{trend_type}".Replace("region", "ADDME").Replace("trendType", "ADDME") + "?interests=ADDME&genders=ADDME&ages=ADDME&normalizeAgainstGroup=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendingKeywordsList - List trending keywords returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/keywords/{region}/top/{trend_type}".Replace("region", "ADDME").Replace("trendType", "ADDME") + "?interests=ADDME&genders=ADDME&ages=ADDME&normalizeAgainstGroup=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

