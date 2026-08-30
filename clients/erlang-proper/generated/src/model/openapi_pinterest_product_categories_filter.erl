-module(openapi_pinterest_product_categories_filter).

-include("openapi.hrl").

-export([openapi_pinterest_product_categories_filter/0]).

-export([openapi_pinterest_product_categories_filter/1]).

-export_type([openapi_pinterest_product_categories_filter/0]).

-type openapi_pinterest_product_categories_filter() ::
  [ {'PINTEREST_PRODUCT_CATEGORIES', openapi_catalogs_product_group_multiple_pinterest_product_category_criteria:openapi_catalogs_product_group_multiple_pinterest_product_category_criteria() }
  ].


openapi_pinterest_product_categories_filter() ->
    openapi_pinterest_product_categories_filter([]).

openapi_pinterest_product_categories_filter(Fields) ->
  Default = [ {'PINTEREST_PRODUCT_CATEGORIES', openapi_catalogs_product_group_multiple_pinterest_product_category_criteria:openapi_catalogs_product_group_multiple_pinterest_product_category_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

