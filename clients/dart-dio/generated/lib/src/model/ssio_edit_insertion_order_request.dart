//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ssio_insertion_order_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_edit_insertion_order_request.g.dart';

/// SSIOEditInsertionOrderRequest
///
/// Properties:
/// * [agencyLink] - URL link for agency
/// * [billingContactEmail] - The billing contact email
/// * [billingContactFirstname] - The billing contact first name
/// * [billingContactLastname] - The billing contact last name
/// * [budgetAmount] - If Budget order line, the budget amount.
/// * [endDate] - End date of time period. Format: YYYY-MM-DD
/// * [mediaContactEmail] - The media contact email
/// * [mediaContactFirstname] - The media contact first name
/// * [mediaContactLastname] - The media contact last name
/// * [poNumber] - The po number
/// * [startDate] - Starting date of time period. Format: YYYY-MM-DD
/// * [userEmail] - The email of user submitting the insertion order
/// * [adsManagerOrderLineId] - Ads manager OrderLineId
/// * [oracleLineId] - LineId in the Oracle DB
/// * [salesforceOrderId] - OrderId in SFDC
/// * [salesforceOrderLineId] - OrderLineId in SFDC
@BuiltValue()
abstract class SSIOEditInsertionOrderRequest implements SSIOInsertionOrderCommon, Built<SSIOEditInsertionOrderRequest, SSIOEditInsertionOrderRequestBuilder> {
  /// OrderId in SFDC
  @BuiltValueField(wireName: r'salesforce_order_id')
  String? get salesforceOrderId;

  /// LineId in the Oracle DB
  @BuiltValueField(wireName: r'oracle_line_id')
  String? get oracleLineId;

  /// OrderLineId in SFDC
  @BuiltValueField(wireName: r'salesforce_order_line_id')
  String? get salesforceOrderLineId;

  /// Ads manager OrderLineId
  @BuiltValueField(wireName: r'ads_manager_order_line_id')
  String? get adsManagerOrderLineId;

  SSIOEditInsertionOrderRequest._();

  factory SSIOEditInsertionOrderRequest([void updates(SSIOEditInsertionOrderRequestBuilder b)]) = _$SSIOEditInsertionOrderRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOEditInsertionOrderRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOEditInsertionOrderRequest> get serializer => _$SSIOEditInsertionOrderRequestSerializer();
}

class _$SSIOEditInsertionOrderRequestSerializer implements PrimitiveSerializer<SSIOEditInsertionOrderRequest> {
  @override
  final Iterable<Type> types = const [SSIOEditInsertionOrderRequest, _$SSIOEditInsertionOrderRequest];

  @override
  final String wireName = r'SSIOEditInsertionOrderRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOEditInsertionOrderRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.agencyLink != null) {
      yield r'agency_link';
      yield serializers.serialize(
        object.agencyLink,
        specifiedType: const FullType(String),
      );
    }
    if (object.oracleLineId != null) {
      yield r'oracle_line_id';
      yield serializers.serialize(
        object.oracleLineId,
        specifiedType: const FullType(String),
      );
    }
    if (object.endDate != null) {
      yield r'end_date';
      yield serializers.serialize(
        object.endDate,
        specifiedType: const FullType(String),
      );
    }
    if (object.salesforceOrderLineId != null) {
      yield r'salesforce_order_line_id';
      yield serializers.serialize(
        object.salesforceOrderLineId,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingContactFirstname != null) {
      yield r'billing_contact_firstname';
      yield serializers.serialize(
        object.billingContactFirstname,
        specifiedType: const FullType(String),
      );
    }
    if (object.salesforceOrderId != null) {
      yield r'salesforce_order_id';
      yield serializers.serialize(
        object.salesforceOrderId,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingContactLastname != null) {
      yield r'billing_contact_lastname';
      yield serializers.serialize(
        object.billingContactLastname,
        specifiedType: const FullType(String),
      );
    }
    if (object.budgetAmount != null) {
      yield r'budget_amount';
      yield serializers.serialize(
        object.budgetAmount,
        specifiedType: const FullType(num),
      );
    }
    if (object.mediaContactFirstname != null) {
      yield r'media_contact_firstname';
      yield serializers.serialize(
        object.mediaContactFirstname,
        specifiedType: const FullType(String),
      );
    }
    if (object.mediaContactLastname != null) {
      yield r'media_contact_lastname';
      yield serializers.serialize(
        object.mediaContactLastname,
        specifiedType: const FullType(String),
      );
    }
    if (object.mediaContactEmail != null) {
      yield r'media_contact_email';
      yield serializers.serialize(
        object.mediaContactEmail,
        specifiedType: const FullType(String),
      );
    }
    if (object.adsManagerOrderLineId != null) {
      yield r'ads_manager_order_line_id';
      yield serializers.serialize(
        object.adsManagerOrderLineId,
        specifiedType: const FullType(String),
      );
    }
    if (object.userEmail != null) {
      yield r'user_email';
      yield serializers.serialize(
        object.userEmail,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingContactEmail != null) {
      yield r'billing_contact_email';
      yield serializers.serialize(
        object.billingContactEmail,
        specifiedType: const FullType(String),
      );
    }
    if (object.poNumber != null) {
      yield r'po_number';
      yield serializers.serialize(
        object.poNumber,
        specifiedType: const FullType(String),
      );
    }
    if (object.startDate != null) {
      yield r'start_date';
      yield serializers.serialize(
        object.startDate,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOEditInsertionOrderRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOEditInsertionOrderRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'agency_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.agencyLink = valueDes;
          break;
        case r'oracle_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.oracleLineId = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'salesforce_order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.salesforceOrderLineId = valueDes;
          break;
        case r'billing_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactFirstname = valueDes;
          break;
        case r'salesforce_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.salesforceOrderId = valueDes;
          break;
        case r'billing_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactLastname = valueDes;
          break;
        case r'budget_amount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.budgetAmount = valueDes;
          break;
        case r'media_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactFirstname = valueDes;
          break;
        case r'media_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactLastname = valueDes;
          break;
        case r'media_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactEmail = valueDes;
          break;
        case r'ads_manager_order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adsManagerOrderLineId = valueDes;
          break;
        case r'user_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.userEmail = valueDes;
          break;
        case r'billing_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactEmail = valueDes;
          break;
        case r'po_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.poNumber = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOEditInsertionOrderRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOEditInsertionOrderRequestBuilder();
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

