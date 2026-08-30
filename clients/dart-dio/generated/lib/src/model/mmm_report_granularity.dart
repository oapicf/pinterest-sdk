//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'mmm_report_granularity.g.dart';

class MMMReportGranularity extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DAY')
  static const MMMReportGranularity DAY = _$DAY;
  @BuiltValueEnumConst(wireName: r'WEEK')
  static const MMMReportGranularity WEEK = _$WEEK;

  static Serializer<MMMReportGranularity> get serializer => _$mMMReportGranularitySerializer;

  const MMMReportGranularity._(String name): super(name);

  static BuiltSet<MMMReportGranularity> get values => _$values;
  static MMMReportGranularity valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MMMReportGranularityMixin = Object with _$MMMReportGranularityMixin;

