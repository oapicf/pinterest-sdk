-module(openapi_product_group_promotion_response).

-include("openapi.hrl").

-export([openapi_product_group_promotion_response/0]).

-export([openapi_product_group_promotion_response/1]).

-export_type([openapi_product_group_promotion_response/0]).

-type openapi_product_group_promotion_response() ::
  [ {'items', list(openapi_product_group_promotion_response_item:openapi_product_group_promotion_response_item()) }
  ].


openapi_product_group_promotion_response() ->
    openapi_product_group_promotion_response([]).

openapi_product_group_promotion_response(Fields) ->
  Default = [ {'items', list(openapi_product_group_promotion_response_item:openapi_product_group_promotion_response_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

