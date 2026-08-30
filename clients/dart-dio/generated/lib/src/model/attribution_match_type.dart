//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'attribution_match_type.g.dart';

class AttributionMatchType extends EnumClass {

  /// Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
  @BuiltValueEnumConst(wireName: r'P')
  static const AttributionMatchType P = _$P;
  /// Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
  @BuiltValueEnumConst(wireName: r'D')
  static const AttributionMatchType D = _$D;
  /// Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
  @BuiltValueEnumConst(wireName: r'NA')
  static const AttributionMatchType NA = _$NA;

  static Serializer<AttributionMatchType> get serializer => _$attributionMatchTypeSerializer;

  const AttributionMatchType._(String name): super(name);

  static BuiltSet<AttributionMatchType> get values => _$values;
  static AttributionMatchType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AttributionMatchTypeMixin = Object with _$AttributionMatchTypeMixin;

