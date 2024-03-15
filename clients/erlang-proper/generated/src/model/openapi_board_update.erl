-module(openapi_board_update).

-include("openapi.hrl").

-export([openapi_board_update/0]).

-export([openapi_board_update/1]).

-export_type([openapi_board_update/0]).

-type openapi_board_update() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'privacy', binary() }
  ].


openapi_board_update() ->
    openapi_board_update([]).

openapi_board_update(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'privacy', elements([<<"PUBLIC">>, <<"SECRET">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

