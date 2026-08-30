//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum FrequencyGoalMetadataTimerange {
  THIRTY_DAY._(r'THIRTY_DAY'),
  DAY._(r'DAY'),
  SEVEN_DAY._(r'SEVEN_DAY'),
  TWENTY_MINUTE._(r'TWENTY_MINUTE'),
  TEN_MINUTE._(r'TEN_MINUTE'),
  TWENTY_FOUR_HOUR._(r'TWENTY_FOUR_HOUR'),
  ;

  /// Instantiate a new enum with the provided value.
  const FrequencyGoalMetadataTimerange._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [FrequencyGoalMetadataTimerange] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static FrequencyGoalMetadataTimerange? fromJson(dynamic value) => FrequencyGoalMetadataTimerangeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [FrequencyGoalMetadataTimerange]
  /// that were successfully decoded from the passed [JSON][json].
  static List<FrequencyGoalMetadataTimerange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FrequencyGoalMetadataTimerange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FrequencyGoalMetadataTimerange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FrequencyGoalMetadataTimerange] to String,
/// and [decode] dynamic data back to [FrequencyGoalMetadataTimerange].
class FrequencyGoalMetadataTimerangeTypeTransformer {
  factory FrequencyGoalMetadataTimerangeTypeTransformer() => _instance ??= const FrequencyGoalMetadataTimerangeTypeTransformer._();

  const FrequencyGoalMetadataTimerangeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(FrequencyGoalMetadataTimerange data) => data._value;

  /// Returns the instance of [FrequencyGoalMetadataTimerange] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FrequencyGoalMetadataTimerange? decode(dynamic data, {bool allowNull = true}) {
    if (data is FrequencyGoalMetadataTimerange) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'THIRTY_DAY': return FrequencyGoalMetadataTimerange.THIRTY_DAY;
        case r'DAY': return FrequencyGoalMetadataTimerange.DAY;
        case r'SEVEN_DAY': return FrequencyGoalMetadataTimerange.SEVEN_DAY;
        case r'TWENTY_MINUTE': return FrequencyGoalMetadataTimerange.TWENTY_MINUTE;
        case r'TEN_MINUTE': return FrequencyGoalMetadataTimerange.TEN_MINUTE;
        case r'TWENTY_FOUR_HOUR': return FrequencyGoalMetadataTimerange.TWENTY_FOUR_HOUR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static FrequencyGoalMetadataTimerangeTypeTransformer? _instance;
}

