//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_attributes.dart';
import 'package:openapi/src/model/catalogs_hotel_item_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_item_response.dart';
import 'package:openapi/src/model/catalogs_retail_item_response.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'item_response_one_of.g.dart';

/// Successful item response
///
/// Properties:
/// * [catalogType] 
/// * [attributes] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [pins] - The pins mapped to the item
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
@BuiltValue()
abstract class ItemResponseOneOf implements Built<ItemResponseOneOf, ItemResponseOneOfBuilder> {
  /// One Of [CatalogsCreativeAssetsItemResponse], [CatalogsHotelItemResponse], [CatalogsRetailItemResponse]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsItemResponse,
    r'HOTEL': CatalogsHotelItemResponse,
    r'RETAIL': CatalogsRetailItemResponse,
  };

  ItemResponseOneOf._();

  factory ItemResponseOneOf([void updates(ItemResponseOneOfBuilder b)]) = _$ItemResponseOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemResponseOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemResponseOneOf> get serializer => _$ItemResponseOneOfSerializer();
}

extension ItemResponseOneOfDiscriminatorExt on ItemResponseOneOf {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemResponse) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemResponse) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemResponse) {
            return r'RETAIL';
        }
        return null;
    }
}
extension ItemResponseOneOfBuilderDiscriminatorExt on ItemResponseOneOfBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemResponseBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemResponseBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemResponseBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$ItemResponseOneOfSerializer implements PrimitiveSerializer<ItemResponseOneOf> {
  @override
  final Iterable<Type> types = const [ItemResponseOneOf, _$ItemResponseOneOf];

  @override
  final String wireName = r'ItemResponseOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemResponseOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemResponseOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ItemResponseOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemResponseOneOfBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(ItemResponseOneOf.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsItemResponse, CatalogsHotelItemResponse, CatalogsRetailItemResponse, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsItemResponse),
        ) as CatalogsCreativeAssetsItemResponse;
        oneOfType = CatalogsCreativeAssetsItemResponse;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelItemResponse),
        ) as CatalogsHotelItemResponse;
        oneOfType = CatalogsHotelItemResponse;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailItemResponse),
        ) as CatalogsRetailItemResponse;
        oneOfType = CatalogsRetailItemResponse;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

