-module(openapi_trends_editorial).

-include("openapi.hrl").

-export([openapi_trends_editorial/0]).

-export([openapi_trends_editorial/1]).

-export_type([openapi_trends_editorial/0]).

-type openapi_trends_editorial() ::
  [ {'board_url', binary() }
  | {'description', binary() }
  | {'interests', list(binary()) }
  | {'pins_url', list(binary()) }
  | {'related_keywords', list(openapi_keyword_info:openapi_keyword_info()) }
  | {'title', binary() }
  ].


openapi_trends_editorial() ->
    openapi_trends_editorial([]).

openapi_trends_editorial(Fields) ->
  Default = [ {'board_url', binary() }
            , {'description', binary() }
            , {'interests', list(binary()) }
            , {'pins_url', list(binary()) }
            , {'related_keywords', list(openapi_keyword_info:openapi_keyword_info()) }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

