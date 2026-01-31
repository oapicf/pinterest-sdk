-module(openapi_trending_keyword_demographics_age_distribution).

-export([encode/1]).

-export_type([openapi_trending_keyword_demographics_age_distribution/0]).

-type openapi_trending_keyword_demographics_age_distribution() ::
    #{ 'age_distribution' => binary()
     }.

encode(#{ 'age_distribution' := AgeDistribution
        }) ->
    #{ 'age_distribution' => AgeDistribution
     }.
