//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/image_size.dart';
import 'package:openapi/src/model/video_metadata_with_item_type.dart';
import 'package:openapi/src/model/image_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'pin_media_metadata.g.dart';

/// PinMediaMetadata
///
/// Properties:
/// * [description] 
/// * [images] 
/// * [itemType] 
/// * [link] 
/// * [title] 
/// * [coverImageUrl] 
/// * [duration] - Duration (in miliseconds). Field maybe null after creation due to video processing time.
/// * [height] - Height (in pixels). Field maybe null after creation due to video processing time.
/// * [videoUrl] - Video url (720p).  **Note:** This field is limited and not available to all apps.
/// * [width] - Width (in pixels). Field maybe null after creation due to video processing time.
@BuiltValue()
abstract class PinMediaMetadata implements Built<PinMediaMetadata, PinMediaMetadataBuilder> {
  /// Any Of [ImageMetadata], [VideoMetadataWithItemType]
  AnyOf get anyOf;

  PinMediaMetadata._();

  factory PinMediaMetadata([void updates(PinMediaMetadataBuilder b)]) = _$PinMediaMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaMetadata> get serializer => _$PinMediaMetadataSerializer();
}

class _$PinMediaMetadataSerializer implements PrimitiveSerializer<PinMediaMetadata> {
  @override
  final Iterable<Type> types = const [PinMediaMetadata, _$PinMediaMetadata];

  @override
  final String wireName = r'PinMediaMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  PinMediaMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaMetadataBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(ImageMetadata), FullType(VideoMetadataWithItemType), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

