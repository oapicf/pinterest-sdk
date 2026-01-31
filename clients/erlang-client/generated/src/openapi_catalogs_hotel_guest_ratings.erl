-module(openapi_catalogs_hotel_guest_ratings).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_guest_ratings/0]).

-type openapi_catalogs_hotel_guest_ratings() ::
    #{ 'max_score' => integer(),
       'number_of_reviewers' => integer(),
       'rating_system' => binary(),
       'score' => integer()
     }.

encode(#{ 'max_score' := MaxScore,
          'number_of_reviewers' := NumberOfReviewers,
          'rating_system' := RatingSystem,
          'score' := Score
        }) ->
    #{ 'max_score' => MaxScore,
       'number_of_reviewers' => NumberOfReviewers,
       'rating_system' => RatingSystem,
       'score' => Score
     }.
