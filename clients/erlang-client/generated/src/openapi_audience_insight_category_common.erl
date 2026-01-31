-module(openapi_audience_insight_category_common).

-export([encode/1]).

-export_type([openapi_audience_insight_category_common/0]).

-type openapi_audience_insight_category_common() ::
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
