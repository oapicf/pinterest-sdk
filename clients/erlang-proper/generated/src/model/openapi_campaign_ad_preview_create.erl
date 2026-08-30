-module(openapi_campaign_ad_preview_create).

-include("openapi.hrl").

-export([openapi_campaign_ad_preview_create/0]).

-export([openapi_campaign_ad_preview_create/1]).

-export_type([openapi_campaign_ad_preview_create/0]).

-type openapi_campaign_ad_preview_create() ::
  [ {'ad_group_id', binary() }
  ].


openapi_campaign_ad_preview_create() ->
    openapi_campaign_ad_preview_create([]).

openapi_campaign_ad_preview_create(Fields) ->
  Default = [ {'ad_group_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

