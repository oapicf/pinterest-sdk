//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'video_metadata_with_item_type.g.dart';

/// VideoMetadataWithItemType
///
/// Properties:
/// * [coverImageUrl] 
/// * [duration] - Duration (in miliseconds). Field maybe null after creation due to video processing time.
/// * [height] - Height (in pixels). Field maybe null after creation due to video processing time.
/// * [itemType] 
/// * [videoUrl] - Video url (720p).  **Note:** This field is limited and not available to all apps.
/// * [width] - Width (in pixels). Field maybe null after creation due to video processing time.
@BuiltValue()
abstract class VideoMetadataWithItemType implements Built<VideoMetadataWithItemType, VideoMetadataWithItemTypeBuilder> {
  @BuiltValueField(wireName: r'cover_image_url')
  String? get coverImageUrl;

  /// Duration (in miliseconds). Field maybe null after creation due to video processing time.
  @BuiltValueField(wireName: r'duration')
  num? get duration;

  /// Height (in pixels). Field maybe null after creation due to video processing time.
  @BuiltValueField(wireName: r'height')
  int? get height;

  @BuiltValueField(wireName: r'item_type')
  String? get itemType;

  /// Video url (720p).  **Note:** This field is limited and not available to all apps.
  @BuiltValueField(wireName: r'video_url')
  String? get videoUrl;

  /// Width (in pixels). Field maybe null after creation due to video processing time.
  @BuiltValueField(wireName: r'width')
  int? get width;

  VideoMetadataWithItemType._();

  factory VideoMetadataWithItemType([void updates(VideoMetadataWithItemTypeBuilder b)]) = _$VideoMetadataWithItemType;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VideoMetadataWithItemTypeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VideoMetadataWithItemType> get serializer => _$VideoMetadataWithItemTypeSerializer();
}

class _$VideoMetadataWithItemTypeSerializer implements PrimitiveSerializer<VideoMetadataWithItemType> {
  @override
  final Iterable<Type> types = const [VideoMetadataWithItemType, _$VideoMetadataWithItemType];

  @override
  final String wireName = r'VideoMetadataWithItemType';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VideoMetadataWithItemType object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.coverImageUrl != null) {
      yield r'cover_image_url';
      yield serializers.serialize(
        object.coverImageUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.duration != null) {
      yield r'duration';
      yield serializers.serialize(
        object.duration,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.height != null) {
      yield r'height';
      yield serializers.serialize(
        object.height,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.itemType != null) {
      yield r'item_type';
      yield serializers.serialize(
        object.itemType,
        specifiedType: const FullType(String),
      );
    }
    if (object.videoUrl != null) {
      yield r'video_url';
      yield serializers.serialize(
        object.videoUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.width != null) {
      yield r'width';
      yield serializers.serialize(
        object.width,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VideoMetadataWithItemType object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VideoMetadataWithItemTypeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cover_image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.coverImageUrl = valueDes;
          break;
        case r'duration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.duration = valueDes;
          break;
        case r'height':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.height = valueDes;
          break;
        case r'item_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemType = valueDes;
          break;
        case r'video_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.videoUrl = valueDes;
          break;
        case r'width':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.width = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VideoMetadataWithItemType deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VideoMetadataWithItemTypeBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

