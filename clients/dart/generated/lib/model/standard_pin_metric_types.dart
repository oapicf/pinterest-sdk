//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Standard Pin metric types
enum StandardPinMetricTypes {
  IMPRESSION._(r'IMPRESSION'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  PIN_CLICK._(r'PIN_CLICK'),
  SAVE._(r'SAVE'),
  SAVE_RATE._(r'SAVE_RATE'),
  TOTAL_COMMENTS._(r'TOTAL_COMMENTS'),
  TOTAL_REACTIONS._(r'TOTAL_REACTIONS'),
  USER_FOLLOW._(r'USER_FOLLOW'),
  PROFILE_VISIT._(r'PROFILE_VISIT'),
  ;

  /// Instantiate a new enum with the provided value.
  const StandardPinMetricTypes._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [StandardPinMetricTypes] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static StandardPinMetricTypes? fromJson(dynamic value) => StandardPinMetricTypesTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [StandardPinMetricTypes]
  /// that were successfully decoded from the passed [JSON][json].
  static List<StandardPinMetricTypes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StandardPinMetricTypes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StandardPinMetricTypes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [StandardPinMetricTypes] to String,
/// and [decode] dynamic data back to [StandardPinMetricTypes].
class StandardPinMetricTypesTypeTransformer {
  factory StandardPinMetricTypesTypeTransformer() => _instance ??= const StandardPinMetricTypesTypeTransformer._();

  const StandardPinMetricTypesTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(StandardPinMetricTypes data) => data._value;

  /// Returns the instance of [StandardPinMetricTypes] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  StandardPinMetricTypes? decode(dynamic data, {bool allowNull = true}) {
    if (data is StandardPinMetricTypes) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'IMPRESSION': return StandardPinMetricTypes.IMPRESSION;
        case r'OUTBOUND_CLICK': return StandardPinMetricTypes.OUTBOUND_CLICK;
        case r'PIN_CLICK': return StandardPinMetricTypes.PIN_CLICK;
        case r'SAVE': return StandardPinMetricTypes.SAVE;
        case r'SAVE_RATE': return StandardPinMetricTypes.SAVE_RATE;
        case r'TOTAL_COMMENTS': return StandardPinMetricTypes.TOTAL_COMMENTS;
        case r'TOTAL_REACTIONS': return StandardPinMetricTypes.TOTAL_REACTIONS;
        case r'USER_FOLLOW': return StandardPinMetricTypes.USER_FOLLOW;
        case r'PROFILE_VISIT': return StandardPinMetricTypes.PROFILE_VISIT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static StandardPinMetricTypesTypeTransformer? _instance;
}

