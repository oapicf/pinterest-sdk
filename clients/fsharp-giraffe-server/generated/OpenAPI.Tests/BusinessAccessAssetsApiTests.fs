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
open BusinessAccessAssetsApiHandlerTestsHelper
open OpenAPI.BusinessAccessAssetsApiHandler
open OpenAPI.BusinessAccessAssetsApiHandlerParams
open OpenAPI.Model.BusinessAssetMembersGet200Response
open OpenAPI.Model.BusinessAssetPartnersGet200Response
open OpenAPI.Model.BusinessAssetsGet200Response
open OpenAPI.Model.BusinessMemberAssetsGet200Response
open OpenAPI.Model.BusinessMembersAssetAccessDeleteRequest
open OpenAPI.Model.BusinessPartnerAssetAccessGet200Response
open OpenAPI.Model.CreateAssetGroupBody
open OpenAPI.Model.CreateAssetGroupResponse
open OpenAPI.Model.DeleteAssetGroupBody
open OpenAPI.Model.DeleteAssetGroupResponse
open OpenAPI.Model.DeleteMemberAccessResultsResponseArray
open OpenAPI.Model.DeletePartnerAssetAccessBody
open OpenAPI.Model.DeletePartnerAssetsResultsResponseArray
open OpenAPI.Model.Error
open OpenAPI.Model.PartnerType
open OpenAPI.Model.PermissionsWithOwner
open OpenAPI.Model.UpdateAssetGroupBody
open OpenAPI.Model.UpdateAssetGroupResponse
open OpenAPI.Model.UpdateMemberAssetAccessBody
open OpenAPI.Model.UpdateMemberAssetsResultsResponseArray
open OpenAPI.Model.UpdatePartnerAssetAccessBody
open OpenAPI.Model.UpdatePartnerAssetsResultsResponseArray

module BusinessAccessAssetsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type CreateAssetGroupBody
      let body = obj() :?> CreateAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type CreateAssetGroupBody
      let body = obj() :?> CreateAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupCreate - Create a new asset group. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupCreateExample "application/json")
      // or pass a body of type CreateAssetGroupBody
      let body = obj() :?> CreateAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupDelete - Delete asset groups. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupDeleteExample "application/json")
      // or pass a body of type DeleteAssetGroupBody
      let body = obj() :?> DeleteAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupDelete - Delete asset groups. returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupDeleteExample "application/json")
      // or pass a body of type DeleteAssetGroupBody
      let body = obj() :?> DeleteAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupDelete - Delete asset groups. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupDeleteExample "application/json")
      // or pass a body of type DeleteAssetGroupBody
      let body = obj() :?> DeleteAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type UpdateAssetGroupBody
      let body = obj() :?> UpdateAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 400 where Invalid parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type UpdateAssetGroupBody
      let body = obj() :?> UpdateAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AssetGroupUpdate - Update asset groups. returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/asset_groups".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAssetGroupUpdateExample "application/json")
      // or pass a body of type UpdateAssetGroupBody
      let body = obj() :?> UpdateAssetGroupBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 200 where Sucess`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&startIndex=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetMembersGet - Get members with access to asset returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/members".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME&startIndex=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 200 where Sucess`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetPartnersGet - Get partners with access to asset returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets/{asset_id}/partners".Replace("businessId", "ADDME").Replace("assetId", "ADDME") + "?startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessAssetsGet - List business assets returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/assets".Replace("businessId", "ADDME") + "?permissions=ADDME&childAssetId=ADDME&assetGroupId=ADDME&assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMemberAssetsGet - Get assets assigned to a member returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/{member_id}/assets".Replace("businessId", "ADDME").Replace("memberId", "ADDME") + "?assetType=ADDME&startIndex=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessDelete - Delete member access to asset returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessDeleteExample "application/json")
      // or pass a body of type BusinessMembersAssetAccessDeleteRequest
      let body = obj() :?> BusinessMembersAssetAccessDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessDelete - Delete member access to asset returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessDeleteExample "application/json")
      // or pass a body of type BusinessMembersAssetAccessDeleteRequest
      let body = obj() :?> BusinessMembersAssetAccessDeleteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessMembersAssetAccessUpdate - Assign/Update member asset permissions returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/members/assets/access".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBusinessMembersAssetAccessUpdateExample "application/json")
      // or pass a body of type UpdateMemberAssetAccessBody
      let body = obj() :?> UpdateMemberAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BusinessPartnerAssetAccessGet - Get assets assigned to a partner or assets assigned by a partner returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/{partner_id}/assets".Replace("businessId", "ADDME").Replace("partnerId", "ADDME") + "?partnerType=ADDME&assetType=ADDME&startIndex=ADDME&pageSize=ADDME&bookmark=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeletePartnerAssetAccessHandlerImpl - Delete partner access to asset returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type DeletePartnerAssetAccessBody
      let body = obj() :?> DeletePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePartnerAssetAccessHandlerImpl - Delete partner access to asset returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type DeletePartnerAssetAccessBody
      let body = obj() :?> DeletePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePartnerAssetAccessHandlerImpl - Assign/Update partner asset permissions returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/businesses/{business_id}/partners/assets".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePartnerAssetAccessHandlerImplExample "application/json")
      // or pass a body of type UpdatePartnerAssetAccessBody
      let body = obj() :?> UpdatePartnerAssetAccessBody |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

