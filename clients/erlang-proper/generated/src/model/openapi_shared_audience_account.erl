-module(openapi_shared_audience_account).

-include("openapi.hrl").

-export([openapi_shared_audience_account/0]).

-export([openapi_shared_audience_account/1]).

-export_type([openapi_shared_audience_account/0]).

-type openapi_shared_audience_account() ::
  [ {'account_id', binary() }
  | {'account_name', binary() }
  | {'account_type', binary() }
  | {'shared_on_timestamp', integer() }
  ].


openapi_shared_audience_account() ->
    openapi_shared_audience_account([]).

openapi_shared_audience_account(Fields) ->
  Default = [ {'account_id', binary() }
            , {'account_name', binary() }
            , {'account_type', elements([<<"AD_ACCOUNT">>, <<"BUSINESS_ACCOUNT">>]) }
            , {'shared_on_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

