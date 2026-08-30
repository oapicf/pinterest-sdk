-module(openapi_dynamic_titles_process_csv_create).

-include("openapi.hrl").

-export([openapi_dynamic_titles_process_csv_create/0]).

-export([openapi_dynamic_titles_process_csv_create/1]).

-export_type([openapi_dynamic_titles_process_csv_create/0]).

-type openapi_dynamic_titles_process_csv_create() ::
  [ {'request_id', binary() }
  ].


openapi_dynamic_titles_process_csv_create() ->
    openapi_dynamic_titles_process_csv_create([]).

openapi_dynamic_titles_process_csv_create(Fields) ->
  Default = [ {'request_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

