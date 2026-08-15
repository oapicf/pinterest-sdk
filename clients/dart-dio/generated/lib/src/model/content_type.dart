//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'content_type.g.dart';

class ContentType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'image/jpeg')
  static const ContentType imageSlashJpeg = _$imageSlashJpeg;
  @BuiltValueEnumConst(wireName: r'image/png')
  static const ContentType imageSlashPng = _$imageSlashPng;

  static Serializer<ContentType> get serializer => _$contentTypeSerializer;

  const ContentType._(String name): super(name);

  static BuiltSet<ContentType> get values => _$values;
  static ContentType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ContentTypeMixin = Object with _$ContentTypeMixin;

