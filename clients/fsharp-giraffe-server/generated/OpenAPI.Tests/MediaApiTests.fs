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
open MediaApiHandlerTestsHelper
open OpenAPI.MediaApiHandler
open OpenAPI.MediaApiHandlerParams
open OpenAPI.Model.Error
open OpenAPI.Model.MediaUpload
open OpenAPI.Model.MediaUploadDetails
open OpenAPI.Model.MediaUploadRequest
open OpenAPI.Model.Paginated

module MediaApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``MediaCreate - Register media upload returns 201 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/media"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMediaCreateExample "application/json")
      // or pass a body of type MediaUploadRequest
      let body = obj() :?> MediaUploadRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``MediaCreate - Register media upload returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/media"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getMediaCreateExample "application/json")
      // or pass a body of type MediaUploadRequest
      let body = obj() :?> MediaUploadRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``MediaGet - Get media upload details returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/media/{media_id}".Replace("mediaId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MediaGet - Get media upload details returns 404 where Media upload not found`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/media/{media_id}".Replace("mediaId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MediaGet - Get media upload details returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/media/{media_id}".Replace("mediaId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MediaList - List media uploads returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/media" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MediaList - List media uploads returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/media" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

