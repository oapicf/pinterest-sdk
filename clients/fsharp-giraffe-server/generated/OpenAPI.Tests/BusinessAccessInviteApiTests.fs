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
open BusinessAccessInviteApiHandlerTestsHelper
open OpenAPI.BusinessAccessInviteApiHandler
open OpenAPI.BusinessAccessInviteApiHandlerParams
open OpenAPI.Model.AuthRespondInvitesBody
open OpenAPI.Model.CancelInvitesBody
open OpenAPI.Model.CreateAssetAccessRequestBody
open OpenAPI.Model.CreateAssetAccessRequestResponse
open OpenAPI.Model.CreateAssetInvitesRequest
open OpenAPI.Model.CreateInvitesResultsResponseArray
open OpenAPI.Model.CreateMembershipOrPartnershipInvitesBody
open OpenAPI.Model.DeleteInvitesResultsResponseArray
open OpenAPI.Model.Error
open OpenAPI.Model.GetInvites200Response
open OpenAPI.Model.InviteType
open OpenAPI.Model.RespondToInvitesResponseArray
open OpenAPI.Model.UpdateInvitesResultsResponseArray

module BusinessAccessInviteApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AssetAccessRequestsCreate - Create a request to access an existing partner&#39;s assets. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/requests/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetAccessRequestsCreateExample "application/json")
      // or pass a body of type CreateAssetAccessRequestBody
      let body = obj() :?> CreateAssetAccessRequestBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetAccessRequestsCreate - Create a request to access an existing partner&#39;s assets. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/requests/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetAccessRequestsCreateExample "application/json")
      // or pass a body of type CreateAssetAccessRequestBody
      let body = obj() :?> CreateAssetAccessRequestBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CancelInvitesOrRequests - Cancel invites/requests returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCancelInvitesOrRequestsExample "application/json")
      // or pass a body of type CancelInvitesBody
      let body = obj() :?> CancelInvitesBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CancelInvitesOrRequests - Cancel invites/requests returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCancelInvitesOrRequestsExample "application/json")
      // or pass a body of type CancelInvitesBody
      let body = obj() :?> CancelInvitesBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateAssetInvites - Update invite/request with an asset permission returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateAssetInvitesExample "application/json")
      // or pass a body of type CreateAssetInvitesRequest
      let body = obj() :?> CreateAssetInvitesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateAssetInvites - Update invite/request with an asset permission returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateAssetInvitesExample "application/json")
      // or pass a body of type CreateAssetInvitesRequest
      let body = obj() :?> CreateAssetInvitesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateMembershipOrPartnershipInvites - Create invites or requests returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateMembershipOrPartnershipInvitesExample "application/json")
      // or pass a body of type CreateMembershipOrPartnershipInvitesBody
      let body = obj() :?> CreateMembershipOrPartnershipInvitesBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateMembershipOrPartnershipInvites - Create invites or requests returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateMembershipOrPartnershipInvitesExample "application/json")
      // or pass a body of type CreateMembershipOrPartnershipInvitesBody
      let body = obj() :?> CreateMembershipOrPartnershipInvitesBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetInvites - Get invites/requests returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites".Replace("businessId", "ADDME") + "?isMember=ADDME&inviteStatus=ADDME&inviteType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetInvites - Get invites/requests returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/invites".Replace("businessId", "ADDME") + "?isMember=ADDME&inviteStatus=ADDME&inviteType=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RespondBusinessAccessInvites - Accept or decline an invite/request returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/invites"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getRespondBusinessAccessInvitesExample "application/json")
      // or pass a body of type AuthRespondInvitesBody
      let body = obj() :?> AuthRespondInvitesBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``RespondBusinessAccessInvites - Accept or decline an invite/request returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/invites"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getRespondBusinessAccessInvitesExample "application/json")
      // or pass a body of type AuthRespondInvitesBody
      let body = obj() :?> AuthRespondInvitesBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

