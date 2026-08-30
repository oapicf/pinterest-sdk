//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The schedule type
enum ScheduleType {
  CAMPAIGN_BUDGET_CHANGE._(r'CAMPAIGN_BUDGET_CHANGE'),
  CAMPAIGN_BID_MULTIPLIERS._(r'CAMPAIGN_BID_MULTIPLIERS'),
  ;

  /// Instantiate a new enum with the provided value.
  const ScheduleType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ScheduleType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ScheduleType? fromJson(dynamic value) => ScheduleTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ScheduleType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ScheduleType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ScheduleType] to String,
/// and [decode] dynamic data back to [ScheduleType].
class ScheduleTypeTypeTransformer {
  factory ScheduleTypeTypeTransformer() => _instance ??= const ScheduleTypeTypeTransformer._();

  const ScheduleTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ScheduleType data) => data._value;

  /// Returns the instance of [ScheduleType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ScheduleType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ScheduleType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CAMPAIGN_BUDGET_CHANGE': return ScheduleType.CAMPAIGN_BUDGET_CHANGE;
        case r'CAMPAIGN_BID_MULTIPLIERS': return ScheduleType.CAMPAIGN_BID_MULTIPLIERS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ScheduleTypeTypeTransformer? _instance;
}

