-module(openapi_keyword).

-include("openapi.hrl").

-export([openapi_keyword/0]).

-export([openapi_keyword/1]).

-export_type([openapi_keyword/0]).

-type openapi_keyword() ::
  [ {'archived', boolean() }
  | {'id', binary() }
  | {'parent_id', binary() }
  | {'parent_type', binary() }
  | {'type', binary() }
  | {'bid', integer() }
  | {'match_type', openapi_match_type_response:openapi_match_type_response() }
  | {'value', binary() }
  ].


openapi_keyword() ->
    openapi_keyword([]).

openapi_keyword(Fields) ->
  Default = [ {'archived', boolean() }
            , {'id', binary() }
            , {'parent_id', binary() }
            , {'parent_type', binary() }
            , {'type', binary() }
            , {'bid', integer() }
            , {'match_type', openapi_match_type_response:openapi_match_type_response() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

