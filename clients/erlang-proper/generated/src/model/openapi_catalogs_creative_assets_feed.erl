-module(openapi_catalogs_creative_assets_feed).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_feed/0]).

-export([openapi_catalogs_creative_assets_feed/1]).

-export_type([openapi_catalogs_creative_assets_feed/0]).

-type openapi_catalogs_creative_assets_feed() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'created_at', datetime() }
  | {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
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
  ].


openapi_catalogs_creative_assets_feed() ->
    openapi_catalogs_creative_assets_feed([]).

openapi_catalogs_creative_assets_feed(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'created_at', datetime() }
            , {'credentials', openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials() }
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

