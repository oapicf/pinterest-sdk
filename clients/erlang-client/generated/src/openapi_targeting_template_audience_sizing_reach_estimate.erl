-module(openapi_targeting_template_audience_sizing_reach_estimate).

-export([encode/1]).

-export_type([openapi_targeting_template_audience_sizing_reach_estimate/0]).

-type openapi_targeting_template_audience_sizing_reach_estimate() ::
    #{ 'estimate' => integer(),
       'lower_bound' => integer(),
       'upper_bound' => integer()
     }.

encode(#{ 'estimate' := Estimate,
          'lower_bound' := LowerBound,
          'upper_bound' := UpperBound
        }) ->
    #{ 'estimate' => Estimate,
       'lower_bound' => LowerBound,
       'upper_bound' => UpperBound
     }.
