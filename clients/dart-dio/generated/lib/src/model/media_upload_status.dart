//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media_upload_status.g.dart';

class MediaUploadStatus extends EnumClass {

  @BuiltValueEnumConst(wireName: r'registered')
  static const MediaUploadStatus registered = _$registered;
  @BuiltValueEnumConst(wireName: r'processing')
  static const MediaUploadStatus processing = _$processing;
  @BuiltValueEnumConst(wireName: r'succeeded')
  static const MediaUploadStatus succeeded = _$succeeded;
  @BuiltValueEnumConst(wireName: r'failed')
  static const MediaUploadStatus failed = _$failed;

  static Serializer<MediaUploadStatus> get serializer => _$mediaUploadStatusSerializer;

  const MediaUploadStatus._(String name): super(name);

  static BuiltSet<MediaUploadStatus> get values => _$values;
  static MediaUploadStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MediaUploadStatusMixin = Object with _$MediaUploadStatusMixin;

