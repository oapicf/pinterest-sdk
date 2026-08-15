//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'image_base64.g.dart';

/// Base64-encoded image media source
///
/// Properties:
/// * [contentType] 
/// * [data] 
@BuiltValue()
abstract class ImageBase64 implements Built<ImageBase64, ImageBase64Builder> {
  @BuiltValueField(wireName: r'content_type')
  ImageBase64ContentTypeEnum get contentType;
  // enum contentTypeEnum {  image/jpeg,  image/png,  };

  @BuiltValueField(wireName: r'data')
  String get data;

  ImageBase64._();

  factory ImageBase64([void updates(ImageBase64Builder b)]) = _$ImageBase64;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ImageBase64Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ImageBase64> get serializer => _$ImageBase64Serializer();
}

class _$ImageBase64Serializer implements PrimitiveSerializer<ImageBase64> {
  @override
  final Iterable<Type> types = const [ImageBase64, _$ImageBase64];

  @override
  final String wireName = r'ImageBase64';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ImageBase64 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'content_type';
    yield serializers.serialize(
      object.contentType,
      specifiedType: const FullType(ImageBase64ContentTypeEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ImageBase64 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ImageBase64Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ImageBase64ContentTypeEnum),
          ) as ImageBase64ContentTypeEnum;
          result.contentType = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.data = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ImageBase64 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ImageBase64Builder();
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

class ImageBase64ContentTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'image/jpeg')
  static const ImageBase64ContentTypeEnum imageSlashJpeg = _$imageBase64ContentTypeEnum_imageSlashJpeg;
  @BuiltValueEnumConst(wireName: r'image/png')
  static const ImageBase64ContentTypeEnum imageSlashPng = _$imageBase64ContentTypeEnum_imageSlashPng;

  static Serializer<ImageBase64ContentTypeEnum> get serializer => _$imageBase64ContentTypeEnumSerializer;

  const ImageBase64ContentTypeEnum._(String name): super(name);

  static BuiltSet<ImageBase64ContentTypeEnum> get values => _$imageBase64ContentTypeEnumValues;
  static ImageBase64ContentTypeEnum valueOf(String name) => _$imageBase64ContentTypeEnumValueOf(name);
}

