-module(openapi_update_business_memberships_response).

-include("openapi.hrl").

-export([openapi_update_business_memberships_response/0]).

-export([openapi_update_business_memberships_response/1]).

-export_type([openapi_update_business_memberships_response/0]).

-type openapi_update_business_memberships_response() ::
  [ {'items', list(openapi_business_membership_member:openapi_business_membership_member()) }
  ].


openapi_update_business_memberships_response() ->
    openapi_update_business_memberships_response([]).

openapi_update_business_memberships_response(Fields) ->
  Default = [ {'items', list(openapi_business_membership_member:openapi_business_membership_member()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

