//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The status of the batch operation
enum SupplementalItemBatchOperationStatus {
  PROCESSING._(r'PROCESSING'),
  COMPLETED._(r'COMPLETED'),
  FAILED._(r'FAILED'),
  ;

  /// Instantiate a new enum with the provided value.
  const SupplementalItemBatchOperationStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [SupplementalItemBatchOperationStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static SupplementalItemBatchOperationStatus? fromJson(dynamic value) => SupplementalItemBatchOperationStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [SupplementalItemBatchOperationStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<SupplementalItemBatchOperationStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SupplementalItemBatchOperationStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SupplementalItemBatchOperationStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [SupplementalItemBatchOperationStatus] to String,
/// and [decode] dynamic data back to [SupplementalItemBatchOperationStatus].
class SupplementalItemBatchOperationStatusTypeTransformer {
  factory SupplementalItemBatchOperationStatusTypeTransformer() => _instance ??= const SupplementalItemBatchOperationStatusTypeTransformer._();

  const SupplementalItemBatchOperationStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(SupplementalItemBatchOperationStatus data) => data._value;

  /// Returns the instance of [SupplementalItemBatchOperationStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SupplementalItemBatchOperationStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is SupplementalItemBatchOperationStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PROCESSING': return SupplementalItemBatchOperationStatus.PROCESSING;
        case r'COMPLETED': return SupplementalItemBatchOperationStatus.COMPLETED;
        case r'FAILED': return SupplementalItemBatchOperationStatus.FAILED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static SupplementalItemBatchOperationStatusTypeTransformer? _instance;
}

