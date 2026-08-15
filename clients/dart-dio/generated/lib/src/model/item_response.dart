//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_response_one_of.dart';
import 'package:openapi/src/model/catalogs_creative_assets_attributes.dart';
import 'package:openapi/src/model/item_response_one_of1.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_item_error_response.dart';
import 'package:openapi/src/model/catalogs_retail_item_error_response.dart';
import 'package:openapi/src/model/catalogs_hotel_item_error_response.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'item_response.g.dart';

/// Object describing an item record or error
///
/// Properties:
/// * [catalogType] 
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [pins] - The pins mapped to the item
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [errors] - Array with the errors for the item id requested
@BuiltValue()
abstract class ItemResponse implements Built<ItemResponse, ItemResponseBuilder> {
  /// One Of [ItemResponseOneOf], [ItemResponseOneOf1]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsItemErrorResponse,
    r'HOTEL': CatalogsHotelItemErrorResponse,
    r'RETAIL': CatalogsRetailItemErrorResponse,
    r'ItemResponse_oneOf': ItemResponseOneOf,
    r'ItemResponse_oneOf_1': ItemResponseOneOf1,
  };

  ItemResponse._();

  factory ItemResponse([void updates(ItemResponseBuilder b)]) = _$ItemResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemResponse> get serializer => _$ItemResponseSerializer();
}

extension ItemResponseDiscriminatorExt on ItemResponse {
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
        if (this is ItemResponseOneOf) {
            return r'ItemResponse_oneOf';
        }
        if (this is ItemResponseOneOf1) {
            return r'ItemResponse_oneOf_1';
        }
        return null;
    }
}
extension ItemResponseBuilderDiscriminatorExt on ItemResponseBuilder {
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
        if (this is ItemResponseOneOfBuilder) {
            return r'ItemResponse_oneOf';
        }
        if (this is ItemResponseOneOf1Builder) {
            return r'ItemResponse_oneOf_1';
        }
        return null;
    }
}

class _$ItemResponseSerializer implements PrimitiveSerializer<ItemResponse> {
  @override
  final Iterable<Type> types = const [ItemResponse, _$ItemResponse];

  @override
  final String wireName = r'ItemResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ItemResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemResponseBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(ItemResponse.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemErrorResponse, ItemResponseOneOf, ItemResponseOneOf1, ];
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
      case r'ItemResponse_oneOf':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(ItemResponseOneOf),
        ) as ItemResponseOneOf;
        oneOfType = ItemResponseOneOf;
        break;
      case r'ItemResponse_oneOf_1':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(ItemResponseOneOf1),
        ) as ItemResponseOneOf1;
        oneOfType = ItemResponseOneOf1;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

