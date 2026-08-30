//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nullalble_match_type.g.dart';

class NullalbleMatchType extends EnumClass {

  /// Keyword match type allowing null
  @BuiltValueEnumConst(wireName: r'BROAD')
  static const NullalbleMatchType BROAD = _$BROAD;
  /// Keyword match type allowing null
  @BuiltValueEnumConst(wireName: r'PHRASE')
  static const NullalbleMatchType PHRASE = _$PHRASE;
  /// Keyword match type allowing null
  @BuiltValueEnumConst(wireName: r'EXACT')
  static const NullalbleMatchType EXACT = _$EXACT;
  /// Keyword match type allowing null
  @BuiltValueEnumConst(wireName: r'EXACT_NEGATIVE')
  static const NullalbleMatchType EXACT_NEGATIVE = _$EXACT_NEGATIVE;
  /// Keyword match type allowing null
  @BuiltValueEnumConst(wireName: r'PHRASE_NEGATIVE')
  static const NullalbleMatchType PHRASE_NEGATIVE = _$PHRASE_NEGATIVE;

  static Serializer<NullalbleMatchType> get serializer => _$nullalbleMatchTypeSerializer;

  const NullalbleMatchType._(String name): super(name);

  static BuiltSet<NullalbleMatchType> get values => _$values;
  static NullalbleMatchType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NullalbleMatchTypeMixin = Object with _$NullalbleMatchTypeMixin;

