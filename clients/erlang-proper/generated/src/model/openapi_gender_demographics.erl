-module(openapi_gender_demographics).

-include("openapi.hrl").

-export([openapi_gender_demographics/0]).

-export([openapi_gender_demographics/1]).

-export_type([openapi_gender_demographics/0]).

-type openapi_gender_demographics() ::
  [ {'female', integer() }
  | {'male', integer() }
  | {'unspecified', integer() }
  ].


openapi_gender_demographics() ->
    openapi_gender_demographics([]).

openapi_gender_demographics(Fields) ->
  Default = [ {'female', integer() }
            , {'male', integer() }
            , {'unspecified', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

