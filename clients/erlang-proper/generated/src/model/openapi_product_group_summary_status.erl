-module(openapi_product_group_summary_status).

-include("openapi.hrl").

-export([openapi_product_group_summary_status/0]).

-export_type([openapi_product_group_summary_status/0]).

-type openapi_product_group_summary_status() ::
  binary().

openapi_product_group_summary_status() ->
  elements([<<"RUNNING">>, <<"PAUSED">>, <<"EXCLUDED">>, <<"ARCHIVED">>]).

