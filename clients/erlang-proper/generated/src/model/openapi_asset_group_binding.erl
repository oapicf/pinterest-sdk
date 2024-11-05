-module(openapi_asset_group_binding).

-include("openapi.hrl").

-export([openapi_asset_group_binding/0]).

-export([openapi_asset_group_binding/1]).

-export_type([openapi_asset_group_binding/0]).

-type openapi_asset_group_binding() ::
  [ {'id', binary() }
  | {'asset_group_name', binary() }
  | {'asset_group_description', binary() }
  | {'asset_group_types', list(binary()) }
  | {'ad_accounts_ids', list(binary()) }
  | {'profiles_ids', list(binary()) }
  | {'created_time', integer() }
  | {'updated_time', integer() }
  | {'owner', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  | {'created_by', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  ].


openapi_asset_group_binding() ->
    openapi_asset_group_binding([]).

openapi_asset_group_binding(Fields) ->
  Default = [ {'id', binary() }
            , {'asset_group_name', binary() }
            , {'asset_group_description', binary() }
            , {'asset_group_types', list(binary()) }
            , {'ad_accounts_ids', list(binary()) }
            , {'profiles_ids', list(binary()) }
            , {'created_time', integer() }
            , {'updated_time', integer() }
            , {'owner', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            , {'created_by', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

