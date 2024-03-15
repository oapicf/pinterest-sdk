-module(openapi_catalogs_product_group_type).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_type/0]).

-export_type([openapi_catalogs_product_group_type/0]).

-type openapi_catalogs_product_group_type() ::
  binary().

openapi_catalogs_product_group_type() ->
  elements([<<"MERCHANT_CREATED">>, <<"ALL_PRODUCTS">>, <<"BEST_DEALS">>, <<"PINNER_FAVORITES">>, <<"TOP_SELLERS">>, <<"BACK_IN_STOCK">>, <<"NEW_ARRIVALS">>, <<"SHOPIFY_COLLECTIONS">>, <<"I2PC">>]).

