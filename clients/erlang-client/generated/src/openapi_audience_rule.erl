-module(openapi_audience_rule).

-export([encode/1]).

-export_type([openapi_audience_rule/0]).

-type openapi_audience_rule() ::
    #{ 'country' => binary(),
       'customer_list_id' => binary(),
       'engagement_domain' => list(),
       'engagement_type' => binary(),
       'event' => binary(),
       'event_data' => openapi_pinterest_tag_event_data:openapi_pinterest_tag_event_data(),
       'percentage' => integer(),
       'pin_id' => list(),
       'prefill' => boolean(),
       'retention_days' => integer(),
       'seed_id' => list(),
       'url' => list(),
       'visitor_source_id' => binary(),
       'event_source' => maps:map(),
       'ingestion_source' => maps:map(),
       'engager_type' => integer(),
       'campaign_id' => list(),
       'ad_id' => list(),
       'objective_type' => list(),
       'ad_account_id' => binary()
     }.

encode(#{ 'country' := Country,
          'customer_list_id' := CustomerListId,
          'engagement_domain' := EngagementDomain,
          'engagement_type' := EngagementType,
          'event' := Event,
          'event_data' := EventData,
          'percentage' := Percentage,
          'pin_id' := PinId,
          'prefill' := Prefill,
          'retention_days' := RetentionDays,
          'seed_id' := SeedId,
          'url' := Url,
          'visitor_source_id' := VisitorSourceId,
          'event_source' := EventSource,
          'ingestion_source' := IngestionSource,
          'engager_type' := EngagerType,
          'campaign_id' := CampaignId,
          'ad_id' := AdId,
          'objective_type' := ObjectiveType,
          'ad_account_id' := AdAccountId
        }) ->
    #{ 'country' => Country,
       'customer_list_id' => CustomerListId,
       'engagement_domain' => EngagementDomain,
       'engagement_type' => EngagementType,
       'event' => Event,
       'event_data' => EventData,
       'percentage' => Percentage,
       'pin_id' => PinId,
       'prefill' => Prefill,
       'retention_days' => RetentionDays,
       'seed_id' => SeedId,
       'url' => Url,
       'visitor_source_id' => VisitorSourceId,
       'event_source' => EventSource,
       'ingestion_source' => IngestionSource,
       'engager_type' => EngagerType,
       'campaign_id' => CampaignId,
       'ad_id' => AdId,
       'objective_type' => ObjectiveType,
       'ad_account_id' => AdAccountId
     }.
