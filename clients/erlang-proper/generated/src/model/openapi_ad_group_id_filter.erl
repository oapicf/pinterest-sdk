-module(openapi_ad_group_id_filter).

-include("openapi.hrl").

-export([openapi_ad_group_id_filter/0]).

-export([openapi_ad_group_id_filter/1]).

-export_type([openapi_ad_group_id_filter/0]).

-type openapi_ad_group_id_filter() ::
  [ {'ad_group_ids', list(binary()) }
  ].


openapi_ad_group_id_filter() ->
    openapi_ad_group_id_filter([]).

openapi_ad_group_id_filter(Fields) ->
  Default = [ {'ad_group_ids', list(binary(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

