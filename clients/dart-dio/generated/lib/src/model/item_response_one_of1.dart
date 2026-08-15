//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_item_error_response.dart';
import 'package:openapi/src/model/catalogs_retail_item_error_response.dart';
import 'package:openapi/src/model/catalogs_hotel_item_error_response.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'item_response_one_of1.g.dart';

/// Error item response
///
/// Properties:
/// * [catalogType] 
/// * [errors] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
@BuiltValue()
abstract class ItemResponseOneOf1 implements Built<ItemResponseOneOf1, ItemResponseOneOf1Builder> {
  /// One Of [CatalogsCreativeAssetsItemErrorResponse], [CatalogsHotelItemErrorResponse], [CatalogsRetailItemErrorResponse]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsItemErrorResponse,
    r'HOTEL': CatalogsHotelItemErrorResponse,
    r'RETAIL': CatalogsRetailItemErrorResponse,
  };

  ItemResponseOneOf1._();

  factory ItemResponseOneOf1([void updates(ItemResponseOneOf1Builder b)]) = _$ItemResponseOneOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemResponseOneOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemResponseOneOf1> get serializer => _$ItemResponseOneOf1Serializer();
}

extension ItemResponseOneOf1DiscriminatorExt on ItemResponseOneOf1 {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemErrorResponse) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemErrorResponse) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemErrorResponse) {
            return r'RETAIL';
        }
        return null;
    }
}
extension ItemResponseOneOf1BuilderDiscriminatorExt on ItemResponseOneOf1Builder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemErrorResponseBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemErrorResponseBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemErrorResponseBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$ItemResponseOneOf1Serializer implements PrimitiveSerializer<ItemResponseOneOf1> {
  @override
  final Iterable<Type> types = const [ItemResponseOneOf1, _$ItemResponseOneOf1];

  @override
  final String wireName = r'ItemResponseOneOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemResponseOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemResponseOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ItemResponseOneOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemResponseOneOf1Builder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(ItemResponseOneOf1.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemErrorResponse, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsItemErrorResponse),
        ) as CatalogsCreativeAssetsItemErrorResponse;
        oneOfType = CatalogsCreativeAssetsItemErrorResponse;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelItemErrorResponse),
        ) as CatalogsHotelItemErrorResponse;
        oneOfType = CatalogsHotelItemErrorResponse;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailItemErrorResponse),
        ) as CatalogsRetailItemErrorResponse;
        oneOfType = CatalogsRetailItemErrorResponse;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

