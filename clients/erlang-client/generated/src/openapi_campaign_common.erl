-module(openapi_campaign_common).

-export([encode/1]).

-export_type([openapi_campaign_common/0]).

-type openapi_campaign_common() ::
    #{ 'ad_account_id' => binary(),
       'name' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'lifetime_spend_cap' => integer(),
       'daily_spend_cap' => integer(),
       'order_line_id' => binary(),
       'tracking_urls' => openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls(),
       'start_time' => integer(),
       'end_time' => integer(),
       'summary_status' => openapi_campaign_summary_status:openapi_campaign_summary_status()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'name' := Name,
          'status' := Status,
          'lifetime_spend_cap' := LifetimeSpendCap,
          'daily_spend_cap' := DailySpendCap,
          'order_line_id' := OrderLineId,
          'tracking_urls' := TrackingUrls,
          'start_time' := StartTime,
          'end_time' := EndTime,
          'summary_status' := SummaryStatus
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'name' => Name,
       'status' => Status,
       'lifetime_spend_cap' => LifetimeSpendCap,
       'daily_spend_cap' => DailySpendCap,
       'order_line_id' => OrderLineId,
       'tracking_urls' => TrackingUrls,
       'start_time' => StartTime,
       'end_time' => EndTime,
       'summary_status' => SummaryStatus
     }.
