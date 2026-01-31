-module(openapi_targeting_spec_operation_gender).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_gender/0]).

-export([openapi_targeting_spec_operation_gender/1]).

-export_type([openapi_targeting_spec_operation_gender/0]).

-type openapi_targeting_spec_operation_gender() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'values', list(openapi_targeting_spec_gender:openapi_targeting_spec_gender()) }
  ].


openapi_targeting_spec_operation_gender() ->
    openapi_targeting_spec_operation_gender([]).

openapi_targeting_spec_operation_gender(Fields) ->
  Default = [ {'field', elements([<<"GENDER">>]) }
            , {'operation', elements([<<"SET">>, <<"ADD">>, <<"REMOVE">>]) }
            , {'values', list(openapi_targeting_spec_gender:openapi_targeting_spec_gender()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

