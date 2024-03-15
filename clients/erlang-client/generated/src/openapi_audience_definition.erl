-module(openapi_audience_definition).

-export([encode/1]).

-export_type([openapi_audience_definition/0]).

-type openapi_audience_definition() ::
    #{ 'date' => binary(),
       'type' => binary(),
       'scope' => binary()
     }.

encode(#{ 'date' := Date,
          'type' := Type,
          'scope' := Scope
        }) ->
    #{ 'date' => Date,
       'type' => Type,
       'scope' => Scope
     }.
