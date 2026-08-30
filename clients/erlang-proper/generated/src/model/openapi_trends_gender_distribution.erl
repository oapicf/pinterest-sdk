-module(openapi_trends_gender_distribution).

-include("openapi.hrl").

-export([openapi_trends_gender_distribution/0]).

-export([openapi_trends_gender_distribution/1]).

-export_type([openapi_trends_gender_distribution/0]).

-type openapi_trends_gender_distribution() ::
  [ {'gender_distribution', openapi_trends_gender:openapi_trends_gender() }
  ].


openapi_trends_gender_distribution() ->
    openapi_trends_gender_distribution([]).

openapi_trends_gender_distribution(Fields) ->
  Default = [ {'gender_distribution', openapi_trends_gender:openapi_trends_gender() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

