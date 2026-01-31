-module(openapi_audience_rule).

-export([encode/1]).

-export_type([openapi_audience_rule/0]).

-type openapi_audience_rule() ::
    #{ 'ad_account_id' => binary(),
       'ad_id' => list(),
       'campaign_id' => list(),
       'country' => binary(),
       'customer_list_id' => binary(),
       'engagement_domain' => list(),
       'engagement_type' => binary(),
       'engager_type' => integer(),
       'event' => binary(),
       'event_data' => openapi_event_data:openapi_event_data(),
       'event_source' => maps:map(),
       'ingestion_source' => maps:map(),
       'objective_type' => list(),
       'percentage' => integer(),
       'pin_id' => list(),
       'prefill' => boolean(),
       'retention_days' => integer(),
       'seed_id' => list(),
       'url' => list(),
       'visitor_source_id' => binary()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'ad_id' := AdId,
          'campaign_id' := CampaignId,
          'country' := Country,
          'customer_list_id' := CustomerListId,
          'engagement_domain' := EngagementDomain,
          'engagement_type' := EngagementType,
          'engager_type' := EngagerType,
          'event' := Event,
          'event_data' := EventData,
          'event_source' := EventSource,
          'ingestion_source' := IngestionSource,
          'objective_type' := ObjectiveType,
          'percentage' := Percentage,
          'pin_id' := PinId,
          'prefill' := Prefill,
          'retention_days' := RetentionDays,
          'seed_id' := SeedId,
          'url' := Url,
          'visitor_source_id' := VisitorSourceId
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'ad_id' => AdId,
       'campaign_id' => CampaignId,
       'country' => Country,
       'customer_list_id' => CustomerListId,
       'engagement_domain' => EngagementDomain,
       'engagement_type' => EngagementType,
       'engager_type' => EngagerType,
       'event' => Event,
       'event_data' => EventData,
       'event_source' => EventSource,
       'ingestion_source' => IngestionSource,
       'objective_type' => ObjectiveType,
       'percentage' => Percentage,
       'pin_id' => PinId,
       'prefill' => Prefill,
       'retention_days' => RetentionDays,
       'seed_id' => SeedId,
       'url' => Url,
       'visitor_source_id' => VisitorSourceId
     }.
