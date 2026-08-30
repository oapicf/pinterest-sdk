-module(openapi_ad_preview_source_pin_id).

-export([encode/1]).

-export_type([openapi_ad_preview_source_pin_id/0]).

-type openapi_ad_preview_source_pin_id() ::
    #{ 'creative_type' => openapi_ad_pin_preview_creative_type:openapi_ad_pin_preview_creative_type(),
       'pin_id' := binary()
     }.

encode(#{ 'creative_type' := CreativeType,
          'pin_id' := PinId
        }) ->
    #{ 'creative_type' => CreativeType,
       'pin_id' => PinId
     }.
