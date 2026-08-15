//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/video_metadata_with_item_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_with_videos.g.dart';

/// Pin with multiple videos.
///
/// Properties:
/// * [items] 
/// * [mediaType] 
@BuiltValue()
abstract class PinMediaWithVideos implements Built<PinMediaWithVideos, PinMediaWithVideosBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<VideoMetadataWithItemType>? get items;

  @BuiltValueField(wireName: r'media_type')
  PinMediaWithVideosMediaTypeEnum get mediaType;
  // enum mediaTypeEnum {  multiple_videos,  };

  PinMediaWithVideos._();

  factory PinMediaWithVideos([void updates(PinMediaWithVideosBuilder b)]) = _$PinMediaWithVideos;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaWithVideosBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaWithVideos> get serializer => _$PinMediaWithVideosSerializer();
}

class _$PinMediaWithVideosSerializer implements PrimitiveSerializer<PinMediaWithVideos> {
  @override
  final Iterable<Type> types = const [PinMediaWithVideos, _$PinMediaWithVideos];

  @override
  final String wireName = r'PinMediaWithVideos';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaWithVideos object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(VideoMetadataWithItemType)]),
      );
    }
    yield r'media_type';
    yield serializers.serialize(
      object.mediaType,
      specifiedType: const FullType(PinMediaWithVideosMediaTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaWithVideos object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaWithVideosBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(VideoMetadataWithItemType)]),
          ) as BuiltList<VideoMetadataWithItemType>;
          result.items.replace(valueDes);
          break;
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaWithVideosMediaTypeEnum),
          ) as PinMediaWithVideosMediaTypeEnum;
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
  PinMediaWithVideos deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaWithVideosBuilder();
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

class PinMediaWithVideosMediaTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'multiple_videos')
  static const PinMediaWithVideosMediaTypeEnum multipleVideos = _$pinMediaWithVideosMediaTypeEnum_multipleVideos;

  static Serializer<PinMediaWithVideosMediaTypeEnum> get serializer => _$pinMediaWithVideosMediaTypeEnumSerializer;

  const PinMediaWithVideosMediaTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaWithVideosMediaTypeEnum> get values => _$pinMediaWithVideosMediaTypeEnumValues;
  static PinMediaWithVideosMediaTypeEnum valueOf(String name) => _$pinMediaWithVideosMediaTypeEnumValueOf(name);
}

