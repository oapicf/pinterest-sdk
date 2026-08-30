//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_pin_preview_creative_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_preview_source_pin_id.g.dart';

/// Ad preview source from an existing Pin.
///
/// Properties:
/// * [creativeType] - Creative type of the ad preview.
/// * [pinId] - Pin ID.
@BuiltValue()
abstract class AdPreviewSourcePinId implements Built<AdPreviewSourcePinId, AdPreviewSourcePinIdBuilder> {
  /// Creative type of the ad preview.
  @BuiltValueField(wireName: r'creative_type')
  AdPinPreviewCreativeType? get creativeType;
  // enum creativeTypeEnum {  SHOPPING,  COLLECTION,  MAX_VIDEO,  MAX_WIDTH_VIDEO_COLLECTION,  MAX_WIDTH_REGULAR_COLLECTION,  };

  /// Pin ID.
  @BuiltValueField(wireName: r'pin_id')
  String get pinId;

  AdPreviewSourcePinId._();

  factory AdPreviewSourcePinId([void updates(AdPreviewSourcePinIdBuilder b)]) = _$AdPreviewSourcePinId;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPreviewSourcePinIdBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPreviewSourcePinId> get serializer => _$AdPreviewSourcePinIdSerializer();
}

class _$AdPreviewSourcePinIdSerializer implements PrimitiveSerializer<AdPreviewSourcePinId> {
  @override
  final Iterable<Type> types = const [AdPreviewSourcePinId, _$AdPreviewSourcePinId];

  @override
  final String wireName = r'AdPreviewSourcePinId';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPreviewSourcePinId object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.creativeType != null) {
      yield r'creative_type';
      yield serializers.serialize(
        object.creativeType,
        specifiedType: const FullType(AdPinPreviewCreativeType),
      );
    }
    yield r'pin_id';
    yield serializers.serialize(
      object.pinId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPreviewSourcePinId object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPreviewSourcePinIdBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'creative_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdPinPreviewCreativeType),
          ) as AdPinPreviewCreativeType?;
          if (valueDes == null) continue;
          result.creativeType = valueDes;
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pinId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdPreviewSourcePinId deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPreviewSourcePinIdBuilder();
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

