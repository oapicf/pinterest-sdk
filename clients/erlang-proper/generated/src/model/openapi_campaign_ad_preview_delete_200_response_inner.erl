-module(openapi_campaign_ad_preview_delete_200_response_inner).

-include("openapi.hrl").

-export([openapi_campaign_ad_preview_delete_200_response_inner/0]).

-export([openapi_campaign_ad_preview_delete_200_response_inner/1]).

-export_type([openapi_campaign_ad_preview_delete_200_response_inner/0]).

-type openapi_campaign_ad_preview_delete_200_response_inner() ::
  [ {'status', openapi_campaign_ad_preview_delete_200_response_inner_status:openapi_campaign_ad_preview_delete_200_response_inner_status() }
  ].


openapi_campaign_ad_preview_delete_200_response_inner() ->
    openapi_campaign_ad_preview_delete_200_response_inner([]).

openapi_campaign_ad_preview_delete_200_response_inner(Fields) ->
  Default = [ {'status', openapi_campaign_ad_preview_delete_200_response_inner_status:openapi_campaign_ad_preview_delete_200_response_inner_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

