-module(openapi_board_section_update_with_required_body).

-include("openapi.hrl").

-export([openapi_board_section_update_with_required_body/0]).

-export([openapi_board_section_update_with_required_body/1]).

-export_type([openapi_board_section_update_with_required_body/0]).

-type openapi_board_section_update_with_required_body() ::
  [ {'id', binary() }
  | {'name', binary() }
  ].


openapi_board_section_update_with_required_body() ->
    openapi_board_section_update_with_required_body([]).

openapi_board_section_update_with_required_body(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary(1, 180) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

