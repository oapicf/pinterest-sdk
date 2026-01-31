-module(openapi_board_with_update_privacy_update).

-include("openapi.hrl").

-export([openapi_board_with_update_privacy_update/0]).

-export([openapi_board_with_update_privacy_update/1]).

-export_type([openapi_board_with_update_privacy_update/0]).

-type openapi_board_with_update_privacy_update() ::
  [ {'description', binary() }
  | {'name', binary() }
  | {'privacy', openapi_board_update_privacy:openapi_board_update_privacy() }
  ].


openapi_board_with_update_privacy_update() ->
    openapi_board_with_update_privacy_update([]).

openapi_board_with_update_privacy_update(Fields) ->
  Default = [ {'description', binary() }
            , {'name', binary() }
            , {'privacy', openapi_board_update_privacy:openapi_board_update_privacy() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

