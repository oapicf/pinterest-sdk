-module(openapi_board_media).

-include("openapi.hrl").

-export([openapi_board_media/0]).

-export([openapi_board_media/1]).

-export_type([openapi_board_media/0]).

-type openapi_board_media() ::
  [ {'image_cover_url', binary() }
  | {'pin_thumbnail_urls', list(binary()) }
  ].


openapi_board_media() ->
    openapi_board_media([]).

openapi_board_media(Fields) ->
  Default = [ {'image_cover_url', binary() }
            , {'pin_thumbnail_urls', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

