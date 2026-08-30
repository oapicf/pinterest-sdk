//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'metrics_reporting_template_type.g.dart';

class MetricsReportingTemplateType extends EnumClass {

  /// Reporting template type
  @BuiltValueEnumConst(wireName: r'UNSPECIFIED')
  static const MetricsReportingTemplateType UNSPECIFIED = _$UNSPECIFIED;
  /// Reporting template type
  @BuiltValueEnumConst(wireName: r'BULK')
  static const MetricsReportingTemplateType BULK = _$BULK;
  /// Reporting template type
  @BuiltValueEnumConst(wireName: r'OVERVIEW')
  static const MetricsReportingTemplateType OVERVIEW = _$OVERVIEW;
  /// Reporting template type
  @BuiltValueEnumConst(wireName: r'TABLE')
  static const MetricsReportingTemplateType TABLE = _$TABLE;
  /// Reporting template type
  @BuiltValueEnumConst(wireName: r'MMM')
  static const MetricsReportingTemplateType MMM = _$MMM;
  /// Reporting template type
  @BuiltValueEnumConst(wireName: r'BRAND_CATEGORY')
  static const MetricsReportingTemplateType BRAND_CATEGORY = _$BRAND_CATEGORY;

  static Serializer<MetricsReportingTemplateType> get serializer => _$metricsReportingTemplateTypeSerializer;

  const MetricsReportingTemplateType._(String name): super(name);

  static BuiltSet<MetricsReportingTemplateType> get values => _$values;
  static MetricsReportingTemplateType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MetricsReportingTemplateTypeMixin = Object with _$MetricsReportingTemplateTypeMixin;

