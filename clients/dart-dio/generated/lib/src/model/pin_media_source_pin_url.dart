//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_pin_url.g.dart';

/// Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
///
/// Properties:
/// * [isAffiliateLink] - This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
/// * [sourceType] 
@BuiltValue()
abstract class PinMediaSourcePinURL implements Built<PinMediaSourcePinURL, PinMediaSourcePinURLBuilder> {
  /// This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  @BuiltValueField(wireName: r'is_affiliate_link')
  bool? get isAffiliateLink;

  @BuiltValueField(wireName: r'source_type')
  PinMediaSourcePinURLSourceTypeEnum get sourceType;
  // enum sourceTypeEnum {  pin_url,  };

  PinMediaSourcePinURL._();

  factory PinMediaSourcePinURL([void updates(PinMediaSourcePinURLBuilder b)]) = _$PinMediaSourcePinURL;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourcePinURLBuilder b) => b
      ..isAffiliateLink = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourcePinURL> get serializer => _$PinMediaSourcePinURLSerializer();
}

class _$PinMediaSourcePinURLSerializer implements PrimitiveSerializer<PinMediaSourcePinURL> {
  @override
  final Iterable<Type> types = const [PinMediaSourcePinURL, _$PinMediaSourcePinURL];

  @override
  final String wireName = r'PinMediaSourcePinURL';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourcePinURL object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isAffiliateLink != null) {
      yield r'is_affiliate_link';
      yield serializers.serialize(
        object.isAffiliateLink,
        specifiedType: const FullType(bool),
      );
    }
    yield r'source_type';
    yield serializers.serialize(
      object.sourceType,
      specifiedType: const FullType(PinMediaSourcePinURLSourceTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourcePinURL object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourcePinURLBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_affiliate_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAffiliateLink = valueDes;
          break;
        case r'source_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaSourcePinURLSourceTypeEnum),
          ) as PinMediaSourcePinURLSourceTypeEnum;
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
  PinMediaSourcePinURL deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourcePinURLBuilder();
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

class PinMediaSourcePinURLSourceTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'pin_url')
  static const PinMediaSourcePinURLSourceTypeEnum pinUrl = _$pinMediaSourcePinURLSourceTypeEnum_pinUrl;

  static Serializer<PinMediaSourcePinURLSourceTypeEnum> get serializer => _$pinMediaSourcePinURLSourceTypeEnumSerializer;

  const PinMediaSourcePinURLSourceTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaSourcePinURLSourceTypeEnum> get values => _$pinMediaSourcePinURLSourceTypeEnumValues;
  static PinMediaSourcePinURLSourceTypeEnum valueOf(String name) => _$pinMediaSourcePinURLSourceTypeEnumValueOf(name);
}

