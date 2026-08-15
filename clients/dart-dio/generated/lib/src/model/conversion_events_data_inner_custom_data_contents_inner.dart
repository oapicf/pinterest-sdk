//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events_data_inner_custom_data_contents_inner.g.dart';

/// ConversionEventsDataInnerCustomDataContentsInner
///
/// Properties:
/// * [id] - The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
/// * [itemBrand] - The brand of a product.
/// * [itemCategory] - The category of a product.
/// * [itemName] - The name of a product.
/// * [itemPrice] - The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
/// * [quantity] - The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
@BuiltValue()
abstract class ConversionEventsDataInnerCustomDataContentsInner implements Built<ConversionEventsDataInnerCustomDataContentsInner, ConversionEventsDataInnerCustomDataContentsInnerBuilder> {
  /// The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The brand of a product.
  @BuiltValueField(wireName: r'item_brand')
  String? get itemBrand;

  /// The category of a product.
  @BuiltValueField(wireName: r'item_category')
  String? get itemCategory;

  /// The name of a product.
  @BuiltValueField(wireName: r'item_name')
  String? get itemName;

  /// The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'item_price')
  String? get itemPrice;

  /// The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'quantity')
  int? get quantity;

  ConversionEventsDataInnerCustomDataContentsInner._();

  factory ConversionEventsDataInnerCustomDataContentsInner([void updates(ConversionEventsDataInnerCustomDataContentsInnerBuilder b)]) = _$ConversionEventsDataInnerCustomDataContentsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsDataInnerCustomDataContentsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventsDataInnerCustomDataContentsInner> get serializer => _$ConversionEventsDataInnerCustomDataContentsInnerSerializer();
}

class _$ConversionEventsDataInnerCustomDataContentsInnerSerializer implements PrimitiveSerializer<ConversionEventsDataInnerCustomDataContentsInner> {
  @override
  final Iterable<Type> types = const [ConversionEventsDataInnerCustomDataContentsInner, _$ConversionEventsDataInnerCustomDataContentsInner];

  @override
  final String wireName = r'ConversionEventsDataInnerCustomDataContentsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventsDataInnerCustomDataContentsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.itemBrand != null) {
      yield r'item_brand';
      yield serializers.serialize(
        object.itemBrand,
        specifiedType: const FullType(String),
      );
    }
    if (object.itemCategory != null) {
      yield r'item_category';
      yield serializers.serialize(
        object.itemCategory,
        specifiedType: const FullType(String),
      );
    }
    if (object.itemName != null) {
      yield r'item_name';
      yield serializers.serialize(
        object.itemName,
        specifiedType: const FullType(String),
      );
    }
    if (object.itemPrice != null) {
      yield r'item_price';
      yield serializers.serialize(
        object.itemPrice,
        specifiedType: const FullType(String),
      );
    }
    if (object.quantity != null) {
      yield r'quantity';
      yield serializers.serialize(
        object.quantity,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventsDataInnerCustomDataContentsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventsDataInnerCustomDataContentsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'item_brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemBrand = valueDes;
          break;
        case r'item_category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemCategory = valueDes;
          break;
        case r'item_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemName = valueDes;
          break;
        case r'item_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemPrice = valueDes;
          break;
        case r'quantity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.quantity = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionEventsDataInnerCustomDataContentsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsDataInnerCustomDataContentsInnerBuilder();
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

