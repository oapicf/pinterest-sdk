-module(openapi_campaign_ad_preview_delete_200_response_inner_status).

-include("openapi.hrl").

-export([openapi_campaign_ad_preview_delete_200_response_inner_status/0]).

-export([openapi_campaign_ad_preview_delete_200_response_inner_status/1]).

-export_type([openapi_campaign_ad_preview_delete_200_response_inner_status/0]).

-type openapi_campaign_ad_preview_delete_200_response_inner_status() ::
  [ {'statusCode', integer() }
  | {'code', integer() }
  | {'message', binary() }
  ].


openapi_campaign_ad_preview_delete_200_response_inner_status() ->
    openapi_campaign_ad_preview_delete_200_response_inner_status([]).

openapi_campaign_ad_preview_delete_200_response_inner_status(Fields) ->
  Default = [ {'statusCode', integer() }
            , {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

