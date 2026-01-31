-module(openapi_board_base).

-include("openapi.hrl").

-export([openapi_board_base/0]).

-export([openapi_board_base/1]).

-export_type([openapi_board_base/0]).

-type openapi_board_base() ::
  [ {'board_pins_modified_at', datetime() }
  | {'collaborator_count', integer() }
  | {'created_at', datetime() }
  | {'description', binary() }
  | {'follower_count', integer() }
  | {'id', binary() }
  | {'is_ads_only', boolean() }
  | {'media', openapi_board_media:openapi_board_media() }
  | {'name', binary() }
  | {'owner', openapi_board_owner:openapi_board_owner() }
  | {'pin_count', integer() }
  ].


openapi_board_base() ->
    openapi_board_base([]).

openapi_board_base(Fields) ->
  Default = [ {'board_pins_modified_at', datetime() }
            , {'collaborator_count', integer(0) }
            , {'created_at', datetime() }
            , {'description', binary() }
            , {'follower_count', integer(0) }
            , {'id', binary() }
            , {'is_ads_only', boolean() }
            , {'media', openapi_board_media:openapi_board_media() }
            , {'name', binary() }
            , {'owner', openapi_board_owner:openapi_board_owner() }
            , {'pin_count', integer(0) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

