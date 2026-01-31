-module(openapi_audience_demographics).

-export([encode/1]).

-export_type([openapi_audience_demographics/0]).

-type openapi_audience_demographics() ::
    #{ 'ages' => list(),
       'countries' => list(),
       'devices' => list(),
       'genders' => list(),
       'metros' => list()
     }.

encode(#{ 'ages' := Ages,
          'countries' := Countries,
          'devices' := Devices,
          'genders' := Genders,
          'metros' := Metros
        }) ->
    #{ 'ages' => Ages,
       'countries' => Countries,
       'devices' => Devices,
       'genders' => Genders,
       'metros' => Metros
     }.
