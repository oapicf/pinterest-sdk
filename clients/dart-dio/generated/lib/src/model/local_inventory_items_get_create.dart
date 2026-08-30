//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_id_store_code_pair.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_items_get_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [itemFilters] - Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
@BuiltValue()
abstract class LocalInventoryItemsGetCreate implements Built<LocalInventoryItemsGetCreate, LocalInventoryItemsGetCreateBuilder> {
  /// Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
  @BuiltValueField(wireName: r'item_filters')
  BuiltList<ItemIdStoreCodePair> get itemFilters;

  LocalInventoryItemsGetCreate._();

  factory LocalInventoryItemsGetCreate([void updates(LocalInventoryItemsGetCreateBuilder b)]) = _$LocalInventoryItemsGetCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryItemsGetCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryItemsGetCreate> get serializer => _$LocalInventoryItemsGetCreateSerializer();
}

class _$LocalInventoryItemsGetCreateSerializer implements PrimitiveSerializer<LocalInventoryItemsGetCreate> {
  @override
  final Iterable<Type> types = const [LocalInventoryItemsGetCreate, _$LocalInventoryItemsGetCreate];

  @override
  final String wireName = r'LocalInventoryItemsGetCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryItemsGetCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'item_filters';
    yield serializers.serialize(
      object.itemFilters,
      specifiedType: const FullType(BuiltList, [FullType(ItemIdStoreCodePair)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalInventoryItemsGetCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryItemsGetCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'item_filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemIdStoreCodePair)]),
          ) as BuiltList<ItemIdStoreCodePair>;
          result.itemFilters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocalInventoryItemsGetCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryItemsGetCreateBuilder();
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

