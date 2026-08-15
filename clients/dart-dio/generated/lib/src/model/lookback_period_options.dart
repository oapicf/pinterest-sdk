//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lookback_period_options.g.dart';

class LookbackPeriodOptions extends EnumClass {

  /// Days in lookback window in the GET Conversion EQS response.
  @BuiltValueEnumConst(wireName: r'1d')
  static const LookbackPeriodOptions n1d = _$n1d;
  /// Days in lookback window in the GET Conversion EQS response.
  @BuiltValueEnumConst(wireName: r'14d')
  static const LookbackPeriodOptions n14d = _$n14d;

  static Serializer<LookbackPeriodOptions> get serializer => _$lookbackPeriodOptionsSerializer;

  const LookbackPeriodOptions._(String name): super(name);

  static BuiltSet<LookbackPeriodOptions> get values => _$values;
  static LookbackPeriodOptions valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LookbackPeriodOptionsMixin = Object with _$LookbackPeriodOptionsMixin;

