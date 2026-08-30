-module(openapi_single_interest_targeting_option).

-export([encode/1]).

-export_type([openapi_single_interest_targeting_option/0]).

-type openapi_single_interest_targeting_option() ::
    #{ 'child_interests' := list(),
       'id' := binary(),
       'level' := integer(),
       'name' := binary()
     }.

encode(#{ 'child_interests' := ChildInterests,
          'id' := Id,
          'level' := Level,
          'name' := Name
        }) ->
    #{ 'child_interests' => ChildInterests,
       'id' => Id,
       'level' => Level,
       'name' => Name
     }.
