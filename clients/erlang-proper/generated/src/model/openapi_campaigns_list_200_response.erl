-module(openapi_campaigns_list_200_response).

-include("openapi.hrl").

-export([openapi_campaigns_list_200_response/0]).

-export([openapi_campaigns_list_200_response/1]).

-export_type([openapi_campaigns_list_200_response/0]).

-type openapi_campaigns_list_200_response() ::
  [ {'items', list(openapi_campaign_response:openapi_campaign_response()) }
  | {'bookmark', binary() }
  ].


openapi_campaigns_list_200_response() ->
    openapi_campaigns_list_200_response([]).

openapi_campaigns_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_campaign_response:openapi_campaign_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

