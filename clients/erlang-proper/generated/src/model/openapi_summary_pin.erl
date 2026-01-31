-module(openapi_summary_pin).

-include("openapi.hrl").

-export([openapi_summary_pin/0]).

-export([openapi_summary_pin/1]).

-export_type([openapi_summary_pin/0]).

-type openapi_summary_pin() ::
  [ {'alt_text', binary() }
  | {'description', binary() }
  | {'id', binary() }
  | {'link', binary() }
  | {'media', openapi_pin_media:openapi_pin_media() }
  | {'title', binary() }
  ].


openapi_summary_pin() ->
    openapi_summary_pin([]).

openapi_summary_pin(Fields) ->
  Default = [ {'alt_text', binary() }
            , {'description', binary() }
            , {'id', binary() }
            , {'link', binary() }
            , {'media', openapi_pin_media:openapi_pin_media() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

