-module(openapi_product_categories_demographic).

-export([encode/1]).

-export_type([openapi_product_categories_demographic/0]).

-type openapi_product_categories_demographic() ::
    #{ 'age' := maps:map(),
       'gender' := openapi_gender_demographics:openapi_gender_demographics()
     }.

encode(#{ 'age' := Age,
          'gender' := Gender
        }) ->
    #{ 'age' => Age,
       'gender' => Gender
     }.
