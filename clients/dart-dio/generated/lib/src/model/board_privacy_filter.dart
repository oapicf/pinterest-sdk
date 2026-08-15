//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_privacy_filter.g.dart';

class BoardPrivacyFilter extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ALL')
  static const BoardPrivacyFilter ALL = _$ALL;
  @BuiltValueEnumConst(wireName: r'PUBLIC')
  static const BoardPrivacyFilter PUBLIC = _$PUBLIC;
  @BuiltValueEnumConst(wireName: r'PROTECTED')
  static const BoardPrivacyFilter PROTECTED = _$PROTECTED;
  @BuiltValueEnumConst(wireName: r'SECRET')
  static const BoardPrivacyFilter SECRET = _$SECRET;
  @BuiltValueEnumConst(wireName: r'PUBLIC_AND_SECRET')
  static const BoardPrivacyFilter PUBLIC_AND_SECRET = _$PUBLIC_AND_SECRET;

  static Serializer<BoardPrivacyFilter> get serializer => _$boardPrivacyFilterSerializer;

  const BoardPrivacyFilter._(String name): super(name);

  static BuiltSet<BoardPrivacyFilter> get values => _$values;
  static BoardPrivacyFilter valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BoardPrivacyFilterMixin = Object with _$BoardPrivacyFilterMixin;

