-module(openapi_trending_keyword_demographics).

-include("openapi.hrl").

-export([openapi_trending_keyword_demographics/0]).

-export([openapi_trending_keyword_demographics/1]).

-export_type([openapi_trending_keyword_demographics/0]).

-type openapi_trending_keyword_demographics() ::
  [ {'age_distribution', openapi_trending_keyword_demographics_age_distribution:openapi_trending_keyword_demographics_age_distribution() }
  | {'gender_distribution', openapi_trending_keyword_demographics_gender_distribution:openapi_trending_keyword_demographics_gender_distribution() }
  ].


openapi_trending_keyword_demographics() ->
    openapi_trending_keyword_demographics([]).

openapi_trending_keyword_demographics(Fields) ->
  Default = [ {'age_distribution', openapi_trending_keyword_demographics_age_distribution:openapi_trending_keyword_demographics_age_distribution() }
            , {'gender_distribution', openapi_trending_keyword_demographics_gender_distribution:openapi_trending_keyword_demographics_gender_distribution() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

