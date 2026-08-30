//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Discount status based on the current time and start and end time of discount
enum DiscountStatus {
  OTHER._(r'OTHER'),
  ACTIVE._(r'ACTIVE'),
  PAUSED._(r'PAUSED'),
  SCHEDULED._(r'SCHEDULED'),
  EXPIRED._(r'EXPIRED'),
  ;

  /// Instantiate a new enum with the provided value.
  const DiscountStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [DiscountStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static DiscountStatus? fromJson(dynamic value) => DiscountStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [DiscountStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<DiscountStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DiscountStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DiscountStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DiscountStatus] to String,
/// and [decode] dynamic data back to [DiscountStatus].
class DiscountStatusTypeTransformer {
  factory DiscountStatusTypeTransformer() => _instance ??= const DiscountStatusTypeTransformer._();

  const DiscountStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(DiscountStatus data) => data._value;

  /// Returns the instance of [DiscountStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DiscountStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is DiscountStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'OTHER': return DiscountStatus.OTHER;
        case r'ACTIVE': return DiscountStatus.ACTIVE;
        case r'PAUSED': return DiscountStatus.PAUSED;
        case r'SCHEDULED': return DiscountStatus.SCHEDULED;
        case r'EXPIRED': return DiscountStatus.EXPIRED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static DiscountStatusTypeTransformer? _instance;
}

