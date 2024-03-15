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
open AudiencesApiHandlerTestsHelper
open OpenAPI.AudiencesApiHandler
open OpenAPI.AudiencesApiHandlerParams
open OpenAPI.Model.Audience
open OpenAPI.Model.AudienceCreateCustomRequest
open OpenAPI.Model.AudienceCreateRequest
open OpenAPI.Model.AudienceUpdateRequest
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.Error

module AudiencesApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AudiencesCreate - Create audience returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAudiencesCreateExample "application/json")
      // or pass a body of type AudienceCreateRequest
      let body = obj() :?> AudienceCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AudiencesCreate - Create audience returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAudiencesCreateExample "application/json")
      // or pass a body of type AudienceCreateRequest
      let body = obj() :?> AudienceCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AudiencesCreateCustom - Create custom audience returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/custom".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAudiencesCreateCustomExample "application/json")
      // or pass a body of type AudienceCreateCustomRequest
      let body = obj() :?> AudienceCreateCustomRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AudiencesCreateCustom - Create custom audience returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/custom".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAudiencesCreateCustomExample "application/json")
      // or pass a body of type AudienceCreateCustomRequest
      let body = obj() :?> AudienceCreateCustomRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AudiencesGet - Get audience returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}".Replace("adAccountId", "ADDME").Replace("audienceId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AudiencesGet - Get audience returns 404 where Audience not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}".Replace("adAccountId", "ADDME").Replace("audienceId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AudiencesGet - Get audience returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}".Replace("adAccountId", "ADDME").Replace("audienceId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AudiencesList - List audiences returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&order=ADDME&pageSize=ADDME&ownershipType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AudiencesList - List audiences returns 400 where Invalid ad account audience parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&order=ADDME&pageSize=ADDME&ownershipType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AudiencesList - List audiences returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&order=ADDME&pageSize=ADDME&ownershipType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AudiencesUpdate - Update audience returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}".Replace("adAccountId", "ADDME").Replace("audienceId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAudiencesUpdateExample "application/json")
      // or pass a body of type AudienceUpdateRequest
      let body = obj() :?> AudienceUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AudiencesUpdate - Update audience returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}".Replace("adAccountId", "ADDME").Replace("audienceId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAudiencesUpdateExample "application/json")
      // or pass a body of type AudienceUpdateRequest
      let body = obj() :?> AudienceUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

