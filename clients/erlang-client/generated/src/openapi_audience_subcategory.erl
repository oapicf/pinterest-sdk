-module(openapi_audience_subcategory).

-export([encode/1]).

-export_type([openapi_audience_subcategory/0]).

-type openapi_audience_subcategory() ::
    #{ 'key' => binary(),
       'name' => binary(),
       'ratio' => integer(),
       'index' => integer(),
       'id' => binary()
     }.

encode(#{ 'key' := Key,
          'name' := Name,
          'ratio' := Ratio,
          'index' := Index,
          'id' := Id
        }) ->
    #{ 'key' => Key,
       'name' => Name,
       'ratio' => Ratio,
       'index' => Index,
       'id' => Id
     }.
