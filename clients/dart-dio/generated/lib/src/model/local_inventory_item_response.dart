//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_availability.dart';
import 'package:openapi/src/model/store_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_item_response.g.dart';

/// Local inventory item response
///
/// Properties:
/// * [adLink] - Ad link for the item
/// * [availability] - Availability status of the item
/// * [createdAt] - The millisecond timestamp when the local inventory item was created
/// * [itemId] - The catalog item id in the merchant namespace
/// * [lastUpdatedTime] - The millisecond timestamp when the local inventory item was lastly modified by the merchant.
/// * [price] - The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
/// * [salePrice] - The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
/// * [storeMetadata] - Store metadata for this local inventory item
@BuiltValue()
abstract class LocalInventoryItemResponse implements Built<LocalInventoryItemResponse, LocalInventoryItemResponseBuilder> {
  /// Ad link for the item
  @BuiltValueField(wireName: r'ad_link')
  String? get adLink;

  /// Availability status of the item
  @BuiltValueField(wireName: r'availability')
  ItemAvailability? get availability;
  // enum availabilityEnum {  in stock,  out of stock,  preorder,  };

  /// The millisecond timestamp when the local inventory item was created
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The millisecond timestamp when the local inventory item was lastly modified by the merchant.
  @BuiltValueField(wireName: r'last_updated_time')
  int get lastUpdatedTime;

  /// The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  @BuiltValueField(wireName: r'price')
  String? get price;

  /// The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  @BuiltValueField(wireName: r'sale_price')
  String? get salePrice;

  /// Store metadata for this local inventory item
  @BuiltValueField(wireName: r'store_metadata')
  StoreMetadata get storeMetadata;

  LocalInventoryItemResponse._();

  factory LocalInventoryItemResponse([void updates(LocalInventoryItemResponseBuilder b)]) = _$LocalInventoryItemResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryItemResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryItemResponse> get serializer => _$LocalInventoryItemResponseSerializer();
}

class _$LocalInventoryItemResponseSerializer implements PrimitiveSerializer<LocalInventoryItemResponse> {
  @override
  final Iterable<Type> types = const [LocalInventoryItemResponse, _$LocalInventoryItemResponse];

  @override
  final String wireName = r'LocalInventoryItemResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adLink != null) {
      yield r'ad_link';
      yield serializers.serialize(
        object.adLink,
        specifiedType: const FullType(String),
      );
    }
    if (object.availability != null) {
      yield r'availability';
      yield serializers.serialize(
        object.availability,
        specifiedType: const FullType(ItemAvailability),
      );
    }
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'last_updated_time';
    yield serializers.serialize(
      object.lastUpdatedTime,
      specifiedType: const FullType(int),
    );
    if (object.price != null) {
      yield r'price';
      yield serializers.serialize(
        object.price,
        specifiedType: const FullType(String),
      );
    }
    if (object.salePrice != null) {
      yield r'sale_price';
      yield serializers.serialize(
        object.salePrice,
        specifiedType: const FullType(String),
      );
    }
    yield r'store_metadata';
    yield serializers.serialize(
      object.storeMetadata,
      specifiedType: const FullType(StoreMetadata),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalInventoryItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryItemResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adLink = valueDes;
          break;
        case r'availability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ItemAvailability),
          ) as ItemAvailability?;
          if (valueDes == null) continue;
          result.availability = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'last_updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lastUpdatedTime = valueDes;
          break;
        case r'price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.price = valueDes;
          break;
        case r'sale_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.salePrice = valueDes;
          break;
        case r'store_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StoreMetadata),
          ) as StoreMetadata;
          result.storeMetadata.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocalInventoryItemResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryItemResponseBuilder();
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

