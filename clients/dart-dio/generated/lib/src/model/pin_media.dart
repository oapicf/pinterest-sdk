//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pin_media_metadata.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/image_size.dart';
import 'package:openapi/src/model/pin_media_with_image.dart';
import 'package:openapi/src/model/pin_media_with_video.dart';
import 'package:openapi/src/model/pin_media_with_images.dart';
import 'package:openapi/src/model/pin_media_with_image_and_video.dart';
import 'package:openapi/src/model/pin_media_with_videos.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'pin_media.g.dart';

/// Pin media that can be an image, video, or a mix of both.
///
/// Properties:
/// * [images] 
/// * [mediaType] 
/// * [coverImageUrl] 
/// * [duration] - Duration (in miliseconds). Field maybe null after creation due to video processing time.
/// * [height] - Height (in pixels). Field maybe null after creation due to video processing time.
/// * [videoUrl] - Video url (720p).  **Note:** This field is limited and not available to all apps.
/// * [width] - Width (in pixels). Field maybe null after creation due to video processing time.
/// * [items] 
@BuiltValue()
abstract class PinMedia implements Built<PinMedia, PinMediaBuilder> {
  /// One Of [PinMediaWithImage], [PinMediaWithImageAndVideo], [PinMediaWithImages], [PinMediaWithVideo], [PinMediaWithVideos]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'media_type';

  static const Map<String, Type> discriminatorMapping = {
    r'image': PinMediaWithImage,
    r'multiple_images': PinMediaWithImages,
    r'multiple_mixed': PinMediaWithImageAndVideo,
    r'multiple_videos': PinMediaWithVideos,
    r'video': PinMediaWithVideo,
  };

  PinMedia._();

  factory PinMedia([void updates(PinMediaBuilder b)]) = _$PinMedia;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMedia> get serializer => _$PinMediaSerializer();
}

extension PinMediaDiscriminatorExt on PinMedia {
    String? get discriminatorValue {
        if (this is PinMediaWithImage) {
            return r'image';
        }
        if (this is PinMediaWithImages) {
            return r'multiple_images';
        }
        if (this is PinMediaWithImageAndVideo) {
            return r'multiple_mixed';
        }
        if (this is PinMediaWithVideos) {
            return r'multiple_videos';
        }
        if (this is PinMediaWithVideo) {
            return r'video';
        }
        return null;
    }
}
extension PinMediaBuilderDiscriminatorExt on PinMediaBuilder {
    String? get discriminatorValue {
        if (this is PinMediaWithImageBuilder) {
            return r'image';
        }
        if (this is PinMediaWithImagesBuilder) {
            return r'multiple_images';
        }
        if (this is PinMediaWithImageAndVideoBuilder) {
            return r'multiple_mixed';
        }
        if (this is PinMediaWithVideosBuilder) {
            return r'multiple_videos';
        }
        if (this is PinMediaWithVideoBuilder) {
            return r'video';
        }
        return null;
    }
}

class _$PinMediaSerializer implements PrimitiveSerializer<PinMedia> {
  @override
  final Iterable<Type> types = const [PinMedia, _$PinMedia];

  @override
  final String wireName = r'PinMedia';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMedia object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMedia object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  PinMedia deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(PinMedia.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [PinMediaWithImage, PinMediaWithImages, PinMediaWithImageAndVideo, PinMediaWithVideos, PinMediaWithVideo, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'image':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaWithImage),
        ) as PinMediaWithImage;
        oneOfType = PinMediaWithImage;
        break;
      case r'multiple_images':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaWithImages),
        ) as PinMediaWithImages;
        oneOfType = PinMediaWithImages;
        break;
      case r'multiple_mixed':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaWithImageAndVideo),
        ) as PinMediaWithImageAndVideo;
        oneOfType = PinMediaWithImageAndVideo;
        break;
      case r'multiple_videos':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaWithVideos),
        ) as PinMediaWithVideos;
        oneOfType = PinMediaWithVideos;
        break;
      case r'video':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaWithVideo),
        ) as PinMediaWithVideo;
        oneOfType = PinMediaWithVideo;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class PinMediaMediaTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'multiple_mixed')
  static const PinMediaMediaTypeEnum multipleMixed = _$pinMediaMediaTypeEnum_multipleMixed;

  static Serializer<PinMediaMediaTypeEnum> get serializer => _$pinMediaMediaTypeEnumSerializer;

  const PinMediaMediaTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaMediaTypeEnum> get values => _$pinMediaMediaTypeEnumValues;
  static PinMediaMediaTypeEnum valueOf(String name) => _$pinMediaMediaTypeEnumValueOf(name);
}

