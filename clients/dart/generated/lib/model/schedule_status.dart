//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Schedule status
enum ScheduleStatus {
  DRAFT._(r'DRAFT'),
  CREATED._(r'CREATED'),
  SCHEDULED._(r'SCHEDULED'),
  ACTIVE._(r'ACTIVE'),
  COMPLETED._(r'COMPLETED'),
  FAILED._(r'FAILED'),
  CANCELED._(r'CANCELED'),
  ;

  /// Instantiate a new enum with the provided value.
  const ScheduleStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ScheduleStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ScheduleStatus? fromJson(dynamic value) => ScheduleStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ScheduleStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ScheduleStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ScheduleStatus] to String,
/// and [decode] dynamic data back to [ScheduleStatus].
class ScheduleStatusTypeTransformer {
  factory ScheduleStatusTypeTransformer() => _instance ??= const ScheduleStatusTypeTransformer._();

  const ScheduleStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ScheduleStatus data) => data._value;

  /// Returns the instance of [ScheduleStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ScheduleStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is ScheduleStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DRAFT': return ScheduleStatus.DRAFT;
        case r'CREATED': return ScheduleStatus.CREATED;
        case r'SCHEDULED': return ScheduleStatus.SCHEDULED;
        case r'ACTIVE': return ScheduleStatus.ACTIVE;
        case r'COMPLETED': return ScheduleStatus.COMPLETED;
        case r'FAILED': return ScheduleStatus.FAILED;
        case r'CANCELED': return ScheduleStatus.CANCELED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ScheduleStatusTypeTransformer? _instance;
}

