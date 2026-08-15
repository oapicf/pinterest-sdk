//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_report_attribution_type.g.dart';

class ConversionReportAttributionType extends EnumClass {

  /// Attribution type. Refers to the Pinterest Tag endpoints
  @BuiltValueEnumConst(wireName: r'INDIVIDUAL')
  static const ConversionReportAttributionType INDIVIDUAL = _$INDIVIDUAL;
  /// Attribution type. Refers to the Pinterest Tag endpoints
  @BuiltValueEnumConst(wireName: r'HOUSEHOLD')
  static const ConversionReportAttributionType HOUSEHOLD = _$HOUSEHOLD;

  static Serializer<ConversionReportAttributionType> get serializer => _$conversionReportAttributionTypeSerializer;

  const ConversionReportAttributionType._(String name): super(name);

  static BuiltSet<ConversionReportAttributionType> get values => _$values;
  static ConversionReportAttributionType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionReportAttributionTypeMixin = Object with _$ConversionReportAttributionTypeMixin;

