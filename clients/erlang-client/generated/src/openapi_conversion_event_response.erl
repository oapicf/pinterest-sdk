-module(openapi_conversion_event_response).

-export([encode/1]).

-export_type([openapi_conversion_event_response/0]).

-type openapi_conversion_event_response() ::
    #{ 'ad_account_id' => binary(),
       'conversion_event' => openapi_conversion_tag_type:openapi_conversion_tag_type(),
       'conversion_tag_id' => binary(),
       'created_time' => integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'conversion_event' := ConversionEvent,
          'conversion_tag_id' := ConversionTagId,
          'created_time' := CreatedTime
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'conversion_event' => ConversionEvent,
       'conversion_tag_id' => ConversionTagId,
       'created_time' => CreatedTime
     }.
