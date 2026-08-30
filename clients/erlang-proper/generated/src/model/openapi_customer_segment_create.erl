-module(openapi_customer_segment_create).

-include("openapi.hrl").

-export([openapi_customer_segment_create/0]).

-export([openapi_customer_segment_create/1]).

-export_type([openapi_customer_segment_create/0]).

-type openapi_customer_segment_create() ::
  [ {'audience_ids', list(binary()) }
  | {'name', binary() }
  ].


openapi_customer_segment_create() ->
    openapi_customer_segment_create([]).

openapi_customer_segment_create(Fields) ->
  Default = [ {'audience_ids', list(binary()) }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

