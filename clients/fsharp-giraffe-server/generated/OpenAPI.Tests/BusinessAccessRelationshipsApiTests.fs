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
open BusinessAccessRelationshipsApiHandlerTestsHelper
open OpenAPI.BusinessAccessRelationshipsApiHandler
open OpenAPI.BusinessAccessRelationshipsApiHandlerParams
open OpenAPI.Model.DeletePartnersRequest
open OpenAPI.Model.DeletePartnersResponse
open OpenAPI.Model.DeletedMembersResponse
open OpenAPI.Model.Error
open OpenAPI.Model.GetBusinessEmployers200Response
open OpenAPI.Model.GetBusinessMembers200Response
open OpenAPI.Model.GetBusinessPartners200Response
open OpenAPI.Model.MemberBusinessRole
open OpenAPI.Model.MembersToDeleteBody
open OpenAPI.Model.PartnerType
open OpenAPI.Model.UpdateMemberBusinessRoleBody
open OpenAPI.Model.UpdateMemberResultsResponseArray

module BusinessAccessRelationshipsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``DeleteBusinessMembership - Terminate business memberships returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessMembershipExample "application/json")
      // or pass a body of type MembersToDeleteBody
      let body = obj() :?> MembersToDeleteBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessMembership - Terminate business memberships returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessMembershipExample "application/json")
      // or pass a body of type MembersToDeleteBody
      let body = obj() :?> MembersToDeleteBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessPartners - Terminate business partnerships returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessPartnersExample "application/json")
      // or pass a body of type DeletePartnersRequest
      let body = obj() :?> DeletePartnersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessPartners - Terminate business partnerships returns 404 where A supplied partner id doesn&#39;t exist`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessPartnersExample "application/json")
      // or pass a body of type DeletePartnersRequest
      let body = obj() :?> DeletePartnersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessPartners - Terminate business partnerships returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessPartnersExample "application/json")
      // or pass a body of type DeletePartnersRequest
      let body = obj() :?> DeletePartnersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type UpdateMemberBusinessRoleBody[]
      let body = obj() :?> UpdateMemberBusinessRoleBody[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type UpdateMemberBusinessRoleBody[]
      let body = obj() :?> UpdateMemberBusinessRoleBody[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

