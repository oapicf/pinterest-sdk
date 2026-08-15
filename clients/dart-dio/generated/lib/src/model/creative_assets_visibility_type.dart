//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'creative_assets_visibility_type.g.dart';

class CreativeAssetsVisibilityType extends EnumClass {

  /// Creative assets visibility.
  @BuiltValueEnumConst(wireName: r'VISIBLE')
  static const CreativeAssetsVisibilityType VISIBLE = _$VISIBLE;
  /// Creative assets visibility.
  @BuiltValueEnumConst(wireName: r'HIDDEN')
  static const CreativeAssetsVisibilityType HIDDEN = _$HIDDEN;

  static Serializer<CreativeAssetsVisibilityType> get serializer => _$creativeAssetsVisibilityTypeSerializer;

  const CreativeAssetsVisibilityType._(String name): super(name);

  static BuiltSet<CreativeAssetsVisibilityType> get values => _$values;
  static CreativeAssetsVisibilityType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CreativeAssetsVisibilityTypeMixin = Object with _$CreativeAssetsVisibilityTypeMixin;

