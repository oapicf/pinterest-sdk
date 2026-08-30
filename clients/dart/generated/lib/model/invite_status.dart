//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The current status of an invite or request.
enum InviteStatus {
  PENDING._(r'PENDING'),
  ACCEPTED._(r'ACCEPTED'),
  DECLINED._(r'DECLINED'),
  CANCELLED._(r'CANCELLED'),
  EXPIRED._(r'EXPIRED'),
  ;

  /// Instantiate a new enum with the provided value.
  const InviteStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [InviteStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static InviteStatus? fromJson(dynamic value) => InviteStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [InviteStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<InviteStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteStatus] to String,
/// and [decode] dynamic data back to [InviteStatus].
class InviteStatusTypeTransformer {
  factory InviteStatusTypeTransformer() => _instance ??= const InviteStatusTypeTransformer._();

  const InviteStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(InviteStatus data) => data._value;

  /// Returns the instance of [InviteStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is InviteStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PENDING': return InviteStatus.PENDING;
        case r'ACCEPTED': return InviteStatus.ACCEPTED;
        case r'DECLINED': return InviteStatus.DECLINED;
        case r'CANCELLED': return InviteStatus.CANCELLED;
        case r'EXPIRED': return InviteStatus.EXPIRED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static InviteStatusTypeTransformer? _instance;
}

