-module(openapi_trending_keyword_demographics_gender_distribution).

-export([encode/1]).

-export_type([openapi_trending_keyword_demographics_gender_distribution/0]).

-type openapi_trending_keyword_demographics_gender_distribution() ::
    #{ 'gender_distribution' => binary()
     }.

encode(#{ 'gender_distribution' := GenderDistribution
        }) ->
    #{ 'gender_distribution' => GenderDistribution
     }.
