//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/billing_profile_card_type.dart';
import 'package:openapi/src/model/billing_profile_payment_method_brand.dart';
import 'package:openapi/src/model/billing_profile_status.dart';
import 'package:openapi/src/model/billing_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_profiles_response.g.dart';

/// BillingProfilesResponse
///
/// Properties:
/// * [advertiserId] - Advertiser ID of the billing.
/// * [billingType] - Billing type of the advertiser
/// * [cardType] - Type of the card.
/// * [id] - Billing ID.
/// * [paymentMethodBrand] - Brand of the payment method.
/// * [status] - Status of the billing.
@BuiltValue()
abstract class BillingProfilesResponse implements Built<BillingProfilesResponse, BillingProfilesResponseBuilder> {
  /// Advertiser ID of the billing.
  @BuiltValueField(wireName: r'advertiser_id')
  String? get advertiserId;

  /// Billing type of the advertiser
  @BuiltValueField(wireName: r'billing_type')
  BillingType? get billingType;
  // enum billingTypeEnum {  CREDIT_CARD,  INVOICE,  INTERNAL,  RECURRING,  PREPAID,  };

  /// Type of the card.
  @BuiltValueField(wireName: r'card_type')
  BillingProfileCardType? get cardType;
  // enum cardTypeEnum {  UNKNOWN,  VISA,  MASTERCARD,  AMERICAN_EXPRESS,  DISCOVER,  ELO,  };

  /// Billing ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Brand of the payment method.
  @BuiltValueField(wireName: r'payment_method_brand')
  BillingProfilePaymentMethodBrand? get paymentMethodBrand;
  // enum paymentMethodBrandEnum {  UNKNOWN,  VISA,  MASTERCARD,  AMERICAN_EXPRESS,  DISCOVER,  SOFORT,  DINERS_CLUB,  ELO,  CARTE_BANCAIRE,  };

  /// Status of the billing.
  @BuiltValueField(wireName: r'status')
  BillingProfileStatus? get status;
  // enum statusEnum {  UNSPECIFIED,  VALID,  INVALID,  PENDING,  DELETED,  SECONDARY,  PENDING_SECONDARY,  };

  BillingProfilesResponse._();

  factory BillingProfilesResponse([void updates(BillingProfilesResponseBuilder b)]) = _$BillingProfilesResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BillingProfilesResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BillingProfilesResponse> get serializer => _$BillingProfilesResponseSerializer();
}

class _$BillingProfilesResponseSerializer implements PrimitiveSerializer<BillingProfilesResponse> {
  @override
  final Iterable<Type> types = const [BillingProfilesResponse, _$BillingProfilesResponse];

  @override
  final String wireName = r'BillingProfilesResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BillingProfilesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.advertiserId != null) {
      yield r'advertiser_id';
      yield serializers.serialize(
        object.advertiserId,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingType != null) {
      yield r'billing_type';
      yield serializers.serialize(
        object.billingType,
        specifiedType: const FullType(BillingType),
      );
    }
    if (object.cardType != null) {
      yield r'card_type';
      yield serializers.serialize(
        object.cardType,
        specifiedType: const FullType(BillingProfileCardType),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.paymentMethodBrand != null) {
      yield r'payment_method_brand';
      yield serializers.serialize(
        object.paymentMethodBrand,
        specifiedType: const FullType(BillingProfilePaymentMethodBrand),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(BillingProfileStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BillingProfilesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BillingProfilesResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'advertiser_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.advertiserId = valueDes;
          break;
        case r'billing_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BillingType),
          ) as BillingType?;
          if (valueDes == null) continue;
          result.billingType = valueDes;
          break;
        case r'card_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BillingProfileCardType),
          ) as BillingProfileCardType?;
          if (valueDes == null) continue;
          result.cardType = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'payment_method_brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BillingProfilePaymentMethodBrand),
          ) as BillingProfilePaymentMethodBrand?;
          if (valueDes == null) continue;
          result.paymentMethodBrand = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BillingProfileStatus),
          ) as BillingProfileStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BillingProfilesResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BillingProfilesResponseBuilder();
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

