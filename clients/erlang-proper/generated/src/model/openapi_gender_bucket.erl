-module(openapi_gender_bucket).

-include("openapi.hrl").

-export([openapi_gender_bucket/0]).

-export_type([openapi_gender_bucket/0]).

-type openapi_gender_bucket() ::
  binary().

openapi_gender_bucket() ->
  elements([<<"MALE">>, <<"FEMALE">>, <<"UNSPECIFIED">>]).

