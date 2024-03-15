-module(openapi_summary_pin).

-include("openapi.hrl").

-export([openapi_summary_pin/0]).

-export([openapi_summary_pin/1]).

-export_type([openapi_summary_pin/0]).

-type openapi_summary_pin() ::
  [ {'media', openapi_summary_pin_media:openapi_summary_pin_media() }
  | {'alt_text', binary() }
  | {'link', binary() }
  | {'title', binary() }
  | {'description', binary() }
  ].


openapi_summary_pin() ->
    openapi_summary_pin([]).

openapi_summary_pin(Fields) ->
  Default = [ {'media', openapi_summary_pin_media:openapi_summary_pin_media() }
            , {'alt_text', binary() }
            , {'link', binary() }
            , {'title', binary() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

