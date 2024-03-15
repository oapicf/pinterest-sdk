-module(openapi_ad_group_audience_sizing_request_keywords_inner).

-export([encode/1]).

-export_type([openapi_ad_group_audience_sizing_request_keywords_inner/0]).

-type openapi_ad_group_audience_sizing_request_keywords_inner() ::
    #{ 'match_type' := openapi_match_type_response:openapi_match_type_response(),
       'value' := binary()
     }.

encode(#{ 'match_type' := MatchType,
          'value' := Value
        }) ->
    #{ 'match_type' => MatchType,
       'value' => Value
     }.
