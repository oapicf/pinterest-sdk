-module(openapi_record_counts).

-include("openapi.hrl").

-export([openapi_record_counts/0]).

-export([openapi_record_counts/1]).

-export_type([openapi_record_counts/0]).

-type openapi_record_counts() ::
  [ {'invalid', integer() }
  | {'processed', integer() }
  | {'valid', integer() }
  ].


openapi_record_counts() ->
    openapi_record_counts([]).

openapi_record_counts(Fields) ->
  Default = [ {'invalid', integer() }
            , {'processed', integer() }
            , {'valid', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

