-module(openapi_board_create).

-include("openapi.hrl").

-export([openapi_board_create/0]).

-export([openapi_board_create/1]).

-export_type([openapi_board_create/0]).

-type openapi_board_create() ::
  [ {'description', binary() }
  | {'is_ads_only', boolean() }
  | {'name', binary() }
  | {'privacy', openapi_board_privacy:openapi_board_privacy() }
  ].


openapi_board_create() ->
    openapi_board_create([]).

openapi_board_create(Fields) ->
  Default = [ {'description', binary() }
            , {'is_ads_only', boolean() }
            , {'name', binary() }
            , {'privacy', openapi_board_privacy:openapi_board_privacy() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

