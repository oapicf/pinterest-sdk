-module(openapi_schedule_gender_multipliers).

-include("openapi.hrl").

-export([openapi_schedule_gender_multipliers/0]).

-export([openapi_schedule_gender_multipliers/1]).

-export_type([openapi_schedule_gender_multipliers/0]).

-type openapi_schedule_gender_multipliers() ::
  [ {'GENDER', openapi_targeting_spec_gender:openapi_targeting_spec_gender() }
  ].


openapi_schedule_gender_multipliers() ->
    openapi_schedule_gender_multipliers([]).

openapi_schedule_gender_multipliers(Fields) ->
  Default = [ {'GENDER', openapi_targeting_spec_gender:openapi_targeting_spec_gender() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

