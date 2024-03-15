-module(openapi_conversion_event_response).

-export([encode/1]).

-export_type([openapi_conversion_event_response/0]).

-type openapi_conversion_event_response() ::
    #{ 'conversion_event' => openapi_conversion_tag_type:openapi_conversion_tag_type(),
       'conversion_tag_id' => binary(),
       'ad_account_id' => binary(),
       'created_time' => integer()
     }.

encode(#{ 'conversion_event' := ConversionEvent,
          'conversion_tag_id' := ConversionTagId,
          'ad_account_id' := AdAccountId,
          'created_time' := CreatedTime
        }) ->
    #{ 'conversion_event' => ConversionEvent,
       'conversion_tag_id' => ConversionTagId,
       'ad_account_id' => AdAccountId,
       'created_time' => CreatedTime
     }.
