//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_availability.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'retail_local_inventory_item_attributes_optional.g.dart';

/// Local inventory attributes for retail items (all fields optional for update/get)
///
/// Properties:
/// * [adLink] - Ad link for the item
/// * [availability] - Availability status of the item
/// * [price] - The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
/// * [salePrice] - The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
@BuiltValue()
abstract class RetailLocalInventoryItemAttributesOptional implements Built<RetailLocalInventoryItemAttributesOptional, RetailLocalInventoryItemAttributesOptionalBuilder> {
  /// Ad link for the item
  @BuiltValueField(wireName: r'ad_link')
  String? get adLink;

  /// Availability status of the item
  @BuiltValueField(wireName: r'availability')
  ItemAvailability? get availability;
  // enum availabilityEnum {  in stock,  out of stock,  preorder,  };

  /// The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  @BuiltValueField(wireName: r'price')
  String? get price;

  /// The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  @BuiltValueField(wireName: r'sale_price')
  String? get salePrice;

  RetailLocalInventoryItemAttributesOptional._();

  factory RetailLocalInventoryItemAttributesOptional([void updates(RetailLocalInventoryItemAttributesOptionalBuilder b)]) = _$RetailLocalInventoryItemAttributesOptional;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RetailLocalInventoryItemAttributesOptionalBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RetailLocalInventoryItemAttributesOptional> get serializer => _$RetailLocalInventoryItemAttributesOptionalSerializer();
}

class _$RetailLocalInventoryItemAttributesOptionalSerializer implements PrimitiveSerializer<RetailLocalInventoryItemAttributesOptional> {
  @override
  final Iterable<Type> types = const [RetailLocalInventoryItemAttributesOptional, _$RetailLocalInventoryItemAttributesOptional];

  @override
  final String wireName = r'RetailLocalInventoryItemAttributesOptional';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RetailLocalInventoryItemAttributesOptional object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    RetailLocalInventoryItemAttributesOptional object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RetailLocalInventoryItemAttributesOptionalBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RetailLocalInventoryItemAttributesOptional deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RetailLocalInventoryItemAttributesOptionalBuilder();
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

