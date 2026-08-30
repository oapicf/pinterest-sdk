//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/entity_label.dart';
import 'package:openapi/src/model/entity_label_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'labeled_entities.g.dart';

/// LabeledEntities
///
/// Properties:
/// * [entitiesLabels] 
/// * [errors] - Labels that were not successfully applied.
@BuiltValue()
abstract class LabeledEntities implements Built<LabeledEntities, LabeledEntitiesBuilder> {
  @BuiltValueField(wireName: r'entities_labels')
  BuiltList<EntityLabel>? get entitiesLabels;

  /// Labels that were not successfully applied.
  @BuiltValueField(wireName: r'errors')
  BuiltList<EntityLabelError>? get errors;

  LabeledEntities._();

  factory LabeledEntities([void updates(LabeledEntitiesBuilder b)]) = _$LabeledEntities;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabeledEntitiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabeledEntities> get serializer => _$LabeledEntitiesSerializer();
}

class _$LabeledEntitiesSerializer implements PrimitiveSerializer<LabeledEntities> {
  @override
  final Iterable<Type> types = const [LabeledEntities, _$LabeledEntities];

  @override
  final String wireName = r'LabeledEntities';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabeledEntities object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.entitiesLabels != null) {
      yield r'entities_labels';
      yield serializers.serialize(
        object.entitiesLabels,
        specifiedType: const FullType(BuiltList, [FullType(EntityLabel)]),
      );
    }
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(EntityLabelError)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LabeledEntities object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabeledEntitiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'entities_labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(EntityLabel)]),
          ) as BuiltList<EntityLabel>?;
          if (valueDes == null) continue;
          result.entitiesLabels.replace(valueDes);
          break;
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(EntityLabelError)]),
          ) as BuiltList<EntityLabelError>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabeledEntities deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabeledEntitiesBuilder();
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

