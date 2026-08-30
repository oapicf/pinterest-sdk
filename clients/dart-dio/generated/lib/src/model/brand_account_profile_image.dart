//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'brand_account_profile_image.g.dart';

/// Base64-encoded image media source
///
/// Properties:
/// * [contentType] 
/// * [data] 
@BuiltValue()
abstract class BrandAccountProfileImage implements Built<BrandAccountProfileImage, BrandAccountProfileImageBuilder> {
  @BuiltValueField(wireName: r'content_type')
  BrandAccountProfileImageContentTypeEnum get contentType;
  // enum contentTypeEnum {  image/jpeg,  image/png,  };

  @BuiltValueField(wireName: r'data')
  String get data;

  BrandAccountProfileImage._();

  factory BrandAccountProfileImage([void updates(BrandAccountProfileImageBuilder b)]) = _$BrandAccountProfileImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BrandAccountProfileImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BrandAccountProfileImage> get serializer => _$BrandAccountProfileImageSerializer();
}

class _$BrandAccountProfileImageSerializer implements PrimitiveSerializer<BrandAccountProfileImage> {
  @override
  final Iterable<Type> types = const [BrandAccountProfileImage, _$BrandAccountProfileImage];

  @override
  final String wireName = r'BrandAccountProfileImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BrandAccountProfileImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'content_type';
    yield serializers.serialize(
      object.contentType,
      specifiedType: const FullType(BrandAccountProfileImageContentTypeEnum),
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
    BrandAccountProfileImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BrandAccountProfileImageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BrandAccountProfileImageContentTypeEnum),
          ) as BrandAccountProfileImageContentTypeEnum;
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
  BrandAccountProfileImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BrandAccountProfileImageBuilder();
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

class BrandAccountProfileImageContentTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'image/jpeg')
  static const BrandAccountProfileImageContentTypeEnum imageSlashJpeg = _$brandAccountProfileImageContentTypeEnum_imageSlashJpeg;
  @BuiltValueEnumConst(wireName: r'image/png')
  static const BrandAccountProfileImageContentTypeEnum imageSlashPng = _$brandAccountProfileImageContentTypeEnum_imageSlashPng;

  static Serializer<BrandAccountProfileImageContentTypeEnum> get serializer => _$brandAccountProfileImageContentTypeEnumSerializer;

  const BrandAccountProfileImageContentTypeEnum._(String name): super(name);

  static BuiltSet<BrandAccountProfileImageContentTypeEnum> get values => _$brandAccountProfileImageContentTypeEnumValues;
  static BrandAccountProfileImageContentTypeEnum valueOf(String name) => _$brandAccountProfileImageContentTypeEnumValueOf(name);
}

