-module(openapi_integration_log).

-export([encode/1]).

-export_type([openapi_integration_log/0]).

-type openapi_integration_log() ::
    #{ 'client_timestamp' := integer(),
       'event_type' := binary(),
       'log_level' := binary(),
       'external_business_id' => binary(),
       'advertiser_id' => binary(),
       'merchant_id' => binary(),
       'tag_id' => binary(),
       'feed_profile_id' => binary(),
       'message' => binary(),
       'app_version_number' => binary(),
       'platform_version_number' => binary(),
       'error' => openapi_integration_log_client_error:openapi_integration_log_client_error(),
       'request' => openapi_integration_log_client_request:openapi_integration_log_client_request()
     }.

encode(#{ 'client_timestamp' := ClientTimestamp,
          'event_type' := EventType,
          'log_level' := LogLevel,
          'external_business_id' := ExternalBusinessId,
          'advertiser_id' := AdvertiserId,
          'merchant_id' := MerchantId,
          'tag_id' := TagId,
          'feed_profile_id' := FeedProfileId,
          'message' := Message,
          'app_version_number' := AppVersionNumber,
          'platform_version_number' := PlatformVersionNumber,
          'error' := Error,
          'request' := Request
        }) ->
    #{ 'client_timestamp' => ClientTimestamp,
       'event_type' => EventType,
       'log_level' => LogLevel,
       'external_business_id' => ExternalBusinessId,
       'advertiser_id' => AdvertiserId,
       'merchant_id' => MerchantId,
       'tag_id' => TagId,
       'feed_profile_id' => FeedProfileId,
       'message' => Message,
       'app_version_number' => AppVersionNumber,
       'platform_version_number' => PlatformVersionNumber,
       'error' => Error,
       'request' => Request
     }.
