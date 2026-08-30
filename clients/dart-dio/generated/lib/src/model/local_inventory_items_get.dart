//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/local_inventory_item_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_items_get.g.dart';

/// Model for getting local inventory items
///
/// Properties:
/// * [items] - Array of local inventory items
@BuiltValue()
abstract class LocalInventoryItemsGet implements Built<LocalInventoryItemsGet, LocalInventoryItemsGetBuilder> {
  /// Array of local inventory items
  @BuiltValueField(wireName: r'items')
  BuiltList<LocalInventoryItemResponse> get items;

  LocalInventoryItemsGet._();

  factory LocalInventoryItemsGet([void updates(LocalInventoryItemsGetBuilder b)]) = _$LocalInventoryItemsGet;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryItemsGetBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryItemsGet> get serializer => _$LocalInventoryItemsGetSerializer();
}

class _$LocalInventoryItemsGetSerializer implements PrimitiveSerializer<LocalInventoryItemsGet> {
  @override
  final Iterable<Type> types = const [LocalInventoryItemsGet, _$LocalInventoryItemsGet];

  @override
  final String wireName = r'LocalInventoryItemsGet';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryItemsGet object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(LocalInventoryItemResponse)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalInventoryItemsGet object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryItemsGetBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocalInventoryItemResponse)]),
          ) as BuiltList<LocalInventoryItemResponse>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocalInventoryItemsGet deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryItemsGetBuilder();
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

