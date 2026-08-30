//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/content_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_video_id.g.dart';

/// Video ID-based media source.
///
/// Properties:
/// * [coverImageContentType] - Content type for cover image Base64.
/// * [coverImageData] - Cover image Base64.
/// * [coverImageKeyFrameTime] - Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
/// * [coverImageUrl] - Cover image URL.
/// * [isStandard] - Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
/// * [mediaId] 
/// * [sourceType] 
@BuiltValue()
abstract class PinMediaSourceVideoID implements Built<PinMediaSourceVideoID, PinMediaSourceVideoIDBuilder> {
  /// Content type for cover image Base64.
  @BuiltValueField(wireName: r'cover_image_content_type')
  ContentType? get coverImageContentType;
  // enum coverImageContentTypeEnum {  image/jpeg,  image/png,  };

  /// Cover image Base64.
  @BuiltValueField(wireName: r'cover_image_data')
  String? get coverImageData;

  /// Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
  @BuiltValueField(wireName: r'cover_image_key_frame_time')
  int? get coverImageKeyFrameTime;

  /// Cover image URL.
  @BuiltValueField(wireName: r'cover_image_url')
  String? get coverImageUrl;

  /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  @BuiltValueField(wireName: r'is_standard')
  bool? get isStandard;

  @BuiltValueField(wireName: r'media_id')
  String get mediaId;

  @BuiltValueField(wireName: r'source_type')
  PinMediaSourceVideoIDSourceTypeEnum get sourceType;
  // enum sourceTypeEnum {  video_id,  };

  PinMediaSourceVideoID._();

  factory PinMediaSourceVideoID([void updates(PinMediaSourceVideoIDBuilder b)]) = _$PinMediaSourceVideoID;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceVideoIDBuilder b) => b
      ..isStandard = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourceVideoID> get serializer => _$PinMediaSourceVideoIDSerializer();
}

class _$PinMediaSourceVideoIDSerializer implements PrimitiveSerializer<PinMediaSourceVideoID> {
  @override
  final Iterable<Type> types = const [PinMediaSourceVideoID, _$PinMediaSourceVideoID];

  @override
  final String wireName = r'PinMediaSourceVideoID';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourceVideoID object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.coverImageContentType != null) {
      yield r'cover_image_content_type';
      yield serializers.serialize(
        object.coverImageContentType,
        specifiedType: const FullType(ContentType),
      );
    }
    if (object.coverImageData != null) {
      yield r'cover_image_data';
      yield serializers.serialize(
        object.coverImageData,
        specifiedType: const FullType(String),
      );
    }
    if (object.coverImageKeyFrameTime != null) {
      yield r'cover_image_key_frame_time';
      yield serializers.serialize(
        object.coverImageKeyFrameTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.coverImageUrl != null) {
      yield r'cover_image_url';
      yield serializers.serialize(
        object.coverImageUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.isStandard != null) {
      yield r'is_standard';
      yield serializers.serialize(
        object.isStandard,
        specifiedType: const FullType(bool),
      );
    }
    yield r'media_id';
    yield serializers.serialize(
      object.mediaId,
      specifiedType: const FullType(String),
    );
    yield r'source_type';
    yield serializers.serialize(
      object.sourceType,
      specifiedType: const FullType(PinMediaSourceVideoIDSourceTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourceVideoID object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourceVideoIDBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cover_image_content_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ContentType),
          ) as ContentType?;
          if (valueDes == null) continue;
          result.coverImageContentType = valueDes;
          break;
        case r'cover_image_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.coverImageData = valueDes;
          break;
        case r'cover_image_key_frame_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.coverImageKeyFrameTime = valueDes;
          break;
        case r'cover_image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.coverImageUrl = valueDes;
          break;
        case r'is_standard':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isStandard = valueDes;
          break;
        case r'media_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaId = valueDes;
          break;
        case r'source_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaSourceVideoIDSourceTypeEnum),
          ) as PinMediaSourceVideoIDSourceTypeEnum;
          result.sourceType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinMediaSourceVideoID deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceVideoIDBuilder();
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

class PinMediaSourceVideoIDSourceTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'video_id')
  static const PinMediaSourceVideoIDSourceTypeEnum videoId = _$pinMediaSourceVideoIDSourceTypeEnum_videoId;

  static Serializer<PinMediaSourceVideoIDSourceTypeEnum> get serializer => _$pinMediaSourceVideoIDSourceTypeEnumSerializer;

  const PinMediaSourceVideoIDSourceTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaSourceVideoIDSourceTypeEnum> get values => _$pinMediaSourceVideoIDSourceTypeEnumValues;
  static PinMediaSourceVideoIDSourceTypeEnum valueOf(String name) => _$pinMediaSourceVideoIDSourceTypeEnumValueOf(name);
}

