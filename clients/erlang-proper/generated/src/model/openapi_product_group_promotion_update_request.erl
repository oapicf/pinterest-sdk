-module(openapi_product_group_promotion_update_request).

-include("openapi.hrl").

-export([openapi_product_group_promotion_update_request/0]).

-export([openapi_product_group_promotion_update_request/1]).

-export_type([openapi_product_group_promotion_update_request/0]).

-type openapi_product_group_promotion_update_request() ::
  [ {'ad_group_id', binary() }
  | {'product_group_promotion', list(openapi_product_group_promotion:openapi_product_group_promotion()) }
  ].


openapi_product_group_promotion_update_request() ->
    openapi_product_group_promotion_update_request([]).

openapi_product_group_promotion_update_request(Fields) ->
  Default = [ {'ad_group_id', binary() }
            , {'product_group_promotion', list(openapi_product_group_promotion:openapi_product_group_promotion()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

