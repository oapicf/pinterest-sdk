//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'brand_account_profile_image_update.g.dart';

/// Base64-encoded image media source
///
/// Properties:
/// * [contentType] 
/// * [data] 
@BuiltValue()
abstract class BrandAccountProfileImageUpdate implements Built<BrandAccountProfileImageUpdate, BrandAccountProfileImageUpdateBuilder> {
  @BuiltValueField(wireName: r'content_type')
  BrandAccountProfileImageUpdateContentTypeEnum? get contentType;
  // enum contentTypeEnum {  image/jpeg,  image/png,  };

  @BuiltValueField(wireName: r'data')
  String? get data;

  BrandAccountProfileImageUpdate._();

  factory BrandAccountProfileImageUpdate([void updates(BrandAccountProfileImageUpdateBuilder b)]) = _$BrandAccountProfileImageUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BrandAccountProfileImageUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BrandAccountProfileImageUpdate> get serializer => _$BrandAccountProfileImageUpdateSerializer();
}

class _$BrandAccountProfileImageUpdateSerializer implements PrimitiveSerializer<BrandAccountProfileImageUpdate> {
  @override
  final Iterable<Type> types = const [BrandAccountProfileImageUpdate, _$BrandAccountProfileImageUpdate];

  @override
  final String wireName = r'BrandAccountProfileImageUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BrandAccountProfileImageUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.contentType != null) {
      yield r'content_type';
      yield serializers.serialize(
        object.contentType,
        specifiedType: const FullType(BrandAccountProfileImageUpdateContentTypeEnum),
      );
    }
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BrandAccountProfileImageUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BrandAccountProfileImageUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BrandAccountProfileImageUpdateContentTypeEnum),
          ) as BrandAccountProfileImageUpdateContentTypeEnum?;
          if (valueDes == null) continue;
          result.contentType = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  BrandAccountProfileImageUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BrandAccountProfileImageUpdateBuilder();
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

class BrandAccountProfileImageUpdateContentTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'image/jpeg')
  static const BrandAccountProfileImageUpdateContentTypeEnum imageSlashJpeg = _$brandAccountProfileImageUpdateContentTypeEnum_imageSlashJpeg;
  @BuiltValueEnumConst(wireName: r'image/png')
  static const BrandAccountProfileImageUpdateContentTypeEnum imageSlashPng = _$brandAccountProfileImageUpdateContentTypeEnum_imageSlashPng;

  static Serializer<BrandAccountProfileImageUpdateContentTypeEnum> get serializer => _$brandAccountProfileImageUpdateContentTypeEnumSerializer;

  const BrandAccountProfileImageUpdateContentTypeEnum._(String name): super(name);

  static BuiltSet<BrandAccountProfileImageUpdateContentTypeEnum> get values => _$brandAccountProfileImageUpdateContentTypeEnumValues;
  static BrandAccountProfileImageUpdateContentTypeEnum valueOf(String name) => _$brandAccountProfileImageUpdateContentTypeEnumValueOf(name);
}

