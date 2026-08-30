-module(openapi_catalogs_feed).

-include("openapi.hrl").

-export([openapi_catalogs_feed/0]).

-export([openapi_catalogs_feed/1]).

-export_type([openapi_catalogs_feed/0]).

-type openapi_catalogs_feed() ::
  [ {'catalog_type', binary() }
  | {'created_at', datetime() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
  | {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
  | {'default_country', openapi_country:openapi_country() }
  | {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
  | {'default_locale', binary() }
  | {'format', openapi_catalogs_format:openapi_catalogs_format() }
  | {'id', binary() }
  | {'location', binary() }
  | {'name', binary() }
  | {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
  | {'status', openapi_catalogs_status:openapi_catalogs_status() }
  | {'updated_at', datetime() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_feed() ->
    openapi_catalogs_feed([]).

openapi_catalogs_feed(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'created_at', datetime() }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
            , {'default_availability', openapi_product_availability_type:openapi_product_availability_type() }
            , {'default_country', openapi_country:openapi_country() }
            , {'default_currency', openapi_nullable_currency:openapi_nullable_currency() }
            , {'default_locale', binary() }
            , {'format', openapi_catalogs_format:openapi_catalogs_format() }
            , {'id', binary() }
            , {'location', binary() }
            , {'name', binary() }
            , {'preferred_processing_schedule', openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule() }
            , {'status', openapi_catalogs_status:openapi_catalogs_status() }
            , {'updated_at', datetime() }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

