//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_attributes.dart';
import 'package:openapi/src/model/catalogs_hotel_item_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_item_error_response.dart';
import 'package:openapi/src/model/catalogs_retail_item_error_response.dart';
import 'package:openapi/src/model/catalogs_creative_assets_item_response.dart';
import 'package:openapi/src/model/catalogs_retail_item_response.dart';
import 'package:openapi/src/model/catalogs_hotel_item_error_response.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'item_response.g.dart';

/// Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
///
/// Properties:
/// * [attributes] 
/// * [catalogType] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [itemResponseKind] - Discriminator literal identifying this leaf inside an `ItemResponse` payload.
/// * [pins] - The pins mapped to the item
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [errors] - Array with the errors for the item id requested
@BuiltValue()
abstract class ItemResponse implements Built<ItemResponse, ItemResponseBuilder> {
  /// One Of [CatalogsCreativeAssetsItemErrorResponse], [CatalogsCreativeAssetsItemResponse], [CatalogsHotelItemErrorResponse], [CatalogsHotelItemResponse], [CatalogsRetailItemErrorResponse], [CatalogsRetailItemResponse]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'item_response_kind';

  static const Map<String, Type> discriminatorMapping = {
    r'creative_assets_item': CatalogsCreativeAssetsItemResponse,
    r'creative_assets_item_error': CatalogsCreativeAssetsItemErrorResponse,
    r'hotel_item': CatalogsHotelItemResponse,
    r'hotel_item_error': CatalogsHotelItemErrorResponse,
    r'retail_item': CatalogsRetailItemResponse,
    r'retail_item_error': CatalogsRetailItemErrorResponse,
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
        if (this is CatalogsCreativeAssetsItemResponse) {
            return r'creative_assets_item';
        }
        if (this is CatalogsCreativeAssetsItemErrorResponse) {
            return r'creative_assets_item_error';
        }
        if (this is CatalogsHotelItemResponse) {
            return r'hotel_item';
        }
        if (this is CatalogsHotelItemErrorResponse) {
            return r'hotel_item_error';
        }
        if (this is CatalogsRetailItemResponse) {
            return r'retail_item';
        }
        if (this is CatalogsRetailItemErrorResponse) {
            return r'retail_item_error';
        }
        return null;
    }
}
extension ItemResponseBuilderDiscriminatorExt on ItemResponseBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemResponseBuilder) {
            return r'creative_assets_item';
        }
        if (this is CatalogsCreativeAssetsItemErrorResponseBuilder) {
            return r'creative_assets_item_error';
        }
        if (this is CatalogsHotelItemResponseBuilder) {
            return r'hotel_item';
        }
        if (this is CatalogsHotelItemErrorResponseBuilder) {
            return r'hotel_item_error';
        }
        if (this is CatalogsRetailItemResponseBuilder) {
            return r'retail_item';
        }
        if (this is CatalogsRetailItemErrorResponseBuilder) {
            return r'retail_item_error';
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
    final oneOfTypes = [CatalogsCreativeAssetsItemResponse, CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemResponse, CatalogsRetailItemErrorResponse, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'creative_assets_item':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsItemResponse),
        ) as CatalogsCreativeAssetsItemResponse;
        oneOfType = CatalogsCreativeAssetsItemResponse;
        break;
      case r'creative_assets_item_error':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsItemErrorResponse),
        ) as CatalogsCreativeAssetsItemErrorResponse;
        oneOfType = CatalogsCreativeAssetsItemErrorResponse;
        break;
      case r'hotel_item':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelItemResponse),
        ) as CatalogsHotelItemResponse;
        oneOfType = CatalogsHotelItemResponse;
        break;
      case r'hotel_item_error':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelItemErrorResponse),
        ) as CatalogsHotelItemErrorResponse;
        oneOfType = CatalogsHotelItemErrorResponse;
        break;
      case r'retail_item':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailItemResponse),
        ) as CatalogsRetailItemResponse;
        oneOfType = CatalogsRetailItemResponse;
        break;
      case r'retail_item_error':
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

class ItemResponseCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const ItemResponseCatalogTypeEnum CREATIVE_ASSETS = _$itemResponseCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<ItemResponseCatalogTypeEnum> get serializer => _$itemResponseCatalogTypeEnumSerializer;

  const ItemResponseCatalogTypeEnum._(String name): super(name);

  static BuiltSet<ItemResponseCatalogTypeEnum> get values => _$itemResponseCatalogTypeEnumValues;
  static ItemResponseCatalogTypeEnum valueOf(String name) => _$itemResponseCatalogTypeEnumValueOf(name);
}

class ItemResponseItemResponseKindEnum extends EnumClass {

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  @BuiltValueEnumConst(wireName: r'creative_assets_item_error')
  static const ItemResponseItemResponseKindEnum creativeAssetsItemError = _$itemResponseItemResponseKindEnum_creativeAssetsItemError;

  static Serializer<ItemResponseItemResponseKindEnum> get serializer => _$itemResponseItemResponseKindEnumSerializer;

  const ItemResponseItemResponseKindEnum._(String name): super(name);

  static BuiltSet<ItemResponseItemResponseKindEnum> get values => _$itemResponseItemResponseKindEnumValues;
  static ItemResponseItemResponseKindEnum valueOf(String name) => _$itemResponseItemResponseKindEnumValueOf(name);
}

