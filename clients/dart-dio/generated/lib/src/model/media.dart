//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/media_upload_type.dart';
import 'package:openapi/src/model/media_upload_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media.g.dart';

/// Media
///
/// Properties:
/// * [mediaId] - Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
/// * [mediaType] 
/// * [status] 
@BuiltValue()
abstract class Media implements Built<Media, MediaBuilder> {
  /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  @BuiltValueField(wireName: r'media_id')
  String get mediaId;

  @BuiltValueField(wireName: r'media_type')
  MediaUploadType get mediaType;
  // enum mediaTypeEnum {  video,  };

  @BuiltValueField(wireName: r'status')
  MediaUploadStatus? get status;
  // enum statusEnum {  registered,  processing,  succeeded,  failed,  };

  Media._();

  factory Media([void updates(MediaBuilder b)]) = _$Media;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MediaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Media> get serializer => _$MediaSerializer();
}

class _$MediaSerializer implements PrimitiveSerializer<Media> {
  @override
  final Iterable<Type> types = const [Media, _$Media];

  @override
  final String wireName = r'Media';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Media object, {
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
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(MediaUploadStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Media object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MediaBuilder result,
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
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MediaUploadStatus),
          ) as MediaUploadStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Media deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MediaBuilder();
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

