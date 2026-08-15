//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BillingProfilesResponse {
  /// Returns a new [BillingProfilesResponse] instance.
  BillingProfilesResponse({
    this.advertiserId,
    this.billingType,
    this.cardType,
    this.id,
    this.paymentMethodBrand,
    this.status,
  });

  /// Advertiser ID of the billing.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? advertiserId;

  /// Billing type of the advertiser
  BillingProfilesResponseBillingTypeEnum? billingType;

  /// Type of the card.
  BillingProfilesResponseCardTypeEnum? cardType;

  /// Billing ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Brand of the payment method.
  BillingProfilesResponsePaymentMethodBrandEnum? paymentMethodBrand;

  /// Status of the billing.
  BillingProfilesResponseStatusEnum? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BillingProfilesResponse &&
    other.advertiserId == advertiserId &&
    other.billingType == billingType &&
    other.cardType == cardType &&
    other.id == id &&
    other.paymentMethodBrand == paymentMethodBrand &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (advertiserId == null ? 0 : advertiserId!.hashCode) +
    (billingType == null ? 0 : billingType!.hashCode) +
    (cardType == null ? 0 : cardType!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (paymentMethodBrand == null ? 0 : paymentMethodBrand!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'BillingProfilesResponse[advertiserId=$advertiserId, billingType=$billingType, cardType=$cardType, id=$id, paymentMethodBrand=$paymentMethodBrand, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.advertiserId != null) {
      json[r'advertiser_id'] = this.advertiserId;
    } else {
      json[r'advertiser_id'] = null;
    }
    if (this.billingType != null) {
      json[r'billing_type'] = this.billingType;
    } else {
      json[r'billing_type'] = null;
    }
    if (this.cardType != null) {
      json[r'card_type'] = this.cardType;
    } else {
      json[r'card_type'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.paymentMethodBrand != null) {
      json[r'payment_method_brand'] = this.paymentMethodBrand;
    } else {
      json[r'payment_method_brand'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [BillingProfilesResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BillingProfilesResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BillingProfilesResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BillingProfilesResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BillingProfilesResponse(
        advertiserId: mapValueOfType<String>(json, r'advertiser_id'),
        billingType: BillingProfilesResponseBillingTypeEnum.fromJson(json[r'billing_type']),
        cardType: BillingProfilesResponseCardTypeEnum.fromJson(json[r'card_type']),
        id: mapValueOfType<String>(json, r'id'),
        paymentMethodBrand: BillingProfilesResponsePaymentMethodBrandEnum.fromJson(json[r'payment_method_brand']),
        status: BillingProfilesResponseStatusEnum.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<BillingProfilesResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfilesResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfilesResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BillingProfilesResponse> mapFromJson(dynamic json) {
    final map = <String, BillingProfilesResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BillingProfilesResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BillingProfilesResponse-objects as value to a dart map
  static Map<String, List<BillingProfilesResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BillingProfilesResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BillingProfilesResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Billing type of the advertiser
class BillingProfilesResponseBillingTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const BillingProfilesResponseBillingTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREDIT_CARD = BillingProfilesResponseBillingTypeEnum._(r'CREDIT_CARD');
  static const INVOICE = BillingProfilesResponseBillingTypeEnum._(r'INVOICE');
  static const INTERNAL = BillingProfilesResponseBillingTypeEnum._(r'INTERNAL');
  static const RECURRING = BillingProfilesResponseBillingTypeEnum._(r'RECURRING');
  static const PREPAID = BillingProfilesResponseBillingTypeEnum._(r'PREPAID');

  /// List of all possible values in this [enum][BillingProfilesResponseBillingTypeEnum].
  static const values = <BillingProfilesResponseBillingTypeEnum>[
    CREDIT_CARD,
    INVOICE,
    INTERNAL,
    RECURRING,
    PREPAID,
  ];

  static BillingProfilesResponseBillingTypeEnum? fromJson(dynamic value) => BillingProfilesResponseBillingTypeEnumTypeTransformer().decode(value);

  static List<BillingProfilesResponseBillingTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfilesResponseBillingTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfilesResponseBillingTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingProfilesResponseBillingTypeEnum] to String,
/// and [decode] dynamic data back to [BillingProfilesResponseBillingTypeEnum].
class BillingProfilesResponseBillingTypeEnumTypeTransformer {
  factory BillingProfilesResponseBillingTypeEnumTypeTransformer() => _instance ??= const BillingProfilesResponseBillingTypeEnumTypeTransformer._();

  const BillingProfilesResponseBillingTypeEnumTypeTransformer._();

  String encode(BillingProfilesResponseBillingTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BillingProfilesResponseBillingTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingProfilesResponseBillingTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREDIT_CARD': return BillingProfilesResponseBillingTypeEnum.CREDIT_CARD;
        case r'INVOICE': return BillingProfilesResponseBillingTypeEnum.INVOICE;
        case r'INTERNAL': return BillingProfilesResponseBillingTypeEnum.INTERNAL;
        case r'RECURRING': return BillingProfilesResponseBillingTypeEnum.RECURRING;
        case r'PREPAID': return BillingProfilesResponseBillingTypeEnum.PREPAID;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BillingProfilesResponseBillingTypeEnumTypeTransformer] instance.
  static BillingProfilesResponseBillingTypeEnumTypeTransformer? _instance;
}


/// Type of the card.
class BillingProfilesResponseCardTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const BillingProfilesResponseCardTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN = BillingProfilesResponseCardTypeEnum._(r'UNKNOWN');
  static const VISA = BillingProfilesResponseCardTypeEnum._(r'VISA');
  static const MASTERCARD = BillingProfilesResponseCardTypeEnum._(r'MASTERCARD');
  static const AMERICAN_EXPRESS = BillingProfilesResponseCardTypeEnum._(r'AMERICAN_EXPRESS');
  static const DISCOVER = BillingProfilesResponseCardTypeEnum._(r'DISCOVER');
  static const ELO = BillingProfilesResponseCardTypeEnum._(r'ELO');

  /// List of all possible values in this [enum][BillingProfilesResponseCardTypeEnum].
  static const values = <BillingProfilesResponseCardTypeEnum>[
    UNKNOWN,
    VISA,
    MASTERCARD,
    AMERICAN_EXPRESS,
    DISCOVER,
    ELO,
  ];

  static BillingProfilesResponseCardTypeEnum? fromJson(dynamic value) => BillingProfilesResponseCardTypeEnumTypeTransformer().decode(value);

  static List<BillingProfilesResponseCardTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfilesResponseCardTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfilesResponseCardTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingProfilesResponseCardTypeEnum] to String,
/// and [decode] dynamic data back to [BillingProfilesResponseCardTypeEnum].
class BillingProfilesResponseCardTypeEnumTypeTransformer {
  factory BillingProfilesResponseCardTypeEnumTypeTransformer() => _instance ??= const BillingProfilesResponseCardTypeEnumTypeTransformer._();

  const BillingProfilesResponseCardTypeEnumTypeTransformer._();

  String encode(BillingProfilesResponseCardTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BillingProfilesResponseCardTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingProfilesResponseCardTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return BillingProfilesResponseCardTypeEnum.UNKNOWN;
        case r'VISA': return BillingProfilesResponseCardTypeEnum.VISA;
        case r'MASTERCARD': return BillingProfilesResponseCardTypeEnum.MASTERCARD;
        case r'AMERICAN_EXPRESS': return BillingProfilesResponseCardTypeEnum.AMERICAN_EXPRESS;
        case r'DISCOVER': return BillingProfilesResponseCardTypeEnum.DISCOVER;
        case r'ELO': return BillingProfilesResponseCardTypeEnum.ELO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BillingProfilesResponseCardTypeEnumTypeTransformer] instance.
  static BillingProfilesResponseCardTypeEnumTypeTransformer? _instance;
}


/// Brand of the payment method.
class BillingProfilesResponsePaymentMethodBrandEnum {
  /// Instantiate a new enum with the provided [value].
  const BillingProfilesResponsePaymentMethodBrandEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN = BillingProfilesResponsePaymentMethodBrandEnum._(r'UNKNOWN');
  static const VISA = BillingProfilesResponsePaymentMethodBrandEnum._(r'VISA');
  static const MASTERCARD = BillingProfilesResponsePaymentMethodBrandEnum._(r'MASTERCARD');
  static const AMERICAN_EXPRESS = BillingProfilesResponsePaymentMethodBrandEnum._(r'AMERICAN_EXPRESS');
  static const DISCOVER = BillingProfilesResponsePaymentMethodBrandEnum._(r'DISCOVER');
  static const SOFORT = BillingProfilesResponsePaymentMethodBrandEnum._(r'SOFORT');
  static const DINERS_CLUB = BillingProfilesResponsePaymentMethodBrandEnum._(r'DINERS_CLUB');
  static const ELO = BillingProfilesResponsePaymentMethodBrandEnum._(r'ELO');
  static const CARTE_BANCAIRE = BillingProfilesResponsePaymentMethodBrandEnum._(r'CARTE_BANCAIRE');

  /// List of all possible values in this [enum][BillingProfilesResponsePaymentMethodBrandEnum].
  static const values = <BillingProfilesResponsePaymentMethodBrandEnum>[
    UNKNOWN,
    VISA,
    MASTERCARD,
    AMERICAN_EXPRESS,
    DISCOVER,
    SOFORT,
    DINERS_CLUB,
    ELO,
    CARTE_BANCAIRE,
  ];

  static BillingProfilesResponsePaymentMethodBrandEnum? fromJson(dynamic value) => BillingProfilesResponsePaymentMethodBrandEnumTypeTransformer().decode(value);

  static List<BillingProfilesResponsePaymentMethodBrandEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfilesResponsePaymentMethodBrandEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfilesResponsePaymentMethodBrandEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingProfilesResponsePaymentMethodBrandEnum] to String,
/// and [decode] dynamic data back to [BillingProfilesResponsePaymentMethodBrandEnum].
class BillingProfilesResponsePaymentMethodBrandEnumTypeTransformer {
  factory BillingProfilesResponsePaymentMethodBrandEnumTypeTransformer() => _instance ??= const BillingProfilesResponsePaymentMethodBrandEnumTypeTransformer._();

  const BillingProfilesResponsePaymentMethodBrandEnumTypeTransformer._();

  String encode(BillingProfilesResponsePaymentMethodBrandEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BillingProfilesResponsePaymentMethodBrandEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingProfilesResponsePaymentMethodBrandEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return BillingProfilesResponsePaymentMethodBrandEnum.UNKNOWN;
        case r'VISA': return BillingProfilesResponsePaymentMethodBrandEnum.VISA;
        case r'MASTERCARD': return BillingProfilesResponsePaymentMethodBrandEnum.MASTERCARD;
        case r'AMERICAN_EXPRESS': return BillingProfilesResponsePaymentMethodBrandEnum.AMERICAN_EXPRESS;
        case r'DISCOVER': return BillingProfilesResponsePaymentMethodBrandEnum.DISCOVER;
        case r'SOFORT': return BillingProfilesResponsePaymentMethodBrandEnum.SOFORT;
        case r'DINERS_CLUB': return BillingProfilesResponsePaymentMethodBrandEnum.DINERS_CLUB;
        case r'ELO': return BillingProfilesResponsePaymentMethodBrandEnum.ELO;
        case r'CARTE_BANCAIRE': return BillingProfilesResponsePaymentMethodBrandEnum.CARTE_BANCAIRE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BillingProfilesResponsePaymentMethodBrandEnumTypeTransformer] instance.
  static BillingProfilesResponsePaymentMethodBrandEnumTypeTransformer? _instance;
}


/// Status of the billing.
class BillingProfilesResponseStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const BillingProfilesResponseStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNSPECIFIED = BillingProfilesResponseStatusEnum._(r'UNSPECIFIED');
  static const VALID = BillingProfilesResponseStatusEnum._(r'VALID');
  static const INVALID = BillingProfilesResponseStatusEnum._(r'INVALID');
  static const PENDING = BillingProfilesResponseStatusEnum._(r'PENDING');
  static const DELETED = BillingProfilesResponseStatusEnum._(r'DELETED');
  static const SECONDARY = BillingProfilesResponseStatusEnum._(r'SECONDARY');
  static const PENDING_SECONDARY = BillingProfilesResponseStatusEnum._(r'PENDING_SECONDARY');

  /// List of all possible values in this [enum][BillingProfilesResponseStatusEnum].
  static const values = <BillingProfilesResponseStatusEnum>[
    UNSPECIFIED,
    VALID,
    INVALID,
    PENDING,
    DELETED,
    SECONDARY,
    PENDING_SECONDARY,
  ];

  static BillingProfilesResponseStatusEnum? fromJson(dynamic value) => BillingProfilesResponseStatusEnumTypeTransformer().decode(value);

  static List<BillingProfilesResponseStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfilesResponseStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfilesResponseStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingProfilesResponseStatusEnum] to String,
/// and [decode] dynamic data back to [BillingProfilesResponseStatusEnum].
class BillingProfilesResponseStatusEnumTypeTransformer {
  factory BillingProfilesResponseStatusEnumTypeTransformer() => _instance ??= const BillingProfilesResponseStatusEnumTypeTransformer._();

  const BillingProfilesResponseStatusEnumTypeTransformer._();

  String encode(BillingProfilesResponseStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BillingProfilesResponseStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingProfilesResponseStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNSPECIFIED': return BillingProfilesResponseStatusEnum.UNSPECIFIED;
        case r'VALID': return BillingProfilesResponseStatusEnum.VALID;
        case r'INVALID': return BillingProfilesResponseStatusEnum.INVALID;
        case r'PENDING': return BillingProfilesResponseStatusEnum.PENDING;
        case r'DELETED': return BillingProfilesResponseStatusEnum.DELETED;
        case r'SECONDARY': return BillingProfilesResponseStatusEnum.SECONDARY;
        case r'PENDING_SECONDARY': return BillingProfilesResponseStatusEnum.PENDING_SECONDARY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BillingProfilesResponseStatusEnumTypeTransformer] instance.
  static BillingProfilesResponseStatusEnumTypeTransformer? _instance;
}


