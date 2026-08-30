-module(openapi_entity_data_change_history).

-export([encode/1]).

-export_type([openapi_entity_data_change_history/0]).

-type openapi_entity_data_change_history() ::
    #{ 'changed_field_id' => binary(),
       'changed_field_name' => binary(),
       'data_type' => openapi_change_history_data_type:openapi_change_history_data_type(),
       'new_data_value' => binary(),
       'old_data_value' => binary()
     }.

encode(#{ 'changed_field_id' := ChangedFieldId,
          'changed_field_name' := ChangedFieldName,
          'data_type' := DataType,
          'new_data_value' := NewDataValue,
          'old_data_value' := OldDataValue
        }) ->
    #{ 'changed_field_id' => ChangedFieldId,
       'changed_field_name' => ChangedFieldName,
       'data_type' => DataType,
       'new_data_value' => NewDataValue,
       'old_data_value' => OldDataValue
     }.
