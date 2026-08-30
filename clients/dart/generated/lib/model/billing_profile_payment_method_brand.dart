//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Brand of the payment method.
enum BillingProfilePaymentMethodBrand {
  UNKNOWN._(r'UNKNOWN'),
  VISA._(r'VISA'),
  MASTERCARD._(r'MASTERCARD'),
  AMERICAN_EXPRESS._(r'AMERICAN_EXPRESS'),
  DISCOVER._(r'DISCOVER'),
  SOFORT._(r'SOFORT'),
  DINERS_CLUB._(r'DINERS_CLUB'),
  ELO._(r'ELO'),
  CARTE_BANCAIRE._(r'CARTE_BANCAIRE'),
  ;

  /// Instantiate a new enum with the provided value.
  const BillingProfilePaymentMethodBrand._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BillingProfilePaymentMethodBrand] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BillingProfilePaymentMethodBrand? fromJson(dynamic value) => BillingProfilePaymentMethodBrandTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BillingProfilePaymentMethodBrand]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BillingProfilePaymentMethodBrand> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfilePaymentMethodBrand>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfilePaymentMethodBrand.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingProfilePaymentMethodBrand] to String,
/// and [decode] dynamic data back to [BillingProfilePaymentMethodBrand].
class BillingProfilePaymentMethodBrandTypeTransformer {
  factory BillingProfilePaymentMethodBrandTypeTransformer() => _instance ??= const BillingProfilePaymentMethodBrandTypeTransformer._();

  const BillingProfilePaymentMethodBrandTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BillingProfilePaymentMethodBrand data) => data._value;

  /// Returns the instance of [BillingProfilePaymentMethodBrand] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingProfilePaymentMethodBrand? decode(dynamic data, {bool allowNull = true}) {
    if (data is BillingProfilePaymentMethodBrand) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return BillingProfilePaymentMethodBrand.UNKNOWN;
        case r'VISA': return BillingProfilePaymentMethodBrand.VISA;
        case r'MASTERCARD': return BillingProfilePaymentMethodBrand.MASTERCARD;
        case r'AMERICAN_EXPRESS': return BillingProfilePaymentMethodBrand.AMERICAN_EXPRESS;
        case r'DISCOVER': return BillingProfilePaymentMethodBrand.DISCOVER;
        case r'SOFORT': return BillingProfilePaymentMethodBrand.SOFORT;
        case r'DINERS_CLUB': return BillingProfilePaymentMethodBrand.DINERS_CLUB;
        case r'ELO': return BillingProfilePaymentMethodBrand.ELO;
        case r'CARTE_BANCAIRE': return BillingProfilePaymentMethodBrand.CARTE_BANCAIRE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BillingProfilePaymentMethodBrandTypeTransformer? _instance;
}

