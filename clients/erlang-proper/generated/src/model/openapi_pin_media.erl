-module(openapi_pin_media).

-include("openapi.hrl").

-export([openapi_pin_media/0]).

-export([openapi_pin_media/1]).

-export_type([openapi_pin_media/0]).

-type openapi_pin_media() ::
  [ {'media_type', binary() }
  ].


openapi_pin_media() ->
    openapi_pin_media([]).

openapi_pin_media(Fields) ->
  Default = [ {'media_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

