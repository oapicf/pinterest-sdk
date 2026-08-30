-module(openapi_entity_history).

-export([encode/1]).

-export_type([openapi_entity_history/0]).

-type openapi_entity_history() ::
    #{ 'change_timestamp' => integer(),
       'data_changes' => list(),
       'entity_id' => binary(),
       'entity_name' => binary(),
       'ldap' => binary(),
       'operation' => openapi_change_history_operation_type:openapi_change_history_operation_type(),
       'user_id' => binary()
     }.

encode(#{ 'change_timestamp' := ChangeTimestamp,
          'data_changes' := DataChanges,
          'entity_id' := EntityId,
          'entity_name' := EntityName,
          'ldap' := Ldap,
          'operation' := Operation,
          'user_id' := UserId
        }) ->
    #{ 'change_timestamp' => ChangeTimestamp,
       'data_changes' => DataChanges,
       'entity_id' => EntityId,
       'entity_name' => EntityName,
       'ldap' => Ldap,
       'operation' => Operation,
       'user_id' => UserId
     }.
