//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'frequency_goal_metadata_timerange.g.dart';

class FrequencyGoalMetadataTimerange extends EnumClass {

  @BuiltValueEnumConst(wireName: r'THIRTY_DAY')
  static const FrequencyGoalMetadataTimerange THIRTY_DAY = _$THIRTY_DAY;
  @BuiltValueEnumConst(wireName: r'DAY')
  static const FrequencyGoalMetadataTimerange DAY = _$DAY;
  @BuiltValueEnumConst(wireName: r'SEVEN_DAY')
  static const FrequencyGoalMetadataTimerange SEVEN_DAY = _$SEVEN_DAY;
  @BuiltValueEnumConst(wireName: r'TWENTY_MINUTE')
  static const FrequencyGoalMetadataTimerange TWENTY_MINUTE = _$TWENTY_MINUTE;
  @BuiltValueEnumConst(wireName: r'TEN_MINUTE')
  static const FrequencyGoalMetadataTimerange TEN_MINUTE = _$TEN_MINUTE;
  @BuiltValueEnumConst(wireName: r'TWENTY_FOUR_HOUR')
  static const FrequencyGoalMetadataTimerange TWENTY_FOUR_HOUR = _$TWENTY_FOUR_HOUR;

  static Serializer<FrequencyGoalMetadataTimerange> get serializer => _$frequencyGoalMetadataTimerangeSerializer;

  const FrequencyGoalMetadataTimerange._(String name): super(name);

  static BuiltSet<FrequencyGoalMetadataTimerange> get values => _$values;
  static FrequencyGoalMetadataTimerange valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class FrequencyGoalMetadataTimerangeMixin = Object with _$FrequencyGoalMetadataTimerangeMixin;

