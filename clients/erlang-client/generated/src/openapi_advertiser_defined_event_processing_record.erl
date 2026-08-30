-module(openapi_advertiser_defined_event_processing_record).

-export([encode/1]).

-export_type([openapi_advertiser_defined_event_processing_record/0]).

-type openapi_advertiser_defined_event_processing_record() ::
    #{ 'exceptions' => list(),
       'name' := binary(),
       'status' := binary()
     }.

encode(#{ 'exceptions' := Exceptions,
          'name' := Name,
          'status' := Status
        }) ->
    #{ 'exceptions' => Exceptions,
       'name' => Name,
       'status' => Status
     }.
