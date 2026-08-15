//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_hotel_address.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_guest_ratings.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_updatable_hotel_attributes.g.dart';

/// CatalogsUpdatableHotelAttributes
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
@BuiltValue(instantiable: false)
abstract class CatalogsUpdatableHotelAttributes  {
  @BuiltValueField(wireName: r'address')
  CatalogsHotelAddress? get address;

  /// Base price of the hotel room per night followed by the ISO currency code
  @BuiltValueField(wireName: r'base_price')
  String? get basePrice;

  /// The brand to which this hotel belongs to.
  @BuiltValueField(wireName: r'brand')
  String? get brand;

  /// The type of property. The category can be any type of internal description desired.
  @BuiltValueField(wireName: r'category')
  String? get category;

  /// Custom grouping of hotels
  @BuiltValueField(wireName: r'custom_label_0')
  String? get customLabel0;

  /// Custom grouping of hotels
  @BuiltValueField(wireName: r'custom_label_1')
  String? get customLabel1;

  /// Custom grouping of hotels
  @BuiltValueField(wireName: r'custom_label_2')
  String? get customLabel2;

  /// Custom grouping of hotels
  @BuiltValueField(wireName: r'custom_label_3')
  String? get customLabel3;

  /// Custom grouping of hotels
  @BuiltValueField(wireName: r'custom_label_4')
  String? get customLabel4;

  /// Brief description of the hotel.
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'guest_ratings')
  CatalogsHotelGuestRatings? get guestRatings;

  /// Latitude of the hotel.
  @BuiltValueField(wireName: r'latitude')
  num? get latitude;

  /// Link to the product page
  @BuiltValueField(wireName: r'link')
  String? get link;

  /// Longitude of the hotel.
  @BuiltValueField(wireName: r'longitude')
  num? get longitude;

  /// The hotel's name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// A list of neighborhoods where the hotel is located
  @BuiltValueField(wireName: r'neighborhood')
  BuiltList<String>? get neighborhood;

  /// Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  @BuiltValueField(wireName: r'sale_price')
  String? get salePrice;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpdatableHotelAttributes> get serializer => _$CatalogsUpdatableHotelAttributesSerializer();
}

class _$CatalogsUpdatableHotelAttributesSerializer implements PrimitiveSerializer<CatalogsUpdatableHotelAttributes> {
  @override
  final Iterable<Type> types = const [CatalogsUpdatableHotelAttributes];

  @override
  final String wireName = r'CatalogsUpdatableHotelAttributes';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpdatableHotelAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.address != null) {
      yield r'address';
      yield serializers.serialize(
        object.address,
        specifiedType: const FullType(CatalogsHotelAddress),
      );
    }
    if (object.basePrice != null) {
      yield r'base_price';
      yield serializers.serialize(
        object.basePrice,
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
    if (object.category != null) {
      yield r'category';
      yield serializers.serialize(
        object.category,
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
    if (object.customLabel1 != null) {
      yield r'custom_label_1';
      yield serializers.serialize(
        object.customLabel1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel2 != null) {
      yield r'custom_label_2';
      yield serializers.serialize(
        object.customLabel2,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel3 != null) {
      yield r'custom_label_3';
      yield serializers.serialize(
        object.customLabel3,
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
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
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
    if (object.longitude != null) {
      yield r'longitude';
      yield serializers.serialize(
        object.longitude,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
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
    if (object.salePrice != null) {
      yield r'sale_price';
      yield serializers.serialize(
        object.salePrice,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpdatableHotelAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CatalogsUpdatableHotelAttributes deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CatalogsUpdatableHotelAttributes)) as $CatalogsUpdatableHotelAttributes;
  }
}

/// a concrete implementation of [CatalogsUpdatableHotelAttributes], since [CatalogsUpdatableHotelAttributes] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CatalogsUpdatableHotelAttributes implements CatalogsUpdatableHotelAttributes, Built<$CatalogsUpdatableHotelAttributes, $CatalogsUpdatableHotelAttributesBuilder> {
  $CatalogsUpdatableHotelAttributes._();

  factory $CatalogsUpdatableHotelAttributes([void Function($CatalogsUpdatableHotelAttributesBuilder)? updates]) = _$$CatalogsUpdatableHotelAttributes;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CatalogsUpdatableHotelAttributesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CatalogsUpdatableHotelAttributes> get serializer => _$$CatalogsUpdatableHotelAttributesSerializer();
}

class _$$CatalogsUpdatableHotelAttributesSerializer implements PrimitiveSerializer<$CatalogsUpdatableHotelAttributes> {
  @override
  final Iterable<Type> types = const [$CatalogsUpdatableHotelAttributes, _$$CatalogsUpdatableHotelAttributes];

  @override
  final String wireName = r'$CatalogsUpdatableHotelAttributes';

  @override
  Object serialize(
    Serializers serializers,
    $CatalogsUpdatableHotelAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CatalogsUpdatableHotelAttributes))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpdatableHotelAttributesBuilder result,
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
        case r'base_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.basePrice = valueDes;
          break;
        case r'brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.brand = valueDes;
          break;
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.category = valueDes;
          break;
        case r'custom_label_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel0 = valueDes;
          break;
        case r'custom_label_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel1 = valueDes;
          break;
        case r'custom_label_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel2 = valueDes;
          break;
        case r'custom_label_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel3 = valueDes;
          break;
        case r'custom_label_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel4 = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'guest_ratings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelGuestRatings),
          ) as CatalogsHotelGuestRatings;
          result.guestRatings.replace(valueDes);
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
        case r'longitude':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.longitude = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'neighborhood':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.neighborhood.replace(valueDes);
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
  $CatalogsUpdatableHotelAttributes deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CatalogsUpdatableHotelAttributesBuilder();
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

