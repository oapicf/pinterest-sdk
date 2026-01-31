-module(openapi_conversion_msot_events).

-export([encode/1]).

-export_type([openapi_conversion_msot_events/0]).

-type openapi_conversion_msot_events() ::
    #{ 'action_timestamps' => list(),
       'ad_group_id' := binary(),
       'attribution_model' => binary(),
       'attribution_scope' := binary(),
       'attribution_score' => float(),
       'campaign_id' => binary(),
       'currency' => openapi_currency:openapi_currency(),
       'event_id' := binary(),
       'event_name' := binary(),
       'event_timestamp' := integer(),
       'total_event_touchpoints' => integer(),
       'total_events' => integer(),
       'value' => float()
     }.

encode(#{ 'action_timestamps' := ActionTimestamps,
          'ad_group_id' := AdGroupId,
          'attribution_model' := AttributionModel,
          'attribution_scope' := AttributionScope,
          'attribution_score' := AttributionScore,
          'campaign_id' := CampaignId,
          'currency' := Currency,
          'event_id' := EventId,
          'event_name' := EventName,
          'event_timestamp' := EventTimestamp,
          'total_event_touchpoints' := TotalEventTouchpoints,
          'total_events' := TotalEvents,
          'value' := Value
        }) ->
    #{ 'action_timestamps' => ActionTimestamps,
       'ad_group_id' => AdGroupId,
       'attribution_model' => AttributionModel,
       'attribution_scope' => AttributionScope,
       'attribution_score' => AttributionScore,
       'campaign_id' => CampaignId,
       'currency' => Currency,
       'event_id' => EventId,
       'event_name' => EventName,
       'event_timestamp' => EventTimestamp,
       'total_event_touchpoints' => TotalEventTouchpoints,
       'total_events' => TotalEvents,
       'value' => Value
     }.
