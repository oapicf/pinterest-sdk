//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/image_size.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_with_video.g.dart';

/// Pin with video.
///
/// Properties:
/// * [coverImageUrl] 
/// * [duration] - Duration (in miliseconds). Field maybe null after creation due to video processing time.
/// * [height] - Height (in pixels). Field maybe null after creation due to video processing time.
/// * [images] 
/// * [mediaType] 
/// * [videoUrl] - Video url (720p).  **Note:** This field is limited and not available to all apps.
/// * [videoUrlHls] - Video url (HLS).  **Note:** This field is limited and not available to all apps.
/// * [width] - Width (in pixels). Field maybe null after creation due to video processing time.
@BuiltValue()
abstract class PinMediaWithVideo implements Built<PinMediaWithVideo, PinMediaWithVideoBuilder> {
  @BuiltValueField(wireName: r'cover_image_url')
  String? get coverImageUrl;

  /// Duration (in miliseconds). Field maybe null after creation due to video processing time.
  @BuiltValueField(wireName: r'duration')
  num? get duration;

  /// Height (in pixels). Field maybe null after creation due to video processing time.
  @BuiltValueField(wireName: r'height')
  int? get height;

  @BuiltValueField(wireName: r'images')
  ImageSize? get images;

  @BuiltValueField(wireName: r'media_type')
  PinMediaWithVideoMediaTypeEnum get mediaType;
  // enum mediaTypeEnum {  video,  };

  /// Video url (720p).  **Note:** This field is limited and not available to all apps.
  @BuiltValueField(wireName: r'video_url')
  String? get videoUrl;

  /// Video url (HLS).  **Note:** This field is limited and not available to all apps.
  @BuiltValueField(wireName: r'video_url_hls')
  String? get videoUrlHls;

  /// Width (in pixels). Field maybe null after creation due to video processing time.
  @BuiltValueField(wireName: r'width')
  int? get width;

  PinMediaWithVideo._();

  factory PinMediaWithVideo([void updates(PinMediaWithVideoBuilder b)]) = _$PinMediaWithVideo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaWithVideoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaWithVideo> get serializer => _$PinMediaWithVideoSerializer();
}

class _$PinMediaWithVideoSerializer implements PrimitiveSerializer<PinMediaWithVideo> {
  @override
  final Iterable<Type> types = const [PinMediaWithVideo, _$PinMediaWithVideo];

  @override
  final String wireName = r'PinMediaWithVideo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaWithVideo object, {
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
    if (object.images != null) {
      yield r'images';
      yield serializers.serialize(
        object.images,
        specifiedType: const FullType(ImageSize),
      );
    }
    yield r'media_type';
    yield serializers.serialize(
      object.mediaType,
      specifiedType: const FullType(PinMediaWithVideoMediaTypeEnum),
    );
    if (object.videoUrl != null) {
      yield r'video_url';
      yield serializers.serialize(
        object.videoUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.videoUrlHls != null) {
      yield r'video_url_hls';
      yield serializers.serialize(
        object.videoUrlHls,
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
    PinMediaWithVideo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaWithVideoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cover_image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
        case r'images':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ImageSize),
          ) as ImageSize?;
          if (valueDes == null) continue;
          result.images.replace(valueDes);
          break;
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaWithVideoMediaTypeEnum),
          ) as PinMediaWithVideoMediaTypeEnum;
          result.mediaType = valueDes;
          break;
        case r'video_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.videoUrl = valueDes;
          break;
        case r'video_url_hls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.videoUrlHls = valueDes;
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
  PinMediaWithVideo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaWithVideoBuilder();
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

class PinMediaWithVideoMediaTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'video')
  static const PinMediaWithVideoMediaTypeEnum video = _$pinMediaWithVideoMediaTypeEnum_video;

  static Serializer<PinMediaWithVideoMediaTypeEnum> get serializer => _$pinMediaWithVideoMediaTypeEnumSerializer;

  const PinMediaWithVideoMediaTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaWithVideoMediaTypeEnum> get values => _$pinMediaWithVideoMediaTypeEnumValues;
  static PinMediaWithVideoMediaTypeEnum valueOf(String name) => _$pinMediaWithVideoMediaTypeEnumValueOf(name);
}

