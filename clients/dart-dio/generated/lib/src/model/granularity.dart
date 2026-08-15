//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'granularity.g.dart';

class Granularity extends EnumClass {

  /// Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
  @BuiltValueEnumConst(wireName: r'TOTAL')
  static const Granularity TOTAL = _$TOTAL;
  /// Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
  @BuiltValueEnumConst(wireName: r'DAY')
  static const Granularity DAY = _$DAY;
  /// Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
  @BuiltValueEnumConst(wireName: r'HOUR')
  static const Granularity HOUR = _$HOUR;
  /// Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
  @BuiltValueEnumConst(wireName: r'WEEK')
  static const Granularity WEEK = _$WEEK;
  /// Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
  @BuiltValueEnumConst(wireName: r'MONTH')
  static const Granularity MONTH = _$MONTH;

  static Serializer<Granularity> get serializer => _$granularitySerializer;

  const Granularity._(String name): super(name);

  static BuiltSet<Granularity> get values => _$values;
  static Granularity valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class GranularityMixin = Object with _$GranularityMixin;

