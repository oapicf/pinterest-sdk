//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/content_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_image_base64.g.dart';

/// Image Base64-based media source.
///
/// Properties:
/// * [contentType] 
/// * [data] 
/// * [isStandard] - Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
/// * [sourceType] - The source type of the media.
@BuiltValue()
abstract class PinMediaSourceImageBase64 implements Built<PinMediaSourceImageBase64, PinMediaSourceImageBase64Builder> {
  @BuiltValueField(wireName: r'content_type')
  ContentType get contentType;
  // enum contentTypeEnum {  image/jpeg,  image/png,  };

  @BuiltValueField(wireName: r'data')
  String get data;

  /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  @BuiltValueField(wireName: r'is_standard')
  bool? get isStandard;

  /// The source type of the media.
  @BuiltValueField(wireName: r'source_type')
  PinMediaSourceImageBase64SourceTypeEnum get sourceType;
  // enum sourceTypeEnum {  image_base64,  };

  PinMediaSourceImageBase64._();

  factory PinMediaSourceImageBase64([void updates(PinMediaSourceImageBase64Builder b)]) = _$PinMediaSourceImageBase64;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceImageBase64Builder b) => b
      ..isStandard = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourceImageBase64> get serializer => _$PinMediaSourceImageBase64Serializer();
}

class _$PinMediaSourceImageBase64Serializer implements PrimitiveSerializer<PinMediaSourceImageBase64> {
  @override
  final Iterable<Type> types = const [PinMediaSourceImageBase64, _$PinMediaSourceImageBase64];

  @override
  final String wireName = r'PinMediaSourceImageBase64';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourceImageBase64 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'content_type';
    yield serializers.serialize(
      object.contentType,
      specifiedType: const FullType(ContentType),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(String),
    );
    if (object.isStandard != null) {
      yield r'is_standard';
      yield serializers.serialize(
        object.isStandard,
        specifiedType: const FullType(bool),
      );
    }
    yield r'source_type';
    yield serializers.serialize(
      object.sourceType,
      specifiedType: const FullType(PinMediaSourceImageBase64SourceTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourceImageBase64 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourceImageBase64Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ContentType),
          ) as ContentType;
          result.contentType = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.data = valueDes;
          break;
        case r'is_standard':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isStandard = valueDes;
          break;
        case r'source_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaSourceImageBase64SourceTypeEnum),
          ) as PinMediaSourceImageBase64SourceTypeEnum;
          result.sourceType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinMediaSourceImageBase64 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceImageBase64Builder();
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

class PinMediaSourceImageBase64SourceTypeEnum extends EnumClass {

  /// The source type of the media.
  @BuiltValueEnumConst(wireName: r'image_base64')
  static const PinMediaSourceImageBase64SourceTypeEnum imageBase64 = _$pinMediaSourceImageBase64SourceTypeEnum_imageBase64;

  static Serializer<PinMediaSourceImageBase64SourceTypeEnum> get serializer => _$pinMediaSourceImageBase64SourceTypeEnumSerializer;

  const PinMediaSourceImageBase64SourceTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaSourceImageBase64SourceTypeEnum> get values => _$pinMediaSourceImageBase64SourceTypeEnumValues;
  static PinMediaSourceImageBase64SourceTypeEnum valueOf(String name) => _$pinMediaSourceImageBase64SourceTypeEnumValueOf(name);
}

