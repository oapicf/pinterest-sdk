//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_product_report_level.g.dart';

class ConversionProductReportLevel extends EnumClass {

  /// Level of the report
  @BuiltValueEnumConst(wireName: r'ADVERTISER')
  static const ConversionProductReportLevel ADVERTISER = _$ADVERTISER;
  /// Level of the report
  @BuiltValueEnumConst(wireName: r'CAMPAIGN')
  static const ConversionProductReportLevel CAMPAIGN = _$CAMPAIGN;
  /// Level of the report
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const ConversionProductReportLevel AD_GROUP = _$AD_GROUP;

  static Serializer<ConversionProductReportLevel> get serializer => _$conversionProductReportLevelSerializer;

  const ConversionProductReportLevel._(String name): super(name);

  static BuiltSet<ConversionProductReportLevel> get values => _$values;
  static ConversionProductReportLevel valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionProductReportLevelMixin = Object with _$ConversionProductReportLevelMixin;

