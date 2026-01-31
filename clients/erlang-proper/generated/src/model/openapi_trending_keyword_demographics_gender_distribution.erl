-module(openapi_trending_keyword_demographics_gender_distribution).

-include("openapi.hrl").

-export([openapi_trending_keyword_demographics_gender_distribution/0]).

-export([openapi_trending_keyword_demographics_gender_distribution/1]).

-export_type([openapi_trending_keyword_demographics_gender_distribution/0]).

-type openapi_trending_keyword_demographics_gender_distribution() ::
  [ {'gender_distribution', binary() }
  ].


openapi_trending_keyword_demographics_gender_distribution() ->
    openapi_trending_keyword_demographics_gender_distribution([]).

openapi_trending_keyword_demographics_gender_distribution(Fields) ->
  Default = [ {'gender_distribution', elements([<<"male">>, <<"female">>, <<"unspecified">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

