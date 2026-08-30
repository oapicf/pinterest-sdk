-module(openapi_ad_account_to_business_shared_audience).

-include("openapi.hrl").

-export([openapi_ad_account_to_business_shared_audience/0]).

-export([openapi_ad_account_to_business_shared_audience/1]).

-export_type([openapi_ad_account_to_business_shared_audience/0]).

-type openapi_ad_account_to_business_shared_audience() ::
  [ {'audience_id', binary() }
  | {'permissions', list(openapi_role:openapi_role()) }
  | {'recipient_business_ids', list(binary()) }
  ].


openapi_ad_account_to_business_shared_audience() ->
    openapi_ad_account_to_business_shared_audience([]).

openapi_ad_account_to_business_shared_audience(Fields) ->
  Default = [ {'audience_id', binary() }
            , {'permissions', list(openapi_role:openapi_role()) }
            , {'recipient_business_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

