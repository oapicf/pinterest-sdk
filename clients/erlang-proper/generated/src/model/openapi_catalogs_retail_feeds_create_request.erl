-module(openapi_catalogs_retail_feeds_create_request).

-include("openapi.hrl").

-export([openapi_catalogs_retail_feeds_create_request/0]).

-export([openapi_catalogs_retail_feeds_create_request/1]).

-export_type([openapi_catalogs_retail_feeds_create_request/0]).

-type openapi_catalogs_retail_feeds_create_request() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
  | {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
  | {'default_country', openapi_country:openapi_country() }
  | {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
  | {'default_locale', openapi_catalogs_creative_assets_feeds_create_request_default_locale:openapi_catalogs_creative_assets_feeds_create_request_default_locale() }
  | {'format', openapi_catalogs_format:openapi_catalogs_format() }
  | {'location', binary() }
  | {'name', binary() }
  | {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
  | {'status', openapi_catalogs_status:openapi_catalogs_status() }
  ].


openapi_catalogs_retail_feeds_create_request() ->
    openapi_catalogs_retail_feeds_create_request([]).

openapi_catalogs_retail_feeds_create_request(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"RETAIL">>]) }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
            , {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
            , {'default_country', openapi_country:openapi_country() }
            , {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
            , {'default_locale', openapi_catalogs_creative_assets_feeds_create_request_default_locale:openapi_catalogs_creative_assets_feeds_create_request_default_locale() }
            , {'format', openapi_catalogs_format:openapi_catalogs_format() }
            , {'location', binary() }
            , {'name', binary() }
            , {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
            , {'status', openapi_catalogs_status:openapi_catalogs_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

