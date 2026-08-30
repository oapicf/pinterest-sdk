//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/image_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_with_images.g.dart';

/// Pin with multiple images.
///
/// Properties:
/// * [items] 
/// * [mediaType] 
@BuiltValue()
abstract class PinMediaWithImages implements Built<PinMediaWithImages, PinMediaWithImagesBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<ImageMetadata>? get items;

  @BuiltValueField(wireName: r'media_type')
  PinMediaWithImagesMediaTypeEnum get mediaType;
  // enum mediaTypeEnum {  multiple_images,  };

  PinMediaWithImages._();

  factory PinMediaWithImages([void updates(PinMediaWithImagesBuilder b)]) = _$PinMediaWithImages;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaWithImagesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaWithImages> get serializer => _$PinMediaWithImagesSerializer();
}

class _$PinMediaWithImagesSerializer implements PrimitiveSerializer<PinMediaWithImages> {
  @override
  final Iterable<Type> types = const [PinMediaWithImages, _$PinMediaWithImages];

  @override
  final String wireName = r'PinMediaWithImages';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaWithImages object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(ImageMetadata)]),
      );
    }
    yield r'media_type';
    yield serializers.serialize(
      object.mediaType,
      specifiedType: const FullType(PinMediaWithImagesMediaTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaWithImages object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaWithImagesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ImageMetadata)]),
          ) as BuiltList<ImageMetadata>?;
          if (valueDes == null) continue;
          result.items.replace(valueDes);
          break;
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaWithImagesMediaTypeEnum),
          ) as PinMediaWithImagesMediaTypeEnum;
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
  PinMediaWithImages deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaWithImagesBuilder();
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

class PinMediaWithImagesMediaTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'multiple_images')
  static const PinMediaWithImagesMediaTypeEnum multipleImages = _$pinMediaWithImagesMediaTypeEnum_multipleImages;

  static Serializer<PinMediaWithImagesMediaTypeEnum> get serializer => _$pinMediaWithImagesMediaTypeEnumSerializer;

  const PinMediaWithImagesMediaTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaWithImagesMediaTypeEnum> get values => _$pinMediaWithImagesMediaTypeEnumValues;
  static PinMediaWithImagesMediaTypeEnum valueOf(String name) => _$pinMediaWithImagesMediaTypeEnumValueOf(name);
}

