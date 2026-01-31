-module(openapi_label).

-export([encode/1]).

-export_type([openapi_label/0]).

-type openapi_label() ::
    #{ 'id' => binary(),
       'label_type' => openapi_label_type:openapi_label_type(),
       'parent_id' => binary(),
       'parent_type' => binary(),
       'status' => openapi_label_status:openapi_label_status(),
       'value' => binary()
     }.

encode(#{ 'id' := Id,
          'label_type' := LabelType,
          'parent_id' := ParentId,
          'parent_type' := ParentType,
          'status' := Status,
          'value' := Value
        }) ->
    #{ 'id' => Id,
       'label_type' => LabelType,
       'parent_id' => ParentId,
       'parent_type' => ParentType,
       'status' => Status,
       'value' => Value
     }.
