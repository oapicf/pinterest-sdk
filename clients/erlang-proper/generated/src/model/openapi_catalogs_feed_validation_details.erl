-module(openapi_catalogs_feed_validation_details).

-include("openapi.hrl").

-export([openapi_catalogs_feed_validation_details/0]).

-export([openapi_catalogs_feed_validation_details/1]).

-export_type([openapi_catalogs_feed_validation_details/0]).

-type openapi_catalogs_feed_validation_details() ::
  [ {'errors', openapi_catalogs_feed_validation_errors:openapi_catalogs_feed_validation_errors() }
  | {'warnings', openapi_catalogs_feed_validation_warnings:openapi_catalogs_feed_validation_warnings() }
  ].


openapi_catalogs_feed_validation_details() ->
    openapi_catalogs_feed_validation_details([]).

openapi_catalogs_feed_validation_details(Fields) ->
  Default = [ {'errors', openapi_catalogs_feed_validation_errors:openapi_catalogs_feed_validation_errors() }
            , {'warnings', openapi_catalogs_feed_validation_warnings:openapi_catalogs_feed_validation_warnings() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

