-module(openapi_label_update_item).

-export([encode/1]).

-export_type([openapi_label_update_item/0]).

-type openapi_label_update_item() ::
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
