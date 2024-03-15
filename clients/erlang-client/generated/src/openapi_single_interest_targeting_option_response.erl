-module(openapi_single_interest_targeting_option_response).

-export([encode/1]).

-export_type([openapi_single_interest_targeting_option_response/0]).

-type openapi_single_interest_targeting_option_response() ::
    #{ 'id' => binary(),
       'name' => binary(),
       'child_interests' => list(),
       'level' => integer()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'child_interests' := ChildInterests,
          'level' := Level
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'child_interests' => ChildInterests,
       'level' => Level
     }.
