-module(openapi_campaign_ad_preview).

-include("openapi.hrl").

-export([openapi_campaign_ad_preview/0]).

-export([openapi_campaign_ad_preview/1]).

-export_type([openapi_campaign_ad_preview/0]).

-type openapi_campaign_ad_preview() ::
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
  ].


openapi_campaign_ad_preview() ->
    openapi_campaign_ad_preview([]).

openapi_campaign_ad_preview(Fields) ->
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

