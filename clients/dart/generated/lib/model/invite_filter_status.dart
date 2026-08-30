//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Invite statuses used for filters.
enum InviteFilterStatus {
  PENDING._(r'PENDING'),
  EXPIRED._(r'EXPIRED'),
  ;

  /// Instantiate a new enum with the provided value.
  const InviteFilterStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [InviteFilterStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static InviteFilterStatus? fromJson(dynamic value) => InviteFilterStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [InviteFilterStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<InviteFilterStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteFilterStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteFilterStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteFilterStatus] to String,
/// and [decode] dynamic data back to [InviteFilterStatus].
class InviteFilterStatusTypeTransformer {
  factory InviteFilterStatusTypeTransformer() => _instance ??= const InviteFilterStatusTypeTransformer._();

  const InviteFilterStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(InviteFilterStatus data) => data._value;

  /// Returns the instance of [InviteFilterStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteFilterStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is InviteFilterStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PENDING': return InviteFilterStatus.PENDING;
        case r'EXPIRED': return InviteFilterStatus.EXPIRED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static InviteFilterStatusTypeTransformer? _instance;
}

