-module(openapi_dynamic_titles_process_csv).

-include("openapi.hrl").

-export([openapi_dynamic_titles_process_csv/0]).

-export([openapi_dynamic_titles_process_csv/1]).

-export_type([openapi_dynamic_titles_process_csv/0]).

-type openapi_dynamic_titles_process_csv() ::
  [ {'errors', list(openapi_dynamic_titles_process_csv_error:openapi_dynamic_titles_process_csv_error()) }
  | {'status', binary() }
  ].


openapi_dynamic_titles_process_csv() ->
    openapi_dynamic_titles_process_csv([]).

openapi_dynamic_titles_process_csv(Fields) ->
  Default = [ {'errors', list(openapi_dynamic_titles_process_csv_error:openapi_dynamic_titles_process_csv_error()) }
            , {'status', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

