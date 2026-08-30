-module(openapi_catalogs_product_group_multiple_pinterest_product_category_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_multiple_pinterest_product_category_criteria/0]).

-export([openapi_catalogs_product_group_multiple_pinterest_product_category_criteria/1]).

-export_type([openapi_catalogs_product_group_multiple_pinterest_product_category_criteria/0]).

-type openapi_catalogs_product_group_multiple_pinterest_product_category_criteria() ::
  [ {'negated', boolean() }
  | {'values', list(openapi_product_category_enum:openapi_product_category_enum()) }
  ].


openapi_catalogs_product_group_multiple_pinterest_product_category_criteria() ->
    openapi_catalogs_product_group_multiple_pinterest_product_category_criteria([]).

openapi_catalogs_product_group_multiple_pinterest_product_category_criteria(Fields) ->
  Default = [ {'negated', boolean() }
            , {'values', list(openapi_product_category_enum:openapi_product_category_enum()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

