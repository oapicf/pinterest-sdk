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
open SearchApiHandlerTestsHelper
open OpenAPI.SearchApiHandler
open OpenAPI.SearchApiHandlerParams
open OpenAPI.Model.Error
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.SearchPartnerPins200Response
open OpenAPI.Model.SearchUserBoardsGet200Response

module SearchApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``SearchPartnerPins - Search pins by a given search term returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/partner/pins" + "?term=ADDME&countryCode=ADDME&bookmark=ADDME&locale=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchPartnerPins - Search pins by a given search term returns 400 where Invalid pins`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/partner/pins" + "?term=ADDME&countryCode=ADDME&bookmark=ADDME&locale=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchPartnerPins - Search pins by a given search term returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/partner/pins" + "?term=ADDME&countryCode=ADDME&bookmark=ADDME&locale=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchUserBoardsGet - Search user&#39;s boards returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/boards" + "?adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME&query=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchUserBoardsGet - Search user&#39;s boards returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/boards" + "?adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME&query=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchUserPinsList - Search user&#39;s Pins returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/pins" + "?adAccountId=ADDME&query=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchUserPinsList - Search user&#39;s Pins returns 404 where User not found`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/pins" + "?adAccountId=ADDME&query=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchUserPinsList - Search user&#39;s Pins returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/search/pins" + "?adAccountId=ADDME&query=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

