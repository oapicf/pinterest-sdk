-module(openapi_item_id_filter).

-include("openapi.hrl").

-export([openapi_item_id_filter/0]).

-export([openapi_item_id_filter/1]).

-export_type([openapi_item_id_filter/0]).

-type openapi_item_id_filter() ::
  [ {'ITEM_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_item_id_filter() ->
    openapi_item_id_filter([]).

openapi_item_id_filter(Fields) ->
  Default = [ {'ITEM_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

