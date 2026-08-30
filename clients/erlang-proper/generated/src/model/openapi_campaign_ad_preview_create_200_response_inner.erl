-module(openapi_campaign_ad_preview_create_200_response_inner).

-include("openapi.hrl").

-export([openapi_campaign_ad_preview_create_200_response_inner/0]).

-export([openapi_campaign_ad_preview_create_200_response_inner/1]).

-export_type([openapi_campaign_ad_preview_create_200_response_inner/0]).

-type openapi_campaign_ad_preview_create_200_response_inner() ::
  [ {'data', openapi_campaign_ad_preview_create_200_response_inner_data:openapi_campaign_ad_preview_create_200_response_inner_data() }
  ].


openapi_campaign_ad_preview_create_200_response_inner() ->
    openapi_campaign_ad_preview_create_200_response_inner([]).

openapi_campaign_ad_preview_create_200_response_inner(Fields) ->
  Default = [ {'data', openapi_campaign_ad_preview_create_200_response_inner_data:openapi_campaign_ad_preview_create_200_response_inner_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

