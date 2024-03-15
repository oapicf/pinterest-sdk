-module(openapi_catalogs_retail_feeds_update_request).

-include("openapi.hrl").

-export([openapi_catalogs_retail_feeds_update_request/0]).

-export([openapi_catalogs_retail_feeds_update_request/1]).

-export_type([openapi_catalogs_retail_feeds_update_request/0]).

-type openapi_catalogs_retail_feeds_update_request() ::
  [ {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
  | {'name', binary() }
  | {'format', openapi_catalogs_format:openapi_catalogs_format() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
  | {'location', binary() }
  | {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
  | {'status', openapi_catalogs_status:openapi_catalogs_status() }
  | {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
  ].


openapi_catalogs_retail_feeds_update_request() ->
    openapi_catalogs_retail_feeds_update_request([]).

openapi_catalogs_retail_feeds_update_request(Fields) ->
  Default = [ {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
            , {'name', binary() }
            , {'format', openapi_catalogs_format:openapi_catalogs_format() }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
            , {'location', binary() }
            , {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
            , {'status', openapi_catalogs_status:openapi_catalogs_status() }
            , {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

