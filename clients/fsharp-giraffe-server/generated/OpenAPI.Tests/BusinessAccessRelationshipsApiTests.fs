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
open OpenAPI.Model.BrandAccount
open OpenAPI.Model.BrandAccountCreate
open OpenAPI.Model.BrandAccountUpdate
open OpenAPI.Model.BusinessMembershipMember
open OpenAPI.Model.DeleteBusinessMembership200Response
open OpenAPI.Model.DeleteBusinessMembershipBody
open OpenAPI.Model.DeleteBusinessPartners
open OpenAPI.Model.DeleteBusinessPartnersDelete
open OpenAPI.Model.GetBusinessEmployers200Response
open OpenAPI.Model.MemberBusinessRole
open OpenAPI.Model.PartnerType
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SystemUserUpdateWithRequiredBody
open OpenAPI.Model.UpdateBusinessMembershipsResponse

module BusinessAccessRelationshipsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsCreate - Create a Brand Account returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsCreateExample "application/json")
      // or pass a body of type BrandAccountCreate
      let body = obj() :?> BrandAccountCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 409 where The request could not be processed because of a conflict in the current state of the resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BrandAccountsUpdate - Update a Brand Account returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".Replace("brandAccountId", "ADDME").Replace("businessHierarchyId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBrandAccountsUpdateExample "application/json")
      // or pass a body of type BrandAccountUpdate
      let body = obj() :?> BrandAccountUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessMembership - Terminate business memberships returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessMembershipExample "application/json")
      // or pass a body of type DeleteBusinessMembershipBody
      let body = obj() :?> DeleteBusinessMembershipBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessMembership - Terminate business memberships returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessMembershipExample "application/json")
      // or pass a body of type DeleteBusinessMembershipBody
      let body = obj() :?> DeleteBusinessMembershipBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessPartners - Terminate business partnerships returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessPartnersExample "application/json")
      // or pass a body of type DeleteBusinessPartnersDelete
      let body = obj() :?> DeleteBusinessPartnersDelete |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessPartners - Terminate business partnerships returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessPartnersExample "application/json")
      // or pass a body of type DeleteBusinessPartnersDelete
      let body = obj() :?> DeleteBusinessPartnersDelete |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteBusinessPartners - Terminate business partnerships returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteBusinessPartnersExample "application/json")
      // or pass a body of type DeleteBusinessPartnersDelete
      let body = obj() :?> DeleteBusinessPartnersDelete |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?assetsSummary=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?assetsSummary=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?assetsSummary=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?assetsSummary=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?assetsSummary=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?assetsSummary=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessEmployers - List business employers for user returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/employers" + "?assetsSummary=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?fetchSystemUsers=ADDME&assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?fetchSystemUsers=ADDME&assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?fetchSystemUsers=ADDME&assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?fetchSystemUsers=ADDME&assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?fetchSystemUsers=ADDME&assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?fetchSystemUsers=ADDME&assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessMembers - Get business members returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME") + "?fetchSystemUsers=ADDME&assetsSummary=ADDME&businessRoles=ADDME&memberIds=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&sortAscending=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&sortAscending=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&sortAscending=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&sortAscending=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&sortAscending=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&sortAscending=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessPartners - Get business partners returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners".Replace("businessId", "ADDME") + "?assetsSummary=ADDME&partnerType=ADDME&partnerIds=ADDME&startIndex=ADDME&sortAscending=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SystemUserUpdate - Update a system user information. returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/system_users/{system_user_id}".Replace("businessId", "ADDME").Replace("systemUserId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSystemUserUpdateExample "application/json")
      // or pass a body of type SystemUserUpdateWithRequiredBody
      let body = obj() :?> SystemUserUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SystemUserUpdate - Update a system user information. returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/system_users/{system_user_id}".Replace("businessId", "ADDME").Replace("systemUserId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSystemUserUpdateExample "application/json")
      // or pass a body of type SystemUserUpdateWithRequiredBody
      let body = obj() :?> SystemUserUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SystemUserUpdate - Update a system user information. returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/system_users/{system_user_id}".Replace("businessId", "ADDME").Replace("systemUserId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSystemUserUpdateExample "application/json")
      // or pass a body of type SystemUserUpdateWithRequiredBody
      let body = obj() :?> SystemUserUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SystemUserUpdate - Update a system user information. returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/system_users/{system_user_id}".Replace("businessId", "ADDME").Replace("systemUserId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSystemUserUpdateExample "application/json")
      // or pass a body of type SystemUserUpdateWithRequiredBody
      let body = obj() :?> SystemUserUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SystemUserUpdate - Update a system user information. returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/system_users/{system_user_id}".Replace("businessId", "ADDME").Replace("systemUserId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSystemUserUpdateExample "application/json")
      // or pass a body of type SystemUserUpdateWithRequiredBody
      let body = obj() :?> SystemUserUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SystemUserUpdate - Update a system user information. returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/system_users/{system_user_id}".Replace("businessId", "ADDME").Replace("systemUserId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSystemUserUpdateExample "application/json")
      // or pass a body of type SystemUserUpdateWithRequiredBody
      let body = obj() :?> SystemUserUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SystemUserUpdate - Update a system user information. returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/system_users/{system_user_id}".Replace("businessId", "ADDME").Replace("systemUserId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSystemUserUpdateExample "application/json")
      // or pass a body of type SystemUserUpdateWithRequiredBody
      let body = obj() :?> SystemUserUpdateWithRequiredBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type BusinessMembershipMember[]
      let body = obj() :?> BusinessMembershipMember[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type BusinessMembershipMember[]
      let body = obj() :?> BusinessMembershipMember[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type BusinessMembershipMember[]
      let body = obj() :?> BusinessMembershipMember[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type BusinessMembershipMember[]
      let body = obj() :?> BusinessMembershipMember[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type BusinessMembershipMember[]
      let body = obj() :?> BusinessMembershipMember[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type BusinessMembershipMember[]
      let body = obj() :?> BusinessMembershipMember[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessMemberships - Update member&#39;s business role returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessMembershipsExample "application/json")
      // or pass a body of type BusinessMembershipMember[]
      let body = obj() :?> BusinessMembershipMember[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

