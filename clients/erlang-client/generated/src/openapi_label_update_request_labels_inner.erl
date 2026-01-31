-module(openapi_label_update_request_labels_inner).

-export([encode/1]).

-export_type([openapi_label_update_request_labels_inner/0]).

-type openapi_label_update_request_labels_inner() ::
    #{ 'id' := binary(),
       'status' => openapi_label_status:openapi_label_status(),
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
