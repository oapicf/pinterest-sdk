//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/image_size.dart';
import 'package:openapi/src/model/video_metadata_with_item_type.dart';
import 'package:openapi/src/model/image_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'pin_media_metadata.g.dart';

/// Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
///
/// Properties:
/// * [description] 
/// * [images] 
/// * [itemType] - Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
/// * [link] 
/// * [title] 
/// * [coverImageUrl] 
/// * [duration] - Duration (in miliseconds). Field maybe null after creation due to video processing time.
/// * [height] - Height (in pixels). Field maybe null after creation due to video processing time.
/// * [videoUrl] - Video url (720p).  **Note:** This field is limited and not available to all apps.
/// * [videoUrlHls] - Video url (HLS).  **Note:** This field is limited and not available to all apps.
/// * [width] - Width (in pixels). Field maybe null after creation due to video processing time.
@BuiltValue()
abstract class PinMediaMetadata implements Built<PinMediaMetadata, PinMediaMetadataBuilder> {
  /// One Of [ImageMetadata], [VideoMetadataWithItemType]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'item_type';

  static const Map<String, Type> discriminatorMapping = {
    r'image': ImageMetadata,
    r'video': VideoMetadataWithItemType,
  };

  PinMediaMetadata._();

  factory PinMediaMetadata([void updates(PinMediaMetadataBuilder b)]) = _$PinMediaMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaMetadata> get serializer => _$PinMediaMetadataSerializer();
}

extension PinMediaMetadataDiscriminatorExt on PinMediaMetadata {
    String? get discriminatorValue {
        if (this is ImageMetadata) {
            return r'image';
        }
        if (this is VideoMetadataWithItemType) {
            return r'video';
        }
        return null;
    }
}
extension PinMediaMetadataBuilderDiscriminatorExt on PinMediaMetadataBuilder {
    String? get discriminatorValue {
        if (this is ImageMetadataBuilder) {
            return r'image';
        }
        if (this is VideoMetadataWithItemTypeBuilder) {
            return r'video';
        }
        return null;
    }
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
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  PinMediaMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaMetadataBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(PinMediaMetadata.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [ImageMetadata, VideoMetadataWithItemType, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'image':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(ImageMetadata),
        ) as ImageMetadata;
        oneOfType = ImageMetadata;
        break;
      case r'video':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(VideoMetadataWithItemType),
        ) as VideoMetadataWithItemType;
        oneOfType = VideoMetadataWithItemType;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class PinMediaMetadataItemTypeEnum extends EnumClass {

  /// Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
  @BuiltValueEnumConst(wireName: r'video')
  static const PinMediaMetadataItemTypeEnum video = _$pinMediaMetadataItemTypeEnum_video;

  static Serializer<PinMediaMetadataItemTypeEnum> get serializer => _$pinMediaMetadataItemTypeEnumSerializer;

  const PinMediaMetadataItemTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaMetadataItemTypeEnum> get values => _$pinMediaMetadataItemTypeEnumValues;
  static PinMediaMetadataItemTypeEnum valueOf(String name) => _$pinMediaMetadataItemTypeEnumValueOf(name);
}

