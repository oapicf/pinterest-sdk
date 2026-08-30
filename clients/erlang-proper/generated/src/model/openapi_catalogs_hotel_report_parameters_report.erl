-module(openapi_catalogs_hotel_report_parameters_report).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_report_parameters_report/0]).

-export([openapi_catalogs_hotel_report_parameters_report/1]).

-export_type([openapi_catalogs_hotel_report_parameters_report/0]).

-type openapi_catalogs_hotel_report_parameters_report() ::
  [ {'feed_id', binary() }
  | {'processing_result_id', binary() }
  | {'report_type', binary() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_hotel_report_parameters_report() ->
    openapi_catalogs_hotel_report_parameters_report([]).

openapi_catalogs_hotel_report_parameters_report(Fields) ->
  Default = [ {'feed_id', binary() }
            , {'processing_result_id', binary() }
            , {'report_type', elements([<<"DISTRIBUTION_ISSUES">>]) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

