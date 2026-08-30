-module(openapi_product_group_promotions).

-include("openapi.hrl").

-export([openapi_product_group_promotions/0]).

-export([openapi_product_group_promotions/1]).

-export_type([openapi_product_group_promotions/0]).

-type openapi_product_group_promotions() ::
  [ {'items', list(openapi_product_group_promotion_response_item:openapi_product_group_promotion_response_item()) }
  ].


openapi_product_group_promotions() ->
    openapi_product_group_promotions([]).

openapi_product_group_promotions(Fields) ->
  Default = [ {'items', list(openapi_product_group_promotion_response_item:openapi_product_group_promotion_response_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

