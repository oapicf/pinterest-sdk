//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Billing profile status
enum BillingProfileStatus {
  UNSPECIFIED._(r'UNSPECIFIED'),
  VALID._(r'VALID'),
  INVALID._(r'INVALID'),
  PENDING._(r'PENDING'),
  DELETED._(r'DELETED'),
  SECONDARY._(r'SECONDARY'),
  PENDING_SECONDARY._(r'PENDING_SECONDARY'),
  ;

  /// Instantiate a new enum with the provided value.
  const BillingProfileStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BillingProfileStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BillingProfileStatus? fromJson(dynamic value) => BillingProfileStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BillingProfileStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BillingProfileStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfileStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfileStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingProfileStatus] to String,
/// and [decode] dynamic data back to [BillingProfileStatus].
class BillingProfileStatusTypeTransformer {
  factory BillingProfileStatusTypeTransformer() => _instance ??= const BillingProfileStatusTypeTransformer._();

  const BillingProfileStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BillingProfileStatus data) => data._value;

  /// Returns the instance of [BillingProfileStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingProfileStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is BillingProfileStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UNSPECIFIED': return BillingProfileStatus.UNSPECIFIED;
        case r'VALID': return BillingProfileStatus.VALID;
        case r'INVALID': return BillingProfileStatus.INVALID;
        case r'PENDING': return BillingProfileStatus.PENDING;
        case r'DELETED': return BillingProfileStatus.DELETED;
        case r'SECONDARY': return BillingProfileStatus.SECONDARY;
        case r'PENDING_SECONDARY': return BillingProfileStatus.PENDING_SECONDARY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BillingProfileStatusTypeTransformer? _instance;
}

