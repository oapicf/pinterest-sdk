//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/quality_component_details.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'quality_components.g.dart';

/// Set of quality components, with each component containing a event coverage and details.
///
/// Properties:
/// * [advertiserExternalId] 
/// * [clickIdEpik] 
/// * [externalEventId] - Dedup components.
/// * [hashedEmail] - User matching identifiers.
/// * [hashedMaid] 
/// * [ipAddress] 
/// * [orderId] 
/// * [orderValue] 
/// * [productId] - Product/event metadata.
/// * [sourceUrl] 
/// * [userAgent] 
@BuiltValue()
abstract class QualityComponents implements Built<QualityComponents, QualityComponentsBuilder> {
  @BuiltValueField(wireName: r'advertiser_external_id')
  BuiltMap<String, QualityComponentDetails>? get advertiserExternalId;

  @BuiltValueField(wireName: r'click_id_epik')
  BuiltMap<String, QualityComponentDetails>? get clickIdEpik;

  /// Dedup components.
  @BuiltValueField(wireName: r'external_event_id')
  BuiltMap<String, QualityComponentDetails>? get externalEventId;

  /// User matching identifiers.
  @BuiltValueField(wireName: r'hashed_email')
  BuiltMap<String, QualityComponentDetails>? get hashedEmail;

  @BuiltValueField(wireName: r'hashed_maid')
  BuiltMap<String, QualityComponentDetails>? get hashedMaid;

  @BuiltValueField(wireName: r'ip_address')
  BuiltMap<String, QualityComponentDetails>? get ipAddress;

  @BuiltValueField(wireName: r'order_id')
  BuiltMap<String, QualityComponentDetails>? get orderId;

  @BuiltValueField(wireName: r'order_value')
  BuiltMap<String, QualityComponentDetails>? get orderValue;

  /// Product/event metadata.
  @BuiltValueField(wireName: r'product_id')
  BuiltMap<String, QualityComponentDetails>? get productId;

  @BuiltValueField(wireName: r'source_url')
  BuiltMap<String, QualityComponentDetails>? get sourceUrl;

  @BuiltValueField(wireName: r'user_agent')
  BuiltMap<String, QualityComponentDetails>? get userAgent;

  QualityComponents._();

  factory QualityComponents([void updates(QualityComponentsBuilder b)]) = _$QualityComponents;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(QualityComponentsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<QualityComponents> get serializer => _$QualityComponentsSerializer();
}

class _$QualityComponentsSerializer implements PrimitiveSerializer<QualityComponents> {
  @override
  final Iterable<Type> types = const [QualityComponents, _$QualityComponents];

  @override
  final String wireName = r'QualityComponents';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    QualityComponents object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.advertiserExternalId != null) {
      yield r'advertiser_external_id';
      yield serializers.serialize(
        object.advertiserExternalId,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.clickIdEpik != null) {
      yield r'click_id_epik';
      yield serializers.serialize(
        object.clickIdEpik,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.externalEventId != null) {
      yield r'external_event_id';
      yield serializers.serialize(
        object.externalEventId,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.hashedEmail != null) {
      yield r'hashed_email';
      yield serializers.serialize(
        object.hashedEmail,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.hashedMaid != null) {
      yield r'hashed_maid';
      yield serializers.serialize(
        object.hashedMaid,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.ipAddress != null) {
      yield r'ip_address';
      yield serializers.serialize(
        object.ipAddress,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.orderId != null) {
      yield r'order_id';
      yield serializers.serialize(
        object.orderId,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.orderValue != null) {
      yield r'order_value';
      yield serializers.serialize(
        object.orderValue,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.productId != null) {
      yield r'product_id';
      yield serializers.serialize(
        object.productId,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.sourceUrl != null) {
      yield r'source_url';
      yield serializers.serialize(
        object.sourceUrl,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
    if (object.userAgent != null) {
      yield r'user_agent';
      yield serializers.serialize(
        object.userAgent,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    QualityComponents object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required QualityComponentsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'advertiser_external_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.advertiserExternalId.replace(valueDes);
          break;
        case r'click_id_epik':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.clickIdEpik.replace(valueDes);
          break;
        case r'external_event_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.externalEventId.replace(valueDes);
          break;
        case r'hashed_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.hashedEmail.replace(valueDes);
          break;
        case r'hashed_maid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.hashedMaid.replace(valueDes);
          break;
        case r'ip_address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.ipAddress.replace(valueDes);
          break;
        case r'order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.orderId.replace(valueDes);
          break;
        case r'order_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.orderValue.replace(valueDes);
          break;
        case r'product_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.productId.replace(valueDes);
          break;
        case r'source_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.sourceUrl.replace(valueDes);
          break;
        case r'user_agent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(QualityComponentDetails)]),
          ) as BuiltMap<String, QualityComponentDetails>?;
          if (valueDes == null) continue;
          result.userAgent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  QualityComponents deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = QualityComponentsBuilder();
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

