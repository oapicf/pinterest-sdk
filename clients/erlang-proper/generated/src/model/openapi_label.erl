-module(openapi_label).

-include("openapi.hrl").

-export([openapi_label/0]).

-export([openapi_label/1]).

-export_type([openapi_label/0]).

-type openapi_label() ::
  [ {'id', binary() }
  | {'label_type', openapi_label_type:openapi_label_type() }
  | {'parent_id', binary() }
  | {'parent_type', binary() }
  | {'status', openapi_label_status:openapi_label_status() }
  | {'value', binary() }
  ].


openapi_label() ->
    openapi_label([]).

openapi_label(Fields) ->
  Default = [ {'id', binary() }
            , {'label_type', openapi_label_type:openapi_label_type() }
            , {'parent_id', binary() }
            , {'parent_type', elements([<<"CAMPAIGN">>, <<"">>]) }
            , {'status', openapi_label_status:openapi_label_status() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

