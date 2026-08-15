//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media_upload_type.g.dart';

class MediaUploadType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'video')
  static const MediaUploadType video = _$video;

  static Serializer<MediaUploadType> get serializer => _$mediaUploadTypeSerializer;

  const MediaUploadType._(String name): super(name);

  static BuiltSet<MediaUploadType> get values => _$values;
  static MediaUploadType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MediaUploadTypeMixin = Object with _$MediaUploadTypeMixin;

