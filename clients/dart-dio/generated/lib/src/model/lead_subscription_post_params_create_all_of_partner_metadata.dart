//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_subscription_post_params_create_all_of_partner_metadata.g.dart';

/// Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
///
/// Properties:
/// * [subscriberKey] - Text field value that uniquely identifies a subscriber.
@BuiltValue()
abstract class LeadSubscriptionPostParamsCreateAllOfPartnerMetadata implements Built<LeadSubscriptionPostParamsCreateAllOfPartnerMetadata, LeadSubscriptionPostParamsCreateAllOfPartnerMetadataBuilder> {
  /// Text field value that uniquely identifies a subscriber.
  @BuiltValueField(wireName: r'subscriber_key')
  String? get subscriberKey;

  LeadSubscriptionPostParamsCreateAllOfPartnerMetadata._();

  factory LeadSubscriptionPostParamsCreateAllOfPartnerMetadata([void updates(LeadSubscriptionPostParamsCreateAllOfPartnerMetadataBuilder b)]) = _$LeadSubscriptionPostParamsCreateAllOfPartnerMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadSubscriptionPostParamsCreateAllOfPartnerMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadSubscriptionPostParamsCreateAllOfPartnerMetadata> get serializer => _$LeadSubscriptionPostParamsCreateAllOfPartnerMetadataSerializer();
}

class _$LeadSubscriptionPostParamsCreateAllOfPartnerMetadataSerializer implements PrimitiveSerializer<LeadSubscriptionPostParamsCreateAllOfPartnerMetadata> {
  @override
  final Iterable<Type> types = const [LeadSubscriptionPostParamsCreateAllOfPartnerMetadata, _$LeadSubscriptionPostParamsCreateAllOfPartnerMetadata];

  @override
  final String wireName = r'LeadSubscriptionPostParamsCreateAllOfPartnerMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadSubscriptionPostParamsCreateAllOfPartnerMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.subscriberKey != null) {
      yield r'subscriber_key';
      yield serializers.serialize(
        object.subscriberKey,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadSubscriptionPostParamsCreateAllOfPartnerMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadSubscriptionPostParamsCreateAllOfPartnerMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'subscriber_key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.subscriberKey = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadSubscriptionPostParamsCreateAllOfPartnerMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadSubscriptionPostParamsCreateAllOfPartnerMetadataBuilder();
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

