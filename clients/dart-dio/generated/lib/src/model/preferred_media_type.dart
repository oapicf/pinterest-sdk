//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'preferred_media_type.g.dart';

class PreferredMediaType extends EnumClass {

  /// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  @BuiltValueEnumConst(wireName: r'VIDEO')
  static const PreferredMediaType VIDEO = _$VIDEO;
  /// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  @BuiltValueEnumConst(wireName: r'IMAGE')
  static const PreferredMediaType IMAGE = _$IMAGE;

  static Serializer<PreferredMediaType> get serializer => _$preferredMediaTypeSerializer;

  const PreferredMediaType._(String name): super(name);

  static BuiltSet<PreferredMediaType> get values => _$values;
  static PreferredMediaType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PreferredMediaTypeMixin = Object with _$PreferredMediaTypeMixin;

