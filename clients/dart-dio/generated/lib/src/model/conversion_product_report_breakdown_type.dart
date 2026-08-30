//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_product_report_breakdown_type.g.dart';

class ConversionProductReportBreakdownType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PRODUCT_BRAND')
  static const ConversionProductReportBreakdownType PRODUCT_BRAND = _$PRODUCT_BRAND;
  @BuiltValueEnumConst(wireName: r'PRODUCT_CATEGORY')
  static const ConversionProductReportBreakdownType PRODUCT_CATEGORY = _$PRODUCT_CATEGORY;
  @BuiltValueEnumConst(wireName: r'PRODUCT_BRAND_AND_CATEGORY')
  static const ConversionProductReportBreakdownType PRODUCT_BRAND_AND_CATEGORY = _$PRODUCT_BRAND_AND_CATEGORY;
  @BuiltValueEnumConst(wireName: r'PRODUCT_SKU')
  static const ConversionProductReportBreakdownType PRODUCT_SKU = _$PRODUCT_SKU;
  @BuiltValueEnumConst(wireName: r'PRODUCT_SKU_GROUP')
  static const ConversionProductReportBreakdownType PRODUCT_SKU_GROUP = _$PRODUCT_SKU_GROUP;

  static Serializer<ConversionProductReportBreakdownType> get serializer => _$conversionProductReportBreakdownTypeSerializer;

  const ConversionProductReportBreakdownType._(String name): super(name);

  static BuiltSet<ConversionProductReportBreakdownType> get values => _$values;
  static ConversionProductReportBreakdownType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionProductReportBreakdownTypeMixin = Object with _$ConversionProductReportBreakdownTypeMixin;

