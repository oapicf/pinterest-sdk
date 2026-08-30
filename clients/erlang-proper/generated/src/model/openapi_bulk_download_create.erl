-module(openapi_bulk_download_create).

-include("openapi.hrl").

-export([openapi_bulk_download_create/0]).

-export([openapi_bulk_download_create/1]).

-export_type([openapi_bulk_download_create/0]).

-type openapi_bulk_download_create() ::
  [ {'campaign_filter', openapi_bulk_download_campaign_filter:openapi_bulk_download_campaign_filter() }
  | {'entity_ids', list(binary()) }
  | {'entity_types', list(openapi_bulk_entity_type:openapi_bulk_entity_type()) }
  | {'output_format', openapi_bulk_output_format:openapi_bulk_output_format() }
  | {'updated_since', binary() }
  ].


openapi_bulk_download_create() ->
    openapi_bulk_download_create([]).

openapi_bulk_download_create(Fields) ->
  Default = [ {'campaign_filter', openapi_bulk_download_campaign_filter:openapi_bulk_download_campaign_filter() }
            , {'entity_ids', list(binary()) }
            , {'entity_types', list(openapi_bulk_entity_type:openapi_bulk_entity_type(), 1, 6) }
            , {'output_format', openapi_bulk_output_format:openapi_bulk_output_format() }
            , {'updated_since', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

