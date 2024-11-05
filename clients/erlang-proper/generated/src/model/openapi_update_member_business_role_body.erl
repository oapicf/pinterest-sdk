-module(openapi_update_member_business_role_body).

-include("openapi.hrl").

-export([openapi_update_member_business_role_body/0]).

-export([openapi_update_member_business_role_body/1]).

-export_type([openapi_update_member_business_role_body/0]).

-type openapi_update_member_business_role_body() ::
  [ {'business_role', openapi_business_role_for_members:openapi_business_role_for_members() }
  | {'member_id', binary() }
  ].


openapi_update_member_business_role_body() ->
    openapi_update_member_business_role_body([]).

openapi_update_member_business_role_body(Fields) ->
  Default = [ {'business_role', openapi_business_role_for_members:openapi_business_role_for_members() }
            , {'member_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

