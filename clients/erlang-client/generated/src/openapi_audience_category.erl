-module(openapi_audience_category).

-export([encode/1]).

-export_type([openapi_audience_category/0]).

-type openapi_audience_category() ::
    #{ 'id' => binary(),
       'index' => integer(),
       'key' => binary(),
       'name' => binary(),
       'ratio' => integer(),
       'subcategories' => list()
     }.

encode(#{ 'id' := Id,
          'index' := Index,
          'key' := Key,
          'name' := Name,
          'ratio' := Ratio,
          'subcategories' := Subcategories
        }) ->
    #{ 'id' => Id,
       'index' => Index,
       'key' => Key,
       'name' => Name,
       'ratio' => Ratio,
       'subcategories' => Subcategories
     }.
