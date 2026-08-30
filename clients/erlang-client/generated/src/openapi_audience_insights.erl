-module(openapi_audience_insights).

-export([encode/1]).

-export_type([openapi_audience_insights/0]).

-type openapi_audience_insights() ::
    #{ 'categories' => list(),
       'date' => binary(),
       'demographics' => openapi_audience_demographics:openapi_audience_demographics(),
       'size' => integer(),
       'size_is_upper_bound' => boolean(),
       'type' => openapi_audience_insight_type:openapi_audience_insight_type()
     }.

encode(#{ 'categories' := Categories,
          'date' := Date,
          'demographics' := Demographics,
          'size' := Size,
          'size_is_upper_bound' := SizeIsUpperBound,
          'type' := Type
        }) ->
    #{ 'categories' => Categories,
       'date' => Date,
       'demographics' => Demographics,
       'size' => Size,
       'size_is_upper_bound' => SizeIsUpperBound,
       'type' => Type
     }.
