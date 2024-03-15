-module(openapi_catalogs_feed_credentials).

-include("openapi.hrl").

-export([openapi_catalogs_feed_credentials/0]).

-export([openapi_catalogs_feed_credentials/1]).

-export_type([openapi_catalogs_feed_credentials/0]).

-type openapi_catalogs_feed_credentials() ::
  [ {'password', binary() }
  | {'username', binary() }
  ].


openapi_catalogs_feed_credentials() ->
    openapi_catalogs_feed_credentials([]).

openapi_catalogs_feed_credentials(Fields) ->
  Default = [ {'password', binary() }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

