-module(openapi_invite_assets_summary_item).

-include("openapi.hrl").

-export([openapi_invite_assets_summary_item/0]).

-export([openapi_invite_assets_summary_item/1]).

-export_type([openapi_invite_assets_summary_item/0]).

-type openapi_invite_assets_summary_item() ::
  [ {'id', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_invite_assets_summary_item() ->
    openapi_invite_assets_summary_item([]).

openapi_invite_assets_summary_item(Fields) ->
  Default = [ {'id', binary() }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

