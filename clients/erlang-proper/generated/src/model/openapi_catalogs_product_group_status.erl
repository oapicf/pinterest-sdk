-module(openapi_catalogs_product_group_status).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_status/0]).

-export_type([openapi_catalogs_product_group_status/0]).

-type openapi_catalogs_product_group_status() ::
  binary().

openapi_catalogs_product_group_status() ->
  elements([<<"ACTIVE">>, <<"INACTIVE">>]).

