-module(openapi_catalogs_items_request).

-include("openapi.hrl").

-export([openapi_catalogs_items_request/0]).

-export([openapi_catalogs_items_request/1]).

-export_type([openapi_catalogs_items_request/0]).

-type openapi_catalogs_items_request() ::
  [ {'country', openapi_country:openapi_country() }
  | {'language', openapi_catalogs_items_request_language:openapi_catalogs_items_request_language() }
  | {'filters', openapi_catalogs_items_post_filters:openapi_catalogs_items_post_filters() }
  ].


openapi_catalogs_items_request() ->
    openapi_catalogs_items_request([]).

openapi_catalogs_items_request(Fields) ->
  Default = [ {'country', openapi_country:openapi_country() }
            , {'language', openapi_catalogs_items_request_language:openapi_catalogs_items_request_language() }
            , {'filters', openapi_catalogs_items_post_filters:openapi_catalogs_items_post_filters() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

