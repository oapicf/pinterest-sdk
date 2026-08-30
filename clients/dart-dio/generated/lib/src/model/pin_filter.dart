//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_filter.g.dart';

class PinFilter extends EnumClass {

  @BuiltValueEnumConst(wireName: r'exclude_native')
  static const PinFilter excludeNative = _$excludeNative;
  @BuiltValueEnumConst(wireName: r'exclude_repins')
  static const PinFilter excludeRepins = _$excludeRepins;
  @BuiltValueEnumConst(wireName: r'has_been_promoted')
  static const PinFilter hasBeenPromoted = _$hasBeenPromoted;

  static Serializer<PinFilter> get serializer => _$pinFilterSerializer;

  const PinFilter._(String name): super(name);

  static BuiltSet<PinFilter> get values => _$values;
  static PinFilter valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PinFilterMixin = Object with _$PinFilterMixin;

