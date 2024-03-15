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
open IntegrationsApiHandlerTestsHelper
open OpenAPI.IntegrationsApiHandler
open OpenAPI.IntegrationsApiHandlerParams
open OpenAPI.Model.DetailedError
open OpenAPI.Model.Error
open OpenAPI.Model.IntegrationLogsRequest
open OpenAPI.Model.IntegrationLogsSuccessResponse
open OpenAPI.Model.IntegrationMetadata
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.IntegrationRequest
open OpenAPI.Model.IntegrationRequestPatch
open OpenAPI.Model.IntegrationsGetList200Response

module IntegrationsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``IntegrationsCommerceDel - Delete commerce integration returns 204 where Commerce Integration deleted successfully`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsCommerceDel - Delete commerce integration returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsCommerceGet - Get commerce integration returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsCommerceGet - Get commerce integration returns 404 where Integration not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsCommerceGet - Get commerce integration returns 409 where Can&#39;t access this integration metadata.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsCommerceGet - Get commerce integration returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsCommercePatch - Update commerce integration returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePatchExample "application/json")
      // or pass a body of type IntegrationRequestPatch
      let body = obj() :?> IntegrationRequestPatch |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsCommercePatch - Update commerce integration returns 404 where Integration not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePatchExample "application/json")
      // or pass a body of type IntegrationRequestPatch
      let body = obj() :?> IntegrationRequestPatch |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsCommercePatch - Update commerce integration returns 409 where Can&#39;t access this integration metadata.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePatchExample "application/json")
      // or pass a body of type IntegrationRequestPatch
      let body = obj() :?> IntegrationRequestPatch |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsCommercePatch - Update commerce integration returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce/{external_business_id}".Replace("externalBusinessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePatchExample "application/json")
      // or pass a body of type IntegrationRequestPatch
      let body = obj() :?> IntegrationRequestPatch |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsCommercePost - Create commerce integration returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePostExample "application/json")
      // or pass a body of type IntegrationRequest
      let body = obj() :?> IntegrationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsCommercePost - Create commerce integration returns 404 where Integration not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePostExample "application/json")
      // or pass a body of type IntegrationRequest
      let body = obj() :?> IntegrationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsCommercePost - Create commerce integration returns 409 where Can&#39;t access this integration metadata.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePostExample "application/json")
      // or pass a body of type IntegrationRequest
      let body = obj() :?> IntegrationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsCommercePost - Create commerce integration returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/commerce"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsCommercePostExample "application/json")
      // or pass a body of type IntegrationRequest
      let body = obj() :?> IntegrationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsGetById - Get integration metadata returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/{id}".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsGetById - Get integration metadata returns 404 where Integration not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/{id}".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsGetById - Get integration metadata returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/{id}".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsGetList - Get integration metadata list returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsGetList - Get integration metadata list returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``IntegrationsLogsPost - Receives batched logs from integration applications. returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/logs"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsLogsPostExample "application/json")
      // or pass a body of type IntegrationLogsRequest
      let body = obj() :?> IntegrationLogsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsLogsPost - Receives batched logs from integration applications. returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/logs"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsLogsPostExample "application/json")
      // or pass a body of type IntegrationLogsRequest
      let body = obj() :?> IntegrationLogsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``IntegrationsLogsPost - Receives batched logs from integration applications. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/integrations/logs"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getIntegrationsLogsPostExample "application/json")
      // or pass a body of type IntegrationLogsRequest
      let body = obj() :?> IntegrationLogsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

