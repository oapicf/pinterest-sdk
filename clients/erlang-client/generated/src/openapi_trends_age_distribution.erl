-module(openapi_trends_age_distribution).

-export([encode/1]).

-export_type([openapi_trends_age_distribution/0]).

-type openapi_trends_age_distribution() ::
    #{ 'age_distribution' => openapi_trends_age_bucket:openapi_trends_age_bucket()
     }.

encode(#{ 'age_distribution' := AgeDistribution
        }) ->
    #{ 'age_distribution' => AgeDistribution
     }.
