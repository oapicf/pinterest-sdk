//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_image_url.g.dart';

/// Image URL-based media source.
///
/// Properties:
/// * [isStandard] - Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
/// * [sourceType] - The source type of the media.
/// * [url] 
@BuiltValue()
abstract class PinMediaSourceImageURL implements Built<PinMediaSourceImageURL, PinMediaSourceImageURLBuilder> {
  /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  @BuiltValueField(wireName: r'is_standard')
  bool? get isStandard;

  /// The source type of the media.
  @BuiltValueField(wireName: r'source_type')
  PinMediaSourceImageURLSourceTypeEnum get sourceType;
  // enum sourceTypeEnum {  image_url,  };

  @BuiltValueField(wireName: r'url')
  String get url;

  PinMediaSourceImageURL._();

  factory PinMediaSourceImageURL([void updates(PinMediaSourceImageURLBuilder b)]) = _$PinMediaSourceImageURL;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceImageURLBuilder b) => b
      ..isStandard = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourceImageURL> get serializer => _$PinMediaSourceImageURLSerializer();
}

class _$PinMediaSourceImageURLSerializer implements PrimitiveSerializer<PinMediaSourceImageURL> {
  @override
  final Iterable<Type> types = const [PinMediaSourceImageURL, _$PinMediaSourceImageURL];

  @override
  final String wireName = r'PinMediaSourceImageURL';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourceImageURL object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
      specifiedType: const FullType(PinMediaSourceImageURLSourceTypeEnum),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourceImageURL object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourceImageURLBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_standard':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isStandard = valueDes;
          break;
        case r'source_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaSourceImageURLSourceTypeEnum),
          ) as PinMediaSourceImageURLSourceTypeEnum;
          result.sourceType = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinMediaSourceImageURL deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceImageURLBuilder();
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

class PinMediaSourceImageURLSourceTypeEnum extends EnumClass {

  /// The source type of the media.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const PinMediaSourceImageURLSourceTypeEnum imageUrl = _$pinMediaSourceImageURLSourceTypeEnum_imageUrl;

  static Serializer<PinMediaSourceImageURLSourceTypeEnum> get serializer => _$pinMediaSourceImageURLSourceTypeEnumSerializer;

  const PinMediaSourceImageURLSourceTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaSourceImageURLSourceTypeEnum> get values => _$pinMediaSourceImageURLSourceTypeEnumValues;
  static PinMediaSourceImageURLSourceTypeEnum valueOf(String name) => _$pinMediaSourceImageURLSourceTypeEnumValueOf(name);
}

