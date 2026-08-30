//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'token_type_hint.g.dart';

class TokenTypeHint extends EnumClass {

  /// The type of token to revoke.
  @BuiltValueEnumConst(wireName: r'access_token')
  static const TokenTypeHint accessToken = _$accessToken;
  /// The type of token to revoke.
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const TokenTypeHint refreshToken = _$refreshToken;

  static Serializer<TokenTypeHint> get serializer => _$tokenTypeHintSerializer;

  const TokenTypeHint._(String name): super(name);

  static BuiltSet<TokenTypeHint> get values => _$values;
  static TokenTypeHint valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TokenTypeHintMixin = Object with _$TokenTypeHintMixin;

