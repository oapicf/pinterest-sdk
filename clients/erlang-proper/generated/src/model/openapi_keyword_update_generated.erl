-module(openapi_keyword_update_generated).

-include("openapi.hrl").

-export([openapi_keyword_update_generated/0]).

-export([openapi_keyword_update_generated/1]).

-export_type([openapi_keyword_update_generated/0]).

-type openapi_keyword_update_generated() ::
  [ {'archived', boolean() }
  | {'bid', integer() }
  | {'id', binary() }
  ].


openapi_keyword_update_generated() ->
    openapi_keyword_update_generated([]).

openapi_keyword_update_generated(Fields) ->
  Default = [ {'archived', boolean() }
            , {'bid', integer() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

