-module(openapi_ads_analytics_get_async_response).

-include("openapi.hrl").

-export([openapi_ads_analytics_get_async_response/0]).

-export([openapi_ads_analytics_get_async_response/1]).

-export_type([openapi_ads_analytics_get_async_response/0]).

-type openapi_ads_analytics_get_async_response() ::
  [ {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
  | {'url', binary() }
  | {'size', integer() }
  ].


openapi_ads_analytics_get_async_response() ->
    openapi_ads_analytics_get_async_response([]).

openapi_ads_analytics_get_async_response(Fields) ->
  Default = [ {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
            , {'url', binary() }
            , {'size', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

