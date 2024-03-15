-module(openapi_product_group_promotions_list_200_response).

-include("openapi.hrl").

-export([openapi_product_group_promotions_list_200_response/0]).

-export([openapi_product_group_promotions_list_200_response/1]).

-export_type([openapi_product_group_promotions_list_200_response/0]).

-type openapi_product_group_promotions_list_200_response() ::
  [ {'items', list(openapi_product_group_promotion_response_item:openapi_product_group_promotion_response_item()) }
  | {'bookmark', binary() }
  ].


openapi_product_group_promotions_list_200_response() ->
    openapi_product_group_promotions_list_200_response([]).

openapi_product_group_promotions_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_product_group_promotion_response_item:openapi_product_group_promotion_response_item()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

