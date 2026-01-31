-module(openapi_audience_subcategory).

-export([encode/1]).

-export_type([openapi_audience_subcategory/0]).

-type openapi_audience_subcategory() ::
    #{ 'id' => binary(),
       'index' => integer(),
       'key' => binary(),
       'name' => binary(),
       'ratio' => integer()
     }.

encode(#{ 'id' := Id,
          'index' := Index,
          'key' := Key,
          'name' := Name,
          'ratio' := Ratio
        }) ->
    #{ 'id' => Id,
       'index' => Index,
       'key' => Key,
       'name' => Name,
       'ratio' => Ratio
     }.
