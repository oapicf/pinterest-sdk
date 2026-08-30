//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'mmm_report_level.g.dart';

class MMMReportLevel extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CAMPAIGN_TARGETING')
  static const MMMReportLevel CAMPAIGN_TARGETING = _$CAMPAIGN_TARGETING;
  @BuiltValueEnumConst(wireName: r'AD_GROUP_TARGETING')
  static const MMMReportLevel AD_GROUP_TARGETING = _$AD_GROUP_TARGETING;

  static Serializer<MMMReportLevel> get serializer => _$mMMReportLevelSerializer;

  const MMMReportLevel._(String name): super(name);

  static BuiltSet<MMMReportLevel> get values => _$values;
  static MMMReportLevel valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MMMReportLevelMixin = Object with _$MMMReportLevelMixin;

