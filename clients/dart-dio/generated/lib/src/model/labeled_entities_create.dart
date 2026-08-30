//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'labeled_entities_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [entityIds] - Entity IDs to apply label to.
@BuiltValue()
abstract class LabeledEntitiesCreate implements Built<LabeledEntitiesCreate, LabeledEntitiesCreateBuilder> {
  /// Entity IDs to apply label to.
  @BuiltValueField(wireName: r'entity_ids')
  BuiltList<String> get entityIds;

  LabeledEntitiesCreate._();

  factory LabeledEntitiesCreate([void updates(LabeledEntitiesCreateBuilder b)]) = _$LabeledEntitiesCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabeledEntitiesCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabeledEntitiesCreate> get serializer => _$LabeledEntitiesCreateSerializer();
}

class _$LabeledEntitiesCreateSerializer implements PrimitiveSerializer<LabeledEntitiesCreate> {
  @override
  final Iterable<Type> types = const [LabeledEntitiesCreate, _$LabeledEntitiesCreate];

  @override
  final String wireName = r'LabeledEntitiesCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabeledEntitiesCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'entity_ids';
    yield serializers.serialize(
      object.entityIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LabeledEntitiesCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabeledEntitiesCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'entity_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.entityIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabeledEntitiesCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabeledEntitiesCreateBuilder();
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

