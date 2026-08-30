//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events_data_items_custom_data_contents_items.g.dart';

/// ConversionEventsDataItemsCustomDataContentsItems
///
/// Properties:
/// * [id] - The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
/// * [itemBrand] - The brand of a product.
/// * [itemBrandId] - The brand ID of a product.
/// * [itemCategory] - The category of a product.
/// * [itemName] - The name of a product.
/// * [itemPrice] - The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
/// * [quantity] - The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
@BuiltValue()
abstract class ConversionEventsDataItemsCustomDataContentsItems implements Built<ConversionEventsDataItemsCustomDataContentsItems, ConversionEventsDataItemsCustomDataContentsItemsBuilder> {
  /// The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The brand of a product.
  @BuiltValueField(wireName: r'item_brand')
  String? get itemBrand;

  /// The brand ID of a product.
  @BuiltValueField(wireName: r'item_brand_id')
  String? get itemBrandId;

  /// The category of a product.
  @BuiltValueField(wireName: r'item_category')
  String? get itemCategory;

  /// The name of a product.
  @BuiltValueField(wireName: r'item_name')
  String? get itemName;

  /// The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'item_price')
  String? get itemPrice;

  /// The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'quantity')
  int? get quantity;

  ConversionEventsDataItemsCustomDataContentsItems._();

  factory ConversionEventsDataItemsCustomDataContentsItems([void updates(ConversionEventsDataItemsCustomDataContentsItemsBuilder b)]) = _$ConversionEventsDataItemsCustomDataContentsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsDataItemsCustomDataContentsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventsDataItemsCustomDataContentsItems> get serializer => _$ConversionEventsDataItemsCustomDataContentsItemsSerializer();
}

class _$ConversionEventsDataItemsCustomDataContentsItemsSerializer implements PrimitiveSerializer<ConversionEventsDataItemsCustomDataContentsItems> {
  @override
  final Iterable<Type> types = const [ConversionEventsDataItemsCustomDataContentsItems, _$ConversionEventsDataItemsCustomDataContentsItems];

  @override
  final String wireName = r'ConversionEventsDataItemsCustomDataContentsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventsDataItemsCustomDataContentsItems object, {
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
    if (object.itemBrandId != null) {
      yield r'item_brand_id';
      yield serializers.serialize(
        object.itemBrandId,
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
    ConversionEventsDataItemsCustomDataContentsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventsDataItemsCustomDataContentsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'item_brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemBrand = valueDes;
          break;
        case r'item_brand_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemBrandId = valueDes;
          break;
        case r'item_category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemCategory = valueDes;
          break;
        case r'item_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemName = valueDes;
          break;
        case r'item_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemPrice = valueDes;
          break;
        case r'quantity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
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
  ConversionEventsDataItemsCustomDataContentsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsDataItemsCustomDataContentsItemsBuilder();
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

