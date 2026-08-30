-module(openapi_trends_age_bucket).

-include("openapi.hrl").

-export([openapi_trends_age_bucket/0]).

-export_type([openapi_trends_age_bucket/0]).

-type openapi_trends_age_bucket() ::
  binary().

openapi_trends_age_bucket() ->
  elements([<<"18-24">>, <<"25-34">>, <<"35-44">>, <<"45-49">>, <<"50-54">>, <<"55-64">>, <<"65+">>]).

