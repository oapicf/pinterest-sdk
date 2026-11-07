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
  &quot;asset_group&quot; : {
    &quot;ad_accounts_ids&quot; : [ &quot;549755885175&quot; ],
    &quot;asset_group_description&quot; : &quot;Asset group that has ad accounts used in Canada&quot;,
    &quot;asset_group_name&quot; : &quot;Canada Ad Accounts&quot;,
    &quot;asset_group_types&quot; : [ &quot;LOCATION_OR_LANGUAGE&quot; ],
    &quot;catalogs_ids&quot; : [ &quot;4836859046874&quot; ],
    &quot;created_by&quot; : &quot;&quot;,
    &quot;created_time&quot; : 1646767577816,
    &quot;id&quot; : &quot;666791336903426391&quot;,
    &quot;owner&quot; : &quot;&quot;,
    &quot;profiles_ids&quot; : [ &quot;630433785246278264&quot; ],
    &quot;updated_time&quot; : 1646767577816
  },
  &quot;asset_group_description&quot; : &quot;Asset groups that has ad accounts shared in Canada&quot;,
  &quot;asset_group_name&quot; : &quot;Canada Ad Accounts&quot;,
  &quot;asset_group_types&quot; : [ &quot;BRAND&quot;, &quot;LOCATION_OR_LANGUAGE&quot;, &quot;PRODUCT_LINE&quot;, &quot;OTHER&quot; ]
}"
  AssetGroupCreateExamples <- AssetGroupCreateExamples.Add("application/json", AssetGroupCreateBody)

  let getAssetGroupCreateExample mediaType =
    AssetGroupCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable AssetGroupDeleteExamples = Map.empty
  let mutable AssetGroupDeleteBody = ""

  AssetGroupDeleteBody <- WebUtility.HtmlDecode "{
  &quot;asset_groups_to_delete&quot; : [ null, null, null, null, null ]
}"
  AssetGroupDeleteExamples <- AssetGroupDeleteExamples.Add("application/json", AssetGroupDeleteBody)

  let getAssetGroupDeleteExample mediaType =
    AssetGroupDeleteExamples.[mediaType]
      |> getConverter mediaType

  let mutable AssetGroupUpdateExamples = Map.empty
  let mutable AssetGroupUpdateBody = ""

  AssetGroupUpdateBody <- WebUtility.HtmlDecode "{
  &quot;asset_groups_to_update&quot; : [ {
    &quot;asset_group_id&quot; : &quot;asset_group_id&quot;,
    &quot;asset_group_types&quot; : [ &quot;BRAND&quot;, &quot;LOCATION_OR_LANGUAGE&quot;, &quot;PRODUCT_LINE&quot;, &quot;OTHER&quot; ],
    &quot;assets_to_add&quot; : [ &quot;assets_to_add&quot;, &quot;assets_to_add&quot; ],
    &quot;assets_to_remove&quot; : [ &quot;assets_to_remove&quot;, &quot;assets_to_remove&quot; ],
    &quot;description&quot; : &quot;description&quot;,
    &quot;name&quot; : &quot;name&quot;
  }, {
    &quot;asset_group_id&quot; : &quot;asset_group_id&quot;,
    &quot;asset_group_types&quot; : [ &quot;BRAND&quot;, &quot;LOCATION_OR_LANGUAGE&quot;, &quot;PRODUCT_LINE&quot;, &quot;OTHER&quot; ],
    &quot;assets_to_add&quot; : [ &quot;assets_to_add&quot;, &quot;assets_to_add&quot; ],
    &quot;assets_to_remove&quot; : [ &quot;assets_to_remove&quot;, &quot;assets_to_remove&quot; ],
    &quot;description&quot; : &quot;description&quot;,
    &quot;name&quot; : &quot;name&quot;
  } ],
  &quot;exceptions&quot; : [ {
    &quot;asset_group_id&quot; : &quot;asset_group_id&quot;,
    &quot;code&quot; : 0,
    &quot;message&quot; : &quot;message&quot;
  }, {
    &quot;asset_group_id&quot; : &quot;asset_group_id&quot;,
    &quot;code&quot; : 0,
    &quot;message&quot; : &quot;message&quot;
  } ],
  &quot;updated_asset_groups&quot; : [ {
    &quot;ad_accounts_ids&quot; : [ &quot;549755885175&quot; ],
    &quot;asset_group_description&quot; : &quot;Asset group that has ad accounts used in Canada&quot;,
    &quot;asset_group_name&quot; : &quot;Canada Ad Accounts&quot;,
    &quot;asset_group_types&quot; : [ &quot;LOCATION_OR_LANGUAGE&quot; ],
    &quot;catalogs_ids&quot; : [ &quot;4836859046874&quot; ],
    &quot;created_by&quot; : &quot;&quot;,
    &quot;created_time&quot; : 1646767577816,
    &quot;id&quot; : &quot;666791336903426391&quot;,
    &quot;owner&quot; : &quot;&quot;,
    &quot;profiles_ids&quot; : [ &quot;630433785246278264&quot; ],
    &quot;updated_time&quot; : 1646767577816
  }, {
    &quot;ad_accounts_ids&quot; : [ &quot;549755885175&quot; ],
    &quot;asset_group_description&quot; : &quot;Asset group that has ad accounts used in Canada&quot;,
    &quot;asset_group_name&quot; : &quot;Canada Ad Accounts&quot;,
    &quot;asset_group_types&quot; : [ &quot;LOCATION_OR_LANGUAGE&quot; ],
    &quot;catalogs_ids&quot; : [ &quot;4836859046874&quot; ],
    &quot;created_by&quot; : &quot;&quot;,
    &quot;created_time&quot; : 1646767577816,
    &quot;id&quot; : &quot;666791336903426391&quot;,
    &quot;owner&quot; : &quot;&quot;,
    &quot;profiles_ids&quot; : [ &quot;630433785246278264&quot; ],
    &quot;updated_time&quot; : 1646767577816
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

  BusinessMembersAssetAccessDeleteBody <- WebUtility.HtmlDecode "{
  &quot;accesses&quot; : [ {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;
  } ]
}"
  BusinessMembersAssetAccessDeleteExamples <- BusinessMembersAssetAccessDeleteExamples.Add("application/json", BusinessMembersAssetAccessDeleteBody)

  let getBusinessMembersAssetAccessDeleteExample mediaType =
    BusinessMembersAssetAccessDeleteExamples.[mediaType]
      |> getConverter mediaType

  let mutable BusinessMembersAssetAccessUpdateExamples = Map.empty
  let mutable BusinessMembersAssetAccessUpdateBody = ""

  BusinessMembersAssetAccessUpdateBody <- WebUtility.HtmlDecode "{
  &quot;accesses&quot; : [ {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;member_id&quot; : &quot;member_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
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
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;partner_type&quot; : &quot;INTERNAL&quot;
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
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  }, {
    &quot;asset_id&quot; : &quot;asset_id&quot;,
    &quot;partner_id&quot; : &quot;partner_id&quot;,
    &quot;permissions&quot; : [ &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot;, &quot;ADMIN&quot; ]
  } ]
}"
  UpdatePartnerAssetAccessHandlerImplExamples <- UpdatePartnerAssetAccessHandlerImplExamples.Add("application/json", UpdatePartnerAssetAccessHandlerImplBody)

  let getUpdatePartnerAssetAccessHandlerImplExample mediaType =
    UpdatePartnerAssetAccessHandlerImplExamples.[mediaType]
      |> getConverter mediaType
