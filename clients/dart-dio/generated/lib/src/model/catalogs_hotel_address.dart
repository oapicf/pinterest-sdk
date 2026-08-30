//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_address.g.dart';

/// CatalogsHotelAddress
///
/// Properties:
/// * [addr1] - Primary street address of hotel.
/// * [city] - City where the hotel is located.
/// * [country] - Country where the hotel is located.
/// * [postalCode] - Required for countries with a postal code system. Postal or zip code of the hotel.
/// * [region] - State, county, province, where the hotel is located.
@BuiltValue()
abstract class CatalogsHotelAddress implements Built<CatalogsHotelAddress, CatalogsHotelAddressBuilder> {
  /// Primary street address of hotel.
  @BuiltValueField(wireName: r'addr1')
  String? get addr1;

  /// City where the hotel is located.
  @BuiltValueField(wireName: r'city')
  String? get city;

  /// Country where the hotel is located.
  @BuiltValueField(wireName: r'country')
  String? get country;

  /// Required for countries with a postal code system. Postal or zip code of the hotel.
  @BuiltValueField(wireName: r'postal_code')
  String? get postalCode;

  /// State, county, province, where the hotel is located.
  @BuiltValueField(wireName: r'region')
  String? get region;

  CatalogsHotelAddress._();

  factory CatalogsHotelAddress([void updates(CatalogsHotelAddressBuilder b)]) = _$CatalogsHotelAddress;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelAddressBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelAddress> get serializer => _$CatalogsHotelAddressSerializer();
}

class _$CatalogsHotelAddressSerializer implements PrimitiveSerializer<CatalogsHotelAddress> {
  @override
  final Iterable<Type> types = const [CatalogsHotelAddress, _$CatalogsHotelAddress];

  @override
  final String wireName = r'CatalogsHotelAddress';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelAddress object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.addr1 != null) {
      yield r'addr1';
      yield serializers.serialize(
        object.addr1,
        specifiedType: const FullType(String),
      );
    }
    if (object.city != null) {
      yield r'city';
      yield serializers.serialize(
        object.city,
        specifiedType: const FullType(String),
      );
    }
    if (object.country != null) {
      yield r'country';
      yield serializers.serialize(
        object.country,
        specifiedType: const FullType(String),
      );
    }
    if (object.postalCode != null) {
      yield r'postal_code';
      yield serializers.serialize(
        object.postalCode,
        specifiedType: const FullType(String),
      );
    }
    if (object.region != null) {
      yield r'region';
      yield serializers.serialize(
        object.region,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelAddress object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelAddressBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'addr1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.addr1 = valueDes;
          break;
        case r'city':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.city = valueDes;
          break;
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.country = valueDes;
          break;
        case r'postal_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.postalCode = valueDes;
          break;
        case r'region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.region = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelAddress deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelAddressBuilder();
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

