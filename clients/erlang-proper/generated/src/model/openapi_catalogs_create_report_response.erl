-module(openapi_catalogs_create_report_response).

-include("openapi.hrl").

-export([openapi_catalogs_create_report_response/0]).

-export([openapi_catalogs_create_report_response/1]).

-export_type([openapi_catalogs_create_report_response/0]).

-type openapi_catalogs_create_report_response() ::
  [ {'token', binary() }
  ].


openapi_catalogs_create_report_response() ->
    openapi_catalogs_create_report_response([]).

openapi_catalogs_create_report_response(Fields) ->
  Default = [ {'token', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

