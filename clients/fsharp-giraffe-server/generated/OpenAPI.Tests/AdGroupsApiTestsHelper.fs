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
  &quot;auto_targeting_enabled&quot; : true,
  &quot;creative_types&quot; : [ &quot;REGULAR&quot;, &quot;REGULAR&quot; ],
  &quot;keywords&quot; : [ {
    &quot;match_type&quot; : &quot;BROAD&quot;,
    &quot;value&quot; : &quot;value&quot;
  }, {
    &quot;match_type&quot; : &quot;BROAD&quot;,
    &quot;value&quot; : &quot;value&quot;
  } ],
  &quot;placement_group&quot; : &quot;&quot;,
  &quot;product_group_ids&quot; : [ null, null ],
  &quot;targeting_spec&quot; : {
    &quot;AGE_BUCKET&quot; : [ &quot;18-24&quot;, &quot;18-24&quot; ],
    &quot;APPTYPE&quot; : [ &quot;android_mobile&quot;, &quot;android_mobile&quot; ],
    &quot;AUDIENCE_EXCLUDE&quot; : [ null, null ],
    &quot;AUDIENCE_INCLUDE&quot; : [ null, null ],
    &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
    &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
    &quot;GEO_EXCLUDE&quot; : [ &quot;GEO_EXCLUDE&quot;, &quot;GEO_EXCLUDE&quot; ],
    &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ],
    &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
    &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
    &quot;LOCATION_EXCLUDE&quot; : [ &quot;LOCATION_EXCLUDE&quot;, &quot;LOCATION_EXCLUDE&quot; ],
    &quot;MAXIMUM_AGE&quot; : &quot;MAXIMUM_AGE&quot;,
    &quot;MINIMUM_AGE&quot; : &quot;MINIMUM_AGE&quot;,
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
  }
}"
  AdGroupsAudienceSizingExamples <- AdGroupsAudienceSizingExamples.Add("application/json", AdGroupsAudienceSizingBody)

  let getAdGroupsAudienceSizingExample mediaType =
    AdGroupsAudienceSizingExamples.[mediaType]
      |> getConverter mediaType

  let mutable AdGroupsBidFloorGetExamples = Map.empty
  let mutable AdGroupsBidFloorGetBody = ""

  AdGroupsBidFloorGetBody <- WebUtility.HtmlDecode "{
  &quot;bid_floor_specs&quot; : [ {
    &quot;billable_event&quot; : &quot;&quot;,
    &quot;countries&quot; : [ &quot;AD&quot;, &quot;AD&quot; ],
    &quot;creative_type&quot; : &quot;&quot;,
    &quot;currency&quot; : &quot;&quot;,
    &quot;objective_type&quot; : &quot;&quot;,
    &quot;optimization_goal_metadata&quot; : &quot;&quot;
  }, {
    &quot;billable_event&quot; : &quot;&quot;,
    &quot;countries&quot; : [ &quot;AD&quot;, &quot;AD&quot; ],
    &quot;creative_type&quot; : &quot;&quot;,
    &quot;currency&quot; : &quot;&quot;,
    &quot;objective_type&quot; : &quot;&quot;,
    &quot;optimization_goal_metadata&quot; : &quot;&quot;
  } ],
  &quot;targeting_spec&quot; : &quot;&quot;
}"
  AdGroupsBidFloorGetExamples <- AdGroupsBidFloorGetExamples.Add("application/json", AdGroupsBidFloorGetBody)

  let getAdGroupsBidFloorGetExample mediaType =
    AdGroupsBidFloorGetExamples.[mediaType]
      |> getConverter mediaType

  let mutable AdGroupsCreateExamples = Map.empty
  let mutable AdGroupsCreateBody = ""

  AdGroupsCreateBody <- WebUtility.HtmlDecode "{
  &quot;auto_targeting_enabled&quot; : true,
  &quot;bid_in_micro_currency&quot; : 0,
  &quot;bid_multiplier&quot; : 6.027456183070403,
  &quot;bid_strategy_type&quot; : &quot;AUTOMATIC_BID&quot;,
  &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
  &quot;budget_in_micro_currency&quot; : 1,
  &quot;budget_type&quot; : &quot;&quot;,
  &quot;campaign_id&quot; : &quot;campaign_id&quot;,
  &quot;customer_segment_id&quot; : &quot;&quot;,
  &quot;end_time&quot; : 5,
  &quot;ext_features&quot; : {
    &quot;enabled&quot; : [ &quot;TRENDS&quot;, &quot;TRENDS&quot; ]
  },
  &quot;feed_profile_id&quot; : &quot;feed_profile_id&quot;,
  &quot;is_creative_optimization&quot; : true,
  &quot;is_local_inventory&quot; : true,
  &quot;lifetime_frequency_cap&quot; : 5,
  &quot;local_inventory_radius_in_miles&quot; : 2.3021358869347655,
  &quot;name&quot; : &quot;name&quot;,
  &quot;optimization_goal_metadata&quot; : &quot;{}&quot;,
  &quot;pacing_delivery_type&quot; : &quot;&quot;,
  &quot;performance_plus_campaign_settings&quot; : &quot;{}&quot;,
  &quot;placement_group&quot; : &quot;&quot;,
  &quot;placement_traffic_type&quot; : &quot;&quot;,
  &quot;promotion_application_level&quot; : &quot;ITEM&quot;,
  &quot;promotion_id&quot; : &quot;0&quot;,
  &quot;promotion_ids&quot; : [ &quot;promotion_ids&quot;, &quot;promotion_ids&quot; ],
  &quot;start_time&quot; : 7,
  &quot;status&quot; : &quot;&quot;,
  &quot;targeting_spec&quot; : {
    &quot;AGE_BUCKET&quot; : [ &quot;18-24&quot;, &quot;18-24&quot; ],
    &quot;APPTYPE&quot; : [ &quot;android_mobile&quot;, &quot;android_mobile&quot; ],
    &quot;AUDIENCE_EXCLUDE&quot; : [ null, null ],
    &quot;AUDIENCE_INCLUDE&quot; : [ null, null ],
    &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
    &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
    &quot;GEO_EXCLUDE&quot; : [ &quot;GEO_EXCLUDE&quot;, &quot;GEO_EXCLUDE&quot; ],
    &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ],
    &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
    &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
    &quot;LOCATION_EXCLUDE&quot; : [ &quot;LOCATION_EXCLUDE&quot;, &quot;LOCATION_EXCLUDE&quot; ],
    &quot;MAXIMUM_AGE&quot; : &quot;MAXIMUM_AGE&quot;,
    &quot;MINIMUM_AGE&quot; : &quot;MINIMUM_AGE&quot;,
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
  &quot;targeting_template_ids&quot; : [ null ],
  &quot;tracking_urls&quot; : {
    &quot;impression&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;click&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;engagement&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;buyable_button&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;audience_verification&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ]
  }
}"
  AdGroupsCreateExamples <- AdGroupsCreateExamples.Add("application/json", AdGroupsCreateBody)

  let getAdGroupsCreateExample mediaType =
    AdGroupsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable AdGroupsDynamicTitlesProcessCsvExamples = Map.empty
  let mutable AdGroupsDynamicTitlesProcessCsvBody = ""

  AdGroupsDynamicTitlesProcessCsvBody <- WebUtility.HtmlDecode "{
  &quot;request_id&quot; : &quot;request_id&quot;
}"
  AdGroupsDynamicTitlesProcessCsvExamples <- AdGroupsDynamicTitlesProcessCsvExamples.Add("application/json", AdGroupsDynamicTitlesProcessCsvBody)

  let getAdGroupsDynamicTitlesProcessCsvExample mediaType =
    AdGroupsDynamicTitlesProcessCsvExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable AdGroupsUpdateExamples = Map.empty
  let mutable AdGroupsUpdateBody = ""

  AdGroupsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;auto_targeting_enabled&quot; : true,
  &quot;bid_in_micro_currency&quot; : 0,
  &quot;bid_multiplier&quot; : 6.027456183070403,
  &quot;bid_strategy_type&quot; : &quot;AUTOMATIC_BID&quot;,
  &quot;billable_event&quot; : &quot;CLICKTHROUGH&quot;,
  &quot;budget_in_micro_currency&quot; : 1,
  &quot;budget_type&quot; : &quot;DAILY&quot;,
  &quot;campaign_id&quot; : &quot;campaign_id&quot;,
  &quot;customer_segment_id&quot; : &quot;&quot;,
  &quot;end_time&quot; : 5,
  &quot;ext_features&quot; : {
    &quot;enabled&quot; : [ &quot;TRENDS&quot;, &quot;TRENDS&quot; ]
  },
  &quot;feed_profile_id&quot; : &quot;feed_profile_id&quot;,
  &quot;id&quot; : &quot;id&quot;,
  &quot;is_creative_optimization&quot; : true,
  &quot;is_local_inventory&quot; : true,
  &quot;lifetime_frequency_cap&quot; : 5,
  &quot;local_inventory_radius_in_miles&quot; : 2.3021358869347655,
  &quot;name&quot; : &quot;name&quot;,
  &quot;optimization_goal_metadata&quot; : &quot;{}&quot;,
  &quot;pacing_delivery_type&quot; : &quot;STANDARD&quot;,
  &quot;performance_plus_campaign_settings&quot; : &quot;{}&quot;,
  &quot;placement_group&quot; : &quot;&quot;,
  &quot;placement_traffic_type&quot; : &quot;&quot;,
  &quot;promotion_application_level&quot; : &quot;ITEM&quot;,
  &quot;promotion_id&quot; : &quot;0&quot;,
  &quot;promotion_ids&quot; : [ &quot;promotion_ids&quot;, &quot;promotion_ids&quot; ],
  &quot;start_time&quot; : 7,
  &quot;status&quot; : &quot;&quot;,
  &quot;targeting_spec&quot; : {
    &quot;AGE_BUCKET&quot; : [ &quot;18-24&quot;, &quot;18-24&quot; ],
    &quot;APPTYPE&quot; : [ &quot;android_mobile&quot;, &quot;android_mobile&quot; ],
    &quot;AUDIENCE_EXCLUDE&quot; : [ null, null ],
    &quot;AUDIENCE_INCLUDE&quot; : [ null, null ],
    &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
    &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
    &quot;GEO_EXCLUDE&quot; : [ &quot;GEO_EXCLUDE&quot;, &quot;GEO_EXCLUDE&quot; ],
    &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ],
    &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
    &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
    &quot;LOCATION_EXCLUDE&quot; : [ &quot;LOCATION_EXCLUDE&quot;, &quot;LOCATION_EXCLUDE&quot; ],
    &quot;MAXIMUM_AGE&quot; : &quot;MAXIMUM_AGE&quot;,
    &quot;MINIMUM_AGE&quot; : &quot;MINIMUM_AGE&quot;,
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
  &quot;targeting_spec_operations&quot; : [ {
    &quot;field&quot; : &quot;AUDIENCE_EXCLUDE&quot;,
    &quot;operation&quot; : &quot;SET&quot;,
    &quot;values&quot; : [ &quot;values&quot;, &quot;values&quot; ]
  }, {
    &quot;field&quot; : &quot;AUDIENCE_EXCLUDE&quot;,
    &quot;operation&quot; : &quot;SET&quot;,
    &quot;values&quot; : [ &quot;values&quot;, &quot;values&quot; ]
  } ],
  &quot;targeting_template_ids&quot; : [ null ],
  &quot;tracking_urls&quot; : {
    &quot;impression&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;click&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;engagement&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;buyable_button&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;audience_verification&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ]
  }
}"
  AdGroupsUpdateExamples <- AdGroupsUpdateExamples.Add("application/json", AdGroupsUpdateBody)

  let getAdGroupsUpdateExample mediaType =
    AdGroupsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

