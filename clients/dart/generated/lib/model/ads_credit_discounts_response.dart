//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsCreditDiscountsResponse {
  /// Returns a new [AdsCreditDiscountsResponse] instance.
  AdsCreditDiscountsResponse({
    this.active,
    this.advertiserId,
    this.discountCurrency,
    this.discountInMicroCurrency,
    this.discountType,
    this.remainingDiscountInMicroCurrency,
    this.title,
  });

  /// True if the offer code is currently active.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? active;

  /// Advertiser ID the offer was applied to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? advertiserId;

  /// Currency value for the discount.
  String? discountCurrency;

  /// The discount applied in the offer’s currency value.
  num? discountInMicroCurrency;

  /// The type of discount of this credit
  AdsCreditDiscountsResponseDiscountTypeEnum? discountType;

  /// The credits left to spend.
  num? remainingDiscountInMicroCurrency;

  /// Human readable title of the offer code.
  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsCreditDiscountsResponse &&
    other.active == active &&
    other.advertiserId == advertiserId &&
    other.discountCurrency == discountCurrency &&
    other.discountInMicroCurrency == discountInMicroCurrency &&
    other.discountType == discountType &&
    other.remainingDiscountInMicroCurrency == remainingDiscountInMicroCurrency &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (active == null ? 0 : active!.hashCode) +
    (advertiserId == null ? 0 : advertiserId!.hashCode) +
    (discountCurrency == null ? 0 : discountCurrency!.hashCode) +
    (discountInMicroCurrency == null ? 0 : discountInMicroCurrency!.hashCode) +
    (discountType == null ? 0 : discountType!.hashCode) +
    (remainingDiscountInMicroCurrency == null ? 0 : remainingDiscountInMicroCurrency!.hashCode) +
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'AdsCreditDiscountsResponse[active=$active, advertiserId=$advertiserId, discountCurrency=$discountCurrency, discountInMicroCurrency=$discountInMicroCurrency, discountType=$discountType, remainingDiscountInMicroCurrency=$remainingDiscountInMicroCurrency, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.active != null) {
      json[r'active'] = this.active;
    } else {
      json[r'active'] = null;
    }
    if (this.advertiserId != null) {
      json[r'advertiser_id'] = this.advertiserId;
    } else {
      json[r'advertiser_id'] = null;
    }
    if (this.discountCurrency != null) {
      json[r'discountCurrency'] = this.discountCurrency;
    } else {
      json[r'discountCurrency'] = null;
    }
    if (this.discountInMicroCurrency != null) {
      json[r'discountInMicroCurrency'] = this.discountInMicroCurrency;
    } else {
      json[r'discountInMicroCurrency'] = null;
    }
    if (this.discountType != null) {
      json[r'discountType'] = this.discountType;
    } else {
      json[r'discountType'] = null;
    }
    if (this.remainingDiscountInMicroCurrency != null) {
      json[r'remainingDiscountInMicroCurrency'] = this.remainingDiscountInMicroCurrency;
    } else {
      json[r'remainingDiscountInMicroCurrency'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    return json;
  }

  /// Returns a new [AdsCreditDiscountsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsCreditDiscountsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdsCreditDiscountsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdsCreditDiscountsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdsCreditDiscountsResponse(
        active: mapValueOfType<bool>(json, r'active'),
        advertiserId: mapValueOfType<String>(json, r'advertiser_id'),
        discountCurrency: mapValueOfType<String>(json, r'discountCurrency'),
        discountInMicroCurrency: json[r'discountInMicroCurrency'] == null
            ? null
            : num.parse('${json[r'discountInMicroCurrency']}'),
        discountType: AdsCreditDiscountsResponseDiscountTypeEnum.fromJson(json[r'discountType']),
        remainingDiscountInMicroCurrency: json[r'remainingDiscountInMicroCurrency'] == null
            ? null
            : num.parse('${json[r'remainingDiscountInMicroCurrency']}'),
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<AdsCreditDiscountsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsCreditDiscountsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsCreditDiscountsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsCreditDiscountsResponse> mapFromJson(dynamic json) {
    final map = <String, AdsCreditDiscountsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsCreditDiscountsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsCreditDiscountsResponse-objects as value to a dart map
  static Map<String, List<AdsCreditDiscountsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsCreditDiscountsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsCreditDiscountsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of discount of this credit
class AdsCreditDiscountsResponseDiscountTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdsCreditDiscountsResponseDiscountTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const COUPON = AdsCreditDiscountsResponseDiscountTypeEnum._(r'COUPON');
  static const CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'CREDIT');
  static const COUPON_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'COUPON_APPLIED');
  static const CREDIT_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'CREDIT_APPLIED');
  static const MARKETING_OFFER_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'MARKETING_OFFER_CREDIT');
  static const MARKETING_OFFER_CREDIT_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'MARKETING_OFFER_CREDIT_APPLIED');
  static const GOODWILL_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'GOODWILL_CREDIT');
  static const GOODWILL_CREDIT_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'GOODWILL_CREDIT_APPLIED');
  static const INTERNAL_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'INTERNAL_CREDIT');
  static const INTERNAL_CREDIT_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'INTERNAL_CREDIT_APPLIED');
  static const PREPAID_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'PREPAID_CREDIT');
  static const PREPAID_CREDIT_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'PREPAID_CREDIT_APPLIED');
  static const SALES_INCENTIVE_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'SALES_INCENTIVE_CREDIT');
  static const SALES_INCENTIVE_CREDIT_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'SALES_INCENTIVE_CREDIT_APPLIED');
  static const CREDIT_EXPIRED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'CREDIT_EXPIRED');
  static const FUTURE_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'FUTURE_CREDIT');
  static const REFERRAL_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'REFERRAL_CREDIT');
  static const INVOICE_SALES_INCENTIVE_CREDIT = AdsCreditDiscountsResponseDiscountTypeEnum._(r'INVOICE_SALES_INCENTIVE_CREDIT');
  static const INVOICE_SALES_INCENTIVE_CREDIT_APPLIED = AdsCreditDiscountsResponseDiscountTypeEnum._(r'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED');
  static const PREPAID_CREDIT_REFUND = AdsCreditDiscountsResponseDiscountTypeEnum._(r'PREPAID_CREDIT_REFUND');

  /// List of all possible values in this [enum][AdsCreditDiscountsResponseDiscountTypeEnum].
  static const values = <AdsCreditDiscountsResponseDiscountTypeEnum>[
    COUPON,
    CREDIT,
    COUPON_APPLIED,
    CREDIT_APPLIED,
    MARKETING_OFFER_CREDIT,
    MARKETING_OFFER_CREDIT_APPLIED,
    GOODWILL_CREDIT,
    GOODWILL_CREDIT_APPLIED,
    INTERNAL_CREDIT,
    INTERNAL_CREDIT_APPLIED,
    PREPAID_CREDIT,
    PREPAID_CREDIT_APPLIED,
    SALES_INCENTIVE_CREDIT,
    SALES_INCENTIVE_CREDIT_APPLIED,
    CREDIT_EXPIRED,
    FUTURE_CREDIT,
    REFERRAL_CREDIT,
    INVOICE_SALES_INCENTIVE_CREDIT,
    INVOICE_SALES_INCENTIVE_CREDIT_APPLIED,
    PREPAID_CREDIT_REFUND,
  ];

  static AdsCreditDiscountsResponseDiscountTypeEnum? fromJson(dynamic value) => AdsCreditDiscountsResponseDiscountTypeEnumTypeTransformer().decode(value);

  static List<AdsCreditDiscountsResponseDiscountTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsCreditDiscountsResponseDiscountTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsCreditDiscountsResponseDiscountTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsCreditDiscountsResponseDiscountTypeEnum] to String,
/// and [decode] dynamic data back to [AdsCreditDiscountsResponseDiscountTypeEnum].
class AdsCreditDiscountsResponseDiscountTypeEnumTypeTransformer {
  factory AdsCreditDiscountsResponseDiscountTypeEnumTypeTransformer() => _instance ??= const AdsCreditDiscountsResponseDiscountTypeEnumTypeTransformer._();

  const AdsCreditDiscountsResponseDiscountTypeEnumTypeTransformer._();

  String encode(AdsCreditDiscountsResponseDiscountTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsCreditDiscountsResponseDiscountTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsCreditDiscountsResponseDiscountTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'COUPON': return AdsCreditDiscountsResponseDiscountTypeEnum.COUPON;
        case r'CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.CREDIT;
        case r'COUPON_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.COUPON_APPLIED;
        case r'CREDIT_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.CREDIT_APPLIED;
        case r'MARKETING_OFFER_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.MARKETING_OFFER_CREDIT;
        case r'MARKETING_OFFER_CREDIT_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.MARKETING_OFFER_CREDIT_APPLIED;
        case r'GOODWILL_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.GOODWILL_CREDIT;
        case r'GOODWILL_CREDIT_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.GOODWILL_CREDIT_APPLIED;
        case r'INTERNAL_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.INTERNAL_CREDIT;
        case r'INTERNAL_CREDIT_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.INTERNAL_CREDIT_APPLIED;
        case r'PREPAID_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.PREPAID_CREDIT;
        case r'PREPAID_CREDIT_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.PREPAID_CREDIT_APPLIED;
        case r'SALES_INCENTIVE_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.SALES_INCENTIVE_CREDIT;
        case r'SALES_INCENTIVE_CREDIT_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.SALES_INCENTIVE_CREDIT_APPLIED;
        case r'CREDIT_EXPIRED': return AdsCreditDiscountsResponseDiscountTypeEnum.CREDIT_EXPIRED;
        case r'FUTURE_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.FUTURE_CREDIT;
        case r'REFERRAL_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.REFERRAL_CREDIT;
        case r'INVOICE_SALES_INCENTIVE_CREDIT': return AdsCreditDiscountsResponseDiscountTypeEnum.INVOICE_SALES_INCENTIVE_CREDIT;
        case r'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED': return AdsCreditDiscountsResponseDiscountTypeEnum.INVOICE_SALES_INCENTIVE_CREDIT_APPLIED;
        case r'PREPAID_CREDIT_REFUND': return AdsCreditDiscountsResponseDiscountTypeEnum.PREPAID_CREDIT_REFUND;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdsCreditDiscountsResponseDiscountTypeEnumTypeTransformer] instance.
  static AdsCreditDiscountsResponseDiscountTypeEnumTypeTransformer? _instance;
}


