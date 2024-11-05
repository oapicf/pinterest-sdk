-module(openapi_audience_account_type).

-include("openapi.hrl").

-export([openapi_audience_account_type/0]).

-export_type([openapi_audience_account_type/0]).

-type openapi_audience_account_type() ::
  binary().

openapi_audience_account_type() ->
  elements([<<"AD_ACCOUNT">>, <<"BUSINESS_ACCOUNT">>]).

