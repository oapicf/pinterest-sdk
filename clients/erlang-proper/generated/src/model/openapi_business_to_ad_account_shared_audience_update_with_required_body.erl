-module(openapi_business_to_ad_account_shared_audience_update_with_required_body).

-include("openapi.hrl").

-export([openapi_business_to_ad_account_shared_audience_update_with_required_body/0]).

-export([openapi_business_to_ad_account_shared_audience_update_with_required_body/1]).

-export_type([openapi_business_to_ad_account_shared_audience_update_with_required_body/0]).

-type openapi_business_to_ad_account_shared_audience_update_with_required_body() ::
  [ {'audience_id', binary() }
  | {'operation_type', openapi_operation_type:openapi_operation_type() }
  | {'recipient_account_ids', list(binary()) }
  ].


openapi_business_to_ad_account_shared_audience_update_with_required_body() ->
    openapi_business_to_ad_account_shared_audience_update_with_required_body([]).

openapi_business_to_ad_account_shared_audience_update_with_required_body(Fields) ->
  Default = [ {'audience_id', binary() }
            , {'operation_type', openapi_operation_type:openapi_operation_type() }
            , {'recipient_account_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

