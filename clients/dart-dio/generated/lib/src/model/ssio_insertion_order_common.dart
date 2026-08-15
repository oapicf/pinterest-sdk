//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_insertion_order_common.g.dart';

/// SSIOInsertionOrderCommon
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
@BuiltValue(instantiable: false)
abstract class SSIOInsertionOrderCommon  {
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
  num? get budgetAmount;

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

  /// The po number
  @BuiltValueField(wireName: r'po_number')
  String? get poNumber;

  /// Starting date of time period. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'start_date')
  String? get startDate;

  /// The email of user submitting the insertion order
  @BuiltValueField(wireName: r'user_email')
  String? get userEmail;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOInsertionOrderCommon> get serializer => _$SSIOInsertionOrderCommonSerializer();
}

class _$SSIOInsertionOrderCommonSerializer implements PrimitiveSerializer<SSIOInsertionOrderCommon> {
  @override
  final Iterable<Type> types = const [SSIOInsertionOrderCommon];

  @override
  final String wireName = r'SSIOInsertionOrderCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOInsertionOrderCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
        specifiedType: const FullType(num),
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
    SSIOInsertionOrderCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  SSIOInsertionOrderCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($SSIOInsertionOrderCommon)) as $SSIOInsertionOrderCommon;
  }
}

/// a concrete implementation of [SSIOInsertionOrderCommon], since [SSIOInsertionOrderCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $SSIOInsertionOrderCommon implements SSIOInsertionOrderCommon, Built<$SSIOInsertionOrderCommon, $SSIOInsertionOrderCommonBuilder> {
  $SSIOInsertionOrderCommon._();

  factory $SSIOInsertionOrderCommon([void Function($SSIOInsertionOrderCommonBuilder)? updates]) = _$$SSIOInsertionOrderCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($SSIOInsertionOrderCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$SSIOInsertionOrderCommon> get serializer => _$$SSIOInsertionOrderCommonSerializer();
}

class _$$SSIOInsertionOrderCommonSerializer implements PrimitiveSerializer<$SSIOInsertionOrderCommon> {
  @override
  final Iterable<Type> types = const [$SSIOInsertionOrderCommon, _$$SSIOInsertionOrderCommon];

  @override
  final String wireName = r'$SSIOInsertionOrderCommon';

  @override
  Object serialize(
    Serializers serializers,
    $SSIOInsertionOrderCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(SSIOInsertionOrderCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOInsertionOrderCommonBuilder result,
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
        case r'billing_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactEmail = valueDes;
          break;
        case r'billing_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactFirstname = valueDes;
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
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'media_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactEmail = valueDes;
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
        case r'user_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  $SSIOInsertionOrderCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $SSIOInsertionOrderCommonBuilder();
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

