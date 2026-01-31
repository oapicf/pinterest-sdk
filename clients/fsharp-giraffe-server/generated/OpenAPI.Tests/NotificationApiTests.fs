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
open NotificationApiHandlerTestsHelper
open OpenAPI.NotificationApiHandler
open OpenAPI.NotificationApiHandlerParams
open OpenAPI.Model.Error
open OpenAPI.Model.NotificationPostRequest
open OpenAPI.Model.NotificationResponse

module NotificationApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``NotificationPost - Receive notifications from external partners. returns 200 where Successfully received notification`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/notifications"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getNotificationPostExample "application/json")
      // or pass a body of type NotificationPostRequest
      let body = obj() :?> NotificationPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``NotificationPost - Receive notifications from external partners. returns 400 where Invalid request parameter.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/notifications"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getNotificationPostExample "application/json")
      // or pass a body of type NotificationPostRequest
      let body = obj() :?> NotificationPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``NotificationPost - Receive notifications from external partners. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/notifications"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getNotificationPostExample "application/json")
      // or pass a body of type NotificationPostRequest
      let body = obj() :?> NotificationPostRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

