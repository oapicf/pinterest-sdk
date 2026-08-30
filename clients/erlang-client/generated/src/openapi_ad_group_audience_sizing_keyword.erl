-module(openapi_ad_group_audience_sizing_keyword).

-export([encode/1]).

-export_type([openapi_ad_group_audience_sizing_keyword/0]).

-type openapi_ad_group_audience_sizing_keyword() ::
    #{ 'match_type' := openapi_match_type:openapi_match_type(),
       'value' := binary()
     }.

encode(#{ 'match_type' := MatchType,
          'value' := Value
        }) ->
    #{ 'match_type' => MatchType,
       'value' => Value
     }.
