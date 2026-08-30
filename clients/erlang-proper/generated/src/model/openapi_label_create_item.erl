-module(openapi_label_create_item).

-include("openapi.hrl").

-export([openapi_label_create_item/0]).

-export([openapi_label_create_item/1]).

-export_type([openapi_label_create_item/0]).

-type openapi_label_create_item() ::
  [ {'label_type', openapi_label_type:openapi_label_type() }
  | {'value', binary() }
  ].


openapi_label_create_item() ->
    openapi_label_create_item([]).

openapi_label_create_item(Fields) ->
  Default = [ {'label_type', openapi_label_type:openapi_label_type() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

