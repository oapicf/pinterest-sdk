//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'standard_pin_metric_types.g.dart';

class StandardPinMetricTypes extends EnumClass {

  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const StandardPinMetricTypes IMPRESSION = _$IMPRESSION;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const StandardPinMetricTypes OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'PIN_CLICK')
  static const StandardPinMetricTypes PIN_CLICK = _$PIN_CLICK;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const StandardPinMetricTypes SAVE = _$SAVE;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'SAVE_RATE')
  static const StandardPinMetricTypes SAVE_RATE = _$SAVE_RATE;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'TOTAL_COMMENTS')
  static const StandardPinMetricTypes TOTAL_COMMENTS = _$TOTAL_COMMENTS;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'TOTAL_REACTIONS')
  static const StandardPinMetricTypes TOTAL_REACTIONS = _$TOTAL_REACTIONS;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'USER_FOLLOW')
  static const StandardPinMetricTypes USER_FOLLOW = _$USER_FOLLOW;
  /// Standard Pin metric types
  @BuiltValueEnumConst(wireName: r'PROFILE_VISIT')
  static const StandardPinMetricTypes PROFILE_VISIT = _$PROFILE_VISIT;

  static Serializer<StandardPinMetricTypes> get serializer => _$standardPinMetricTypesSerializer;

  const StandardPinMetricTypes._(String name): super(name);

  static BuiltSet<StandardPinMetricTypes> get values => _$values;
  static StandardPinMetricTypes valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class StandardPinMetricTypesMixin = Object with _$StandardPinMetricTypesMixin;

