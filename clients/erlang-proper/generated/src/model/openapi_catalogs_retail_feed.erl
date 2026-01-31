-module(openapi_catalogs_retail_feed).

-include("openapi.hrl").

-export([openapi_catalogs_retail_feed/0]).

-export([openapi_catalogs_retail_feed/1]).

-export_type([openapi_catalogs_retail_feed/0]).

-type openapi_catalogs_retail_feed() ::
  [ {'created_at', datetime() }
  | {'id', binary() }
  | {'updated_at', datetime() }
  | {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
  | {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
  | {'default_country', openapi_country:openapi_country() }
  | {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
  | {'default_locale', binary() }
  | {'format', openapi_catalogs_format:openapi_catalogs_format() }
  | {'location', binary() }
  | {'name', binary() }
  | {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
  | {'status', openapi_catalogs_status:openapi_catalogs_status() }
  ].


openapi_catalogs_retail_feed() ->
    openapi_catalogs_retail_feed([]).

openapi_catalogs_retail_feed(Fields) ->
  Default = [ {'created_at', datetime() }
            , {'id', binary() }
            , {'updated_at', datetime() }
            , {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
            , {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
            , {'default_country', openapi_country:openapi_country() }
            , {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
            , {'default_locale', binary() }
            , {'format', openapi_catalogs_format:openapi_catalogs_format() }
            , {'location', binary() }
            , {'name', binary() }
            , {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
            , {'status', openapi_catalogs_status:openapi_catalogs_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

