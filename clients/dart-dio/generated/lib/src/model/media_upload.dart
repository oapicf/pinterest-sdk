//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/media_upload_type.dart';
import 'package:openapi/src/model/media_upload_parameters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media_upload.g.dart';

/// Media upload that has been registered but not uploaded/processed yet.
///
/// Properties:
/// * [mediaId] - Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
/// * [mediaType] 
/// * [uploadParameters] - The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
/// * [uploadUrl] - The URL where you will POST your media file.
@BuiltValue()
abstract class MediaUpload implements Built<MediaUpload, MediaUploadBuilder> {
  /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  @BuiltValueField(wireName: r'media_id')
  String get mediaId;

  @BuiltValueField(wireName: r'media_type')
  MediaUploadType get mediaType;
  // enum mediaTypeEnum {  video,  };

  /// The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  @BuiltValueField(wireName: r'upload_parameters')
  MediaUploadParameters? get uploadParameters;

  /// The URL where you will POST your media file.
  @BuiltValueField(wireName: r'upload_url')
  String? get uploadUrl;

  MediaUpload._();

  factory MediaUpload([void updates(MediaUploadBuilder b)]) = _$MediaUpload;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MediaUploadBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MediaUpload> get serializer => _$MediaUploadSerializer();
}

class _$MediaUploadSerializer implements PrimitiveSerializer<MediaUpload> {
  @override
  final Iterable<Type> types = const [MediaUpload, _$MediaUpload];

  @override
  final String wireName = r'MediaUpload';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MediaUpload object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'media_id';
    yield serializers.serialize(
      object.mediaId,
      specifiedType: const FullType(String),
    );
    yield r'media_type';
    yield serializers.serialize(
      object.mediaType,
      specifiedType: const FullType(MediaUploadType),
    );
    if (object.uploadParameters != null) {
      yield r'upload_parameters';
      yield serializers.serialize(
        object.uploadParameters,
        specifiedType: const FullType(MediaUploadParameters),
      );
    }
    if (object.uploadUrl != null) {
      yield r'upload_url';
      yield serializers.serialize(
        object.uploadUrl,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MediaUpload object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MediaUploadBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'media_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaId = valueDes;
          break;
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MediaUploadType),
          ) as MediaUploadType;
          result.mediaType = valueDes;
          break;
        case r'upload_parameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MediaUploadParameters),
          ) as MediaUploadParameters?;
          if (valueDes == null) continue;
          result.uploadParameters.replace(valueDes);
          break;
        case r'upload_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.uploadUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MediaUpload deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MediaUploadBuilder();
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

