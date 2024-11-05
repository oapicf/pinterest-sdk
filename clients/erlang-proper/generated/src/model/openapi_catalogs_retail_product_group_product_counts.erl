-module(openapi_catalogs_retail_product_group_product_counts).

-include("openapi.hrl").

-export([openapi_catalogs_retail_product_group_product_counts/0]).

-export([openapi_catalogs_retail_product_group_product_counts/1]).

-export_type([openapi_catalogs_retail_product_group_product_counts/0]).

-type openapi_catalogs_retail_product_group_product_counts() ::
  [ {'catalog_type', binary() }
  | {'in_stock', integer() }
  | {'out_of_stock', integer() }
  | {'preorder', integer() }
  | {'total', integer() }
  | {'videos', integer() }
  ].


openapi_catalogs_retail_product_group_product_counts() ->
    openapi_catalogs_retail_product_group_product_counts([]).

openapi_catalogs_retail_product_group_product_counts(Fields) ->
  Default = [ {'catalog_type', elements([<<"RETAIL">>]) }
            , {'in_stock', integer() }
            , {'out_of_stock', integer() }
            , {'preorder', integer() }
            , {'total', integer() }
            , {'videos', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

