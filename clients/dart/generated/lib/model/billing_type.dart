//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Advertisers billing type
enum BillingType {
  CREDIT_CARD._(r'CREDIT_CARD'),
  INVOICE._(r'INVOICE'),
  INTERNAL._(r'INTERNAL'),
  RECURRING._(r'RECURRING'),
  PREPAID._(r'PREPAID'),
  ;

  /// Instantiate a new enum with the provided value.
  const BillingType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BillingType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BillingType? fromJson(dynamic value) => BillingTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BillingType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BillingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingType] to String,
/// and [decode] dynamic data back to [BillingType].
class BillingTypeTypeTransformer {
  factory BillingTypeTypeTransformer() => _instance ??= const BillingTypeTypeTransformer._();

  const BillingTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BillingType data) => data._value;

  /// Returns the instance of [BillingType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingType? decode(dynamic data, {bool allowNull = true}) {
    if (data is BillingType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREDIT_CARD': return BillingType.CREDIT_CARD;
        case r'INVOICE': return BillingType.INVOICE;
        case r'INTERNAL': return BillingType.INTERNAL;
        case r'RECURRING': return BillingType.RECURRING;
        case r'PREPAID': return BillingType.PREPAID;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BillingTypeTypeTransformer? _instance;
}

