-module(openapi_ad_account_to_business_shared_audience_update_with_required_body).

-include("openapi.hrl").

-export([openapi_ad_account_to_business_shared_audience_update_with_required_body/0]).

-export([openapi_ad_account_to_business_shared_audience_update_with_required_body/1]).

-export_type([openapi_ad_account_to_business_shared_audience_update_with_required_body/0]).

-type openapi_ad_account_to_business_shared_audience_update_with_required_body() ::
  [ {'audience_id', binary() }
  | {'operation_type', openapi_operation_type:openapi_operation_type() }
  | {'recipient_business_ids', list(binary()) }
  ].


openapi_ad_account_to_business_shared_audience_update_with_required_body() ->
    openapi_ad_account_to_business_shared_audience_update_with_required_body([]).

openapi_ad_account_to_business_shared_audience_update_with_required_body(Fields) ->
  Default = [ {'audience_id', binary() }
            , {'operation_type', openapi_operation_type:openapi_operation_type() }
            , {'recipient_business_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

