-module(openapi_business_member_sort_by).

-include("openapi.hrl").

-export([openapi_business_member_sort_by/0]).

-export_type([openapi_business_member_sort_by/0]).

-type openapi_business_member_sort_by() ::
  binary().

openapi_business_member_sort_by() ->
  elements([<<"FULL_NAME">>, <<"BUSINESS_ROLES">>, <<"CREATED_TIME">>]).

