-module(openapi_catalogs_hotel_guest_ratings).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_guest_ratings/0]).

-export([openapi_catalogs_hotel_guest_ratings/1]).

-export_type([openapi_catalogs_hotel_guest_ratings/0]).

-type openapi_catalogs_hotel_guest_ratings() ::
  [ {'score', integer() }
  | {'number_of_reviewers', integer() }
  | {'max_score', integer() }
  | {'rating_system', binary() }
  ].


openapi_catalogs_hotel_guest_ratings() ->
    openapi_catalogs_hotel_guest_ratings([]).

openapi_catalogs_hotel_guest_ratings(Fields) ->
  Default = [ {'score', integer() }
            , {'number_of_reviewers', integer() }
            , {'max_score', integer() }
            , {'rating_system', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

