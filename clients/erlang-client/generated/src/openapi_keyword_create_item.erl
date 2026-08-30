-module(openapi_keyword_create_item).

-export([encode/1]).

-export_type([openapi_keyword_create_item/0]).

-type openapi_keyword_create_item() ::
    #{ 'bid' => integer(),
       'match_type' := openapi_match_type:openapi_match_type(),
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
