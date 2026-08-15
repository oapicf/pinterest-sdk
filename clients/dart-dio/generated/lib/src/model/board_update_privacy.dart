//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_update_privacy.g.dart';

class BoardUpdatePrivacy extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PUBLIC')
  static const BoardUpdatePrivacy PUBLIC = _$PUBLIC;
  @BuiltValueEnumConst(wireName: r'SECRET')
  static const BoardUpdatePrivacy SECRET = _$SECRET;

  static Serializer<BoardUpdatePrivacy> get serializer => _$boardUpdatePrivacySerializer;

  const BoardUpdatePrivacy._(String name): super(name);

  static BuiltSet<BoardUpdatePrivacy> get values => _$values;
  static BoardUpdatePrivacy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BoardUpdatePrivacyMixin = Object with _$BoardUpdatePrivacyMixin;

