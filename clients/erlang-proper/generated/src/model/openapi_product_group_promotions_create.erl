-module(openapi_product_group_promotions_create).

-include("openapi.hrl").

-export([openapi_product_group_promotions_create/0]).

-export([openapi_product_group_promotions_create/1]).

-export_type([openapi_product_group_promotions_create/0]).

-type openapi_product_group_promotions_create() ::
  [ {'ad_group_id', binary() }
  | {'product_group_promotion', list(openapi_product_group_promotion:openapi_product_group_promotion()) }
  ].


openapi_product_group_promotions_create() ->
    openapi_product_group_promotions_create([]).

openapi_product_group_promotions_create(Fields) ->
  Default = [ {'ad_group_id', binary() }
            , {'product_group_promotion', list(openapi_product_group_promotion:openapi_product_group_promotion()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

