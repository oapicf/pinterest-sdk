-module(openapi_single_interest_targeting_option_response).

-include("openapi.hrl").

-export([openapi_single_interest_targeting_option_response/0]).

-export([openapi_single_interest_targeting_option_response/1]).

-export_type([openapi_single_interest_targeting_option_response/0]).

-type openapi_single_interest_targeting_option_response() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'child_interests', list(binary()) }
  | {'level', integer() }
  ].


openapi_single_interest_targeting_option_response() ->
    openapi_single_interest_targeting_option_response([]).

openapi_single_interest_targeting_option_response(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            , {'child_interests', list(binary()) }
            , {'level', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

