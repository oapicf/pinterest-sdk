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
open OpenAPI.AdGroupsApiHandler
open OpenAPI.AdGroupsApiHandlerParams

module AdGroupsApiHandlerTestsHelper =

  ()


  let mutable AdGroupsAudienceSizingExamples = Map.empty
  let mutable AdGroupsAudienceSizingBody = ""

  AdGroupsAudienceSizingBody <- WebUtility.HtmlDecode "{
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
  &quot;keywords&quot; : [ {
    &quot;match_type&quot; : &quot;BROAD&quot;,
    &quot;value&quot; : &quot;value&quot;
  }, {
    &quot;match_type&quot; : &quot;BROAD&quot;,
    &quot;value&quot; : &quot;value&quot;
  } ],
  &quot;creative_types&quot; : [ &quot;REGULAR&quot;, &quot;REGULAR&quot; ],
  &quot;product_group_ids&quot; : [ &quot;23423422123&quot;, &quot;23423422123&quot; ],
  &quot;auto_targeting_enabled&quot; : true,
  &quot;placement_group&quot; : &quot;ALL&quot;
}"
  AdGroupsAudienceSizingExamples <- AdGroupsAudienceSizingExamples.Add("application/json", AdGroupsAudienceSizingBody)

  let getAdGroupsAudienceSizingExample mediaType =
    AdGroupsAudienceSizingExamples.[mediaType]
      |> getConverter mediaType

  let mutable AdGroupsBidFloorGetExamples = Map.empty
  let mutable AdGroupsBidFloorGetBody = ""

  AdGroupsBidFloorGetBody <- WebUtility.HtmlDecode "{
  &quot;targeting_spec&quot; : {
    &quot;GEO&quot; : [ &quot;BE-VOV&quot; ],
    &quot;LOCATION&quot; : [ &quot;US&quot; ],
    &quot;LOCALE&quot; : [ &quot;cs&quot; ],
    &quot;AGE_BUCKET&quot; : [ &quot;25-34&quot; ],
    &quot;AUDIENCE_INCLUDE&quot; : [ &quot;2542620905473&quot; ],
    &quot;SHOPPING_RETARGETING&quot; : [ {
      &quot;lookback_window&quot; : 30,
      &quot;exclusion_window&quot; : 14,
      &quot;tag_types&quot; : [ 0, 6 ]
    }, {
      &quot;lookback_window&quot; : 30,
      &quot;exclusion_window&quot; : 14,
      &quot;tag_types&quot; : [ 0, 6 ]
    } ],
    &quot;GENDER&quot; : [ &quot;male&quot; ],
    &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot; ],
    &quot;APPTYPE&quot; : [ &quot;iphone&quot; ],
    &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;2542620905475&quot; ],
    &quot;INTEREST&quot; : [ &quot;925056443165&quot; ]
  },
  &quot;bid_floor_specs&quot; : [ {
    &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
    &quot;creative_type&quot; : &quot;REGULAR&quot;,
    &quot;currency&quot; : &quot;USD&quot;,
    &quot;countries&quot; : [ &quot;US&quot;, &quot;US&quot; ],
    &quot;optimization_goal_metadata&quot; : {
      &quot;frequency_goal_metadata&quot; : {
        &quot;timerange&quot; : &quot;DAY&quot;,
        &quot;frequency&quot; : 5
      },
      &quot;conversion_tag_v3_goal_metadata&quot; : {
        &quot;attribution_windows&quot; : {
          &quot;view_window_days&quot; : 1,
          &quot;click_window_days&quot; : 0,
          &quot;engagement_window_days&quot; : 6
        },
        &quot;conversion_tag_id&quot; : &quot;123456789&quot;,
        &quot;learning_mode_type&quot; : &quot;ACTIVE&quot;,
        &quot;conversion_event&quot; : &quot;PAGE_VISIT&quot;,
        &quot;is_roas_optimized&quot; : true,
        &quot;cpa_goal_value_in_micro_currency&quot; : &quot;123456789&quot;
      },
      &quot;scrollup_goal_metadata&quot; : {
        &quot;scrollup_goal_value_in_micro_currency&quot; : &quot;123456789&quot;
      }
    }
  }, {
    &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
    &quot;creative_type&quot; : &quot;REGULAR&quot;,
    &quot;currency&quot; : &quot;USD&quot;,
    &quot;countries&quot; : [ &quot;US&quot;, &quot;US&quot; ],
    &quot;optimization_goal_metadata&quot; : {
      &quot;frequency_goal_metadata&quot; : {
        &quot;timerange&quot; : &quot;DAY&quot;,
        &quot;frequency&quot; : 5
      },
      &quot;conversion_tag_v3_goal_metadata&quot; : {
        &quot;attribution_windows&quot; : {
          &quot;view_window_days&quot; : 1,
          &quot;click_window_days&quot; : 0,
          &quot;engagement_window_days&quot; : 6
        },
        &quot;conversion_tag_id&quot; : &quot;123456789&quot;,
        &quot;learning_mode_type&quot; : &quot;ACTIVE&quot;,
        &quot;conversion_event&quot; : &quot;PAGE_VISIT&quot;,
        &quot;is_roas_optimized&quot; : true,
        &quot;cpa_goal_value_in_micro_currency&quot; : &quot;123456789&quot;
      },
      &quot;scrollup_goal_metadata&quot; : {
        &quot;scrollup_goal_value_in_micro_currency&quot; : &quot;123456789&quot;
      }
    }
  } ]
}"
  AdGroupsBidFloorGetExamples <- AdGroupsBidFloorGetExamples.Add("application/json", AdGroupsBidFloorGetBody)

  let getAdGroupsBidFloorGetExample mediaType =
    AdGroupsBidFloorGetExamples.[mediaType]
      |> getConverter mediaType

  let mutable AdGroupsCreateExamples = Map.empty
  let mutable AdGroupsCreateBody = ""

  AdGroupsCreateBody <- WebUtility.HtmlDecode "{
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
}"
  AdGroupsCreateExamples <- AdGroupsCreateExamples.Add("application/json", AdGroupsCreateBody)

  let getAdGroupsCreateExample mediaType =
    AdGroupsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable AdGroupsUpdateExamples = Map.empty
  let mutable AdGroupsUpdateBody = ""

  AdGroupsUpdateBody <- WebUtility.HtmlDecode "{
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
}"
  AdGroupsUpdateExamples <- AdGroupsUpdateExamples.Add("application/json", AdGroupsUpdateBody)

  let getAdGroupsUpdateExample mediaType =
    AdGroupsUpdateExamples.[mediaType]
      |> getConverter mediaType
