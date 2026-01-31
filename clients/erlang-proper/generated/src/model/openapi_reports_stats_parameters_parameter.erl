-module(openapi_reports_stats_parameters_parameter).

-include("openapi.hrl").

-export([openapi_reports_stats_parameters_parameter/0]).

-export([openapi_reports_stats_parameters_parameter/1]).

-export_type([openapi_reports_stats_parameters_parameter/0]).

-type openapi_reports_stats_parameters_parameter() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'report', openapi_catalogs_hotel_report_stats_parameters_report:openapi_catalogs_hotel_report_stats_parameters_report() }
  ].


openapi_reports_stats_parameters_parameter() ->
    openapi_reports_stats_parameters_parameter([]).

openapi_reports_stats_parameters_parameter(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'report', openapi_catalogs_hotel_report_stats_parameters_report:openapi_catalogs_hotel_report_stats_parameters_report() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

