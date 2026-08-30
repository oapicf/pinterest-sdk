-module(openapi_ad_account_create).

-include("openapi.hrl").

-export([openapi_ad_account_create/0]).

-export([openapi_ad_account_create/1]).

-export_type([openapi_ad_account_create/0]).

-type openapi_ad_account_create() ::
  [ {'country', openapi_country:openapi_country() }
  | {'currency', openapi_currency:openapi_currency() }
  | {'name', binary() }
  | {'owner_user_id', binary() }
  | {'time_zone', binary() }
  ].


openapi_ad_account_create() ->
    openapi_ad_account_create([]).

openapi_ad_account_create(Fields) ->
  Default = [ {'country', openapi_country:openapi_country() }
            , {'currency', openapi_currency:openapi_currency() }
            , {'name', binary() }
            , {'owner_user_id', binary() }
            , {'time_zone', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

