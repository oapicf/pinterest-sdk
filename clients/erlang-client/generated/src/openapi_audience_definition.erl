-module(openapi_audience_definition).

-export([encode/1]).

-export_type([openapi_audience_definition/0]).

-type openapi_audience_definition() ::
    #{ 'date' => binary(),
       'scope' => binary(),
       'type' => binary()
     }.

encode(#{ 'date' := Date,
          'scope' := Scope,
          'type' := Type
        }) ->
    #{ 'date' => Date,
       'scope' => Scope,
       'type' => Type
     }.
