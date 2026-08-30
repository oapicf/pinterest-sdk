-module(openapi_label).

-export([encode/1]).

-export_type([openapi_label/0]).

-type openapi_label() ::
    #{ 'id' := binary(),
       'label_type' := openapi_nullable_label_type:openapi_nullable_label_type(),
       'status' => openapi_nullable_label_status:openapi_nullable_label_status(),
       'value' := binary()
     }.

encode(#{ 'id' := Id,
          'label_type' := LabelType,
          'status' := Status,
          'value' := Value
        }) ->
    #{ 'id' => Id,
       'label_type' => LabelType,
       'status' => Status,
       'value' => Value
     }.
