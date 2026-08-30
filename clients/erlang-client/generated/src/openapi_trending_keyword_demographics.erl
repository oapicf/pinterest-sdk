-module(openapi_trending_keyword_demographics).

-export([encode/1]).

-export_type([openapi_trending_keyword_demographics/0]).

-type openapi_trending_keyword_demographics() ::
    #{ 'age_distribution' => openapi_trends_age_distribution:openapi_trends_age_distribution(),
       'gender_distribution' => openapi_trends_gender_distribution:openapi_trends_gender_distribution()
     }.

encode(#{ 'age_distribution' := AgeDistribution,
          'gender_distribution' := GenderDistribution
        }) ->
    #{ 'age_distribution' => AgeDistribution,
       'gender_distribution' => GenderDistribution
     }.
