-module(openapi_catalogs_product_group_product_counts_vertical).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_product_counts_vertical/0]).

-export([openapi_catalogs_product_group_product_counts_vertical/1]).

-export_type([openapi_catalogs_product_group_product_counts_vertical/0]).

-type openapi_catalogs_product_group_product_counts_vertical() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'in_stock', integer() }
  | {'out_of_stock', integer() }
  | {'preorder', integer() }
  | {'total', integer() }
  | {'videos', integer() }
  ].


openapi_catalogs_product_group_product_counts_vertical() ->
    openapi_catalogs_product_group_product_counts_vertical([]).

openapi_catalogs_product_group_product_counts_vertical(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'in_stock', integer() }
            , {'out_of_stock', integer() }
            , {'preorder', integer() }
            , {'total', integer() }
            , {'videos', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

