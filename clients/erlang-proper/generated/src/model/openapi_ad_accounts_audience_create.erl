-module(openapi_ad_accounts_audience_create).

-include("openapi.hrl").

-export([openapi_ad_accounts_audience_create/0]).

-export([openapi_ad_accounts_audience_create/1]).

-export_type([openapi_ad_accounts_audience_create/0]).

-type openapi_ad_accounts_audience_create() ::
  [ {'ad_account_id', binary() }
  | {'audience_type', openapi_audience_type:openapi_audience_type() }
  | {'description', binary() }
  | {'name', binary() }
  | {'rule', openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule() }
  ].


openapi_ad_accounts_audience_create() ->
    openapi_ad_accounts_audience_create([]).

openapi_ad_accounts_audience_create(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'audience_type', openapi_audience_type:openapi_audience_type() }
            , {'description', binary() }
            , {'name', binary() }
            , {'rule', openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

