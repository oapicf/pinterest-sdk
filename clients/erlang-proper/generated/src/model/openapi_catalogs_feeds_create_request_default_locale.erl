-module(openapi_catalogs_feeds_create_request_default_locale).

-include("openapi.hrl").

-export([openapi_catalogs_feeds_create_request_default_locale/0]).

-export([openapi_catalogs_feeds_create_request_default_locale/1]).

-export_type([openapi_catalogs_feeds_create_request_default_locale/0]).

-type openapi_catalogs_feeds_create_request_default_locale() ::
  [ 
  ].


openapi_catalogs_feeds_create_request_default_locale() ->
    openapi_catalogs_feeds_create_request_default_locale([]).

openapi_catalogs_feeds_create_request_default_locale(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

