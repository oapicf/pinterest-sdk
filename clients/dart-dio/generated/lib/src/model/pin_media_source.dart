//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pin_media_source_images_base64.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin_media_source_images_url.dart';
import 'package:openapi/src/model/content_type.dart';
import 'package:openapi/src/model/pin_media_source_image_url.dart';
import 'package:openapi/src/model/pin_media_source_image_base64.dart';
import 'package:openapi/src/model/pin_media_source_pin_url.dart';
import 'package:openapi/src/model/pin_media_source_video_id.dart';
import 'package:openapi/src/model/pin_media_source_images_url_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'pin_media_source.g.dart';

/// Pin media source that can be an image, video, or a mix of both passed in as a request.
///
/// Properties:
/// * [contentType] 
/// * [data] 
/// * [isStandard] - Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
/// * [sourceType] 
/// * [url] 
/// * [coverImageContentType] - Content type for cover image Base64.
/// * [coverImageData] - Cover image Base64.
/// * [coverImageKeyFrameTime] - Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
/// * [coverImageUrl] - Cover image URL.
/// * [mediaId] 
/// * [index] 
/// * [items] - Array with image objects.
/// * [isAffiliateLink] - This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
@BuiltValue()
abstract class PinMediaSource implements Built<PinMediaSource, PinMediaSourceBuilder> {
  /// One Of [PinMediaSourceImageBase64], [PinMediaSourceImageURL], [PinMediaSourceImagesBase64], [PinMediaSourceImagesURL], [PinMediaSourcePinURL], [PinMediaSourceVideoID]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'source_type';

  static const Map<String, Type> discriminatorMapping = {
    r'image_base64': PinMediaSourceImageBase64,
    r'image_url': PinMediaSourceImageURL,
    r'multiple_image_base64': PinMediaSourceImagesBase64,
    r'multiple_image_urls': PinMediaSourceImagesURL,
    r'pin_url': PinMediaSourcePinURL,
    r'video_id': PinMediaSourceVideoID,
  };

  PinMediaSource._();

  factory PinMediaSource([void updates(PinMediaSourceBuilder b)]) = _$PinMediaSource;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSource> get serializer => _$PinMediaSourceSerializer();
}

extension PinMediaSourceDiscriminatorExt on PinMediaSource {
    String? get discriminatorValue {
        if (this is PinMediaSourceImageBase64) {
            return r'image_base64';
        }
        if (this is PinMediaSourceImageURL) {
            return r'image_url';
        }
        if (this is PinMediaSourceImagesBase64) {
            return r'multiple_image_base64';
        }
        if (this is PinMediaSourceImagesURL) {
            return r'multiple_image_urls';
        }
        if (this is PinMediaSourcePinURL) {
            return r'pin_url';
        }
        if (this is PinMediaSourceVideoID) {
            return r'video_id';
        }
        return null;
    }
}
extension PinMediaSourceBuilderDiscriminatorExt on PinMediaSourceBuilder {
    String? get discriminatorValue {
        if (this is PinMediaSourceImageBase64Builder) {
            return r'image_base64';
        }
        if (this is PinMediaSourceImageURLBuilder) {
            return r'image_url';
        }
        if (this is PinMediaSourceImagesBase64Builder) {
            return r'multiple_image_base64';
        }
        if (this is PinMediaSourceImagesURLBuilder) {
            return r'multiple_image_urls';
        }
        if (this is PinMediaSourcePinURLBuilder) {
            return r'pin_url';
        }
        if (this is PinMediaSourceVideoIDBuilder) {
            return r'video_id';
        }
        return null;
    }
}

class _$PinMediaSourceSerializer implements PrimitiveSerializer<PinMediaSource> {
  @override
  final Iterable<Type> types = const [PinMediaSource, _$PinMediaSource];

  @override
  final String wireName = r'PinMediaSource';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSource object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSource object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  PinMediaSource deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(PinMediaSource.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [PinMediaSourceImageBase64, PinMediaSourceImageURL, PinMediaSourceImagesBase64, PinMediaSourceImagesURL, PinMediaSourcePinURL, PinMediaSourceVideoID, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'image_base64':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaSourceImageBase64),
        ) as PinMediaSourceImageBase64;
        oneOfType = PinMediaSourceImageBase64;
        break;
      case r'image_url':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaSourceImageURL),
        ) as PinMediaSourceImageURL;
        oneOfType = PinMediaSourceImageURL;
        break;
      case r'multiple_image_base64':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaSourceImagesBase64),
        ) as PinMediaSourceImagesBase64;
        oneOfType = PinMediaSourceImagesBase64;
        break;
      case r'multiple_image_urls':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaSourceImagesURL),
        ) as PinMediaSourceImagesURL;
        oneOfType = PinMediaSourceImagesURL;
        break;
      case r'pin_url':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaSourcePinURL),
        ) as PinMediaSourcePinURL;
        oneOfType = PinMediaSourcePinURL;
        break;
      case r'video_id':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(PinMediaSourceVideoID),
        ) as PinMediaSourceVideoID;
        oneOfType = PinMediaSourceVideoID;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class PinMediaSourceSourceTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'pin_url')
  static const PinMediaSourceSourceTypeEnum pinUrl = _$pinMediaSourceSourceTypeEnum_pinUrl;

  static Serializer<PinMediaSourceSourceTypeEnum> get serializer => _$pinMediaSourceSourceTypeEnumSerializer;

  const PinMediaSourceSourceTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaSourceSourceTypeEnum> get values => _$pinMediaSourceSourceTypeEnumValues;
  static PinMediaSourceSourceTypeEnum valueOf(String name) => _$pinMediaSourceSourceTypeEnumValueOf(name);
}

