//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'token_grant_type.g.dart';

class TokenGrantType extends EnumClass {

  /// The type of OAuth grant being requested.
  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const TokenGrantType authorizationCode = _$authorizationCode;
  /// The type of OAuth grant being requested.
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const TokenGrantType refreshToken = _$refreshToken;
  /// The type of OAuth grant being requested.
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const TokenGrantType clientCredentials = _$clientCredentials;

  static Serializer<TokenGrantType> get serializer => _$tokenGrantTypeSerializer;

  const TokenGrantType._(String name): super(name);

  static BuiltSet<TokenGrantType> get values => _$values;
  static TokenGrantType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TokenGrantTypeMixin = Object with _$TokenGrantTypeMixin;

