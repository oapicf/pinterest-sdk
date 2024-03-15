-module(openapi_catalogs_hotel_guest_ratings).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_guest_ratings/0]).

-type openapi_catalogs_hotel_guest_ratings() ::
    #{ 'score' => integer(),
       'number_of_reviewers' => integer(),
       'max_score' => integer(),
       'rating_system' => binary()
     }.

encode(#{ 'score' := Score,
          'number_of_reviewers' := NumberOfReviewers,
          'max_score' := MaxScore,
          'rating_system' := RatingSystem
        }) ->
    #{ 'score' => Score,
       'number_of_reviewers' => NumberOfReviewers,
       'max_score' => MaxScore,
       'rating_system' => RatingSystem
     }.
