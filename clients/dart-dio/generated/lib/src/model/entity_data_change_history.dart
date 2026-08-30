//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/change_history_data_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'entity_data_change_history.g.dart';

/// EntityDataChangeHistory
///
/// Properties:
/// * [changedFieldId] - A string identifier representing the changed field on the entity
/// * [changedFieldName] - The human readable name of the changed field on the entity
/// * [dataType] - Specifies the type of the field's data values
/// * [newDataValue] - A string representation of the value of the changed field, after the change
/// * [oldDataValue] - A string representation of the value of the changed field, before the change
@BuiltValue()
abstract class EntityDataChangeHistory implements Built<EntityDataChangeHistory, EntityDataChangeHistoryBuilder> {
  /// A string identifier representing the changed field on the entity
  @BuiltValueField(wireName: r'changed_field_id')
  String? get changedFieldId;

  /// The human readable name of the changed field on the entity
  @BuiltValueField(wireName: r'changed_field_name')
  String? get changedFieldName;

  /// Specifies the type of the field's data values
  @BuiltValueField(wireName: r'data_type')
  ChangeHistoryDataType? get dataType;
  // enum dataTypeEnum {  STRING,  NUMERIC,  MICROCURRENCY,  DATE,  BOOL,  GENDER_LIST,  AGE_BUCKET_LIST,  APPTYPE_LIST,  COUNTRY_LIST,  LOCALE_LIST,  };

  /// A string representation of the value of the changed field, after the change
  @BuiltValueField(wireName: r'new_data_value')
  String? get newDataValue;

  /// A string representation of the value of the changed field, before the change
  @BuiltValueField(wireName: r'old_data_value')
  String? get oldDataValue;

  EntityDataChangeHistory._();

  factory EntityDataChangeHistory([void updates(EntityDataChangeHistoryBuilder b)]) = _$EntityDataChangeHistory;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EntityDataChangeHistoryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EntityDataChangeHistory> get serializer => _$EntityDataChangeHistorySerializer();
}

class _$EntityDataChangeHistorySerializer implements PrimitiveSerializer<EntityDataChangeHistory> {
  @override
  final Iterable<Type> types = const [EntityDataChangeHistory, _$EntityDataChangeHistory];

  @override
  final String wireName = r'EntityDataChangeHistory';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EntityDataChangeHistory object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.changedFieldId != null) {
      yield r'changed_field_id';
      yield serializers.serialize(
        object.changedFieldId,
        specifiedType: const FullType(String),
      );
    }
    if (object.changedFieldName != null) {
      yield r'changed_field_name';
      yield serializers.serialize(
        object.changedFieldName,
        specifiedType: const FullType(String),
      );
    }
    if (object.dataType != null) {
      yield r'data_type';
      yield serializers.serialize(
        object.dataType,
        specifiedType: const FullType(ChangeHistoryDataType),
      );
    }
    if (object.newDataValue != null) {
      yield r'new_data_value';
      yield serializers.serialize(
        object.newDataValue,
        specifiedType: const FullType(String),
      );
    }
    if (object.oldDataValue != null) {
      yield r'old_data_value';
      yield serializers.serialize(
        object.oldDataValue,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    EntityDataChangeHistory object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EntityDataChangeHistoryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'changed_field_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.changedFieldId = valueDes;
          break;
        case r'changed_field_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.changedFieldName = valueDes;
          break;
        case r'data_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ChangeHistoryDataType),
          ) as ChangeHistoryDataType?;
          if (valueDes == null) continue;
          result.dataType = valueDes;
          break;
        case r'new_data_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.newDataValue = valueDes;
          break;
        case r'old_data_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.oldDataValue = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EntityDataChangeHistory deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EntityDataChangeHistoryBuilder();
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

