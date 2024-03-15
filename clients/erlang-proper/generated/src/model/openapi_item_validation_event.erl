-module(openapi_item_validation_event).

-include("openapi.hrl").

-export([openapi_item_validation_event/0]).

-export([openapi_item_validation_event/1]).

-export_type([openapi_item_validation_event/0]).

-type openapi_item_validation_event() ::
  [ {'attribute', binary() }
  | {'code', integer() }
  | {'message', binary() }
  ].


openapi_item_validation_event() ->
    openapi_item_validation_event([]).

openapi_item_validation_event(Fields) ->
  Default = [ {'attribute', binary() }
            , {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

