-module(openapi_conversion_product_report).

-include("openapi.hrl").

-export([openapi_conversion_product_report/0]).

-export([openapi_conversion_product_report/1]).

-export_type([openapi_conversion_product_report/0]).

-type openapi_conversion_product_report() ::
  [ {'message', binary() }
  | {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
  | {'size', integer() }
  | {'token', binary() }
  | {'url', binary() }
  ].


openapi_conversion_product_report() ->
    openapi_conversion_product_report([]).

openapi_conversion_product_report(Fields) ->
  Default = [ {'message', binary() }
            , {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
            , {'size', integer() }
            , {'token', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

