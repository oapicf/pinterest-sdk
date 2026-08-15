//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'match_type_response.g.dart';

class MatchTypeResponse extends EnumClass {

  /// Keyword match type
  @BuiltValueEnumConst(wireName: r'BROAD')
  static const MatchTypeResponse BROAD = _$BROAD;
  /// Keyword match type
  @BuiltValueEnumConst(wireName: r'PHRASE')
  static const MatchTypeResponse PHRASE = _$PHRASE;
  /// Keyword match type
  @BuiltValueEnumConst(wireName: r'EXACT')
  static const MatchTypeResponse EXACT = _$EXACT;
  /// Keyword match type
  @BuiltValueEnumConst(wireName: r'EXACT_NEGATIVE')
  static const MatchTypeResponse EXACT_NEGATIVE = _$EXACT_NEGATIVE;
  /// Keyword match type
  @BuiltValueEnumConst(wireName: r'PHRASE_NEGATIVE')
  static const MatchTypeResponse PHRASE_NEGATIVE = _$PHRASE_NEGATIVE;

  static Serializer<MatchTypeResponse> get serializer => _$matchTypeResponseSerializer;

  const MatchTypeResponse._(String name): super(name);

  static BuiltSet<MatchTypeResponse> get values => _$values;
  static MatchTypeResponse valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MatchTypeResponseMixin = Object with _$MatchTypeResponseMixin;

