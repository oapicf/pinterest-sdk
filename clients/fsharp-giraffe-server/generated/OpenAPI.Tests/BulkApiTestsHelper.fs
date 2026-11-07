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
  &quot;campaign_filter&quot; : {
    &quot;campaign_status&quot; : [ &quot;RUNNING&quot;, &quot;RUNNING&quot; ],
    &quot;end_time&quot; : &quot;1622848072&quot;,
    &quot;name&quot; : &quot;campaign name&quot;,
    &quot;objective_type&quot; : [ &quot;AWARENESS&quot;, &quot;AWARENESS&quot; ],
    &quot;start_time&quot; : &quot;1622848072&quot;
  },
  &quot;entity_ids&quot; : [ null, null ],
  &quot;entity_types&quot; : [ &quot;CAMPAIGN&quot;, &quot;AD_GROUP&quot; ],
  &quot;output_format&quot; : &quot;&quot;,
  &quot;updated_since&quot; : &quot;1622848072&quot;
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
      &quot;bid_multiplier&quot; : 0.8008281904610115,
      &quot;budget_type&quot; : &quot;DAILY&quot;,
      &quot;pacing_delivery_type&quot; : &quot;STANDARD&quot;,
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;bid_strategy_type&quot; : &quot;AUTOMATIC_BID&quot;,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;end_time&quot; : 5705424000,
      &quot;is_creative_optimization&quot; : true,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;placement_group&quot; : &quot;&quot;,
      &quot;promotion_application_level&quot; : &quot;ITEM&quot;,
      &quot;promotion_id&quot; : &quot;7834020347906&quot;,
      &quot;promotion_ids&quot; : [ &quot;7834020347906&quot;, &quot;7834020347907&quot; ],
      &quot;start_time&quot; : 5686848000,
      &quot;status&quot; : &quot;&quot;,
      &quot;targeting_spec&quot; : {
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;GEO_EXCLUDE&quot; : [ &quot;GEO_EXCLUDE&quot;, &quot;GEO_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCATION_EXCLUDE&quot; : [ &quot;LOCATION_EXCLUDE&quot;, &quot;LOCATION_EXCLUDE&quot; ],
        &quot;MAXIMUM_AGE&quot; : &quot;65+&quot;,
        &quot;MINIMUM_AGE&quot; : &quot;18&quot;,
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ]
      },
      &quot;targeting_template_ids&quot; : [ &quot;targeting_template_ids&quot; ]
    }, {
      &quot;bid_multiplier&quot; : 0.8008281904610115,
      &quot;budget_type&quot; : &quot;DAILY&quot;,
      &quot;pacing_delivery_type&quot; : &quot;STANDARD&quot;,
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;bid_strategy_type&quot; : &quot;AUTOMATIC_BID&quot;,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;end_time&quot; : 5705424000,
      &quot;is_creative_optimization&quot; : true,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;placement_group&quot; : &quot;&quot;,
      &quot;promotion_application_level&quot; : &quot;ITEM&quot;,
      &quot;promotion_id&quot; : &quot;7834020347906&quot;,
      &quot;promotion_ids&quot; : [ &quot;7834020347906&quot;, &quot;7834020347907&quot; ],
      &quot;start_time&quot; : 5686848000,
      &quot;status&quot; : &quot;&quot;,
      &quot;targeting_spec&quot; : {
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;GEO_EXCLUDE&quot; : [ &quot;GEO_EXCLUDE&quot;, &quot;GEO_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCATION_EXCLUDE&quot; : [ &quot;LOCATION_EXCLUDE&quot;, &quot;LOCATION_EXCLUDE&quot; ],
        &quot;MAXIMUM_AGE&quot; : &quot;65+&quot;,
        &quot;MINIMUM_AGE&quot; : &quot;18&quot;,
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ]
      },
      &quot;targeting_template_ids&quot; : [ &quot;targeting_template_ids&quot; ]
    } ],
    &quot;ads&quot; : [ {
      &quot;ad_group_id&quot; : &quot;ad_group_id&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;creative_type&quot; : &quot;REGULAR&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;disclosure_type&quot; : &quot;MED_GUIDE&quot;,
      &quot;disclosure_url&quot; : &quot;disclosure_url&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;is_carting&quot; : true,
      &quot;is_pin_deleted&quot; : false,
      &quot;is_removable&quot; : false,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;pin_id&quot; : &quot;394205773611545468&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;
    }, {
      &quot;ad_group_id&quot; : &quot;ad_group_id&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;creative_type&quot; : &quot;REGULAR&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;disclosure_type&quot; : &quot;MED_GUIDE&quot;,
      &quot;disclosure_url&quot; : &quot;disclosure_url&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;is_carting&quot; : true,
      &quot;is_pin_deleted&quot; : false,
      &quot;is_removable&quot; : false,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;pin_id&quot; : &quot;394205773611545468&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;
    } ],
    &quot;campaigns&quot; : [ {
      &quot;bid_options&quot; : {
        &quot;age_bucket_multipliers&quot; : &quot;&quot;,
        &quot;app_type_multipliers&quot; : &quot;&quot;,
        &quot;audience_multipliers&quot; : &quot;&quot;,
        &quot;freq_bid_multiplier_time_window&quot; : &quot;&quot;,
        &quot;frequency_multipliers&quot; : &quot;{}&quot;,
        &quot;gender_multipliers&quot; : &quot;&quot;,
        &quot;placement_multipliers&quot; : &quot;&quot;
      },
      &quot;intended_promotion_type&quot; : &quot;LEGACY&quot;,
      &quot;is_ltv_optimized&quot; : true,
      &quot;is_performance_plus&quot; : false,
      &quot;is_top_of_search&quot; : false,
      &quot;objective_type&quot; : &quot;AWARENESS&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;default_ad_group_budget_in_micro_currency&quot; : 6,
      &quot;end_time&quot; : 1644023526,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;start_time&quot; : 1580865126
    }, {
      &quot;bid_options&quot; : {
        &quot;age_bucket_multipliers&quot; : &quot;&quot;,
        &quot;app_type_multipliers&quot; : &quot;&quot;,
        &quot;audience_multipliers&quot; : &quot;&quot;,
        &quot;freq_bid_multiplier_time_window&quot; : &quot;&quot;,
        &quot;frequency_multipliers&quot; : &quot;{}&quot;,
        &quot;gender_multipliers&quot; : &quot;&quot;,
        &quot;placement_multipliers&quot; : &quot;&quot;
      },
      &quot;intended_promotion_type&quot; : &quot;LEGACY&quot;,
      &quot;is_ltv_optimized&quot; : true,
      &quot;is_performance_plus&quot; : false,
      &quot;is_top_of_search&quot; : false,
      &quot;objective_type&quot; : &quot;AWARENESS&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;default_ad_group_budget_in_micro_currency&quot; : 6,
      &quot;end_time&quot; : 1644023526,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;start_time&quot; : 1580865126
    } ],
    &quot;catalog_product_groups&quot; : [ {
      &quot;description&quot; : &quot;description&quot;,
      &quot;feed_id&quot; : &quot;2680059592705&quot;,
      &quot;filters&quot; : {
        &quot;any_of&quot; : [ {
          &quot;MIN_PRICE&quot; : {
            &quot;inclusion&quot; : true,
            &quot;negated&quot; : true,
            &quot;values&quot; : 0.14658129805029452
          }
        }, {
          &quot;MIN_PRICE&quot; : {
            &quot;inclusion&quot; : true,
            &quot;negated&quot; : true,
            &quot;values&quot; : 0.14658129805029452
          }
        } ]
      },
      &quot;is_featured&quot; : true,
      &quot;name&quot; : &quot;name&quot;
    }, {
      &quot;description&quot; : &quot;description&quot;,
      &quot;feed_id&quot; : &quot;2680059592705&quot;,
      &quot;filters&quot; : {
        &quot;any_of&quot; : [ {
          &quot;MIN_PRICE&quot; : {
            &quot;inclusion&quot; : true,
            &quot;negated&quot; : true,
            &quot;values&quot; : 0.14658129805029452
          }
        }, {
          &quot;MIN_PRICE&quot; : {
            &quot;inclusion&quot; : true,
            &quot;negated&quot; : true,
            &quot;values&quot; : 0.14658129805029452
          }
        } ]
      },
      &quot;is_featured&quot; : true,
      &quot;name&quot; : &quot;name&quot;
    } ],
    &quot;keywords&quot; : [ {
      &quot;keywords&quot; : [ {
        &quot;bid&quot; : 5,
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;bid&quot; : 5,
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;parent_id&quot; : &quot;parent_id&quot;
    }, {
      &quot;keywords&quot; : [ {
        &quot;bid&quot; : 5,
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;bid&quot; : 5,
        &quot;match_type&quot; : &quot;BROAD&quot;,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;parent_id&quot; : &quot;parent_id&quot;
    } ],
    &quot;labels&quot; : [ {
      &quot;labels&quot; : [ {
        &quot;label_type&quot; : &quot;BRAND&quot;,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;label_type&quot; : &quot;BRAND&quot;,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;parent_id&quot; : &quot;parent_id&quot;
    }, {
      &quot;labels&quot; : [ {
        &quot;label_type&quot; : &quot;BRAND&quot;,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;label_type&quot; : &quot;BRAND&quot;,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;parent_id&quot; : &quot;parent_id&quot;
    } ],
    &quot;product_groups&quot; : [ {
      &quot;product_group_promotion&quot; : [ {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;
      }, {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;
      } ],
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;
    }, {
      &quot;product_group_promotion&quot; : [ {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;
      }, {
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
        &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;is_mdl&quot; : true,
        &quot;status&quot; : &quot;ACTIVE&quot;
      } ],
      &quot;ad_group_id&quot; : &quot;2680059592705&quot;
    } ],
    &quot;schedules&quot; : [ {
      &quot;entity_id&quot; : &quot;entity_id&quot;,
      &quot;entity_type&quot; : &quot;entity_type&quot;,
      &quot;delta_value&quot; : &quot;ScheduleCommonDeltaValue&quot;,
      &quot;end_timestamp&quot; : 5,
      &quot;name&quot; : &quot;name&quot;,
      &quot;schedule_action&quot; : &quot;INCREASE_BY_VALUE&quot;,
      &quot;schedule_status&quot; : &quot;ACTIVE&quot;,
      &quot;schedule_type&quot; : &quot;CAMPAIGN_BUDGET_CHANGE&quot;,
      &quot;start_timestamp&quot; : 2
    }, {
      &quot;entity_id&quot; : &quot;entity_id&quot;,
      &quot;entity_type&quot; : &quot;entity_type&quot;,
      &quot;delta_value&quot; : &quot;ScheduleCommonDeltaValue&quot;,
      &quot;end_timestamp&quot; : 5,
      &quot;name&quot; : &quot;name&quot;,
      &quot;schedule_action&quot; : &quot;INCREASE_BY_VALUE&quot;,
      &quot;schedule_status&quot; : &quot;ACTIVE&quot;,
      &quot;schedule_type&quot; : &quot;CAMPAIGN_BUDGET_CHANGE&quot;,
      &quot;start_timestamp&quot; : 2
    } ]
  },
  &quot;update&quot; : {
    &quot;ad_groups&quot; : [ {
      &quot;bid_multiplier&quot; : 7.061401241503109,
      &quot;id&quot; : &quot;id&quot;,
      &quot;targeting_spec_operations&quot; : [ {
        &quot;field&quot; : &quot;AUDIENCE_EXCLUDE&quot;,
        &quot;operation&quot; : &quot;SET&quot;,
        &quot;values&quot; : [ &quot;values&quot;, &quot;values&quot; ]
      }, {
        &quot;field&quot; : &quot;AUDIENCE_EXCLUDE&quot;,
        &quot;operation&quot; : &quot;SET&quot;,
        &quot;values&quot; : [ &quot;values&quot;, &quot;values&quot; ]
      } ],
      &quot;auto_targeting_enabled&quot; : true,
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;budget_type&quot; : &quot;DAILY&quot;,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;end_time&quot; : 5705424000,
      &quot;is_creative_optimization&quot; : true,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;pacing_delivery_type&quot; : &quot;STANDARD&quot;,
      &quot;placement_group&quot; : &quot;&quot;,
      &quot;promotion_application_level&quot; : &quot;ITEM&quot;,
      &quot;promotion_id&quot; : &quot;7834020347906&quot;,
      &quot;promotion_ids&quot; : [ &quot;7834020347906&quot;, &quot;7834020347907&quot; ],
      &quot;start_time&quot; : 5686848000,
      &quot;status&quot; : &quot;&quot;,
      &quot;targeting_spec&quot; : {
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;GEO_EXCLUDE&quot; : [ &quot;GEO_EXCLUDE&quot;, &quot;GEO_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCATION_EXCLUDE&quot; : [ &quot;LOCATION_EXCLUDE&quot;, &quot;LOCATION_EXCLUDE&quot; ],
        &quot;MAXIMUM_AGE&quot; : &quot;65+&quot;,
        &quot;MINIMUM_AGE&quot; : &quot;18&quot;,
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ]
      },
      &quot;targeting_template_ids&quot; : [ &quot;targeting_template_ids&quot; ]
    }, {
      &quot;bid_multiplier&quot; : 7.061401241503109,
      &quot;id&quot; : &quot;id&quot;,
      &quot;targeting_spec_operations&quot; : [ {
        &quot;field&quot; : &quot;AUDIENCE_EXCLUDE&quot;,
        &quot;operation&quot; : &quot;SET&quot;,
        &quot;values&quot; : [ &quot;values&quot;, &quot;values&quot; ]
      }, {
        &quot;field&quot; : &quot;AUDIENCE_EXCLUDE&quot;,
        &quot;operation&quot; : &quot;SET&quot;,
        &quot;values&quot; : [ &quot;values&quot;, &quot;values&quot; ]
      } ],
      &quot;auto_targeting_enabled&quot; : true,
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
      &quot;budget_in_micro_currency&quot; : 5000000,
      &quot;budget_type&quot; : &quot;DAILY&quot;,
      &quot;campaign_id&quot; : &quot;626736533506&quot;,
      &quot;end_time&quot; : 5705424000,
      &quot;is_creative_optimization&quot; : true,
      &quot;lifetime_frequency_cap&quot; : 100,
      &quot;name&quot; : &quot;Ad Group For Pin: 687195905986&quot;,
      &quot;pacing_delivery_type&quot; : &quot;STANDARD&quot;,
      &quot;placement_group&quot; : &quot;&quot;,
      &quot;promotion_application_level&quot; : &quot;ITEM&quot;,
      &quot;promotion_id&quot; : &quot;7834020347906&quot;,
      &quot;promotion_ids&quot; : [ &quot;7834020347906&quot;, &quot;7834020347907&quot; ],
      &quot;start_time&quot; : 5686848000,
      &quot;status&quot; : &quot;&quot;,
      &quot;targeting_spec&quot; : {
        &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
        &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
        &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
        &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
        &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
        &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
        &quot;GEO_EXCLUDE&quot; : [ &quot;GEO_EXCLUDE&quot;, &quot;GEO_EXCLUDE&quot; ],
        &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ],
        &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
        &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
        &quot;LOCATION_EXCLUDE&quot; : [ &quot;LOCATION_EXCLUDE&quot;, &quot;LOCATION_EXCLUDE&quot; ],
        &quot;MAXIMUM_AGE&quot; : &quot;65+&quot;,
        &quot;MINIMUM_AGE&quot; : &quot;18&quot;,
        &quot;SHOPPING_RETARGETING&quot; : [ {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        }, {
          &quot;lookback_window&quot; : 30,
          &quot;exclusion_window&quot; : 14,
          &quot;tag_types&quot; : [ 0, 6 ]
        } ],
        &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ]
      },
      &quot;targeting_template_ids&quot; : [ &quot;targeting_template_ids&quot; ]
    } ],
    &quot;ads&quot; : [ {
      &quot;id&quot; : &quot;id&quot;,
      &quot;pin_id&quot; : &quot;pin_id&quot;,
      &quot;ad_group_id&quot; : &quot;ad_group_id&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;disclosure_type&quot; : &quot;MED_GUIDE&quot;,
      &quot;disclosure_url&quot; : &quot;disclosure_url&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;is_carting&quot; : true,
      &quot;is_pin_deleted&quot; : false,
      &quot;is_removable&quot; : false,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;
    }, {
      &quot;id&quot; : &quot;id&quot;,
      &quot;pin_id&quot; : &quot;pin_id&quot;,
      &quot;ad_group_id&quot; : &quot;ad_group_id&quot;,
      &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
      &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
      &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
      &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
      &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
      &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
      &quot;destination_url&quot; : &quot;destination_url&quot;,
      &quot;disclosure_type&quot; : &quot;MED_GUIDE&quot;,
      &quot;disclosure_url&quot; : &quot;disclosure_url&quot;,
      &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
      &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
      &quot;is_carting&quot; : true,
      &quot;is_pin_deleted&quot; : false,
      &quot;is_removable&quot; : false,
      &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
      &quot;name&quot; : &quot;name&quot;,
      &quot;status&quot; : &quot;ACTIVE&quot;,
      &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;
    } ],
    &quot;campaigns&quot; : [ {
      &quot;bid_options&quot; : {
        &quot;age_bucket_multipliers&quot; : &quot;&quot;,
        &quot;app_type_multipliers&quot; : &quot;&quot;,
        &quot;audience_multipliers&quot; : &quot;&quot;,
        &quot;freq_bid_multiplier_time_window&quot; : &quot;&quot;,
        &quot;frequency_multipliers&quot; : &quot;{}&quot;,
        &quot;gender_multipliers&quot; : &quot;&quot;,
        &quot;placement_multipliers&quot; : &quot;&quot;,
        &quot;update_mask&quot; : [ &quot;AUDIENCE&quot;, &quot;AUDIENCE&quot; ]
      },
      &quot;is_ltv_optimized&quot; : true,
      &quot;is_performance_plus&quot; : true,
      &quot;is_top_of_search&quot; : true,
      &quot;objective_type&quot; : &quot;&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;default_ad_group_budget_in_micro_currency&quot; : 9,
      &quot;end_time&quot; : 1644023526,
      &quot;id&quot; : &quot;549755885175&quot;,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;start_time&quot; : 1580865126,
      &quot;status&quot; : &quot;ACTIVE&quot;
    }, {
      &quot;bid_options&quot; : {
        &quot;age_bucket_multipliers&quot; : &quot;&quot;,
        &quot;app_type_multipliers&quot; : &quot;&quot;,
        &quot;audience_multipliers&quot; : &quot;&quot;,
        &quot;freq_bid_multiplier_time_window&quot; : &quot;&quot;,
        &quot;frequency_multipliers&quot; : &quot;{}&quot;,
        &quot;gender_multipliers&quot; : &quot;&quot;,
        &quot;placement_multipliers&quot; : &quot;&quot;,
        &quot;update_mask&quot; : [ &quot;AUDIENCE&quot;, &quot;AUDIENCE&quot; ]
      },
      &quot;is_ltv_optimized&quot; : true,
      &quot;is_performance_plus&quot; : true,
      &quot;is_top_of_search&quot; : true,
      &quot;objective_type&quot; : &quot;&quot;,
      &quot;ad_account_id&quot; : &quot;549755885175&quot;,
      &quot;daily_spend_cap&quot; : 1432744744,
      &quot;default_ad_group_budget_in_micro_currency&quot; : 9,
      &quot;end_time&quot; : 1644023526,
      &quot;id&quot; : &quot;549755885175&quot;,
      &quot;lifetime_spend_cap&quot; : 1432744744,
      &quot;name&quot; : &quot;ACME Tools&quot;,
      &quot;order_line_id&quot; : &quot;549755885175&quot;,
      &quot;start_time&quot; : 1580865126,
      &quot;status&quot; : &quot;ACTIVE&quot;
    } ],
    &quot;catalog_product_groups&quot; : [ {
      &quot;description&quot; : &quot;description&quot;,
      &quot;is_featured&quot; : true,
      &quot;name&quot; : &quot;name&quot;
    }, {
      &quot;description&quot; : &quot;description&quot;,
      &quot;is_featured&quot; : true,
      &quot;name&quot; : &quot;name&quot;
    } ],
    &quot;keywords&quot; : [ {
      &quot;archived&quot; : true,
      &quot;bid&quot; : 3,
      &quot;id&quot; : &quot;id&quot;
    }, {
      &quot;archived&quot; : true,
      &quot;bid&quot; : 3,
      &quot;id&quot; : &quot;id&quot;
    } ],
    &quot;labels&quot; : [ {
      &quot;id&quot; : &quot;id&quot;,
      &quot;parent_id&quot; : &quot;parent_id&quot;,
      &quot;status&quot; : &quot;ARCHIVED&quot;
    }, {
      &quot;id&quot; : &quot;id&quot;,
      &quot;parent_id&quot; : &quot;parent_id&quot;,
      &quot;status&quot; : &quot;ARCHIVED&quot;
    } ],
    &quot;product_groups&quot; : [ {
      &quot;product_group_promotion&quot; : [ {
        &quot;catalog_product_group_id&quot; : &quot;1234123&quot;,
        &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
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
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
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
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
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
        &quot;creative_type&quot; : &quot;REGULAR&quot;,
        &quot;collections_hero_pin_id&quot; : &quot;123124&quot;,
        &quot;catalog_product_group_name&quot; : &quot;ProductGroupName&quot;,
        &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
        &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
        &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
        &quot;status&quot; : &quot;ACTIVE&quot;,
        &quot;id&quot; : &quot;2680059592706&quot;
      } ],
      &quot;ad_group_id&quot; : &quot;26823439592705&quot;
    } ],
    &quot;schedules&quot; : [ {
      &quot;entity_id&quot; : &quot;entity_id&quot;,
      &quot;entity_type&quot; : &quot;entity_type&quot;,
      &quot;id&quot; : &quot;id&quot;,
      &quot;end_timestamp&quot; : 2,
      &quot;name&quot; : &quot;name&quot;,
      &quot;schedule_action&quot; : &quot;INCREASE_BY_VALUE&quot;,
      &quot;schedule_status&quot; : &quot;ACTIVE&quot;,
      &quot;schedule_type&quot; : &quot;CAMPAIGN_BUDGET_CHANGE&quot;,
      &quot;start_timestamp&quot; : 4
    }, {
      &quot;entity_id&quot; : &quot;entity_id&quot;,
      &quot;entity_type&quot; : &quot;entity_type&quot;,
      &quot;id&quot; : &quot;id&quot;,
      &quot;end_timestamp&quot; : 2,
      &quot;name&quot; : &quot;name&quot;,
      &quot;schedule_action&quot; : &quot;INCREASE_BY_VALUE&quot;,
      &quot;schedule_status&quot; : &quot;ACTIVE&quot;,
      &quot;schedule_type&quot; : &quot;CAMPAIGN_BUDGET_CHANGE&quot;,
      &quot;start_timestamp&quot; : 4
    } ]
  }
}"
  BulkUpsertCreateExamples <- BulkUpsertCreateExamples.Add("application/json", BulkUpsertCreateBody)

  let getBulkUpsertCreateExample mediaType =
    BulkUpsertCreateExamples.[mediaType]
      |> getConverter mediaType
