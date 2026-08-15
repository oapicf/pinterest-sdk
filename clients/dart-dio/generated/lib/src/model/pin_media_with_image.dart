//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/image_size.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_with_image.g.dart';

/// Pin with image.
///
/// Properties:
/// * [images] 
/// * [mediaType] 
@BuiltValue()
abstract class PinMediaWithImage implements Built<PinMediaWithImage, PinMediaWithImageBuilder> {
  @BuiltValueField(wireName: r'images')
  ImageSize? get images;

  @BuiltValueField(wireName: r'media_type')
  PinMediaWithImageMediaTypeEnum get mediaType;
  // enum mediaTypeEnum {  image,  };

  PinMediaWithImage._();

  factory PinMediaWithImage([void updates(PinMediaWithImageBuilder b)]) = _$PinMediaWithImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaWithImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaWithImage> get serializer => _$PinMediaWithImageSerializer();
}

class _$PinMediaWithImageSerializer implements PrimitiveSerializer<PinMediaWithImage> {
  @override
  final Iterable<Type> types = const [PinMediaWithImage, _$PinMediaWithImage];

  @override
  final String wireName = r'PinMediaWithImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaWithImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
      specifiedType: const FullType(PinMediaWithImageMediaTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaWithImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaWithImageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'images':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ImageSize),
          ) as ImageSize;
          result.images.replace(valueDes);
          break;
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaWithImageMediaTypeEnum),
          ) as PinMediaWithImageMediaTypeEnum;
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
  PinMediaWithImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaWithImageBuilder();
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

class PinMediaWithImageMediaTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'image')
  static const PinMediaWithImageMediaTypeEnum image = _$pinMediaWithImageMediaTypeEnum_image;

  static Serializer<PinMediaWithImageMediaTypeEnum> get serializer => _$pinMediaWithImageMediaTypeEnumSerializer;

  const PinMediaWithImageMediaTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaWithImageMediaTypeEnum> get values => _$pinMediaWithImageMediaTypeEnumValues;
  static PinMediaWithImageMediaTypeEnum valueOf(String name) => _$pinMediaWithImageMediaTypeEnumValueOf(name);
}

