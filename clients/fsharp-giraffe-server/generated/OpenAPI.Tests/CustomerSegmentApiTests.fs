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
open CustomerSegmentApiHandlerTestsHelper
open OpenAPI.CustomerSegmentApiHandler
open OpenAPI.CustomerSegmentApiHandlerParams
open OpenAPI.Model.CustomerSegment
open OpenAPI.Model.CustomerSegmentCreate
open OpenAPI.Model.CustomerSegmentList200Response
open OpenAPI.Model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder

module CustomerSegmentApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentCreate - Create customer segments returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentCreateExample "application/json")
      // or pass a body of type CustomerSegmentCreate
      let body = obj() :?> CustomerSegmentCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentList - List customer segments returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&includeSizing=ADDME&searchQuery=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CustomerSegmentList - List customer segments returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&includeSizing=ADDME&searchQuery=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CustomerSegmentList - List customer segments returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&includeSizing=ADDME&searchQuery=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CustomerSegmentList - List customer segments returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&includeSizing=ADDME&searchQuery=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CustomerSegmentList - List customer segments returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&includeSizing=ADDME&searchQuery=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CustomerSegmentList - List customer segments returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&includeSizing=ADDME&searchQuery=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CustomerSegmentList - List customer segments returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&order=ADDME&includeSizing=ADDME&searchQuery=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CustomerSegmentUpdate - Update customer segments returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentUpdateExample "application/json")
      // or pass a body of type CustomerSegmentUpdateRequestUpdateWithRequiredBody
      let body = obj() :?> CustomerSegmentUpdateRequestUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentUpdate - Update customer segments returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentUpdateExample "application/json")
      // or pass a body of type CustomerSegmentUpdateRequestUpdateWithRequiredBody
      let body = obj() :?> CustomerSegmentUpdateRequestUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentUpdate - Update customer segments returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentUpdateExample "application/json")
      // or pass a body of type CustomerSegmentUpdateRequestUpdateWithRequiredBody
      let body = obj() :?> CustomerSegmentUpdateRequestUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentUpdate - Update customer segments returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentUpdateExample "application/json")
      // or pass a body of type CustomerSegmentUpdateRequestUpdateWithRequiredBody
      let body = obj() :?> CustomerSegmentUpdateRequestUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentUpdate - Update customer segments returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentUpdateExample "application/json")
      // or pass a body of type CustomerSegmentUpdateRequestUpdateWithRequiredBody
      let body = obj() :?> CustomerSegmentUpdateRequestUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentUpdate - Update customer segments returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentUpdateExample "application/json")
      // or pass a body of type CustomerSegmentUpdateRequestUpdateWithRequiredBody
      let body = obj() :?> CustomerSegmentUpdateRequestUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CustomerSegmentUpdate - Update customer segments returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/customer_segments".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCustomerSegmentUpdateExample "application/json")
      // or pass a body of type CustomerSegmentUpdateRequestUpdateWithRequiredBody
      let body = obj() :?> CustomerSegmentUpdateRequestUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

