//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Bulk request status
enum BulkRequestStatus {
  RUNNING._(r'RUNNING'),
  SUCCEEDED._(r'SUCCEEDED'),
  FAILED._(r'FAILED'),
  ;

  /// Instantiate a new enum with the provided value.
  const BulkRequestStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BulkRequestStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BulkRequestStatus? fromJson(dynamic value) => BulkRequestStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BulkRequestStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BulkRequestStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkRequestStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkRequestStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BulkRequestStatus] to String,
/// and [decode] dynamic data back to [BulkRequestStatus].
class BulkRequestStatusTypeTransformer {
  factory BulkRequestStatusTypeTransformer() => _instance ??= const BulkRequestStatusTypeTransformer._();

  const BulkRequestStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BulkRequestStatus data) => data._value;

  /// Returns the instance of [BulkRequestStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BulkRequestStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is BulkRequestStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RUNNING': return BulkRequestStatus.RUNNING;
        case r'SUCCEEDED': return BulkRequestStatus.SUCCEEDED;
        case r'FAILED': return BulkRequestStatus.FAILED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BulkRequestStatusTypeTransformer? _instance;
}

