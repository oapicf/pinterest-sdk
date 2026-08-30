//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/carting_retailer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'carting_product.g.dart';

/// CartingProduct
///
/// Properties:
/// * [cartingProductId] - the internal Pinterest carting product id (different from industry product id)
/// * [displayPreferredRetailersOnly] - Whether to display only the preferred retailers for the carting product
/// * [displayProductPrice] - Whether to display the price for the carting product
/// * [preferredRetailers] - A sorted array of preferred retailers for the carting product
/// * [randomizePreferredRetailers] - Whether to randomize preferred retailers for the carting product
@BuiltValue()
abstract class CartingProduct implements Built<CartingProduct, CartingProductBuilder> {
  /// the internal Pinterest carting product id (different from industry product id)
  @BuiltValueField(wireName: r'carting_product_id')
  String get cartingProductId;

  /// Whether to display only the preferred retailers for the carting product
  @BuiltValueField(wireName: r'display_preferred_retailers_only')
  bool? get displayPreferredRetailersOnly;

  /// Whether to display the price for the carting product
  @BuiltValueField(wireName: r'display_product_price')
  bool? get displayProductPrice;

  /// A sorted array of preferred retailers for the carting product
  @BuiltValueField(wireName: r'preferred_retailers')
  BuiltList<CartingRetailer>? get preferredRetailers;

  /// Whether to randomize preferred retailers for the carting product
  @BuiltValueField(wireName: r'randomize_preferred_retailers')
  bool? get randomizePreferredRetailers;

  CartingProduct._();

  factory CartingProduct([void updates(CartingProductBuilder b)]) = _$CartingProduct;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CartingProductBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CartingProduct> get serializer => _$CartingProductSerializer();
}

class _$CartingProductSerializer implements PrimitiveSerializer<CartingProduct> {
  @override
  final Iterable<Type> types = const [CartingProduct, _$CartingProduct];

  @override
  final String wireName = r'CartingProduct';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CartingProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'carting_product_id';
    yield serializers.serialize(
      object.cartingProductId,
      specifiedType: const FullType(String),
    );
    if (object.displayPreferredRetailersOnly != null) {
      yield r'display_preferred_retailers_only';
      yield serializers.serialize(
        object.displayPreferredRetailersOnly,
        specifiedType: const FullType(bool),
      );
    }
    if (object.displayProductPrice != null) {
      yield r'display_product_price';
      yield serializers.serialize(
        object.displayProductPrice,
        specifiedType: const FullType(bool),
      );
    }
    if (object.preferredRetailers != null) {
      yield r'preferred_retailers';
      yield serializers.serialize(
        object.preferredRetailers,
        specifiedType: const FullType(BuiltList, [FullType(CartingRetailer)]),
      );
    }
    if (object.randomizePreferredRetailers != null) {
      yield r'randomize_preferred_retailers';
      yield serializers.serialize(
        object.randomizePreferredRetailers,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CartingProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CartingProductBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'carting_product_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.cartingProductId = valueDes;
          break;
        case r'display_preferred_retailers_only':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.displayPreferredRetailersOnly = valueDes;
          break;
        case r'display_product_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.displayProductPrice = valueDes;
          break;
        case r'preferred_retailers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CartingRetailer)]),
          ) as BuiltList<CartingRetailer>?;
          if (valueDes == null) continue;
          result.preferredRetailers.replace(valueDes);
          break;
        case r'randomize_preferred_retailers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.randomizePreferredRetailers = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CartingProduct deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CartingProductBuilder();
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

