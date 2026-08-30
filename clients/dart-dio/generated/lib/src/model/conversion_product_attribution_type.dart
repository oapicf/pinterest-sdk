//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_product_attribution_type.g.dart';

class ConversionProductAttributionType extends EnumClass {

  /// Conversion product attribution level
  @BuiltValueEnumConst(wireName: r'DEFAULT')
  static const ConversionProductAttributionType DEFAULT = _$DEFAULT;
  /// Conversion product attribution level
  @BuiltValueEnumConst(wireName: r'BRAND_ATTRIBUTION')
  static const ConversionProductAttributionType BRAND_ATTRIBUTION = _$BRAND_ATTRIBUTION;

  static Serializer<ConversionProductAttributionType> get serializer => _$conversionProductAttributionTypeSerializer;

  const ConversionProductAttributionType._(String name): super(name);

  static BuiltSet<ConversionProductAttributionType> get values => _$values;
  static ConversionProductAttributionType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionProductAttributionTypeMixin = Object with _$ConversionProductAttributionTypeMixin;

