//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/media_upload_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media_upload_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [mediaType] 
@BuiltValue()
abstract class MediaUploadCreate implements Built<MediaUploadCreate, MediaUploadCreateBuilder> {
  @BuiltValueField(wireName: r'media_type')
  MediaUploadType get mediaType;
  // enum mediaTypeEnum {  video,  };

  MediaUploadCreate._();

  factory MediaUploadCreate([void updates(MediaUploadCreateBuilder b)]) = _$MediaUploadCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MediaUploadCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MediaUploadCreate> get serializer => _$MediaUploadCreateSerializer();
}

class _$MediaUploadCreateSerializer implements PrimitiveSerializer<MediaUploadCreate> {
  @override
  final Iterable<Type> types = const [MediaUploadCreate, _$MediaUploadCreate];

  @override
  final String wireName = r'MediaUploadCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MediaUploadCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'media_type';
    yield serializers.serialize(
      object.mediaType,
      specifiedType: const FullType(MediaUploadType),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MediaUploadCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MediaUploadCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MediaUploadType),
          ) as MediaUploadType;
          result.mediaType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MediaUploadCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MediaUploadCreateBuilder();
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

