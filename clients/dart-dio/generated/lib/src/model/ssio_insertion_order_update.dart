//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_insertion_order_update.g.dart';

/// Resource create or update operation model.
///
/// Properties:
/// * [adsManagerOrderLineId] - Ads manager OrderLineId
/// * [agencyLink] - URL link for agency
/// * [billingContactEmail] - The billing contact email
/// * [billingContactFirstname] - The billing contact first name
/// * [billingContactLastname] - The billing contact last name
/// * [budgetAmount] - If Budget order line, the budget amount.
/// * [endDate] - End date of time period. Format: YYYY-MM-DD
/// * [mediaContactEmail] - The media contact email
/// * [mediaContactFirstname] - The media contact first name
/// * [mediaContactLastname] - The media contact last name
/// * [oracleLineId] - LineId in the Oracle DB
/// * [poNumber] - The po number
/// * [salesforceOrderId] - OrderId in SFDC
/// * [salesforceOrderLineId] - OrderLineId in SFDC
/// * [startDate] - Starting date of time period. Format: YYYY-MM-DD
/// * [userEmail] - The email of user submitting the insertion order
@BuiltValue()
abstract class SSIOInsertionOrderUpdate implements Built<SSIOInsertionOrderUpdate, SSIOInsertionOrderUpdateBuilder> {
  /// Ads manager OrderLineId
  @BuiltValueField(wireName: r'ads_manager_order_line_id')
  String? get adsManagerOrderLineId;

  /// URL link for agency
  @BuiltValueField(wireName: r'agency_link')
  String? get agencyLink;

  /// The billing contact email
  @BuiltValueField(wireName: r'billing_contact_email')
  String? get billingContactEmail;

  /// The billing contact first name
  @BuiltValueField(wireName: r'billing_contact_firstname')
  String? get billingContactFirstname;

  /// The billing contact last name
  @BuiltValueField(wireName: r'billing_contact_lastname')
  String? get billingContactLastname;

  /// If Budget order line, the budget amount.
  @BuiltValueField(wireName: r'budget_amount')
  double? get budgetAmount;

  /// End date of time period. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'end_date')
  String? get endDate;

  /// The media contact email
  @BuiltValueField(wireName: r'media_contact_email')
  String? get mediaContactEmail;

  /// The media contact first name
  @BuiltValueField(wireName: r'media_contact_firstname')
  String? get mediaContactFirstname;

  /// The media contact last name
  @BuiltValueField(wireName: r'media_contact_lastname')
  String? get mediaContactLastname;

  /// LineId in the Oracle DB
  @BuiltValueField(wireName: r'oracle_line_id')
  String? get oracleLineId;

  /// The po number
  @BuiltValueField(wireName: r'po_number')
  String? get poNumber;

  /// OrderId in SFDC
  @BuiltValueField(wireName: r'salesforce_order_id')
  String? get salesforceOrderId;

  /// OrderLineId in SFDC
  @BuiltValueField(wireName: r'salesforce_order_line_id')
  String? get salesforceOrderLineId;

  /// Starting date of time period. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'start_date')
  String? get startDate;

  /// The email of user submitting the insertion order
  @BuiltValueField(wireName: r'user_email')
  String? get userEmail;

  SSIOInsertionOrderUpdate._();

  factory SSIOInsertionOrderUpdate([void updates(SSIOInsertionOrderUpdateBuilder b)]) = _$SSIOInsertionOrderUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOInsertionOrderUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOInsertionOrderUpdate> get serializer => _$SSIOInsertionOrderUpdateSerializer();
}

class _$SSIOInsertionOrderUpdateSerializer implements PrimitiveSerializer<SSIOInsertionOrderUpdate> {
  @override
  final Iterable<Type> types = const [SSIOInsertionOrderUpdate, _$SSIOInsertionOrderUpdate];

  @override
  final String wireName = r'SSIOInsertionOrderUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOInsertionOrderUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adsManagerOrderLineId != null) {
      yield r'ads_manager_order_line_id';
      yield serializers.serialize(
        object.adsManagerOrderLineId,
        specifiedType: const FullType(String),
      );
    }
    if (object.agencyLink != null) {
      yield r'agency_link';
      yield serializers.serialize(
        object.agencyLink,
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
    if (object.billingContactFirstname != null) {
      yield r'billing_contact_firstname';
      yield serializers.serialize(
        object.billingContactFirstname,
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
        specifiedType: const FullType(double),
      );
    }
    if (object.endDate != null) {
      yield r'end_date';
      yield serializers.serialize(
        object.endDate,
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
    if (object.oracleLineId != null) {
      yield r'oracle_line_id';
      yield serializers.serialize(
        object.oracleLineId,
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
    if (object.salesforceOrderId != null) {
      yield r'salesforce_order_id';
      yield serializers.serialize(
        object.salesforceOrderId,
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
    if (object.startDate != null) {
      yield r'start_date';
      yield serializers.serialize(
        object.startDate,
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
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOInsertionOrderUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOInsertionOrderUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ads_manager_order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adsManagerOrderLineId = valueDes;
          break;
        case r'agency_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.agencyLink = valueDes;
          break;
        case r'billing_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billingContactEmail = valueDes;
          break;
        case r'billing_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billingContactFirstname = valueDes;
          break;
        case r'billing_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billingContactLastname = valueDes;
          break;
        case r'budget_amount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.budgetAmount = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.endDate = valueDes;
          break;
        case r'media_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.mediaContactEmail = valueDes;
          break;
        case r'media_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.mediaContactFirstname = valueDes;
          break;
        case r'media_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.mediaContactLastname = valueDes;
          break;
        case r'oracle_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.oracleLineId = valueDes;
          break;
        case r'po_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.poNumber = valueDes;
          break;
        case r'salesforce_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.salesforceOrderId = valueDes;
          break;
        case r'salesforce_order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.salesforceOrderLineId = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.startDate = valueDes;
          break;
        case r'user_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userEmail = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOInsertionOrderUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOInsertionOrderUpdateBuilder();
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

