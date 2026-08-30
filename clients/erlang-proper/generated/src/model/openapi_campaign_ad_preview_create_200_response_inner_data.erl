-module(openapi_campaign_ad_preview_create_200_response_inner_data).

-include("openapi.hrl").

-export([openapi_campaign_ad_preview_create_200_response_inner_data/0]).

-export([openapi_campaign_ad_preview_create_200_response_inner_data/1]).

-export_type([openapi_campaign_ad_preview_create_200_response_inner_data/0]).

-type openapi_campaign_ad_preview_create_200_response_inner_data() ::
  [ {'ad_account_id', binary() }
  | {'ad_group_id', binary() }
  | {'client_id', integer() }
  | {'expires_at', integer() }
  | {'is_active', boolean() }
  | {'pin_id', integer() }
  | {'pin_promotion_id', integer() }
  | {'promoted_product_group_id', integer() }
  | {'url', binary() }
  | {'user_id', integer() }
  | {'uuid', binary() }
  | {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
  ].


openapi_campaign_ad_preview_create_200_response_inner_data() ->
    openapi_campaign_ad_preview_create_200_response_inner_data([]).

openapi_campaign_ad_preview_create_200_response_inner_data(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'ad_group_id', binary() }
            , {'client_id', integer() }
            , {'expires_at', integer() }
            , {'is_active', boolean() }
            , {'pin_id', integer() }
            , {'pin_promotion_id', integer() }
            , {'promoted_product_group_id', integer() }
            , {'url', binary() }
            , {'user_id', integer() }
            , {'uuid', binary() }
            , {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

