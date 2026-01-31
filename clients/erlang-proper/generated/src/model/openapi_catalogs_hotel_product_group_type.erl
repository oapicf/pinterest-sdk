-module(openapi_catalogs_hotel_product_group_type).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_product_group_type/0]).

-export_type([openapi_catalogs_hotel_product_group_type/0]).

-type openapi_catalogs_hotel_product_group_type() ::
  binary().

openapi_catalogs_hotel_product_group_type() ->
  elements([<<"MERCHANT_CREATED">>, <<"ALL_LISTINGS">>]).

