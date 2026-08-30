//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/entity_label.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'entity_label_error.g.dart';

/// EntityLabelError
///
/// Properties:
/// * [data] 
/// * [errorMessages] 
@BuiltValue()
abstract class EntityLabelError implements Built<EntityLabelError, EntityLabelErrorBuilder> {
  @BuiltValueField(wireName: r'data')
  EntityLabel? get data;

  @BuiltValueField(wireName: r'error_messages')
  BuiltList<String>? get errorMessages;

  EntityLabelError._();

  factory EntityLabelError([void updates(EntityLabelErrorBuilder b)]) = _$EntityLabelError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EntityLabelErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EntityLabelError> get serializer => _$EntityLabelErrorSerializer();
}

class _$EntityLabelErrorSerializer implements PrimitiveSerializer<EntityLabelError> {
  @override
  final Iterable<Type> types = const [EntityLabelError, _$EntityLabelError];

  @override
  final String wireName = r'EntityLabelError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EntityLabelError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(EntityLabel),
      );
    }
    if (object.errorMessages != null) {
      yield r'error_messages';
      yield serializers.serialize(
        object.errorMessages,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    EntityLabelError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EntityLabelErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EntityLabel),
          ) as EntityLabel?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'error_messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.errorMessages.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EntityLabelError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EntityLabelErrorBuilder();
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

