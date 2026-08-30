//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Type of the credit card.
enum BillingProfileCardType {
  UNKNOWN._(r'UNKNOWN'),
  VISA._(r'VISA'),
  MASTERCARD._(r'MASTERCARD'),
  AMERICAN_EXPRESS._(r'AMERICAN_EXPRESS'),
  DISCOVER._(r'DISCOVER'),
  ELO._(r'ELO'),
  ;

  /// Instantiate a new enum with the provided value.
  const BillingProfileCardType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BillingProfileCardType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BillingProfileCardType? fromJson(dynamic value) => BillingProfileCardTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BillingProfileCardType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BillingProfileCardType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfileCardType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfileCardType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingProfileCardType] to String,
/// and [decode] dynamic data back to [BillingProfileCardType].
class BillingProfileCardTypeTypeTransformer {
  factory BillingProfileCardTypeTypeTransformer() => _instance ??= const BillingProfileCardTypeTypeTransformer._();

  const BillingProfileCardTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BillingProfileCardType data) => data._value;

  /// Returns the instance of [BillingProfileCardType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingProfileCardType? decode(dynamic data, {bool allowNull = true}) {
    if (data is BillingProfileCardType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return BillingProfileCardType.UNKNOWN;
        case r'VISA': return BillingProfileCardType.VISA;
        case r'MASTERCARD': return BillingProfileCardType.MASTERCARD;
        case r'AMERICAN_EXPRESS': return BillingProfileCardType.AMERICAN_EXPRESS;
        case r'DISCOVER': return BillingProfileCardType.DISCOVER;
        case r'ELO': return BillingProfileCardType.ELO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BillingProfileCardTypeTypeTransformer? _instance;
}

