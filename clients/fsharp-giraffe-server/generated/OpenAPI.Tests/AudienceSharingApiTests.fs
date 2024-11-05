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
open AudienceSharingApiHandlerTestsHelper
open OpenAPI.AudienceSharingApiHandler
open OpenAPI.AudienceSharingApiHandlerParams
open OpenAPI.Model.AdAccountsAudiencesSharedAccountsList200Response
open OpenAPI.Model.AudienceAccountType
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.BusinessSharedAudience
open OpenAPI.Model.BusinessSharedAudienceResponse
open OpenAPI.Model.Error
open OpenAPI.Model.SharedAudience
open OpenAPI.Model.SharedAudienceResponse

module AudienceSharingApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 400 where Invalid ad account audiences shared accounts parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 404 where Shared accounts not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 400 where Invalid business audiences shared accounts parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 404 where Shared accounts not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?bookmark=ADDME&order=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?bookmark=ADDME&order=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?bookmark=ADDME&order=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type SharedAudience
      let body = obj() :?> SharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 400 where Invalid ad account id.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type SharedAudience
      let body = obj() :?> SharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type SharedAudience
      let body = obj() :?> SharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessSharedAudience
      let body = obj() :?> BusinessSharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 400 where Invalid ad account id.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessSharedAudience
      let body = obj() :?> BusinessSharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessSharedAudience
      let body = obj() :?> BusinessSharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type SharedAudience
      let body = obj() :?> SharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type SharedAudience
      let body = obj() :?> SharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type SharedAudience
      let body = obj() :?> SharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessSharedAudience
      let body = obj() :?> BusinessSharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessSharedAudience
      let body = obj() :?> BusinessSharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessSharedAudience
      let body = obj() :?> BusinessSharedAudience |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

