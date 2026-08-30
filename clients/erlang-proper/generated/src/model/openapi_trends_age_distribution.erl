-module(openapi_trends_age_distribution).

-include("openapi.hrl").

-export([openapi_trends_age_distribution/0]).

-export([openapi_trends_age_distribution/1]).

-export_type([openapi_trends_age_distribution/0]).

-type openapi_trends_age_distribution() ::
  [ {'age_distribution', openapi_trends_age_bucket:openapi_trends_age_bucket() }
  ].


openapi_trends_age_distribution() ->
    openapi_trends_age_distribution([]).

openapi_trends_age_distribution(Fields) ->
  Default = [ {'age_distribution', openapi_trends_age_bucket:openapi_trends_age_bucket() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

