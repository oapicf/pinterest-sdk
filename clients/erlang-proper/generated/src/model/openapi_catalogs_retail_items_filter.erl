-module(openapi_catalogs_retail_items_filter).

-include("openapi.hrl").

-export([openapi_catalogs_retail_items_filter/0]).

-export([openapi_catalogs_retail_items_filter/1]).

-export_type([openapi_catalogs_retail_items_filter/0]).

-type openapi_catalogs_retail_items_filter() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'item_ids', list(binary()) }
  ].


openapi_catalogs_retail_items_filter() ->
    openapi_catalogs_retail_items_filter([]).

openapi_catalogs_retail_items_filter(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"RETAIL">>]) }
            , {'item_ids', list(binary(), 1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

