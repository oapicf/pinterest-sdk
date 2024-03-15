-module(openapi_board_owner).

-include("openapi.hrl").

-export([openapi_board_owner/0]).

-export([openapi_board_owner/1]).

-export_type([openapi_board_owner/0]).

-type openapi_board_owner() ::
  [ {'username', binary() }
  ].


openapi_board_owner() ->
    openapi_board_owner([]).

openapi_board_owner(Fields) ->
  Default = [ {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

