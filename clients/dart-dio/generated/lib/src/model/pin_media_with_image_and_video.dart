//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pin_media_metadata.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_with_image_and_video.g.dart';

/// Pin with a mix of images and videos.
///
/// Properties:
/// * [items] 
/// * [mediaType] 
@BuiltValue()
abstract class PinMediaWithImageAndVideo implements Built<PinMediaWithImageAndVideo, PinMediaWithImageAndVideoBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<PinMediaMetadata>? get items;

  @BuiltValueField(wireName: r'media_type')
  PinMediaWithImageAndVideoMediaTypeEnum get mediaType;
  // enum mediaTypeEnum {  multiple_mixed,  };

  PinMediaWithImageAndVideo._();

  factory PinMediaWithImageAndVideo([void updates(PinMediaWithImageAndVideoBuilder b)]) = _$PinMediaWithImageAndVideo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaWithImageAndVideoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaWithImageAndVideo> get serializer => _$PinMediaWithImageAndVideoSerializer();
}

class _$PinMediaWithImageAndVideoSerializer implements PrimitiveSerializer<PinMediaWithImageAndVideo> {
  @override
  final Iterable<Type> types = const [PinMediaWithImageAndVideo, _$PinMediaWithImageAndVideo];

  @override
  final String wireName = r'PinMediaWithImageAndVideo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaWithImageAndVideo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(PinMediaMetadata)]),
      );
    }
    yield r'media_type';
    yield serializers.serialize(
      object.mediaType,
      specifiedType: const FullType(PinMediaWithImageAndVideoMediaTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaWithImageAndVideo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaWithImageAndVideoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(PinMediaMetadata)]),
          ) as BuiltList<PinMediaMetadata>?;
          if (valueDes == null) continue;
          result.items.replace(valueDes);
          break;
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaWithImageAndVideoMediaTypeEnum),
          ) as PinMediaWithImageAndVideoMediaTypeEnum;
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
  PinMediaWithImageAndVideo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaWithImageAndVideoBuilder();
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

class PinMediaWithImageAndVideoMediaTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'multiple_mixed')
  static const PinMediaWithImageAndVideoMediaTypeEnum multipleMixed = _$pinMediaWithImageAndVideoMediaTypeEnum_multipleMixed;

  static Serializer<PinMediaWithImageAndVideoMediaTypeEnum> get serializer => _$pinMediaWithImageAndVideoMediaTypeEnumSerializer;

  const PinMediaWithImageAndVideoMediaTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaWithImageAndVideoMediaTypeEnum> get values => _$pinMediaWithImageAndVideoMediaTypeEnumValues;
  static PinMediaWithImageAndVideoMediaTypeEnum valueOf(String name) => _$pinMediaWithImageAndVideoMediaTypeEnumValueOf(name);
}

