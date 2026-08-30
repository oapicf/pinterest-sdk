-module(openapi_campaign_planning_conversion_attribution).

-export([encode/1]).

-export_type([openapi_campaign_planning_conversion_attribution/0]).

-type openapi_campaign_planning_conversion_attribution() ::
    #{ 'click_window_days' => openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days(),
       'engagement_window_days' => openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days(),
       'view_window_days' => openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days()
     }.

encode(#{ 'click_window_days' := ClickWindowDays,
          'engagement_window_days' := EngagementWindowDays,
          'view_window_days' := ViewWindowDays
        }) ->
    #{ 'click_window_days' => ClickWindowDays,
       'engagement_window_days' => EngagementWindowDays,
       'view_window_days' => ViewWindowDays
     }.
