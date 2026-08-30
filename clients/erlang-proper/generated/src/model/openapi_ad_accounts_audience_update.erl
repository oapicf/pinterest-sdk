-module(openapi_ad_accounts_audience_update).

-include("openapi.hrl").

-export([openapi_ad_accounts_audience_update/0]).

-export([openapi_ad_accounts_audience_update/1]).

-export_type([openapi_ad_accounts_audience_update/0]).

-type openapi_ad_accounts_audience_update() ::
  [ {'ad_account_id', binary() }
  | {'audience_type', openapi_audience_type:openapi_audience_type() }
  | {'description', binary() }
  | {'name', binary() }
  | {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
  | {'rule', openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule() }
  ].


openapi_ad_accounts_audience_update() ->
    openapi_ad_accounts_audience_update([]).

openapi_ad_accounts_audience_update(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'audience_type', openapi_audience_type:openapi_audience_type() }
            , {'description', binary() }
            , {'name', binary() }
            , {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
            , {'rule', openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

