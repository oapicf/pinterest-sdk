-module(openapi_audience_insight_category_common).

-export([encode/1]).

-export_type([openapi_audience_insight_category_common/0]).

-type openapi_audience_insight_category_common() ::
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
