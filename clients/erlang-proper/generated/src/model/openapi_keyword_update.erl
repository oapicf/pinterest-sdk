-module(openapi_keyword_update).

-include("openapi.hrl").

-export([openapi_keyword_update/0]).

-export([openapi_keyword_update/1]).

-export_type([openapi_keyword_update/0]).

-type openapi_keyword_update() ::
  [ {'id', binary() }
  | {'archived', boolean() }
  | {'bid', integer() }
  ].


openapi_keyword_update() ->
    openapi_keyword_update([]).

openapi_keyword_update(Fields) ->
  Default = [ {'id', binary() }
            , {'archived', boolean() }
            , {'bid', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

