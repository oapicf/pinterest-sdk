-module(openapi_ad_account).

-include("openapi.hrl").

-export([openapi_ad_account/0]).

-export([openapi_ad_account/1]).

-export_type([openapi_ad_account/0]).

-type openapi_ad_account() ::
  [ {'country', openapi_country:openapi_country() }
  | {'created_time', integer() }
  | {'currency', openapi_currency:openapi_currency() }
  | {'id', binary() }
  | {'name', binary() }
  | {'owner', openapi_ad_account_owner:openapi_ad_account_owner() }
  | {'permissions', list(openapi_business_access_role:openapi_business_access_role()) }
  | {'time_zone', binary() }
  | {'updated_time', integer() }
  ].


openapi_ad_account() ->
    openapi_ad_account([]).

openapi_ad_account(Fields) ->
  Default = [ {'country', openapi_country:openapi_country() }
            , {'created_time', integer() }
            , {'currency', openapi_currency:openapi_currency() }
            , {'id', binary() }
            , {'name', binary() }
            , {'owner', openapi_ad_account_owner:openapi_ad_account_owner() }
            , {'permissions', list(openapi_business_access_role:openapi_business_access_role()) }
            , {'time_zone', binary() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

