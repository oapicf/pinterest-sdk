-module(openapi_label_bulk_update_request).

-export([encode/1]).

-export_type([openapi_label_bulk_update_request/0]).

-type openapi_label_bulk_update_request() ::
    #{ 'id' := binary(),
       'status' => binary(),
       'value' => binary()
     }.

encode(#{ 'id' := Id,
          'status' := Status,
          'value' := Value
        }) ->
    #{ 'id' => Id,
       'status' => Status,
       'value' => Value
     }.
