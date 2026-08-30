//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_type.g.dart';

class AssetGroupType extends EnumClass {

  /// Asset group type.
  @BuiltValueEnumConst(wireName: r'BRAND')
  static const AssetGroupType BRAND = _$BRAND;
  /// Asset group type.
  @BuiltValueEnumConst(wireName: r'LOCATION_OR_LANGUAGE')
  static const AssetGroupType LOCATION_OR_LANGUAGE = _$LOCATION_OR_LANGUAGE;
  /// Asset group type.
  @BuiltValueEnumConst(wireName: r'PRODUCT_LINE')
  static const AssetGroupType PRODUCT_LINE = _$PRODUCT_LINE;
  /// Asset group type.
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const AssetGroupType OTHER = _$OTHER;

  static Serializer<AssetGroupType> get serializer => _$assetGroupTypeSerializer;

  const AssetGroupType._(String name): super(name);

  static BuiltSet<AssetGroupType> get values => _$values;
  static AssetGroupType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AssetGroupTypeMixin = Object with _$AssetGroupTypeMixin;

