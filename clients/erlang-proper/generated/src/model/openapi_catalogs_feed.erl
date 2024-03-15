-module(openapi_catalogs_feed).

-include("openapi.hrl").

-export([openapi_catalogs_feed/0]).

-export([openapi_catalogs_feed/1]).

-export_type([openapi_catalogs_feed/0]).

-type openapi_catalogs_feed() ::
  [ {'created_at', datetime() }
  | {'id', binary() }
  | {'updated_at', datetime() }
  | {'name', binary() }
  | {'format', openapi_catalogs_format:openapi_catalogs_format() }
  | {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
  | {'location', binary() }
  | {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
  | {'status', openapi_catalogs_status:openapi_catalogs_status() }
  | {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
  | {'default_locale', binary() }
  | {'default_country', openapi_country:openapi_country() }
  | {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_feed() ->
    openapi_catalogs_feed([]).

openapi_catalogs_feed(Fields) ->
  Default = [ {'created_at', datetime() }
            , {'id', binary() }
            , {'updated_at', datetime() }
            , {'name', binary() }
            , {'format', openapi_catalogs_format:openapi_catalogs_format() }
            , {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
            , {'location', binary() }
            , {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
            , {'status', openapi_catalogs_status:openapi_catalogs_status() }
            , {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
            , {'default_locale', binary() }
            , {'default_country', openapi_country:openapi_country() }
            , {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

