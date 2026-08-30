-module(openapi_business_membership_member).

-include("openapi.hrl").

-export([openapi_business_membership_member/0]).

-export([openapi_business_membership_member/1]).

-export_type([openapi_business_membership_member/0]).

-type openapi_business_membership_member() ::
  [ {'business_role', openapi_business_role_for_members:openapi_business_role_for_members() }
  | {'member_id', binary() }
  ].


openapi_business_membership_member() ->
    openapi_business_membership_member([]).

openapi_business_membership_member(Fields) ->
  Default = [ {'business_role', openapi_business_role_for_members:openapi_business_role_for_members() }
            , {'member_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

