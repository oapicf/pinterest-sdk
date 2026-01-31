-module(openapi_age_trends_bucket).

-include("openapi.hrl").

-export([openapi_age_trends_bucket/0]).

-export_type([openapi_age_trends_bucket/0]).

-type openapi_age_trends_bucket() ::
  binary().

openapi_age_trends_bucket() ->
  elements([<<"18-24">>, <<"25-34">>, <<"35-44">>, <<"45-49">>, <<"50-54">>, <<"55-64">>, <<"65+">>]).

