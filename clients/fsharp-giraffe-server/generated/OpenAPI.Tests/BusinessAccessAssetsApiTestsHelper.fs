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
open OpenAPI.BusinessAccessAssetsApiHandler
open OpenAPI.BusinessAccessAssetsApiHandlerParams

module BusinessAccessAssetsApiHandlerTestsHelper =


  let mutable AssetGroupCreateExamples = Map.empty
  let mutable AssetGroupCreateBody = ""

  AssetGroupCreateBody <- WebUtility.HtmlDecode "{
  &quot;asset_group_types&quot; : [ &quot;BRAND&quot;, &quot;LOCATION_OR_LANGUAGE&quot;, &quot;PRODUCT_LINE&quot;, &quot;OTHER&quot; ],
  &quot;asset_group_description&quot; : &quot;Asset groups that has ad accounts shared in Canada&quot;,
  &quot;asset_group_name&quot; : &quot;Canada Ad Accounts&quot;
}"
  AssetGroupCreateExamples <- AssetGroupCreateExamples.Add("application/json", AssetGroupCreateBody)

  let getAssetGroupCreateExample mediaType =
    AssetGroupCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable AssetGroupDeleteExamples = Map.empty
  let mutable AssetGroupDeleteBody = ""

  AssetGroupDeleteBody <- WebUtility.HtmlDecode "{
  &quot;asset_groups_to_delete&quot; : [ &quot;666791336903426391&quot;, &quot;666791336903426392&quot; ]
}"
  AssetGroupDeleteExamples <- AssetGroupDeleteExamples.Add("application/json", AssetGroupDeleteBody)

  let getAssetGroupDeleteExample mediaType =
    AssetGroupDeleteExamples.[mediaType]
      |> getConverter mediaType

  let mutable AssetGroupUpdateExamples = Map.empty
  let mutable AssetGroupUpdateBody = ""

  AssetGroupUpdateBody <- WebUtility.HtmlDecode "{
  &quot;asset_groups_to_update&quot; : [ {
    &quot;asset_group_id&quot; : &quot;666791336903426391&quot;,
    &quot;assets_to_add&quot; : [ &quot;549755885175&quot;, &quot;549755885175&quot; ],
    &quot;asset_group_types&quot; : [ &quot;BRAND&quot;, &quot;LOCATION_OR_LANGUAGE&quot;, &quot;PRODUCT_LINE&quot;, &quot;OTHER&quot; ],
    &quot;name&quot; : &quot;Canada Ad Accounts&quot;,
    &quot;assets_to_remove&quot; : [ &quot;549755885175&quot;, &quot;549755885175&quot; ],
    &quot;description&quot; : &quot;Asset groups that has ad accounts shared in Canada&quot;
  }, {
    &quot;asset_group_id&quot; : &quot;666791336903426391&quot;,
    &quot;assets_to_add&quot; : [ &quot;549755885175&quot;, &quot;549755885175&quot; ],
    &quot;asset_group_types&quot; : [ &quot;BRAND&quot;, &quot;LOCATION_OR_LANGUAGE&quot;, &quot;PRODUCT_LINE&quot;, &quot;OTHER&quot; ],
    &quot;name&quot; : &quot;Canada Ad Accounts&quot;,
    &quot;assets_to_remove&quot; : [ &quot;549755885175&quot;, &quot;549755885175&quot; ],
    &quot;description&quot; : &quot;Asset groups that has ad accounts shared in Canada&quot;
  } ]
}"
  AssetGroupUpdateExamples <- AssetGroupUpdateExamples.Add("application/json", AssetGroupUpdateBody)

  let getAssetGroupUpdateExample mediaType =
    AssetGroupUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable BusinessMembersAssetAccessDeleteExamples = Map.empty
  let mutable BusinessMembersAssetAccessDeleteBody = ""

  BusinessMembersAssetAccessDeleteBody <- WebUtility.HtmlDecode ""
  BusinessMembersAssetAccessDeleteExamples <- BusinessMembersAssetAccessDeleteExamples.Add("", BusinessMembersAssetAccessDeleteBody)

  let getBusinessMembersAssetAccessDeleteExample mediaType =
    BusinessMembersAssetAccessDeleteExamples.[mediaType]
      |> getConverter mediaType

  let mutable BusinessMembersAssetAccessUpdateExamples = Map.empty
  let mutable BusinessMembersAssetAccessUpdateBody = ""

  BusinessMembersAssetAccessUpdateBody <- WebUtility.HtmlDecode "{
  &quot;accesses&quot; : [ {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;member_id&quot; : &quot;140943737684417&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  } ]
}"
  BusinessMembersAssetAccessUpdateExamples <- BusinessMembersAssetAccessUpdateExamples.Add("application/json", BusinessMembersAssetAccessUpdateBody)

  let getBusinessMembersAssetAccessUpdateExample mediaType =
    BusinessMembersAssetAccessUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable DeletePartnerAssetAccessHandlerImplExamples = Map.empty
  let mutable DeletePartnerAssetAccessHandlerImplBody = ""

  DeletePartnerAssetAccessHandlerImplBody <- WebUtility.HtmlDecode "{
  &quot;accesses&quot; : [ {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;,
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;,
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;,
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;,
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;,
    &quot;asset_id&quot; : &quot;549755885175&quot;
  } ]
}"
  DeletePartnerAssetAccessHandlerImplExamples <- DeletePartnerAssetAccessHandlerImplExamples.Add("application/json", DeletePartnerAssetAccessHandlerImplBody)

  let getDeletePartnerAssetAccessHandlerImplExample mediaType =
    DeletePartnerAssetAccessHandlerImplExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdatePartnerAssetAccessHandlerImplExamples = Map.empty
  let mutable UpdatePartnerAssetAccessHandlerImplBody = ""

  UpdatePartnerAssetAccessHandlerImplBody <- WebUtility.HtmlDecode "{
  &quot;accesses&quot; : [ {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  }, {
    &quot;partner_id&quot; : &quot;1234567890123&quot;,
    &quot;permissions&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
    &quot;asset_id&quot; : &quot;549755885175&quot;
  } ]
}"
  UpdatePartnerAssetAccessHandlerImplExamples <- UpdatePartnerAssetAccessHandlerImplExamples.Add("application/json", UpdatePartnerAssetAccessHandlerImplBody)

  let getUpdatePartnerAssetAccessHandlerImplExample mediaType =
    UpdatePartnerAssetAccessHandlerImplExamples.[mediaType]
      |> getConverter mediaType
