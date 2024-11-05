-module(openapi_user_business_role_binding).

-include("openapi.hrl").

-export([openapi_user_business_role_binding/0]).

-export([openapi_user_business_role_binding/1]).

-export_type([openapi_user_business_role_binding/0]).

-type openapi_user_business_role_binding() ::
  [ {'assets_summary', openapi_business_member_assets_summary:openapi_business_member_assets_summary() }
  | {'business_roles', list(binary()) }
  | {'created_by_business', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  | {'created_by_user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  | {'created_time', integer() }
  | {'id', binary() }
  | {'is_shared_partner', boolean() }
  | {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  ].


openapi_user_business_role_binding() ->
    openapi_user_business_role_binding([]).

openapi_user_business_role_binding(Fields) ->
  Default = [ {'assets_summary', openapi_business_member_assets_summary:openapi_business_member_assets_summary() }
            , {'business_roles', list(binary()) }
            , {'created_by_business', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            , {'created_by_user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            , {'created_time', integer() }
            , {'id', binary() }
            , {'is_shared_partner', boolean() }
            , {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

