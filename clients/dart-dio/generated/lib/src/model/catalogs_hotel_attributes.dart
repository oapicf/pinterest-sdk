//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_hotel_address.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_updatable_hotel_attributes.dart';
import 'package:openapi/src/model/catalogs_hotel_attributes_all_of_main_image.dart';
import 'package:openapi/src/model/catalogs_hotel_guest_ratings.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_attributes.g.dart';

/// CatalogsHotelAttributes
///
/// Properties:
/// * [address] 
/// * [basePrice] - Base price of the hotel room per night followed by the ISO currency code
/// * [brand] - The brand to which this hotel belongs to.
/// * [category] - The type of property. The category can be any type of internal description desired.
/// * [customLabel0] - Custom grouping of hotels
/// * [customLabel1] - Custom grouping of hotels
/// * [customLabel2] - Custom grouping of hotels
/// * [customLabel3] - Custom grouping of hotels
/// * [customLabel4] - Custom grouping of hotels
/// * [description] - Brief description of the hotel.
/// * [guestRatings] 
/// * [latitude] - Latitude of the hotel.
/// * [link] - Link to the product page
/// * [longitude] - Longitude of the hotel.
/// * [name] - The hotel's name.
/// * [neighborhood] - A list of neighborhoods where the hotel is located
/// * [salePrice] - Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
/// * [additionalImageLink] - <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
/// * [mainImage] 
@BuiltValue()
abstract class CatalogsHotelAttributes implements CatalogsUpdatableHotelAttributes, Built<CatalogsHotelAttributes, CatalogsHotelAttributesBuilder> {
  @BuiltValueField(wireName: r'main_image')
  CatalogsHotelAttributesAllOfMainImage? get mainImage;

  /// <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
  @BuiltValueField(wireName: r'additional_image_link')
  BuiltList<String>? get additionalImageLink;

  CatalogsHotelAttributes._();

  factory CatalogsHotelAttributes([void updates(CatalogsHotelAttributesBuilder b)]) = _$CatalogsHotelAttributes;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelAttributesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelAttributes> get serializer => _$CatalogsHotelAttributesSerializer();
}

class _$CatalogsHotelAttributesSerializer implements PrimitiveSerializer<CatalogsHotelAttributes> {
  @override
  final Iterable<Type> types = const [CatalogsHotelAttributes, _$CatalogsHotelAttributes];

  @override
  final String wireName = r'CatalogsHotelAttributes';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.address != null) {
      yield r'address';
      yield serializers.serialize(
        object.address,
        specifiedType: const FullType(CatalogsHotelAddress),
      );
    }
    if (object.salePrice != null) {
      yield r'sale_price';
      yield serializers.serialize(
        object.salePrice,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel4 != null) {
      yield r'custom_label_4';
      yield serializers.serialize(
        object.customLabel4,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.guestRatings != null) {
      yield r'guest_ratings';
      yield serializers.serialize(
        object.guestRatings,
        specifiedType: const FullType(CatalogsHotelGuestRatings),
      );
    }
    if (object.customLabel3 != null) {
      yield r'custom_label_3';
      yield serializers.serialize(
        object.customLabel3,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.latitude != null) {
      yield r'latitude';
      yield serializers.serialize(
        object.latitude,
        specifiedType: const FullType(num),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.mainImage != null) {
      yield r'main_image';
      yield serializers.serialize(
        object.mainImage,
        specifiedType: const FullType(CatalogsHotelAttributesAllOfMainImage),
      );
    }
    if (object.additionalImageLink != null) {
      yield r'additional_image_link';
      yield serializers.serialize(
        object.additionalImageLink,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel2 != null) {
      yield r'custom_label_2';
      yield serializers.serialize(
        object.customLabel2,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel1 != null) {
      yield r'custom_label_1';
      yield serializers.serialize(
        object.customLabel1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel0 != null) {
      yield r'custom_label_0';
      yield serializers.serialize(
        object.customLabel0,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.neighborhood != null) {
      yield r'neighborhood';
      yield serializers.serialize(
        object.neighborhood,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.category != null) {
      yield r'category';
      yield serializers.serialize(
        object.category,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.brand != null) {
      yield r'brand';
      yield serializers.serialize(
        object.brand,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.basePrice != null) {
      yield r'base_price';
      yield serializers.serialize(
        object.basePrice,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.longitude != null) {
      yield r'longitude';
      yield serializers.serialize(
        object.longitude,
        specifiedType: const FullType.nullable(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelAttributesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelAddress),
          ) as CatalogsHotelAddress;
          result.address.replace(valueDes);
          break;
        case r'sale_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.salePrice = valueDes;
          break;
        case r'custom_label_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel4 = valueDes;
          break;
        case r'guest_ratings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelGuestRatings),
          ) as CatalogsHotelGuestRatings;
          result.guestRatings.replace(valueDes);
          break;
        case r'custom_label_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel3 = valueDes;
          break;
        case r'latitude':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.latitude = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'main_image':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelAttributesAllOfMainImage),
          ) as CatalogsHotelAttributesAllOfMainImage;
          result.mainImage.replace(valueDes);
          break;
        case r'additional_image_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.additionalImageLink.replace(valueDes);
          break;
        case r'custom_label_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel2 = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'custom_label_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel1 = valueDes;
          break;
        case r'custom_label_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel0 = valueDes;
          break;
        case r'neighborhood':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.neighborhood.replace(valueDes);
          break;
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.category = valueDes;
          break;
        case r'brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.brand = valueDes;
          break;
        case r'base_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.basePrice = valueDes;
          break;
        case r'longitude':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.longitude = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelAttributes deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelAttributesBuilder();
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

