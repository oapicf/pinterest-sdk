//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
enum CustomerListStatus {
  PROCESSING._(r'PROCESSING'),
  READY._(r'READY'),
  TOO_SMALL._(r'TOO_SMALL'),
  UPLOADING._(r'UPLOADING'),
  ;

  /// Instantiate a new enum with the provided value.
  const CustomerListStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CustomerListStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CustomerListStatus? fromJson(dynamic value) => CustomerListStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CustomerListStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CustomerListStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CustomerListStatus] to String,
/// and [decode] dynamic data back to [CustomerListStatus].
class CustomerListStatusTypeTransformer {
  factory CustomerListStatusTypeTransformer() => _instance ??= const CustomerListStatusTypeTransformer._();

  const CustomerListStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CustomerListStatus data) => data._value;

  /// Returns the instance of [CustomerListStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CustomerListStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is CustomerListStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PROCESSING': return CustomerListStatus.PROCESSING;
        case r'READY': return CustomerListStatus.READY;
        case r'TOO_SMALL': return CustomerListStatus.TOO_SMALL;
        case r'UPLOADING': return CustomerListStatus.UPLOADING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CustomerListStatusTypeTransformer? _instance;
}

