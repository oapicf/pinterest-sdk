-module(openapi_targeting_template_keyword).

-include("openapi.hrl").

-export([openapi_targeting_template_keyword/0]).

-export([openapi_targeting_template_keyword/1]).

-export_type([openapi_targeting_template_keyword/0]).

-type openapi_targeting_template_keyword() ::
  [ {'match_type', openapi_match_type:openapi_match_type() }
  | {'value', binary() }
  ].


openapi_targeting_template_keyword() ->
    openapi_targeting_template_keyword([]).

openapi_targeting_template_keyword(Fields) ->
  Default = [ {'match_type', openapi_match_type:openapi_match_type() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

