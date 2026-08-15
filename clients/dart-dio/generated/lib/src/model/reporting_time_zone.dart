//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'reporting_time_zone.g.dart';

class ReportingTimeZone extends EnumClass {

  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
  @BuiltValueEnumConst(wireName: r'PINTEREST_TIME_ZONE')
  static const ReportingTimeZone PINTEREST_TIME_ZONE = _$PINTEREST_TIME_ZONE;
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
  @BuiltValueEnumConst(wireName: r'AD_ACCOUNT_TIME_ZONE')
  static const ReportingTimeZone AD_ACCOUNT_TIME_ZONE = _$AD_ACCOUNT_TIME_ZONE;

  static Serializer<ReportingTimeZone> get serializer => _$reportingTimeZoneSerializer;

  const ReportingTimeZone._(String name): super(name);

  static BuiltSet<ReportingTimeZone> get values => _$values;
  static ReportingTimeZone valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ReportingTimeZoneMixin = Object with _$ReportingTimeZoneMixin;

