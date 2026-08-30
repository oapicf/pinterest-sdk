-module(openapi_conversion_msot_events_create).

-export([encode/1]).

-export_type([openapi_conversion_msot_events_create/0]).

-type openapi_conversion_msot_events_create() ::
    #{ 'action_timestamps' => list(),
       'ad_group_id' := binary(),
       'attribution_model' => openapi_attribution_model:openapi_attribution_model(),
       'attribution_scope' => openapi_attribution_scope:openapi_attribution_scope(),
       'attribution_score' => float(),
       'campaign_id' => binary(),
       'click_window' => binary(),
       'currency' => openapi_currency:openapi_currency(),
       'event_id' := binary(),
       'event_name' := openapi_msot_event_name:openapi_msot_event_name(),
       'event_timestamp' := integer(),
       'total_event_touchpoints' => integer(),
       'total_events' => integer(),
       'total_events_fractional' => float(),
       'value' => float(),
       'view_window' => binary()
     }.

encode(#{ 'action_timestamps' := ActionTimestamps,
          'ad_group_id' := AdGroupId,
          'attribution_model' := AttributionModel,
          'attribution_scope' := AttributionScope,
          'attribution_score' := AttributionScore,
          'campaign_id' := CampaignId,
          'click_window' := ClickWindow,
          'currency' := Currency,
          'event_id' := EventId,
          'event_name' := EventName,
          'event_timestamp' := EventTimestamp,
          'total_event_touchpoints' := TotalEventTouchpoints,
          'total_events' := TotalEvents,
          'total_events_fractional' := TotalEventsFractional,
          'value' := Value,
          'view_window' := ViewWindow
        }) ->
    #{ 'action_timestamps' => ActionTimestamps,
       'ad_group_id' => AdGroupId,
       'attribution_model' => AttributionModel,
       'attribution_scope' => AttributionScope,
       'attribution_score' => AttributionScore,
       'campaign_id' => CampaignId,
       'click_window' => ClickWindow,
       'currency' => Currency,
       'event_id' => EventId,
       'event_name' => EventName,
       'event_timestamp' => EventTimestamp,
       'total_event_touchpoints' => TotalEventTouchpoints,
       'total_events' => TotalEvents,
       'total_events_fractional' => TotalEventsFractional,
       'value' => Value,
       'view_window' => ViewWindow
     }.
