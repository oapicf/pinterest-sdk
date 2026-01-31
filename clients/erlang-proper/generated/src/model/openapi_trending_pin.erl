-module(openapi_trending_pin).

-include("openapi.hrl").

-export([openapi_trending_pin/0]).

-export([openapi_trending_pin/1]).

-export_type([openapi_trending_pin/0]).

-type openapi_trending_pin() ::
  [ {'height', integer() }
  | {'id', binary() }
  | {'src', binary() }
  | {'width', integer() }
  ].


openapi_trending_pin() ->
    openapi_trending_pin([]).

openapi_trending_pin(Fields) ->
  Default = [ {'height', integer() }
            , {'id', binary() }
            , {'src', binary() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

