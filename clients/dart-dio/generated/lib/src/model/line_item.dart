//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'line_item.g.dart';

/// LineItem
///
/// Properties:
/// * [productBrand] - Product brand. For example, 'Parker'.
/// * [productCategory] - Product category. For example, 'Shoes'.
/// * [productId] - Product ID. For example, 1414.
/// * [productName] - Product name. For example, 'Parker Boots'.
/// * [productPrice] - Product price. For example, '99.99'.
/// * [productQuantity] - Product quantity. For example, 2.
/// * [productVariant] - Product variant. For example, 'Red'.
/// * [productVariantId] - Product variant ID. For example, '1414-34832'.
@BuiltValue()
abstract class LineItem implements Built<LineItem, LineItemBuilder> {
  /// Product brand. For example, 'Parker'.
  @BuiltValueField(wireName: r'product_brand')
  String? get productBrand;

  /// Product category. For example, 'Shoes'.
  @BuiltValueField(wireName: r'product_category')
  String? get productCategory;

  /// Product ID. For example, 1414.
  @BuiltValueField(wireName: r'product_id')
  int? get productId;

  /// Product name. For example, 'Parker Boots'.
  @BuiltValueField(wireName: r'product_name')
  String? get productName;

  /// Product price. For example, '99.99'.
  @BuiltValueField(wireName: r'product_price')
  String? get productPrice;

  /// Product quantity. For example, 2.
  @BuiltValueField(wireName: r'product_quantity')
  int? get productQuantity;

  /// Product variant. For example, 'Red'.
  @BuiltValueField(wireName: r'product_variant')
  String? get productVariant;

  /// Product variant ID. For example, '1414-34832'.
  @BuiltValueField(wireName: r'product_variant_id')
  String? get productVariantId;

  LineItem._();

  factory LineItem([void updates(LineItemBuilder b)]) = _$LineItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LineItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LineItem> get serializer => _$LineItemSerializer();
}

class _$LineItemSerializer implements PrimitiveSerializer<LineItem> {
  @override
  final Iterable<Type> types = const [LineItem, _$LineItem];

  @override
  final String wireName = r'LineItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LineItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.productBrand != null) {
      yield r'product_brand';
      yield serializers.serialize(
        object.productBrand,
        specifiedType: const FullType(String),
      );
    }
    if (object.productCategory != null) {
      yield r'product_category';
      yield serializers.serialize(
        object.productCategory,
        specifiedType: const FullType(String),
      );
    }
    if (object.productId != null) {
      yield r'product_id';
      yield serializers.serialize(
        object.productId,
        specifiedType: const FullType(int),
      );
    }
    if (object.productName != null) {
      yield r'product_name';
      yield serializers.serialize(
        object.productName,
        specifiedType: const FullType(String),
      );
    }
    if (object.productPrice != null) {
      yield r'product_price';
      yield serializers.serialize(
        object.productPrice,
        specifiedType: const FullType(String),
      );
    }
    if (object.productQuantity != null) {
      yield r'product_quantity';
      yield serializers.serialize(
        object.productQuantity,
        specifiedType: const FullType(int),
      );
    }
    if (object.productVariant != null) {
      yield r'product_variant';
      yield serializers.serialize(
        object.productVariant,
        specifiedType: const FullType(String),
      );
    }
    if (object.productVariantId != null) {
      yield r'product_variant_id';
      yield serializers.serialize(
        object.productVariantId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LineItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LineItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'product_brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.productBrand = valueDes;
          break;
        case r'product_category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.productCategory = valueDes;
          break;
        case r'product_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.productId = valueDes;
          break;
        case r'product_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.productName = valueDes;
          break;
        case r'product_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.productPrice = valueDes;
          break;
        case r'product_quantity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.productQuantity = valueDes;
          break;
        case r'product_variant':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.productVariant = valueDes;
          break;
        case r'product_variant_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.productVariantId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LineItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LineItemBuilder();
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

