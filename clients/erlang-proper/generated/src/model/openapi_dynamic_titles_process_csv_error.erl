-module(openapi_dynamic_titles_process_csv_error).

-include("openapi.hrl").

-export([openapi_dynamic_titles_process_csv_error/0]).

-export([openapi_dynamic_titles_process_csv_error/1]).

-export_type([openapi_dynamic_titles_process_csv_error/0]).

-type openapi_dynamic_titles_process_csv_error() ::
  [ {'error_type', binary() }
  | {'row_number', integer() }
  ].


openapi_dynamic_titles_process_csv_error() ->
    openapi_dynamic_titles_process_csv_error([]).

openapi_dynamic_titles_process_csv_error(Fields) ->
  Default = [ {'error_type', binary() }
            , {'row_number', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

