//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin_media_source_images_base64_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_images_base64.g.dart';

/// Multiple Base64-based images media source
///
/// Properties:
/// * [index] 
/// * [items] - Array with image objects.
/// * [sourceType] - The source type of the media.
@BuiltValue()
abstract class PinMediaSourceImagesBase64 implements Built<PinMediaSourceImagesBase64, PinMediaSourceImagesBase64Builder> {
  @BuiltValueField(wireName: r'index')
  int? get index;

  /// Array with image objects.
  @BuiltValueField(wireName: r'items')
  BuiltList<PinMediaSourceImagesBase64Item> get items;

  /// The source type of the media.
  @BuiltValueField(wireName: r'source_type')
  PinMediaSourceImagesBase64SourceTypeEnum get sourceType;
  // enum sourceTypeEnum {  multiple_image_base64,  };

  PinMediaSourceImagesBase64._();

  factory PinMediaSourceImagesBase64([void updates(PinMediaSourceImagesBase64Builder b)]) = _$PinMediaSourceImagesBase64;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceImagesBase64Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourceImagesBase64> get serializer => _$PinMediaSourceImagesBase64Serializer();
}

class _$PinMediaSourceImagesBase64Serializer implements PrimitiveSerializer<PinMediaSourceImagesBase64> {
  @override
  final Iterable<Type> types = const [PinMediaSourceImagesBase64, _$PinMediaSourceImagesBase64];

  @override
  final String wireName = r'PinMediaSourceImagesBase64';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourceImagesBase64 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.index != null) {
      yield r'index';
      yield serializers.serialize(
        object.index,
        specifiedType: const FullType(int),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(PinMediaSourceImagesBase64Item)]),
    );
    yield r'source_type';
    yield serializers.serialize(
      object.sourceType,
      specifiedType: const FullType(PinMediaSourceImagesBase64SourceTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourceImagesBase64 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourceImagesBase64Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.index = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PinMediaSourceImagesBase64Item)]),
          ) as BuiltList<PinMediaSourceImagesBase64Item>;
          result.items.replace(valueDes);
          break;
        case r'source_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaSourceImagesBase64SourceTypeEnum),
          ) as PinMediaSourceImagesBase64SourceTypeEnum;
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
  PinMediaSourceImagesBase64 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceImagesBase64Builder();
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

class PinMediaSourceImagesBase64SourceTypeEnum extends EnumClass {

  /// The source type of the media.
  @BuiltValueEnumConst(wireName: r'multiple_image_base64')
  static const PinMediaSourceImagesBase64SourceTypeEnum multipleImageBase64 = _$pinMediaSourceImagesBase64SourceTypeEnum_multipleImageBase64;

  static Serializer<PinMediaSourceImagesBase64SourceTypeEnum> get serializer => _$pinMediaSourceImagesBase64SourceTypeEnumSerializer;

  const PinMediaSourceImagesBase64SourceTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaSourceImagesBase64SourceTypeEnum> get values => _$pinMediaSourceImagesBase64SourceTypeEnumValues;
  static PinMediaSourceImagesBase64SourceTypeEnum valueOf(String name) => _$pinMediaSourceImagesBase64SourceTypeEnumValueOf(name);
}

