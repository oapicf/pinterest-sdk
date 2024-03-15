-module(openapi_board_section).

-include("openapi.hrl").

-export([openapi_board_section/0]).

-export([openapi_board_section/1]).

-export_type([openapi_board_section/0]).

-type openapi_board_section() ::
  [ {'id', binary() }
  | {'name', binary() }
  ].


openapi_board_section() ->
    openapi_board_section([]).

openapi_board_section(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary(1, 180) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

