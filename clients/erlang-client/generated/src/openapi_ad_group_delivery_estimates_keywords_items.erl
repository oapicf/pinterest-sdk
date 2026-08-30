-module(openapi_ad_group_delivery_estimates_keywords_items).

-export([encode/1]).

-export_type([openapi_ad_group_delivery_estimates_keywords_items/0]).

-type openapi_ad_group_delivery_estimates_keywords_items() ::
    #{ 'match_type' := openapi_nullalble_match_type:openapi_nullalble_match_type(),
       'value' := binary()
     }.

encode(#{ 'match_type' := MatchType,
          'value' := Value
        }) ->
    #{ 'match_type' => MatchType,
       'value' => Value
     }.
