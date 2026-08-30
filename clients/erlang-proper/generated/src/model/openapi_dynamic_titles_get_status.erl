-module(openapi_dynamic_titles_get_status).

-include("openapi.hrl").

-export([openapi_dynamic_titles_get_status/0]).

-export([openapi_dynamic_titles_get_status/1]).

-export_type([openapi_dynamic_titles_get_status/0]).

-type openapi_dynamic_titles_get_status() ::
  [ {'generated_count', integer() }
  | {'is_ready', boolean() }
  | {'reviewed_count', integer() }
  ].


openapi_dynamic_titles_get_status() ->
    openapi_dynamic_titles_get_status([]).

openapi_dynamic_titles_get_status(Fields) ->
  Default = [ {'generated_count', integer() }
            , {'is_ready', boolean() }
            , {'reviewed_count', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

