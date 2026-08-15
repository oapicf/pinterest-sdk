//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_privacy.g.dart';

class BoardPrivacy extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PUBLIC')
  static const BoardPrivacy PUBLIC = _$PUBLIC;
  @BuiltValueEnumConst(wireName: r'PROTECTED')
  static const BoardPrivacy PROTECTED = _$PROTECTED;
  @BuiltValueEnumConst(wireName: r'SECRET')
  static const BoardPrivacy SECRET = _$SECRET;

  static Serializer<BoardPrivacy> get serializer => _$boardPrivacySerializer;

  const BoardPrivacy._(String name): super(name);

  static BuiltSet<BoardPrivacy> get values => _$values;
  static BoardPrivacy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BoardPrivacyMixin = Object with _$BoardPrivacyMixin;

