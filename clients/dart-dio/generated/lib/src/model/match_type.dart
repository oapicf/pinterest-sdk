//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'match_type.g.dart';

/// Keyword match type
class MatchType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'BROAD')
  static const MatchType BROAD = _$BROAD;
  @BuiltValueEnumConst(wireName: r'PHRASE')
  static const MatchType PHRASE = _$PHRASE;
  @BuiltValueEnumConst(wireName: r'EXACT')
  static const MatchType EXACT = _$EXACT;
  @BuiltValueEnumConst(wireName: r'EXACT_NEGATIVE')
  static const MatchType EXACT_NEGATIVE = _$EXACT_NEGATIVE;
  @BuiltValueEnumConst(wireName: r'PHRASE_NEGATIVE')
  static const MatchType PHRASE_NEGATIVE = _$PHRASE_NEGATIVE;

  static Serializer<MatchType> get serializer => _$matchTypeSerializer;

  const MatchType._(String name): super(name);

  static BuiltSet<MatchType> get values => _$values;
  static MatchType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MatchTypeMixin = Object with _$MatchTypeMixin;

