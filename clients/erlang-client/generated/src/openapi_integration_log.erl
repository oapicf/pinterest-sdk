-module(openapi_integration_log).

-export([encode/1]).

-export_type([openapi_integration_log/0]).

-type openapi_integration_log() ::
    #{ 'advertiser_id' => binary(),
       'app_version_number' => binary(),
       'client_timestamp' := integer(),
       'error' => openapi_integration_log_client_error:openapi_integration_log_client_error(),
       'event_type' := openapi_integration_log_event_type:openapi_integration_log_event_type(),
       'external_business_id' => binary(),
       'feed_profile_id' => binary(),
       'log_level' := openapi_integration_log_level:openapi_integration_log_level(),
       'merchant_id' => binary(),
       'message' => binary(),
       'platform_version_number' => binary(),
       'request' => openapi_integration_log_client_request:openapi_integration_log_client_request(),
       'tag_id' => binary()
     }.

encode(#{ 'advertiser_id' := AdvertiserId,
          'app_version_number' := AppVersionNumber,
          'client_timestamp' := ClientTimestamp,
          'error' := Error,
          'event_type' := EventType,
          'external_business_id' := ExternalBusinessId,
          'feed_profile_id' := FeedProfileId,
          'log_level' := LogLevel,
          'merchant_id' := MerchantId,
          'message' := Message,
          'platform_version_number' := PlatformVersionNumber,
          'request' := Request,
          'tag_id' := TagId
        }) ->
    #{ 'advertiser_id' => AdvertiserId,
       'app_version_number' => AppVersionNumber,
       'client_timestamp' => ClientTimestamp,
       'error' => Error,
       'event_type' => EventType,
       'external_business_id' => ExternalBusinessId,
       'feed_profile_id' => FeedProfileId,
       'log_level' => LogLevel,
       'merchant_id' => MerchantId,
       'message' => Message,
       'platform_version_number' => PlatformVersionNumber,
       'request' => Request,
       'tag_id' => TagId
     }.
