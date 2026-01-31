-module(openapi_quality_components).

-export([encode/1]).

-export_type([openapi_quality_components/0]).

-type openapi_quality_components() ::
    #{ 'advertiser_external_id' => maps:map(),
       'click_id_epik' => maps:map(),
       'external_event_id' => maps:map(),
       'hashed_email' => maps:map(),
       'hashed_maid' => maps:map(),
       'ip_address' => maps:map(),
       'order_id' => maps:map(),
       'order_value' => maps:map(),
       'product_id' => maps:map(),
       'source_url' => maps:map(),
       'user_agent' => maps:map()
     }.

encode(#{ 'advertiser_external_id' := AdvertiserExternalId,
          'click_id_epik' := ClickIdEpik,
          'external_event_id' := ExternalEventId,
          'hashed_email' := HashedEmail,
          'hashed_maid' := HashedMaid,
          'ip_address' := IpAddress,
          'order_id' := OrderId,
          'order_value' := OrderValue,
          'product_id' := ProductId,
          'source_url' := SourceUrl,
          'user_agent' := UserAgent
        }) ->
    #{ 'advertiser_external_id' => AdvertiserExternalId,
       'click_id_epik' => ClickIdEpik,
       'external_event_id' => ExternalEventId,
       'hashed_email' => HashedEmail,
       'hashed_maid' => HashedMaid,
       'ip_address' => IpAddress,
       'order_id' => OrderId,
       'order_value' => OrderValue,
       'product_id' => ProductId,
       'source_url' => SourceUrl,
       'user_agent' => UserAgent
     }.
