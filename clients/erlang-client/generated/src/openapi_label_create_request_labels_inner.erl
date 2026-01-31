-module(openapi_label_create_request_labels_inner).

-export([encode/1]).

-export_type([openapi_label_create_request_labels_inner/0]).

-type openapi_label_create_request_labels_inner() ::
    #{ 'label_type' := openapi_label_type:openapi_label_type(),
       'value' := binary()
     }.

encode(#{ 'label_type' := LabelType,
          'value' := Value
        }) ->
    #{ 'label_type' => LabelType,
       'value' => Value
     }.
