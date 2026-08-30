//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_id_store_code_pair.g.dart';

/// A pair of item_id and store_code that uniquely identifies a local inventory item
///
/// Properties:
/// * [itemId] - Catalog item id in the merchant namespace
/// * [storeCode] - Store code for the local inventory item
@BuiltValue()
abstract class ItemIdStoreCodePair implements Built<ItemIdStoreCodePair, ItemIdStoreCodePairBuilder> {
  /// Catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// Store code for the local inventory item
  @BuiltValueField(wireName: r'store_code')
  String get storeCode;

  ItemIdStoreCodePair._();

  factory ItemIdStoreCodePair([void updates(ItemIdStoreCodePairBuilder b)]) = _$ItemIdStoreCodePair;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemIdStoreCodePairBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemIdStoreCodePair> get serializer => _$ItemIdStoreCodePairSerializer();
}

class _$ItemIdStoreCodePairSerializer implements PrimitiveSerializer<ItemIdStoreCodePair> {
  @override
  final Iterable<Type> types = const [ItemIdStoreCodePair, _$ItemIdStoreCodePair];

  @override
  final String wireName = r'ItemIdStoreCodePair';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemIdStoreCodePair object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'store_code';
    yield serializers.serialize(
      object.storeCode,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemIdStoreCodePair object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemIdStoreCodePairBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'store_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.storeCode = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemIdStoreCodePair deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemIdStoreCodePairBuilder();
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

