//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/local_store.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_local_stores_create200_response_inner_data_one_of.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_local_stores_create200_response_inner_data.g.dart';

/// Created/updated resource on success or error details on failure
///
/// Properties:
/// * [addressPrimary] - Primary address line of the store.
/// * [addressSecondary] - Secondary address line of the store.
/// * [city] - City where the store is located.
/// * [country] - Country code where the store is located.
/// * [createdAt] - Creation timestamp
/// * [id] - The ID of the local store.
/// * [latitude] - Geographic latitude coordinate of the store.
/// * [longitude] - Geographic longitude coordinate of the store.
/// * [name] - The name of the local store.
/// * [postalCode] - Postal or ZIP code of the store.
/// * [region] - State or region code where the store is located.
/// * [storeCode] - Merchant provided code for the local store. Unique within the merchant's catalog.
/// * [updatedAt] - Last update timestamp
/// * [exceptions] 
@BuiltValue()
abstract class CatalogsLocalStoresCreate200ResponseInnerData implements Built<CatalogsLocalStoresCreate200ResponseInnerData, CatalogsLocalStoresCreate200ResponseInnerDataBuilder> {
  /// One Of [CatalogsLocalStoresCreate200ResponseInnerDataOneOf], [LocalStore]
  OneOf get oneOf;

  CatalogsLocalStoresCreate200ResponseInnerData._();

  factory CatalogsLocalStoresCreate200ResponseInnerData([void updates(CatalogsLocalStoresCreate200ResponseInnerDataBuilder b)]) = _$CatalogsLocalStoresCreate200ResponseInnerData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsLocalStoresCreate200ResponseInnerDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsLocalStoresCreate200ResponseInnerData> get serializer => _$CatalogsLocalStoresCreate200ResponseInnerDataSerializer();
}

class _$CatalogsLocalStoresCreate200ResponseInnerDataSerializer implements PrimitiveSerializer<CatalogsLocalStoresCreate200ResponseInnerData> {
  @override
  final Iterable<Type> types = const [CatalogsLocalStoresCreate200ResponseInnerData, _$CatalogsLocalStoresCreate200ResponseInnerData];

  @override
  final String wireName = r'CatalogsLocalStoresCreate200ResponseInnerData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsLocalStoresCreate200ResponseInnerData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsLocalStoresCreate200ResponseInnerData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsLocalStoresCreate200ResponseInnerData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsLocalStoresCreate200ResponseInnerDataBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(LocalStore), FullType(CatalogsLocalStoresCreate200ResponseInnerDataOneOf), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

