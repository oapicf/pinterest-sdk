-module(openapi_label_error_data).

-export([encode/1]).

-export_type([openapi_label_error_data/0]).

-type openapi_label_error_data() ::
    #{ 'id' => binary(),
       'label_type' => openapi_nullable_label_type:openapi_nullable_label_type(),
       'status' => openapi_nullable_label_status:openapi_nullable_label_status(),
       'value' => binary()
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
