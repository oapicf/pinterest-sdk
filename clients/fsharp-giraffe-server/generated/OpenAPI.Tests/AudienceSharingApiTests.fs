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
open OpenAPI.Model.AdAccountToAdAccountSharedAudience
open OpenAPI.Model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.AdAccountToBusinessSharedAudience
open OpenAPI.Model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.AdAccountsAudiencesSharedAccountsList200Response
open OpenAPI.Model.AudienceAccountType
open OpenAPI.Model.BusinessToAdAccountSharedAudience
open OpenAPI.Model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.BusinessToBusinessSharedAudience
open OpenAPI.Model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.Order
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SharedAudiencesForBusinessList200Response

module AudienceSharingApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsAudiencesSharedAccountsList - List accounts with access to an audience owned by an ad account returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts".Replace("adAccountId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAccountAudiencesSharedAccountsList - List accounts with access to an audience owned by a business returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/shared/accounts".Replace("businessId", "ADDME") + "?audienceId=ADDME&accountType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?order=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?order=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?order=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?order=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?order=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?order=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SharedAudiencesForBusinessList - List received audiences for a business returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences".Replace("businessId", "ADDME") + "?order=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToAdAccountSharedAudience - Update audience sharing between ad accounts returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateAdAccountToBusinessSharedAudience - Update audience sharing from an ad account to businesses returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateAdAccountToBusinessSharedAudienceExample "application/json")
      // or pass a body of type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> AdAccountToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToAdAccountSharedAudience - Update audience sharing from a business to ad accounts returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/ad_accounts/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToAdAccountSharedAudienceExample "application/json")
      // or pass a body of type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToAdAccountSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessToBusinessSharedAudience - Update audience sharing between businesses returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/audiences/businesses/shared".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessToBusinessSharedAudienceExample "application/json")
      // or pass a body of type BusinessToBusinessSharedAudienceUpdateWithRequiredBody
      let body = obj() :?> BusinessToBusinessSharedAudienceUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

