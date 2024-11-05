-module(openapi_catalogs_items_request_language).

-include("openapi.hrl").

-export([openapi_catalogs_items_request_language/0]).

-export([openapi_catalogs_items_request_language/1]).

-export_type([openapi_catalogs_items_request_language/0]).

-type openapi_catalogs_items_request_language() ::
  [ 
  ].


openapi_catalogs_items_request_language() ->
    openapi_catalogs_items_request_language([]).

openapi_catalogs_items_request_language(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

