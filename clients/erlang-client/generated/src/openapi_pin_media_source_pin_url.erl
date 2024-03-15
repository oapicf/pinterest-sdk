-module(openapi_pin_media_source_pin_url).

-export([encode/1]).

-export_type([openapi_pin_media_source_pin_url/0]).

-type openapi_pin_media_source_pin_url() ::
    #{ 'source_type' := binary(),
       'is_affiliate_link' => boolean()
     }.

encode(#{ 'source_type' := SourceType,
          'is_affiliate_link' := IsAffiliateLink
        }) ->
    #{ 'source_type' => SourceType,
       'is_affiliate_link' => IsAffiliateLink
     }.
