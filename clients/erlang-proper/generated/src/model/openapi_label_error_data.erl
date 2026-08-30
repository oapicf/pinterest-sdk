-module(openapi_label_error_data).

-include("openapi.hrl").

-export([openapi_label_error_data/0]).

-export([openapi_label_error_data/1]).

-export_type([openapi_label_error_data/0]).

-type openapi_label_error_data() ::
  [ {'id', binary() }
  | {'label_type', openapi_nullable_label_type:openapi_nullable_label_type() }
  | {'status', openapi_nullable_label_status:openapi_nullable_label_status() }
  | {'value', binary() }
  ].


openapi_label_error_data() ->
    openapi_label_error_data([]).

openapi_label_error_data(Fields) ->
  Default = [ {'id', binary() }
            , {'label_type', openapi_nullable_label_type:openapi_nullable_label_type() }
            , {'status', openapi_nullable_label_status:openapi_nullable_label_status() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

