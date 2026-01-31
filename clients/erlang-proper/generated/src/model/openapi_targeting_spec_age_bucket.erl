-module(openapi_targeting_spec_age_bucket).

-include("openapi.hrl").

-export([openapi_targeting_spec_age_bucket/0]).

-export_type([openapi_targeting_spec_age_bucket/0]).

-type openapi_targeting_spec_age_bucket() ::
  binary().

openapi_targeting_spec_age_bucket() ->
  elements([<<"18-24">>, <<"19+">>, <<"20+">>, <<"21+">>, <<"25-34">>, <<"35-44">>, <<"45-49">>, <<"50-54">>, <<"55-64">>, <<"65+">>]).

