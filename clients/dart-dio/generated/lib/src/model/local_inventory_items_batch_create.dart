//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/local_inventory_operation.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_items_batch_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [operations] - Array of inventory operations. Up to 1000 items per request.
@BuiltValue()
abstract class LocalInventoryItemsBatchCreate implements Built<LocalInventoryItemsBatchCreate, LocalInventoryItemsBatchCreateBuilder> {
  /// Array of inventory operations. Up to 1000 items per request.
  @BuiltValueField(wireName: r'operations')
  BuiltList<LocalInventoryOperation> get operations;

  LocalInventoryItemsBatchCreate._();

  factory LocalInventoryItemsBatchCreate([void updates(LocalInventoryItemsBatchCreateBuilder b)]) = _$LocalInventoryItemsBatchCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryItemsBatchCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryItemsBatchCreate> get serializer => _$LocalInventoryItemsBatchCreateSerializer();
}

class _$LocalInventoryItemsBatchCreateSerializer implements PrimitiveSerializer<LocalInventoryItemsBatchCreate> {
  @override
  final Iterable<Type> types = const [LocalInventoryItemsBatchCreate, _$LocalInventoryItemsBatchCreate];

  @override
  final String wireName = r'LocalInventoryItemsBatchCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryItemsBatchCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'operations';
    yield serializers.serialize(
      object.operations,
      specifiedType: const FullType(BuiltList, [FullType(LocalInventoryOperation)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalInventoryItemsBatchCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryItemsBatchCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'operations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocalInventoryOperation)]),
          ) as BuiltList<LocalInventoryOperation>;
          result.operations.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocalInventoryItemsBatchCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryItemsBatchCreateBuilder();
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

