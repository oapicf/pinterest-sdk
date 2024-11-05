-module(openapi_catalogs_report).

-include("openapi.hrl").

-export([openapi_catalogs_report/0]).

-export([openapi_catalogs_report/1]).

-export_type([openapi_catalogs_report/0]).

-type openapi_catalogs_report() ::
  [ {'report_status', binary() }
  | {'url', binary() }
  | {'size', integer() }
  ].


openapi_catalogs_report() ->
    openapi_catalogs_report([]).

openapi_catalogs_report(Fields) ->
  Default = [ {'report_status', elements([<<"FINISHED">>, <<"IN_PROGRESS">>]) }
            , {'url', binary() }
            , {'size', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

