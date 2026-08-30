//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'mmm_reporting_targeting_type.g.dart';

class MMMReportingTargetingType extends EnumClass {

  /// Ad targeting types for MMM report
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const MMMReportingTargetingType APPTYPE = _$APPTYPE;
  /// Ad targeting types for MMM report
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const MMMReportingTargetingType COUNTRY = _$COUNTRY;
  /// Ad targeting types for MMM report
  @BuiltValueEnumConst(wireName: r'CREATIVE_TYPE')
  static const MMMReportingTargetingType CREATIVE_TYPE = _$CREATIVE_TYPE;
  /// Ad targeting types for MMM report
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const MMMReportingTargetingType GENDER = _$GENDER;
  /// Ad targeting types for MMM report
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const MMMReportingTargetingType LOCATION = _$LOCATION;
  /// Ad targeting types for MMM report
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const MMMReportingTargetingType PLACEMENT = _$PLACEMENT;
  /// Ad targeting types for MMM report
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const MMMReportingTargetingType AUDIENCE_INCLUDE = _$AUDIENCE_INCLUDE;

  static Serializer<MMMReportingTargetingType> get serializer => _$mMMReportingTargetingTypeSerializer;

  const MMMReportingTargetingType._(String name): super(name);

  static BuiltSet<MMMReportingTargetingType> get values => _$values;
  static MMMReportingTargetingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MMMReportingTargetingTypeMixin = Object with _$MMMReportingTargetingTypeMixin;

