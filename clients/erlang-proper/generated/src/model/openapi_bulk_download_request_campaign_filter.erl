-module(openapi_bulk_download_request_campaign_filter).

-include("openapi.hrl").

-export([openapi_bulk_download_request_campaign_filter/0]).

-export([openapi_bulk_download_request_campaign_filter/1]).

-export_type([openapi_bulk_download_request_campaign_filter/0]).

-type openapi_bulk_download_request_campaign_filter() ::
  [ {'campaign_status', list(openapi_campaign_summary_status:openapi_campaign_summary_status()) }
  | {'end_time', binary() }
  | {'name', binary() }
  | {'objective_type', list(openapi_objective_type:openapi_objective_type()) }
  | {'start_time', binary() }
  ].


openapi_bulk_download_request_campaign_filter() ->
    openapi_bulk_download_request_campaign_filter([]).

openapi_bulk_download_request_campaign_filter(Fields) ->
  Default = [ {'campaign_status', list(openapi_campaign_summary_status:openapi_campaign_summary_status()) }
            , {'end_time', binary() }
            , {'name', binary() }
            , {'objective_type', list(openapi_objective_type:openapi_objective_type()) }
            , {'start_time', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

