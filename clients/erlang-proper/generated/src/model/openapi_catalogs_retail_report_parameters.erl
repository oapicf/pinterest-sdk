-module(openapi_catalogs_retail_report_parameters).

-include("openapi.hrl").

-export([openapi_catalogs_retail_report_parameters/0]).

-export([openapi_catalogs_retail_report_parameters/1]).

-export_type([openapi_catalogs_retail_report_parameters/0]).

-type openapi_catalogs_retail_report_parameters() ::
  [ {'catalog_type', binary() }
  | {'report', openapi_catalogs_hotel_report_parameters_report:openapi_catalogs_hotel_report_parameters_report() }
  ].


openapi_catalogs_retail_report_parameters() ->
    openapi_catalogs_retail_report_parameters([]).

openapi_catalogs_retail_report_parameters(Fields) ->
  Default = [ {'catalog_type', elements([<<"RETAIL">>]) }
            , {'report', openapi_catalogs_hotel_report_parameters_report:openapi_catalogs_hotel_report_parameters_report() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

