-module(openapi_catalogs_feed_update_request_schema).

-include("openapi.hrl").

-export([openapi_catalogs_feed_update_request_schema/0]).

-export([openapi_catalogs_feed_update_request_schema/1]).

-export_type([openapi_catalogs_feed_update_request_schema/0]).

-type openapi_catalogs_feed_update_request_schema() ::
  [ {'catalog_type', binary() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
  | {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
  | {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
  | {'format', openapi_catalogs_format:openapi_catalogs_format() }
  | {'location', binary() }
  | {'name', binary() }
  | {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
  | {'status', openapi_catalogs_status:openapi_catalogs_status() }
  ].


openapi_catalogs_feed_update_request_schema() ->
    openapi_catalogs_feed_update_request_schema([]).

openapi_catalogs_feed_update_request_schema(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
            , {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
            , {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
            , {'format', openapi_catalogs_format:openapi_catalogs_format() }
            , {'location', binary() }
            , {'name', binary() }
            , {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
            , {'status', openapi_catalogs_status:openapi_catalogs_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

