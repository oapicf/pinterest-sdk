//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/entity_label_status.dart';
import 'package:openapi/src/model/label_parent_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'entity_label.g.dart';

/// EntityLabel
///
/// Properties:
/// * [entityId] - Entity ID to apply label to.
/// * [entityType] 
/// * [labelId] - Label ID.
/// * [status] 
@BuiltValue()
abstract class EntityLabel implements Built<EntityLabel, EntityLabelBuilder> {
  /// Entity ID to apply label to.
  @BuiltValueField(wireName: r'entity_id')
  String get entityId;

  @BuiltValueField(wireName: r'entity_type')
  LabelParentType? get entityType;
  // enum entityTypeEnum {  CAMPAIGN,  };

  /// Label ID.
  @BuiltValueField(wireName: r'label_id')
  String get labelId;

  @BuiltValueField(wireName: r'status')
  EntityLabelStatus? get status;
  // enum statusEnum {  ACTIVE,  ARCHIVED,  NULL,  };

  EntityLabel._();

  factory EntityLabel([void updates(EntityLabelBuilder b)]) = _$EntityLabel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EntityLabelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EntityLabel> get serializer => _$EntityLabelSerializer();
}

class _$EntityLabelSerializer implements PrimitiveSerializer<EntityLabel> {
  @override
  final Iterable<Type> types = const [EntityLabel, _$EntityLabel];

  @override
  final String wireName = r'EntityLabel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EntityLabel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'entity_id';
    yield serializers.serialize(
      object.entityId,
      specifiedType: const FullType(String),
    );
    if (object.entityType != null) {
      yield r'entity_type';
      yield serializers.serialize(
        object.entityType,
        specifiedType: const FullType.nullable(LabelParentType),
      );
    }
    yield r'label_id';
    yield serializers.serialize(
      object.labelId,
      specifiedType: const FullType(String),
    );
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType.nullable(EntityLabelStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    EntityLabel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EntityLabelBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'entity_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.entityId = valueDes;
          break;
        case r'entity_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LabelParentType),
          ) as LabelParentType?;
          if (valueDes == null) continue;
          result.entityType = valueDes;
          break;
        case r'label_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.labelId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EntityLabelStatus),
          ) as EntityLabelStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EntityLabel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EntityLabelBuilder();
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

