-module(openapi_product_group_promotions_update_with_required_body).

-include("openapi.hrl").

-export([openapi_product_group_promotions_update_with_required_body/0]).

-export([openapi_product_group_promotions_update_with_required_body/1]).

-export_type([openapi_product_group_promotions_update_with_required_body/0]).

-type openapi_product_group_promotions_update_with_required_body() ::
  [ {'ad_group_id', binary() }
  | {'product_group_promotion', list(openapi_product_group_promotion:openapi_product_group_promotion()) }
  ].


openapi_product_group_promotions_update_with_required_body() ->
    openapi_product_group_promotions_update_with_required_body([]).

openapi_product_group_promotions_update_with_required_body(Fields) ->
  Default = [ {'ad_group_id', binary() }
            , {'product_group_promotion', list(openapi_product_group_promotion:openapi_product_group_promotion()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

