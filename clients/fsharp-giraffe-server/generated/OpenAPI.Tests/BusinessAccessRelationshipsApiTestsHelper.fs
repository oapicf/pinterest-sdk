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


  let mutable DeleteBusinessMembershipExamples = Map.empty
  let mutable DeleteBusinessMembershipBody = ""

  DeleteBusinessMembershipBody <- WebUtility.HtmlDecode "{
  &quot;members&quot; : [ {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;
  } ]
}"
  DeleteBusinessMembershipExamples <- DeleteBusinessMembershipExamples.Add("application/json", DeleteBusinessMembershipBody)

  let getDeleteBusinessMembershipExample mediaType =
    DeleteBusinessMembershipExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteBusinessPartnersExamples = Map.empty
  let mutable DeleteBusinessPartnersBody = ""

  DeleteBusinessPartnersBody <- WebUtility.HtmlDecode "{
  &quot;partner_type&quot; : &quot;partner_type&quot;,
  &quot;partner_ids&quot; : [ &quot;1234567890123&quot;, &quot;1234567890123&quot;, &quot;1234567890123&quot;, &quot;1234567890123&quot;, &quot;1234567890123&quot; ]
}"
  DeleteBusinessPartnersExamples <- DeleteBusinessPartnersExamples.Add("application/json", DeleteBusinessPartnersBody)

  let getDeleteBusinessPartnersExample mediaType =
    DeleteBusinessPartnersExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable UpdateBusinessMembershipsExamples = Map.empty
  let mutable UpdateBusinessMembershipsBody = ""

  UpdateBusinessMembershipsBody <- WebUtility.HtmlDecode "{
  &quot;member_id&quot; : &quot;140943737684417&quot;,
  &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;
}"
  UpdateBusinessMembershipsExamples <- UpdateBusinessMembershipsExamples.Add("application/json", UpdateBusinessMembershipsBody)

  let getUpdateBusinessMembershipsExample mediaType =
    UpdateBusinessMembershipsExamples.[mediaType]
      |> getConverter mediaType
