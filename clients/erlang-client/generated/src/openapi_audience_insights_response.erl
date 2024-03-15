-module(openapi_audience_insights_response).

-export([encode/1]).

-export_type([openapi_audience_insights_response/0]).

-type openapi_audience_insights_response() ::
    #{ 'categories' => list(),
       'demographics' => openapi_audience_demographics:openapi_audience_demographics(),
       'type' => openapi_audience_insight_type:openapi_audience_insight_type(),
       'date' => binary(),
       'size' => integer(),
       'size_is_upper_bound' => boolean()
     }.

encode(#{ 'categories' := Categories,
          'demographics' := Demographics,
          'type' := Type,
          'date' := Date,
          'size' := Size,
          'size_is_upper_bound' := SizeIsUpperBound
        }) ->
    #{ 'categories' => Categories,
       'demographics' => Demographics,
       'type' => Type,
       'date' => Date,
       'size' => Size,
       'size_is_upper_bound' => SizeIsUpperBound
     }.
