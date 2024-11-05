-module(openapi_product_group_promotion_response_item).

-include("openapi.hrl").

-export([openapi_product_group_promotion_response_item/0]).

-export([openapi_product_group_promotion_response_item/1]).

-export_type([openapi_product_group_promotion_response_item/0]).

-type openapi_product_group_promotion_response_item() ::
  [ {'data', openapi_product_group_promotion_response_element:openapi_product_group_promotion_response_element() }
  | {'exceptions', list(openapi_exception:openapi_exception()) }
  ].


openapi_product_group_promotion_response_item() ->
    openapi_product_group_promotion_response_item([]).

openapi_product_group_promotion_response_item(Fields) ->
  Default = [ {'data', openapi_product_group_promotion_response_element:openapi_product_group_promotion_response_element() }
            , {'exceptions', list(openapi_exception:openapi_exception()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

