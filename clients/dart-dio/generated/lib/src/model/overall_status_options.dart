//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'overall_status_options.g.dart';

class OverallStatusOptions extends EnumClass {

  /// Overall status of event quality score.
  @BuiltValueEnumConst(wireName: r'NEEDS_IMPROVEMENT')
  static const OverallStatusOptions NEEDS_IMPROVEMENT = _$NEEDS_IMPROVEMENT;
  /// Overall status of event quality score.
  @BuiltValueEnumConst(wireName: r'FAIR')
  static const OverallStatusOptions FAIR = _$FAIR;
  /// Overall status of event quality score.
  @BuiltValueEnumConst(wireName: r'GOOD')
  static const OverallStatusOptions GOOD = _$GOOD;

  static Serializer<OverallStatusOptions> get serializer => _$overallStatusOptionsSerializer;

  const OverallStatusOptions._(String name): super(name);

  static BuiltSet<OverallStatusOptions> get values => _$values;
  static OverallStatusOptions valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class OverallStatusOptionsMixin = Object with _$OverallStatusOptionsMixin;

