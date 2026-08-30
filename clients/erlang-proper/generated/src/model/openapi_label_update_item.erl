-module(openapi_label_update_item).

-include("openapi.hrl").

-export([openapi_label_update_item/0]).

-export([openapi_label_update_item/1]).

-export_type([openapi_label_update_item/0]).

-type openapi_label_update_item() ::
  [ {'id', binary() }
  | {'status', openapi_label_status:openapi_label_status() }
  | {'value', binary() }
  ].


openapi_label_update_item() ->
    openapi_label_update_item([]).

openapi_label_update_item(Fields) ->
  Default = [ {'id', binary() }
            , {'status', openapi_label_status:openapi_label_status() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

