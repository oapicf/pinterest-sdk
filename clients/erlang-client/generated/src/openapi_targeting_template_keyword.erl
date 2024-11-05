-module(openapi_targeting_template_keyword).

-export([encode/1]).

-export_type([openapi_targeting_template_keyword/0]).

-type openapi_targeting_template_keyword() ::
    #{ 'match_type' => openapi_match_type:openapi_match_type(),
       'value' => binary()
     }.

encode(#{ 'match_type' := MatchType,
          'value' := Value
        }) ->
    #{ 'match_type' => MatchType,
       'value' => Value
     }.
