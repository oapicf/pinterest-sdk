-module(openapi_audience_category).

-export([encode/1]).

-export_type([openapi_audience_category/0]).

-type openapi_audience_category() ::
    #{ 'key' => binary(),
       'name' => binary(),
       'ratio' => integer(),
       'index' => integer(),
       'id' => binary(),
       'subcategories' => list()
     }.

encode(#{ 'key' := Key,
          'name' := Name,
          'ratio' := Ratio,
          'index' := Index,
          'id' := Id,
          'subcategories' := Subcategories
        }) ->
    #{ 'key' => Key,
       'name' => Name,
       'ratio' => Ratio,
       'index' => Index,
       'id' => Id,
       'subcategories' => Subcategories
     }.
