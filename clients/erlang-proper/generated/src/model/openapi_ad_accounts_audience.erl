-module(openapi_ad_accounts_audience).

-include("openapi.hrl").

-export([openapi_ad_accounts_audience/0]).

-export([openapi_ad_accounts_audience/1]).

-export_type([openapi_ad_accounts_audience/0]).

-type openapi_ad_accounts_audience() ::
  [ {'ad_account_id', binary() }
  | {'audience_type', openapi_audience_type:openapi_audience_type() }
  | {'created_by_company_name', binary() }
  | {'created_timestamp', integer() }
  | {'description', binary() }
  | {'id', binary() }
  | {'is_nca', boolean() }
  | {'name', binary() }
  | {'rule', openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule() }
  | {'size', integer() }
  | {'status', openapi_audience_status:openapi_audience_status() }
  | {'type', binary() }
  | {'updated_timestamp', integer() }
  ].


openapi_ad_accounts_audience() ->
    openapi_ad_accounts_audience([]).

openapi_ad_accounts_audience(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'audience_type', openapi_audience_type:openapi_audience_type() }
            , {'created_by_company_name', binary() }
            , {'created_timestamp', integer() }
            , {'description', binary() }
            , {'id', binary() }
            , {'is_nca', boolean() }
            , {'name', binary() }
            , {'rule', openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule() }
            , {'size', integer() }
            , {'status', openapi_audience_status:openapi_audience_status() }
            , {'type', binary() }
            , {'updated_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

