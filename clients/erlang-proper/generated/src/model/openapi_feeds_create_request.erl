-module(openapi_feeds_create_request).

-include("openapi.hrl").

-export([openapi_feeds_create_request/0]).

-export([openapi_feeds_create_request/1]).

-export_type([openapi_feeds_create_request/0]).

-type openapi_feeds_create_request() ::
  [ {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
  | {'name', binary() }
  | {'format', openapi_catalogs_format:openapi_catalogs_format() }
  | {'default_locale', openapi_catalogs_feeds_create_request_default_locale:openapi_catalogs_feeds_create_request_default_locale() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
  | {'location', binary() }
  | {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
  | {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'default_country', openapi_country:openapi_country() }
  | {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
  | {'catalog_id', binary() }
  ].


openapi_feeds_create_request() ->
    openapi_feeds_create_request([]).

openapi_feeds_create_request(Fields) ->
  Default = [ {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
            , {'name', binary() }
            , {'format', openapi_catalogs_format:openapi_catalogs_format() }
            , {'default_locale', openapi_catalogs_feeds_create_request_default_locale:openapi_catalogs_feeds_create_request_default_locale() }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
            , {'location', binary() }
            , {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
            , {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'default_country', openapi_country:openapi_country() }
            , {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

