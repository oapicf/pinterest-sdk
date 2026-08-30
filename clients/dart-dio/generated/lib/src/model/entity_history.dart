//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/entity_data_change_history.dart';
import 'package:openapi/src/model/change_history_operation_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'entity_history.g.dart';

/// EntityHistory
///
/// Properties:
/// * [changeTimestamp] - A Unix timestamp representing the time of the change in seconds
/// * [dataChanges] - Properties associated with a particular change to an entity's data
/// * [entityId] - The id of the entity that was changed
/// * [entityName] - The name of the entity that was changed
/// * [ldap] - The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
/// * [operation] - The type of operation that caused the change
/// * [userId] - The id of the user who initiated the change
@BuiltValue()
abstract class EntityHistory implements Built<EntityHistory, EntityHistoryBuilder> {
  /// A Unix timestamp representing the time of the change in seconds
  @BuiltValueField(wireName: r'change_timestamp')
  int? get changeTimestamp;

  /// Properties associated with a particular change to an entity's data
  @BuiltValueField(wireName: r'data_changes')
  BuiltList<EntityDataChangeHistory>? get dataChanges;

  /// The id of the entity that was changed
  @BuiltValueField(wireName: r'entity_id')
  String? get entityId;

  /// The name of the entity that was changed
  @BuiltValueField(wireName: r'entity_name')
  String? get entityName;

  /// The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
  @BuiltValueField(wireName: r'ldap')
  String? get ldap;

  /// The type of operation that caused the change
  @BuiltValueField(wireName: r'operation')
  ChangeHistoryOperationType? get operation;
  // enum operationEnum {  CREATE,  UPDATE,  DELETE,  };

  /// The id of the user who initiated the change
  @BuiltValueField(wireName: r'user_id')
  String? get userId;

  EntityHistory._();

  factory EntityHistory([void updates(EntityHistoryBuilder b)]) = _$EntityHistory;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EntityHistoryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EntityHistory> get serializer => _$EntityHistorySerializer();
}

class _$EntityHistorySerializer implements PrimitiveSerializer<EntityHistory> {
  @override
  final Iterable<Type> types = const [EntityHistory, _$EntityHistory];

  @override
  final String wireName = r'EntityHistory';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EntityHistory object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.changeTimestamp != null) {
      yield r'change_timestamp';
      yield serializers.serialize(
        object.changeTimestamp,
        specifiedType: const FullType(int),
      );
    }
    if (object.dataChanges != null) {
      yield r'data_changes';
      yield serializers.serialize(
        object.dataChanges,
        specifiedType: const FullType(BuiltList, [FullType(EntityDataChangeHistory)]),
      );
    }
    if (object.entityId != null) {
      yield r'entity_id';
      yield serializers.serialize(
        object.entityId,
        specifiedType: const FullType(String),
      );
    }
    if (object.entityName != null) {
      yield r'entity_name';
      yield serializers.serialize(
        object.entityName,
        specifiedType: const FullType(String),
      );
    }
    if (object.ldap != null) {
      yield r'ldap';
      yield serializers.serialize(
        object.ldap,
        specifiedType: const FullType(String),
      );
    }
    if (object.operation != null) {
      yield r'operation';
      yield serializers.serialize(
        object.operation,
        specifiedType: const FullType(ChangeHistoryOperationType),
      );
    }
    if (object.userId != null) {
      yield r'user_id';
      yield serializers.serialize(
        object.userId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    EntityHistory object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EntityHistoryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'change_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.changeTimestamp = valueDes;
          break;
        case r'data_changes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(EntityDataChangeHistory)]),
          ) as BuiltList<EntityDataChangeHistory>?;
          if (valueDes == null) continue;
          result.dataChanges.replace(valueDes);
          break;
        case r'entity_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.entityId = valueDes;
          break;
        case r'entity_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.entityName = valueDes;
          break;
        case r'ldap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.ldap = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ChangeHistoryOperationType),
          ) as ChangeHistoryOperationType?;
          if (valueDes == null) continue;
          result.operation = valueDes;
          break;
        case r'user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EntityHistory deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EntityHistoryBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

