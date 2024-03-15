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
open UserAccountApiHandlerTestsHelper
open OpenAPI.UserAccountApiHandler
open OpenAPI.UserAccountApiHandlerParams
open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.BoardsUserFollowsList200Response
open OpenAPI.Model.Error
open OpenAPI.Model.FollowUserRequest
open OpenAPI.Model.FollowersList200Response
open System.Collections.Generic
open OpenAPI.Model.LinkedBusiness
open OpenAPI.Model.TopPinsAnalyticsResponse
open OpenAPI.Model.TopVideoPinsAnalyticsResponse
open OpenAPI.Model.UserAccountFollowedInterests200Response
open OpenAPI.Model.UserFollowingFeedType
open OpenAPI.Model.UserFollowingGet200Response
open OpenAPI.Model.UserSummary
open OpenAPI.Model.UserWebsiteSummary
open OpenAPI.Model.UserWebsiteVerificationCode
open OpenAPI.Model.UserWebsiteVerifyRequest
open OpenAPI.Model.UserWebsitesGet200Response

module UserAccountApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``BoardsUserFollowsList - List following boards returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following/boards" + "?bookmark=ADDME&pageSize=ADDME&explicitFollowing=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsUserFollowsList - List following boards returns 400 where Invalid user id`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following/boards" + "?bookmark=ADDME&pageSize=ADDME&explicitFollowing=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsUserFollowsList - List following boards returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following/boards" + "?bookmark=ADDME&pageSize=ADDME&explicitFollowing=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FollowUserUpdate - Follow user returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following/{username}".Replace("username", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFollowUserUpdateExample "application/json")
      // or pass a body of type FollowUserRequest
      let body = obj() :?> FollowUserRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FollowUserUpdate - Follow user returns 404 where User not found`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following/{username}".Replace("username", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFollowUserUpdateExample "application/json")
      // or pass a body of type FollowUserRequest
      let body = obj() :?> FollowUserRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FollowUserUpdate - Follow user returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following/{username}".Replace("username", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getFollowUserUpdateExample "application/json")
      // or pass a body of type FollowUserRequest
      let body = obj() :?> FollowUserRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``FollowersList - List followers returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/followers" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FollowersList - List followers returns 400 where Invalid user id`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/followers" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``FollowersList - List followers returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/followers" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``LinkedBusinessAccountsGet - List linked businesses returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/businesses"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``LinkedBusinessAccountsGet - List linked businesses returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/businesses"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UnverifyWebsiteDelete - Unverify website returns 204 where Successfully unverified website`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites" + "?website=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UnverifyWebsiteDelete - Unverify website returns 404 where Website not in user list.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites" + "?website=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UnverifyWebsiteDelete - Unverify website returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites" + "?website=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalytics - Get user account analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics" + "?startDate=ADDME&endDate=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalytics - Get user account analytics returns 400 where Invalid user accounts analytics parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics" + "?startDate=ADDME&endDate=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalytics - Get user account analytics returns 403 where Not authorized to access the user account analytics.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics" + "?startDate=ADDME&endDate=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalytics - Get user account analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics" + "?startDate=ADDME&endDate=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&splitField=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalyticsTopPins - Get user account top pins analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics/top_pins" + "?startDate=ADDME&endDate=ADDME&sortBy=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&numOfPins=ADDME&createdInLastNDays=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalyticsTopPins - Get user account top pins analytics returns 403 where Not authorized to access the user account analytics.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics/top_pins" + "?startDate=ADDME&endDate=ADDME&sortBy=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&numOfPins=ADDME&createdInLastNDays=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalyticsTopPins - Get user account top pins analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics/top_pins" + "?startDate=ADDME&endDate=ADDME&sortBy=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&numOfPins=ADDME&createdInLastNDays=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalyticsTopVideoPins - Get user account top video pins analytics returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics/top_video_pins" + "?startDate=ADDME&endDate=ADDME&sortBy=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&numOfPins=ADDME&createdInLastNDays=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalyticsTopVideoPins - Get user account top video pins analytics returns 403 where Not authorized to access the user account analytics.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics/top_video_pins" + "?startDate=ADDME&endDate=ADDME&sortBy=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&numOfPins=ADDME&createdInLastNDays=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountAnalyticsTopVideoPins - Get user account top video pins analytics returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/analytics/top_video_pins" + "?startDate=ADDME&endDate=ADDME&sortBy=ADDME&fromClaimedContent=ADDME&pinFormat=ADDME&appTypes=ADDME&contentType=ADDME&source=ADDME&metricTypes=ADDME&numOfPins=ADDME&createdInLastNDays=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountFollowedInterests - List following interests returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/users/{username}/interests/follow".Replace("username", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountFollowedInterests - List following interests returns 400 where Invalid parameters`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/users/{username}/interests/follow".Replace("username", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountFollowedInterests - List following interests returns 401 where Authorization failed`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/users/{username}/interests/follow".Replace("username", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountFollowedInterests - List following interests returns 404 where User not found`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/users/{username}/interests/follow".Replace("username", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountFollowedInterests - List following interests returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/users/{username}/interests/follow".Replace("username", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountGet - Get user account returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account" + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountGet - Get user account returns 403 where Not authorized to access the user account.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account" + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserAccountGet - Get user account returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account" + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserFollowingGet - List following returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following" + "?bookmark=ADDME&pageSize=ADDME&feedType=ADDME&explicitFollowing=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserFollowingGet - List following returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/following" + "?bookmark=ADDME&pageSize=ADDME&feedType=ADDME&explicitFollowing=ADDME&adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserWebsitesGet - Get user websites returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserWebsitesGet - Get user websites returns 403 where Not authorized to access the user website list.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UserWebsitesGet - Get user websites returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites" + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``VerifyWebsiteUpdate - Verify website returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyWebsiteUpdateExample "application/json")
      // or pass a body of type UserWebsiteVerifyRequest
      let body = obj() :?> UserWebsiteVerifyRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyWebsiteUpdate - Verify website returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyWebsiteUpdateExample "application/json")
      // or pass a body of type UserWebsiteVerifyRequest
      let body = obj() :?> UserWebsiteVerifyRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``WebsiteVerificationGet - Get user verification code for website claiming returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites/verification"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``WebsiteVerificationGet - Get user verification code for website claiming returns 403 where Not authorized to access the user verification code for website claiming.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites/verification"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``WebsiteVerificationGet - Get user verification code for website claiming returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/user_account/websites/verification"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

