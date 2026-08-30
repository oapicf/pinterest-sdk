//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_group_type.g.dart';

class CatalogsHotelProductGroupType extends EnumClass {

  /// Catalog hotel product group type
  @BuiltValueEnumConst(wireName: r'MERCHANT_CREATED')
  static const CatalogsHotelProductGroupType MERCHANT_CREATED = _$MERCHANT_CREATED;
  /// Catalog hotel product group type
  @BuiltValueEnumConst(wireName: r'ALL_LISTINGS')
  static const CatalogsHotelProductGroupType ALL_LISTINGS = _$ALL_LISTINGS;

  static Serializer<CatalogsHotelProductGroupType> get serializer => _$catalogsHotelProductGroupTypeSerializer;

  const CatalogsHotelProductGroupType._(String name): super(name);

  static BuiltSet<CatalogsHotelProductGroupType> get values => _$values;
  static CatalogsHotelProductGroupType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CatalogsHotelProductGroupTypeMixin = Object with _$CatalogsHotelProductGroupTypeMixin;

