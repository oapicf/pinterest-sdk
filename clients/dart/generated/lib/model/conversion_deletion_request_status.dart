//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
enum ConversionDeletionRequestStatus {
  PENDING._(r'PENDING'),
  SUBMITTED._(r'SUBMITTED'),
  CANCELLED._(r'CANCELLED'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionDeletionRequestStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionDeletionRequestStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionDeletionRequestStatus? fromJson(dynamic value) => ConversionDeletionRequestStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionDeletionRequestStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionDeletionRequestStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionDeletionRequestStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionDeletionRequestStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionDeletionRequestStatus] to String,
/// and [decode] dynamic data back to [ConversionDeletionRequestStatus].
class ConversionDeletionRequestStatusTypeTransformer {
  factory ConversionDeletionRequestStatusTypeTransformer() => _instance ??= const ConversionDeletionRequestStatusTypeTransformer._();

  const ConversionDeletionRequestStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionDeletionRequestStatus data) => data._value;

  /// Returns the instance of [ConversionDeletionRequestStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionDeletionRequestStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionDeletionRequestStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PENDING': return ConversionDeletionRequestStatus.PENDING;
        case r'SUBMITTED': return ConversionDeletionRequestStatus.SUBMITTED;
        case r'CANCELLED': return ConversionDeletionRequestStatus.CANCELLED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionDeletionRequestStatusTypeTransformer? _instance;
}

