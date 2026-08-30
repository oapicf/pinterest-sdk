-module(openapi_board_section_create).

-include("openapi.hrl").

-export([openapi_board_section_create/0]).

-export([openapi_board_section_create/1]).

-export_type([openapi_board_section_create/0]).

-type openapi_board_section_create() ::
  [ {'id', binary() }
  | {'name', binary() }
  ].


openapi_board_section_create() ->
    openapi_board_section_create([]).

openapi_board_section_create(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary(1, 180) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

