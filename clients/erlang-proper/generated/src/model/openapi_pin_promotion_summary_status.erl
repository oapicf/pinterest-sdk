-module(openapi_pin_promotion_summary_status).

-include("openapi.hrl").

-export([openapi_pin_promotion_summary_status/0]).

-export_type([openapi_pin_promotion_summary_status/0]).

-type openapi_pin_promotion_summary_status() ::
  binary().

openapi_pin_promotion_summary_status() ->
  elements([<<"APPROVED">>, <<"PAUSED">>, <<"PENDING">>, <<"REJECTED">>, <<"ADVERTISER_DISABLED">>, <<"ARCHIVED">>, <<"DRAFT">>, <<"DELETED_DRAFT">>]).

