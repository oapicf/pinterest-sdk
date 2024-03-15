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
open LeadAdsApiHandlerTestsHelper
open OpenAPI.LeadAdsApiHandler
open OpenAPI.LeadAdsApiHandlerParams
open OpenAPI.Model.AdAccountCreateSubscriptionRequest
open OpenAPI.Model.AdAccountCreateSubscriptionResponse
open OpenAPI.Model.AdAccountGetSubscriptionResponse
open OpenAPI.Model.AdAccountsSubscriptionsGetList200Response
open OpenAPI.Model.Error

module LeadAdsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdAccountsSubscriptionsDelById - Delete lead ads subscription returns 204 where Subscription deleted successfully`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsDelById - Delete lead ads subscription returns 400 where Invalid input parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsDelById - Delete lead ads subscription returns 403 where You are not authorized to delete this subscription.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsDelById - Delete lead ads subscription returns 404 where Subscription not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsDelById - Delete lead ads subscription returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetById - Get lead ads subscription returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetById - Get lead ads subscription returns 400 where Invalid input parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetById - Get lead ads subscription returns 403 where Can&#39;t access this subscription.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetById - Get lead ads subscription returns 404 where Subscription not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetById - Get lead ads subscription returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".Replace("adAccountId", "ADDME").Replace("subscriptionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetList - Get lead ads subscriptions returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions".Replace("adAccountId", "ADDME") + "?pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetList - Get lead ads subscriptions returns 403 where Can&#39;t access this subscription.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions".Replace("adAccountId", "ADDME") + "?pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsGetList - Get lead ads subscriptions returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions".Replace("adAccountId", "ADDME") + "?pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsPost - Create lead ads subscription returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdAccountsSubscriptionsPostExample "application/json")
      // or pass a body of type AdAccountCreateSubscriptionRequest
      let body = obj() :?> AdAccountCreateSubscriptionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsPost - Create lead ads subscription returns 400 where Invalid input parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdAccountsSubscriptionsPostExample "application/json")
      // or pass a body of type AdAccountCreateSubscriptionRequest
      let body = obj() :?> AdAccountCreateSubscriptionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsPost - Create lead ads subscription returns 403 where Can&#39;t access this subscription.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdAccountsSubscriptionsPostExample "application/json")
      // or pass a body of type AdAccountCreateSubscriptionRequest
      let body = obj() :?> AdAccountCreateSubscriptionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdAccountsSubscriptionsPost - Create lead ads subscription returns 0 where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions".Replace("adAccountId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdAccountsSubscriptionsPostExample "application/json")
      // or pass a body of type AdAccountCreateSubscriptionRequest
      let body = obj() :?> AdAccountCreateSubscriptionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

