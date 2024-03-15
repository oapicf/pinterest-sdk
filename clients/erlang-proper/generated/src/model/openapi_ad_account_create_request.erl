-module(openapi_ad_account_create_request).

-include("openapi.hrl").

-export([openapi_ad_account_create_request/0]).

-export([openapi_ad_account_create_request/1]).

-export_type([openapi_ad_account_create_request/0]).

-type openapi_ad_account_create_request() ::
  [ {'country', openapi_country:openapi_country() }
  | {'name', binary() }
  | {'owner_user_id', binary() }
  ].


openapi_ad_account_create_request() ->
    openapi_ad_account_create_request([]).

openapi_ad_account_create_request(Fields) ->
  Default = [ {'country', openapi_country:openapi_country() }
            , {'name', binary() }
            , {'owner_user_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

