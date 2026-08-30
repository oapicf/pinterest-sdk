//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_product_report_granularity.g.dart';

class ConversionProductReportGranularity extends EnumClass {

  /// Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
  @BuiltValueEnumConst(wireName: r'TOTAL')
  static const ConversionProductReportGranularity TOTAL = _$TOTAL;
  /// Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
  @BuiltValueEnumConst(wireName: r'WEEK')
  static const ConversionProductReportGranularity WEEK = _$WEEK;
  /// Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
  @BuiltValueEnumConst(wireName: r'MONTH')
  static const ConversionProductReportGranularity MONTH = _$MONTH;

  static Serializer<ConversionProductReportGranularity> get serializer => _$conversionProductReportGranularitySerializer;

  const ConversionProductReportGranularity._(String name): super(name);

  static BuiltSet<ConversionProductReportGranularity> get values => _$values;
  static ConversionProductReportGranularity valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionProductReportGranularityMixin = Object with _$ConversionProductReportGranularityMixin;

