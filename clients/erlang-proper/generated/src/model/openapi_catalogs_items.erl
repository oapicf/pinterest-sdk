-module(openapi_catalogs_items).

-include("openapi.hrl").

-export([openapi_catalogs_items/0]).

-export([openapi_catalogs_items/1]).

-export_type([openapi_catalogs_items/0]).

-type openapi_catalogs_items() ::
  [ {'items', list(openapi_item_response:openapi_item_response()) }
  ].


openapi_catalogs_items() ->
    openapi_catalogs_items([]).

openapi_catalogs_items(Fields) ->
  Default = [ {'items', list(openapi_item_response:openapi_item_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

