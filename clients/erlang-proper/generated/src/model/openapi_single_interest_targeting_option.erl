-module(openapi_single_interest_targeting_option).

-include("openapi.hrl").

-export([openapi_single_interest_targeting_option/0]).

-export([openapi_single_interest_targeting_option/1]).

-export_type([openapi_single_interest_targeting_option/0]).

-type openapi_single_interest_targeting_option() ::
  [ {'child_interests', list(binary()) }
  | {'id', binary() }
  | {'level', integer() }
  | {'name', binary() }
  ].


openapi_single_interest_targeting_option() ->
    openapi_single_interest_targeting_option([]).

openapi_single_interest_targeting_option(Fields) ->
  Default = [ {'child_interests', list(binary()) }
            , {'id', binary() }
            , {'level', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

