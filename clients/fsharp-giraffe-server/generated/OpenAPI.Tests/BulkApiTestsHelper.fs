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
open OpenAPI.BulkApiHandler
open OpenAPI.BulkApiHandlerParams

module BulkApiHandlerTestsHelper =


  let mutable BulkDownloadCreateExamples = Map.empty
  let mutable BulkDownloadCreateBody = ""

  BulkDownloadCreateBody <- WebUtility.HtmlDecode "{
  &quot;output_format&quot; : &quot;JSON&quot;,
  &quot;entity_types&quot; : [ &quot;CAMPAIGN&quot;, &quot;AD_GROUP&quot; ],
  &quot;updated_since&quot; : &quot;1622848072&quot;,
  &quot;campaign_filter&quot; : {
    &quot;start_time&quot; : &quot;1622848072&quot;,
    &quot;campaign_status&quot; : [ &quot;RUNNING&quot;, &quot;RUNNING&quot; ],
    &quot;end_time&quot; : &quot;1622848072&quot;,
    &quot;name&quot; : &quot;campaign name&quot;,
    &quot;objective_type&quot; : [ &quot;AWARENESS&quot;, &quot;AWARENESS&quot; ]
  },
  &quot;entity_ids&quot; : [ &quot;entity_ids&quot;, &quot;entity_ids&quot; ]
}"
  BulkDownloadCreateExamples <- BulkDownloadCreateExamples.Add("application/json", BulkDownloadCreateBody)

  let getBulkDownloadCreateExample mediaType =
    BulkDownloadCreateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable BulkUpsertCreateExamples = Map.empty
  let mutable BulkUpsertCreateBody = ""

  BulkUpsertCreateBody <- WebUtility.HtmlDecode "{
  &quot;create&quot; : {
    &quot;ad_groups&quot; : [ {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;targeting_template_ids&quot; : [ &quot;643&quot; ],
      &quot;end_time&quot; : 5705424000,
      &quot;auto_targeting_enabled&quot; : true,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;bid_strategy_type&quot; : &quot;MAX_BID&quot;,
      &quot;start_time&quot; : 5686848000,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;targeting_spec&quot; : {
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ]
      },
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;optimization_goal_metadata&quot; : &quot;{}&quot;,
      &quot;placement_group&quot; : &quot;placement_group&quot;,
      &quot;budget_type&quot; : &quot;DAILY&quot;,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;status&quot; : &quot;status&quot;,
      &quot;pacing_delivery_type&quot; : &quot;STANDARD&quot;
    }, {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;targeting_template_ids&quot; : [ &quot;643&quot; ],
      &quot;end_time&quot; : 5705424000,
      &quot;auto_targeting_enabled&quot; : true,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;bid_strategy_type&quot; : &quot;MAX_BID&quot;,
      &quot;start_time&quot; : 5686848000,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;targeting_spec&quot; : {
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ]
      },
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;optimization_goal_metadata&quot; : &quot;{}&quot;,
      &quot;placement_group&quot; : &quot;placement_group&quot;,
      &quot;budget_type&quot; : &quot;DAILY&quot;,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;status&quot; : &quot;status&quot;,
      &quot;pacing_delivery_type&quot; : &quot;STANDARD&quot;
    } ],
    &quot;ads&quot; : [ {
      &quot;is_removable&quot; : false,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;is_pin_deleted&quot; : false,
      &quot;creative_type&quot; : &quot;REGULAR&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;quiz_pin_data&quot; : &quot;{}&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;,
      &quot;pin_id&quot; : &quot;394205773611545468&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;
    }, {
      &quot;is_removable&quot; : false,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;is_pin_deleted&quot; : false,
      &quot;creative_type&quot; : &quot;REGULAR&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;quiz_pin_data&quot; : &quot;{}&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;,
      &quot;pin_id&quot; : &quot;394205773611545468&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;
    } ],
    &quot;campaigns&quot; : [ {
      &quot;default_ad_group_budget_in_micro_currency&quot; : 0,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;end_time&quot; : 1644023526,
      &quot;is_flexible_daily_budgets&quot; : false,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;objective_type&quot; : &quot;AWARENESS&quot;,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;is_automated_campaign&quot; : false,
      &quot;start_time&quot; : 1580865126,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;
    }, {
      &quot;default_ad_group_budget_in_micro_currency&quot; : 0,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;end_time&quot; : 1644023526,
      &quot;is_flexible_daily_budgets&quot; : false,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;objective_type&quot; : &quot;AWARENESS&quot;,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;is_automated_campaign&quot; : false,
      &quot;start_time&quot; : 1580865126,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;
    } ],
    &quot;keywords&quot; : [ {
      &quot;keywords&quot; : [ {
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;bid&quot; : 0,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;bid&quot; : 0,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;parent_id&quot; : &quot;383791336903426391&quot;
    }, {
      &quot;keywords&quot; : [ {
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;bid&quot; : 0,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;bid&quot; : 0,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;parent_id&quot; : &quot;383791336903426391&quot;
    } ],
    &quot;product_groups&quot; : [ {
      &quot;product_group_promotion&quot; : [ {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;
      }, {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;
      } ],
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;
    }, {
      &quot;product_group_promotion&quot; : [ {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;
      }, {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;
      } ],
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;
    } ]
  },
  &quot;update&quot; : {
    &quot;ad_groups&quot; : [ {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;targeting_template_ids&quot; : [ &quot;643&quot; ],
      &quot;end_time&quot; : 5705424000,
      &quot;auto_targeting_enabled&quot; : true,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;bid_strategy_type&quot; : &quot;MAX_BID&quot;,
      &quot;start_time&quot; : 5686848000,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;targeting_spec&quot; : {
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ]
      },
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;id&quot; : &quot;2680060704746&quot;,
      &quot;optimization_goal_metadata&quot; : &quot;{}&quot;,
      &quot;placement_group&quot; : &quot;placement_group&quot;,
      &quot;budget_type&quot; : &quot;budget_type&quot;,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;status&quot; : &quot;status&quot;,
      &quot;pacing_delivery_type&quot; : &quot;pacing_delivery_type&quot;
    }, {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;targeting_template_ids&quot; : [ &quot;643&quot; ],
      &quot;end_time&quot; : 5705424000,
      &quot;auto_targeting_enabled&quot; : true,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;bid_strategy_type&quot; : &quot;MAX_BID&quot;,
      &quot;start_time&quot; : 5686848000,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;targeting_spec&quot; : {
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ]
      },
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;id&quot; : &quot;2680060704746&quot;,
      &quot;optimization_goal_metadata&quot; : &quot;{}&quot;,
      &quot;placement_group&quot; : &quot;placement_group&quot;,
      &quot;budget_type&quot; : &quot;budget_type&quot;,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;status&quot; : &quot;status&quot;,
      &quot;pacing_delivery_type&quot; : &quot;pacing_delivery_type&quot;
    } ],
    &quot;ads&quot; : [ {
      &quot;is_removable&quot; : false,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;is_pin_deleted&quot; : false,
      &quot;creative_type&quot; : &quot;REGULAR&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;quiz_pin_data&quot; : &quot;{}&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;id&quot; : &quot;687195134316&quot;,
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;,
      &quot;pin_id&quot; : &quot;394205773611545468&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;
    }, {
      &quot;is_removable&quot; : false,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;is_pin_deleted&quot; : false,
      &quot;creative_type&quot; : &quot;REGULAR&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;quiz_pin_data&quot; : &quot;{}&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;id&quot; : &quot;687195134316&quot;,
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;,
      &quot;pin_id&quot; : &quot;394205773611545468&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;
    } ],
    &quot;campaigns&quot; : [ {
      &quot;default_ad_group_budget_in_micro_currency&quot; : 0,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;end_time&quot; : 1644023526,
      &quot;is_flexible_daily_budgets&quot; : true,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;objective_type&quot; : &quot;objective_type&quot;,
      &quot;is_campaign_budget_optimization&quot; : true,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;is_automated_campaign&quot; : true,
      &quot;start_time&quot; : 1580865126,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;id&quot; : &quot;549755885175&quot;,
      &quot;status&quot; : &quot;status&quot;
    }, {
      &quot;default_ad_group_budget_in_micro_currency&quot; : 0,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;end_time&quot; : 1644023526,
      &quot;is_flexible_daily_budgets&quot; : true,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;objective_type&quot; : &quot;objective_type&quot;,
      &quot;is_campaign_budget_optimization&quot; : true,
      &quot;tracking_urls&quot; : &quot;{}&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;is_automated_campaign&quot; : true,
      &quot;start_time&quot; : 1580865126,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;id&quot; : &quot;549755885175&quot;,
      &quot;status&quot; : &quot;status&quot;
    } ],
    &quot;keywords&quot; : [ {
      &quot;archived&quot; : false,
      &quot;id&quot; : &quot;2886364308355&quot;,
      &quot;bid&quot; : 6
    }, {
      &quot;archived&quot; : false,
      &quot;id&quot; : &quot;2886364308355&quot;,
      &quot;bid&quot; : 6
    } ],
    &quot;product_groups&quot; : [ {
      &quot;product_group_promotion&quot; : [ {
        &quot;catalog_product_group_id&quot; : &quot;1234123&quot;,
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;ProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;id&quot; : &quot;2680059592705&quot;
      }, {
        &quot;catalog_product_group_id&quot; : &quot;1231231&quot;,
        &quot;slideshow_collections_description&quot; : &quot;Other description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123124&quot;,
        &quot;catalog_product_group_name&quot; : &quot;ProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;id&quot; : &quot;2680059592706&quot;
      } ],
      &quot;ad_group_id&quot; : &quot;26823439592705&quot;
    }, {
      &quot;product_group_promotion&quot; : [ {
        &quot;catalog_product_group_id&quot; : &quot;1234123&quot;,
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;ProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;id&quot; : &quot;2680059592705&quot;
      }, {
        &quot;catalog_product_group_id&quot; : &quot;1231231&quot;,
        &quot;slideshow_collections_description&quot; : &quot;Other description&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123124&quot;,
        &quot;catalog_product_group_name&quot; : &quot;ProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;id&quot; : &quot;2680059592706&quot;
      } ],
      &quot;ad_group_id&quot; : &quot;26823439592705&quot;
    } ]
  }
}"
  BulkUpsertCreateExamples <- BulkUpsertCreateExamples.Add("application/json", BulkUpsertCreateBody)

  let getBulkUpsertCreateExample mediaType =
    BulkUpsertCreateExamples.[mediaType]
      |> getConverter mediaType
