-module(openapi_carousel_slot).

-include("openapi.hrl").

-export([openapi_carousel_slot/0]).

-export([openapi_carousel_slot/1]).

-export_type([openapi_carousel_slot/0]).

-type openapi_carousel_slot() ::
  [ {'description', binary() }
  | {'link', binary() }
  | {'title', binary() }
  ].


openapi_carousel_slot() ->
    openapi_carousel_slot([]).

openapi_carousel_slot(Fields) ->
  Default = [ {'description', binary() }
            , {'link', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

