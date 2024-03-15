-module(openapi_keywords_common).

-export([encode/1]).

-export_type([openapi_keywords_common/0]).

-type openapi_keywords_common() ::
    #{ 'bid' => integer(),
       'match_type' := openapi_match_type_response:openapi_match_type_response(),
       'value' := binary()
     }.

encode(#{ 'bid' := Bid,
          'match_type' := MatchType,
          'value' := Value
        }) ->
    #{ 'bid' => Bid,
       'match_type' => MatchType,
       'value' => Value
     }.
