-module(openapi_bulk_download_request_campaign_filter).

-include("openapi.hrl").

-export([openapi_bulk_download_request_campaign_filter/0]).

-export([openapi_bulk_download_request_campaign_filter/1]).

-export_type([openapi_bulk_download_request_campaign_filter/0]).

-type openapi_bulk_download_request_campaign_filter() ::
  [ {'start_time', binary() }
  | {'end_time', binary() }
  | {'name', binary() }
  | {'campaign_status', list(openapi_campaign_summary_status:openapi_campaign_summary_status()) }
  | {'objective_type', list(openapi_objective_type:openapi_objective_type()) }
  ].


openapi_bulk_download_request_campaign_filter() ->
    openapi_bulk_download_request_campaign_filter([]).

openapi_bulk_download_request_campaign_filter(Fields) ->
  Default = [ {'start_time', binary() }
            , {'end_time', binary() }
            , {'name', binary() }
            , {'campaign_status', list(openapi_campaign_summary_status:openapi_campaign_summary_status()) }
            , {'objective_type', list(openapi_objective_type:openapi_objective_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

