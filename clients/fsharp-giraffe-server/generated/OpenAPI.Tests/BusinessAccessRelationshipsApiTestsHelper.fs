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
open TestHelper
open OpenAPI.BusinessAccessRelationshipsApiHandler
open OpenAPI.BusinessAccessRelationshipsApiHandlerParams

module BusinessAccessRelationshipsApiHandlerTestsHelper =


  let mutable BrandAccountsCreateExamples = Map.empty
  let mutable BrandAccountsCreateBody = ""

  BrandAccountsCreateBody <- WebUtility.HtmlDecode "{
  &quot;about&quot; : &quot;about&quot;,
  &quot;country&quot; : &quot;AD&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;profile_image&quot; : {
    &quot;content_type&quot; : &quot;image/jpeg&quot;,
    &quot;data&quot; : &quot;data&quot;
  },
  &quot;username&quot; : &quot;username&quot;,
  &quot;website&quot; : &quot;website&quot;
}"
  BrandAccountsCreateExamples <- BrandAccountsCreateExamples.Add("application/json", BrandAccountsCreateBody)

  let getBrandAccountsCreateExample mediaType =
    BrandAccountsCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable BrandAccountsUpdateExamples = Map.empty
  let mutable BrandAccountsUpdateBody = ""

  BrandAccountsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;about&quot; : &quot;about&quot;,
  &quot;country&quot; : &quot;AD&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;profile_image&quot; : {
    &quot;content_type&quot; : &quot;image/jpeg&quot;,
    &quot;data&quot; : &quot;data&quot;
  },
  &quot;username&quot; : &quot;username&quot;,
  &quot;website&quot; : &quot;website&quot;
}"
  BrandAccountsUpdateExamples <- BrandAccountsUpdateExamples.Add("application/json", BrandAccountsUpdateBody)

  let getBrandAccountsUpdateExample mediaType =
    BrandAccountsUpdateExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteBusinessMembershipExamples = Map.empty
  let mutable DeleteBusinessMembershipBody = ""

  DeleteBusinessMembershipBody <- WebUtility.HtmlDecode "{
  &quot;members&quot; : [ {
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;,
    &quot;member_id&quot; : &quot;140943737684417&quot;
  }, {
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;,
    &quot;member_id&quot; : &quot;140943737684417&quot;
  }, {
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;,
    &quot;member_id&quot; : &quot;140943737684417&quot;
  }, {
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;,
    &quot;member_id&quot; : &quot;140943737684417&quot;
  }, {
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;,
    &quot;member_id&quot; : &quot;140943737684417&quot;
  } ]
}"
  DeleteBusinessMembershipExamples <- DeleteBusinessMembershipExamples.Add("application/json", DeleteBusinessMembershipBody)

  let getDeleteBusinessMembershipExample mediaType =
    DeleteBusinessMembershipExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteBusinessPartnersExamples = Map.empty
  let mutable DeleteBusinessPartnersBody = ""

  DeleteBusinessPartnersBody <- WebUtility.HtmlDecode "{
  &quot;partner_ids&quot; : [ null, null, null, null, null ],
  &quot;partner_type&quot; : &quot;&quot;
}"
  DeleteBusinessPartnersExamples <- DeleteBusinessPartnersExamples.Add("application/json", DeleteBusinessPartnersBody)

  let getDeleteBusinessPartnersExample mediaType =
    DeleteBusinessPartnersExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable SystemUserUpdateExamples = Map.empty
  let mutable SystemUserUpdateBody = ""

  SystemUserUpdateBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;name&quot;
}"
  SystemUserUpdateExamples <- SystemUserUpdateExamples.Add("application/json", SystemUserUpdateBody)

  let getSystemUserUpdateExample mediaType =
    SystemUserUpdateExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateBusinessMembershipsExamples = Map.empty
  let mutable UpdateBusinessMembershipsBody = ""

  UpdateBusinessMembershipsBody <- WebUtility.HtmlDecode "{
  &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;,
  &quot;member_id&quot; : &quot;140943737684417&quot;
}"
  UpdateBusinessMembershipsExamples <- UpdateBusinessMembershipsExamples.Add("application/json", UpdateBusinessMembershipsBody)

  let getUpdateBusinessMembershipsExample mediaType =
    UpdateBusinessMembershipsExamples.[mediaType]
      |> getConverter mediaType
