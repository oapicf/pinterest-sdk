-module(openapi_catalogs_hotel_report_parameters_report).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_report_parameters_report/0]).

-export([openapi_catalogs_hotel_report_parameters_report/1]).

-export_type([openapi_catalogs_hotel_report_parameters_report/0]).

-type openapi_catalogs_hotel_report_parameters_report() ::
  [ {'report_type', binary() }
  | {'feed_id', binary() }
  | {'processing_result_id', binary() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_hotel_report_parameters_report() ->
    openapi_catalogs_hotel_report_parameters_report([]).

openapi_catalogs_hotel_report_parameters_report(Fields) ->
  Default = [ {'report_type', elements([<<"FEED_INGESTION_ISSUES">>, <<"DISTRIBUTION_ISSUES">>]) }
            , {'feed_id', binary() }
            , {'processing_result_id', binary() }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

