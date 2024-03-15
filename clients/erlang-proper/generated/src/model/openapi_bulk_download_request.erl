-module(openapi_bulk_download_request).

-include("openapi.hrl").

-export([openapi_bulk_download_request/0]).

-export([openapi_bulk_download_request/1]).

-export_type([openapi_bulk_download_request/0]).

-type openapi_bulk_download_request() ::
  [ {'entity_types', list(binary()) }
  | {'entity_ids', list(binary()) }
  | {'updated_since', binary() }
  | {'campaign_filter', openapi_bulk_download_request_campaign_filter:openapi_bulk_download_request_campaign_filter() }
  | {'output_format', openapi_bulk_output_format:openapi_bulk_output_format() }
  ].


openapi_bulk_download_request() ->
    openapi_bulk_download_request([]).

openapi_bulk_download_request(Fields) ->
  Default = [ {'entity_types', list(binary(), 1, 5) }
            , {'entity_ids', list(binary()) }
            , {'updated_since', binary() }
            , {'campaign_filter', openapi_bulk_download_request_campaign_filter:openapi_bulk_download_request_campaign_filter() }
            , {'output_format', openapi_bulk_output_format:openapi_bulk_output_format() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

