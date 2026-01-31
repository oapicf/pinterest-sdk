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
open OauthApiHandlerTestsHelper
open OpenAPI.OauthApiHandler
open OpenAPI.OauthApiHandlerParams
open OpenAPI.Model.ConversionAccessTokenResponse
open OpenAPI.Model.Error
open OpenAPI.Model.OauthAccessTokenResponse

module OauthApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``OauthConversionToken - Generate OAuth access token for conversion API returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/conversion_token"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``OauthConversionToken - Generate OAuth access token for conversion API returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/conversion_token"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``OauthToken - Generate OAuth access token returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/token"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/x-www-form-urlencoded", getOauthTokenExample "application/x-www-form-urlencoded")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``OauthToken - Generate OAuth access token returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/token"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/x-www-form-urlencoded", getOauthTokenExample "application/x-www-form-urlencoded")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TokenRevoke - Revoke a token returns 200 where Successful token revocation. No content is returned.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/token/revoke"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/x-www-form-urlencoded", getTokenRevokeExample "application/x-www-form-urlencoded")
      // or pass a formform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TokenRevoke - Revoke a token returns 401 where Client authentication error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/token/revoke"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/x-www-form-urlencoded", getTokenRevokeExample "application/x-www-form-urlencoded")
      // or pass a formform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TokenRevoke - Revoke a token returns 403 where Client is not allowed to revoke token.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/token/revoke"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/x-www-form-urlencoded", getTokenRevokeExample "application/x-www-form-urlencoded")
      // or pass a formform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TokenRevoke - Revoke a token returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/oauth/token/revoke"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/x-www-form-urlencoded", getTokenRevokeExample "application/x-www-form-urlencoded")
      // or pass a formform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

