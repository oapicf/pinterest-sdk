-module(openapi_attribution_windows).

-export([encode/1]).

-export_type([openapi_attribution_windows/0]).

-type openapi_attribution_windows() ::
    #{ 'click_window_days' => integer(),
       'engagement_window_days' => integer(),
       'view_window_days' => integer()
     }.

encode(#{ 'click_window_days' := ClickWindowDays,
          'engagement_window_days' := EngagementWindowDays,
          'view_window_days' := ViewWindowDays
        }) ->
    #{ 'click_window_days' => ClickWindowDays,
       'engagement_window_days' => EngagementWindowDays,
       'view_window_days' => ViewWindowDays
     }.
