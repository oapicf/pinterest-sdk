-module(openapi_trending_keyword_demographics_age_distribution).

-include("openapi.hrl").

-export([openapi_trending_keyword_demographics_age_distribution/0]).

-export([openapi_trending_keyword_demographics_age_distribution/1]).

-export_type([openapi_trending_keyword_demographics_age_distribution/0]).

-type openapi_trending_keyword_demographics_age_distribution() ::
  [ {'age_distribution', binary() }
  ].


openapi_trending_keyword_demographics_age_distribution() ->
    openapi_trending_keyword_demographics_age_distribution([]).

openapi_trending_keyword_demographics_age_distribution(Fields) ->
  Default = [ {'age_distribution', elements([<<"18-24">>, <<"25-34">>, <<"35-44">>, <<"45-49">>, <<"50-54">>, <<"55-64">>, <<"65+">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

