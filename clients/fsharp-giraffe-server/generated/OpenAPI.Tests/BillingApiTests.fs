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
open BillingApiHandlerTestsHelper
open OpenAPI.BillingApiHandler
open OpenAPI.BillingApiHandlerParams
open OpenAPI.Model.AdsCreditRedeemRequest
open OpenAPI.Model.AdsCreditRedeemResponse
open OpenAPI.Model.AdsCreditsDiscountsGet200Response
open OpenAPI.Model.BillingProfilesGet200Response
open OpenAPI.Model.Error
open OpenAPI.Model.SSIOAccountResponse
open OpenAPI.Model.SSIOCreateInsertionOrderRequest
open OpenAPI.Model.SSIOCreateInsertionOrderResponse
open OpenAPI.Model.SSIOEditInsertionOrderRequest
open OpenAPI.Model.SSIOEditInsertionOrderResponse
open OpenAPI.Model.SSIOInsertionOrderStatusResponse
open OpenAPI.Model.SsioInsertionOrdersStatusGetByAdAccount200Response
open OpenAPI.Model.SsioOrderLinesGetByAdAccount200Response

module BillingApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdsCreditRedeem - Redeem ad credits returns 200 where Successfully redeemed ad credits.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads_credit/redeem".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdsCreditRedeemExample "application/json")
      // or pass a body of type AdsCreditRedeemRequest
      let body = obj() :?> AdsCreditRedeemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdsCreditRedeem - Redeem ad credits returns 400 where Error thrown when unable to redeem offer code.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads_credit/redeem".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdsCreditRedeemExample "application/json")
      // or pass a body of type AdsCreditRedeemRequest
      let body = obj() :?> AdsCreditRedeemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdsCreditRedeem - Redeem ad credits returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads_credit/redeem".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdsCreditRedeemExample "application/json")
      // or pass a body of type AdsCreditRedeemRequest
      let body = obj() :?> AdsCreditRedeemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdsCreditsDiscountsGet - Get ads credit discounts returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads_credit/discounts".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdsCreditsDiscountsGet - Get ads credit discounts returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ads_credit/discounts".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BillingProfilesGet - Get billing profiles returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/billing_profiles".Replace("adAccountId", "ADDME") + "?isActive=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BillingProfilesGet - Get billing profiles returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/billing_profiles".Replace("adAccountId", "ADDME") + "?isActive=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioAccountsGet - Get Salesforce account details including bill-to information. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/accounts".Replace("adAccountId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioAccountsGet - Get Salesforce account details including bill-to information. returns 400 where Invalid request parameter.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/accounts".Replace("adAccountId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioAccountsGet - Get Salesforce account details including bill-to information. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/accounts".Replace("adAccountId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioInsertionOrderCreate - Create insertion order through SSIO. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSsioInsertionOrderCreateExample "application/json")
      // or pass a body of type SSIOCreateInsertionOrderRequest
      let body = obj() :?> SSIOCreateInsertionOrderRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SsioInsertionOrderCreate - Create insertion order through SSIO. returns 400 where Invalid request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSsioInsertionOrderCreateExample "application/json")
      // or pass a body of type SSIOCreateInsertionOrderRequest
      let body = obj() :?> SSIOCreateInsertionOrderRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SsioInsertionOrderCreate - Create insertion order through SSIO. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSsioInsertionOrderCreateExample "application/json")
      // or pass a body of type SSIOCreateInsertionOrderRequest
      let body = obj() :?> SSIOCreateInsertionOrderRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SsioInsertionOrderEdit - Edit insertion order through SSIO. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSsioInsertionOrderEditExample "application/json")
      // or pass a body of type SSIOEditInsertionOrderRequest
      let body = obj() :?> SSIOEditInsertionOrderRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SsioInsertionOrderEdit - Edit insertion order through SSIO. returns 400 where Invalid request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSsioInsertionOrderEditExample "application/json")
      // or pass a body of type SSIOEditInsertionOrderRequest
      let body = obj() :?> SSIOEditInsertionOrderRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SsioInsertionOrderEdit - Edit insertion order through SSIO. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSsioInsertionOrderEditExample "application/json")
      // or pass a body of type SSIOEditInsertionOrderRequest
      let body = obj() :?> SSIOEditInsertionOrderRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SsioInsertionOrdersStatusGetByAdAccount - Get insertion order status by ad account id. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioInsertionOrdersStatusGetByAdAccount - Get insertion order status by ad account id. returns 400 where Invalid request parameter.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioInsertionOrdersStatusGetByAdAccount - Get insertion order status by ad account id. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioInsertionOrdersStatusGetByPinOrderId - Get insertion order status by pin order id. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".Replace("adAccountId", "ADDME").Replace("pinOrderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioInsertionOrdersStatusGetByPinOrderId - Get insertion order status by pin order id. returns 400 where Invalid request parameter.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".Replace("adAccountId", "ADDME").Replace("pinOrderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioInsertionOrdersStatusGetByPinOrderId - Get insertion order status by pin order id. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".Replace("adAccountId", "ADDME").Replace("pinOrderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioOrderLinesGetByAdAccount - Get Salesforce order lines by ad account id. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/order_lines".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&pinOrderId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioOrderLinesGetByAdAccount - Get Salesforce order lines by ad account id. returns 400 where Invalid request parameter.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/order_lines".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&pinOrderId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SsioOrderLinesGetByAdAccount - Get Salesforce order lines by ad account id. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/ssio/order_lines".Replace("adAccountId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&pinOrderId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

