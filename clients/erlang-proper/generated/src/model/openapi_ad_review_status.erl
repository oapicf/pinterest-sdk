-module(openapi_ad_review_status).

-include("openapi.hrl").

-export([openapi_ad_review_status/0]).

-export_type([openapi_ad_review_status/0]).

-type openapi_ad_review_status() ::
  binary().

openapi_ad_review_status() ->
  elements([<<"OTHER">>, <<"PENDING">>, <<"REJECTED">>, <<"APPROVED">>]).

