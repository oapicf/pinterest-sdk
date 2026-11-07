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
open OpenAPI.CampaignsApiHandler
open OpenAPI.CampaignsApiHandlerParams

module CampaignsApiHandlerTestsHelper =

  ()

  ()

  ()


  let mutable CampaignsCreateExamples = Map.empty
  let mutable CampaignsCreateBody = ""

  CampaignsCreateBody <- WebUtility.HtmlDecode "{
  &quot;ad_account_id&quot; : &quot;549755885175&quot;,
  &quot;app_id&quot; : &quot;429047995&quot;,
  &quot;app_platform&quot; : &quot;IOS&quot;,
  &quot;bid_options&quot; : &quot;&quot;,
  &quot;daily_spend_cap&quot; : 1432744744,
  &quot;default_ad_group_budget_in_micro_currency&quot; : 0,
  &quot;end_time&quot; : 1644023526,
  &quot;intended_promotion_type&quot; : &quot;LEGACY&quot;,
  &quot;is_automated_campaign&quot; : true,
  &quot;is_campaign_budget_optimization&quot; : true,
  &quot;is_flexible_daily_budgets&quot; : true,
  &quot;is_ltv_optimized&quot; : true,
  &quot;is_performance_plus&quot; : true,
  &quot;is_top_of_search&quot; : true,
  &quot;lifetime_spend_cap&quot; : 1432744744,
  &quot;name&quot; : &quot;ACME Tools&quot;,
  &quot;objective_type&quot; : &quot;AWARENESS&quot;,
  &quot;order_line_id&quot; : &quot;549755885175&quot;,
  &quot;start_time&quot; : 1580865126,
  &quot;status&quot; : &quot;&quot;,
  &quot;tracking_urls&quot; : &quot;{}&quot;
}"
  CampaignsCreateExamples <- CampaignsCreateExamples.Add("application/json", CampaignsCreateBody)

  let getCampaignsCreateExample mediaType =
    CampaignsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable CampaignsUpdateExamples = Map.empty
  let mutable CampaignsUpdateBody = ""

  CampaignsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;ad_account_id&quot; : &quot;549755885175&quot;,
  &quot;app_id&quot; : &quot;429047995&quot;,
  &quot;app_platform&quot; : &quot;IOS&quot;,
  &quot;bid_options&quot; : &quot;&quot;,
  &quot;daily_spend_cap&quot; : 1432744744,
  &quot;default_ad_group_budget_in_micro_currency&quot; : 0,
  &quot;end_time&quot; : 1644023526,
  &quot;id&quot; : &quot;549755885175&quot;,
  &quot;intended_promotion_type&quot; : &quot;LEGACY&quot;,
  &quot;is_automated_campaign&quot; : true,
  &quot;is_campaign_budget_optimization&quot; : true,
  &quot;is_flexible_daily_budgets&quot; : true,
  &quot;is_ltv_optimized&quot; : true,
  &quot;is_performance_plus&quot; : true,
  &quot;is_top_of_search&quot; : true,
  &quot;lifetime_spend_cap&quot; : 1432744744,
  &quot;name&quot; : &quot;ACME Tools&quot;,
  &quot;objective_type&quot; : &quot;AWARENESS&quot;,
  &quot;order_line_id&quot; : &quot;549755885175&quot;,
  &quot;performance_plus_campaign_settings&quot; : &quot;{}&quot;,
  &quot;start_time&quot; : 1580865126,
  &quot;status&quot; : &quot;ACTIVE&quot;,
  &quot;tracking_urls&quot; : &quot;{}&quot;
}"
  CampaignsUpdateExamples <- CampaignsUpdateExamples.Add("application/json", CampaignsUpdateBody)

  let getCampaignsUpdateExample mediaType =
    CampaignsUpdateExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetCampaignDeliveryEstimatesExamples = Map.empty
  let mutable GetCampaignDeliveryEstimatesBody = ""

  GetCampaignDeliveryEstimatesBody <- WebUtility.HtmlDecode "{
  &quot;ad_groups&quot; : [ {
    &quot;auto_targeting_enabled&quot; : true,
    &quot;creative_types&quot; : [ &quot;REGULAR&quot;, &quot;REGULAR&quot; ],
    &quot;keywords&quot; : [ {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    } ],
    &quot;monthly_frequency_cap&quot; : 0,
    &quot;optimization_goal_metadata&quot; : {
      &quot;conversion_tag_v3_goal_metadata&quot; : {
        &quot;attribution_windows&quot; : {
          &quot;click_window_days&quot; : 6,
          &quot;engagement_window_days&quot; : 1,
          &quot;view_window_days&quot; : 5
        },
        &quot;conversion_event&quot; : &quot;PAGE_VISIT&quot;,
        &quot;conversion_tag_id&quot; : &quot;conversion_tag_id&quot;,
        &quot;cpa_goal_value_in_micro_currency&quot; : &quot;cpa_goal_value_in_micro_currency&quot;,
        &quot;is_roas_optimized&quot; : true,
        &quot;reporting_event&quot; : &quot;reporting_event&quot;
      },
      &quot;frequency_goal_metadata&quot; : {
        &quot;frequency&quot; : 12,
        &quot;timerange&quot; : &quot;THIRTY_DAY&quot;
      },
      &quot;scrollup_goal_metadata&quot; : {
        &quot;scrollup_goal_value_in_micro_currency&quot; : &quot;scrollup_goal_value_in_micro_currency&quot;
      }
    },
    &quot;optimization_type&quot; : &quot;&quot;,
    &quot;placement_group&quot; : &quot;ALL&quot;,
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
  }, {
    &quot;auto_targeting_enabled&quot; : true,
    &quot;creative_types&quot; : [ &quot;REGULAR&quot;, &quot;REGULAR&quot; ],
    &quot;keywords&quot; : [ {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    } ],
    &quot;monthly_frequency_cap&quot; : 0,
    &quot;optimization_goal_metadata&quot; : {
      &quot;conversion_tag_v3_goal_metadata&quot; : {
        &quot;attribution_windows&quot; : {
          &quot;click_window_days&quot; : 6,
          &quot;engagement_window_days&quot; : 1,
          &quot;view_window_days&quot; : 5
        },
        &quot;conversion_event&quot; : &quot;PAGE_VISIT&quot;,
        &quot;conversion_tag_id&quot; : &quot;conversion_tag_id&quot;,
        &quot;cpa_goal_value_in_micro_currency&quot; : &quot;cpa_goal_value_in_micro_currency&quot;,
        &quot;is_roas_optimized&quot; : true,
        &quot;reporting_event&quot; : &quot;reporting_event&quot;
      },
      &quot;frequency_goal_metadata&quot; : {
        &quot;frequency&quot; : 12,
        &quot;timerange&quot; : &quot;THIRTY_DAY&quot;
      },
      &quot;scrollup_goal_metadata&quot; : {
        &quot;scrollup_goal_value_in_micro_currency&quot; : &quot;scrollup_goal_value_in_micro_currency&quot;
      }
    },
    &quot;optimization_type&quot; : &quot;&quot;,
    &quot;placement_group&quot; : &quot;ALL&quot;,
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
  }, {
    &quot;auto_targeting_enabled&quot; : true,
    &quot;creative_types&quot; : [ &quot;REGULAR&quot;, &quot;REGULAR&quot; ],
    &quot;keywords&quot; : [ {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    } ],
    &quot;monthly_frequency_cap&quot; : 0,
    &quot;optimization_goal_metadata&quot; : {
      &quot;conversion_tag_v3_goal_metadata&quot; : {
        &quot;attribution_windows&quot; : {
          &quot;click_window_days&quot; : 6,
          &quot;engagement_window_days&quot; : 1,
          &quot;view_window_days&quot; : 5
        },
        &quot;conversion_event&quot; : &quot;PAGE_VISIT&quot;,
        &quot;conversion_tag_id&quot; : &quot;conversion_tag_id&quot;,
        &quot;cpa_goal_value_in_micro_currency&quot; : &quot;cpa_goal_value_in_micro_currency&quot;,
        &quot;is_roas_optimized&quot; : true,
        &quot;reporting_event&quot; : &quot;reporting_event&quot;
      },
      &quot;frequency_goal_metadata&quot; : {
        &quot;frequency&quot; : 12,
        &quot;timerange&quot; : &quot;THIRTY_DAY&quot;
      },
      &quot;scrollup_goal_metadata&quot; : {
        &quot;scrollup_goal_value_in_micro_currency&quot; : &quot;scrollup_goal_value_in_micro_currency&quot;
      }
    },
    &quot;optimization_type&quot; : &quot;&quot;,
    &quot;placement_group&quot; : &quot;ALL&quot;,
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
  }, {
    &quot;auto_targeting_enabled&quot; : true,
    &quot;creative_types&quot; : [ &quot;REGULAR&quot;, &quot;REGULAR&quot; ],
    &quot;keywords&quot; : [ {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    } ],
    &quot;monthly_frequency_cap&quot; : 0,
    &quot;optimization_goal_metadata&quot; : {
      &quot;conversion_tag_v3_goal_metadata&quot; : {
        &quot;attribution_windows&quot; : {
          &quot;click_window_days&quot; : 6,
          &quot;engagement_window_days&quot; : 1,
          &quot;view_window_days&quot; : 5
        },
        &quot;conversion_event&quot; : &quot;PAGE_VISIT&quot;,
        &quot;conversion_tag_id&quot; : &quot;conversion_tag_id&quot;,
        &quot;cpa_goal_value_in_micro_currency&quot; : &quot;cpa_goal_value_in_micro_currency&quot;,
        &quot;is_roas_optimized&quot; : true,
        &quot;reporting_event&quot; : &quot;reporting_event&quot;
      },
      &quot;frequency_goal_metadata&quot; : {
        &quot;frequency&quot; : 12,
        &quot;timerange&quot; : &quot;THIRTY_DAY&quot;
      },
      &quot;scrollup_goal_metadata&quot; : {
        &quot;scrollup_goal_value_in_micro_currency&quot; : &quot;scrollup_goal_value_in_micro_currency&quot;
      }
    },
    &quot;optimization_type&quot; : &quot;&quot;,
    &quot;placement_group&quot; : &quot;ALL&quot;,
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
  }, {
    &quot;auto_targeting_enabled&quot; : true,
    &quot;creative_types&quot; : [ &quot;REGULAR&quot;, &quot;REGULAR&quot; ],
    &quot;keywords&quot; : [ {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;match_type&quot; : &quot;&quot;,
      &quot;value&quot; : &quot;value&quot;
    } ],
    &quot;monthly_frequency_cap&quot; : 0,
    &quot;optimization_goal_metadata&quot; : {
      &quot;conversion_tag_v3_goal_metadata&quot; : {
        &quot;attribution_windows&quot; : {
          &quot;click_window_days&quot; : 6,
          &quot;engagement_window_days&quot; : 1,
          &quot;view_window_days&quot; : 5
        },
        &quot;conversion_event&quot; : &quot;PAGE_VISIT&quot;,
        &quot;conversion_tag_id&quot; : &quot;conversion_tag_id&quot;,
        &quot;cpa_goal_value_in_micro_currency&quot; : &quot;cpa_goal_value_in_micro_currency&quot;,
        &quot;is_roas_optimized&quot; : true,
        &quot;reporting_event&quot; : &quot;reporting_event&quot;
      },
      &quot;frequency_goal_metadata&quot; : {
        &quot;frequency&quot; : 12,
        &quot;timerange&quot; : &quot;THIRTY_DAY&quot;
      },
      &quot;scrollup_goal_metadata&quot; : {
        &quot;scrollup_goal_value_in_micro_currency&quot; : &quot;scrollup_goal_value_in_micro_currency&quot;
      }
    },
    &quot;optimization_type&quot; : &quot;&quot;,
    &quot;placement_group&quot; : &quot;ALL&quot;,
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
  } ],
  &quot;budget_duration_type&quot; : &quot;FIXED_DAILY&quot;,
  &quot;daily_spend_cap&quot; : 50000000,
  &quot;end_date&quot; : &quot;end_date&quot;,
  &quot;lifetime_spend_cap&quot; : 500000000,
  &quot;objective_type&quot; : &quot;AWARENESS&quot;,
  &quot;start_date&quot; : &quot;start_date&quot;
}"
  GetCampaignDeliveryEstimatesExamples <- GetCampaignDeliveryEstimatesExamples.Add("application/json", GetCampaignDeliveryEstimatesBody)

  let getGetCampaignDeliveryEstimatesExample mediaType =
    GetCampaignDeliveryEstimatesExamples.[mediaType]
      |> getConverter mediaType
