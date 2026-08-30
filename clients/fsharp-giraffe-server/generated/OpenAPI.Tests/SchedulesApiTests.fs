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
open SchedulesApiHandlerTestsHelper
open OpenAPI.SchedulesApiHandler
open OpenAPI.SchedulesApiHandlerParams
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.Schedule
open OpenAPI.Model.ScheduleBatchUpdate
open OpenAPI.Model.ScheduleCreate
open OpenAPI.Model.ScheduleStatus
open OpenAPI.Model.ScheduleType
open OpenAPI.Model.SchedulesCreate200ResponseInner
open OpenAPI.Model.SchedulesList200Response

module SchedulesApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesCreate - Create schedules returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesCreateExample "application/json")
      // or pass a body of type ScheduleCreate[]
      let body = obj() :?> ScheduleCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesList - Get Schedules returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&scheduleStatuses=ADDME&scheduleType=ADDME&entityIds=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SchedulesList - Get Schedules returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&scheduleStatuses=ADDME&scheduleType=ADDME&entityIds=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SchedulesList - Get Schedules returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&scheduleStatuses=ADDME&scheduleType=ADDME&entityIds=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SchedulesList - Get Schedules returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&scheduleStatuses=ADDME&scheduleType=ADDME&entityIds=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SchedulesList - Get Schedules returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&scheduleStatuses=ADDME&scheduleType=ADDME&entityIds=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SchedulesList - Get Schedules returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&scheduleStatuses=ADDME&scheduleType=ADDME&entityIds=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SchedulesList - Get Schedules returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&scheduleStatuses=ADDME&scheduleType=ADDME&entityIds=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SchedulesUpdate - Update schedules returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesUpdateExample "application/json")
      // or pass a body of type ScheduleBatchUpdate[]
      let body = obj() :?> ScheduleBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesUpdate - Update schedules returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesUpdateExample "application/json")
      // or pass a body of type ScheduleBatchUpdate[]
      let body = obj() :?> ScheduleBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesUpdate - Update schedules returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesUpdateExample "application/json")
      // or pass a body of type ScheduleBatchUpdate[]
      let body = obj() :?> ScheduleBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesUpdate - Update schedules returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesUpdateExample "application/json")
      // or pass a body of type ScheduleBatchUpdate[]
      let body = obj() :?> ScheduleBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesUpdate - Update schedules returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesUpdateExample "application/json")
      // or pass a body of type ScheduleBatchUpdate[]
      let body = obj() :?> ScheduleBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesUpdate - Update schedules returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesUpdateExample "application/json")
      // or pass a body of type ScheduleBatchUpdate[]
      let body = obj() :?> ScheduleBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SchedulesUpdate - Update schedules returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/schedules".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSchedulesUpdateExample "application/json")
      // or pass a body of type ScheduleBatchUpdate[]
      let body = obj() :?> ScheduleBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

