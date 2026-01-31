-module(openapi_bulk_download_request).

-include("openapi.hrl").

-export([openapi_bulk_download_request/0]).

-export([openapi_bulk_download_request/1]).

-export_type([openapi_bulk_download_request/0]).

-type openapi_bulk_download_request() ::
  [ {'campaign_filter', openapi_bulk_download_request_campaign_filter:openapi_bulk_download_request_campaign_filter() }
  | {'entity_ids', list(binary()) }
  | {'entity_types', list(binary()) }
  | {'output_format', openapi_bulk_output_format:openapi_bulk_output_format() }
  | {'updated_since', binary() }
  ].


openapi_bulk_download_request() ->
    openapi_bulk_download_request([]).

openapi_bulk_download_request(Fields) ->
  Default = [ {'campaign_filter', openapi_bulk_download_request_campaign_filter:openapi_bulk_download_request_campaign_filter() }
            , {'entity_ids', list(binary()) }
            , {'entity_types', list(binary(), 1, 6) }
            , {'output_format', openapi_bulk_output_format:openapi_bulk_output_format() }
            , {'updated_since', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

