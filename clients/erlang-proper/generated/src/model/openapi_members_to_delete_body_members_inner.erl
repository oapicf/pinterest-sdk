-module(openapi_members_to_delete_body_members_inner).

-include("openapi.hrl").

-export([openapi_members_to_delete_body_members_inner/0]).

-export([openapi_members_to_delete_body_members_inner/1]).

-export_type([openapi_members_to_delete_body_members_inner/0]).

-type openapi_members_to_delete_body_members_inner() ::
  [ {'member_id', binary() }
  | {'business_role', openapi_business_role_for_members:openapi_business_role_for_members() }
  ].


openapi_members_to_delete_body_members_inner() ->
    openapi_members_to_delete_body_members_inner([]).

openapi_members_to_delete_body_members_inner(Fields) ->
  Default = [ {'member_id', binary() }
            , {'business_role', openapi_business_role_for_members:openapi_business_role_for_members() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

