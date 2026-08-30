-module(openapi_trends_gender_distribution).

-export([encode/1]).

-export_type([openapi_trends_gender_distribution/0]).

-type openapi_trends_gender_distribution() ::
    #{ 'gender_distribution' => openapi_trends_gender:openapi_trends_gender()
     }.

encode(#{ 'gender_distribution' := GenderDistribution
        }) ->
    #{ 'gender_distribution' => GenderDistribution
     }.
