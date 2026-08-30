//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Days in lookback window in the GET Conversion EQS response.
enum LookbackPeriodOptions {
  n1d._(r'1d'),
  n14d._(r'14d'),
  ;

  /// Instantiate a new enum with the provided value.
  const LookbackPeriodOptions._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [LookbackPeriodOptions] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static LookbackPeriodOptions? fromJson(dynamic value) => LookbackPeriodOptionsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [LookbackPeriodOptions]
  /// that were successfully decoded from the passed [JSON][json].
  static List<LookbackPeriodOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LookbackPeriodOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LookbackPeriodOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LookbackPeriodOptions] to String,
/// and [decode] dynamic data back to [LookbackPeriodOptions].
class LookbackPeriodOptionsTypeTransformer {
  factory LookbackPeriodOptionsTypeTransformer() => _instance ??= const LookbackPeriodOptionsTypeTransformer._();

  const LookbackPeriodOptionsTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(LookbackPeriodOptions data) => data._value;

  /// Returns the instance of [LookbackPeriodOptions] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LookbackPeriodOptions? decode(dynamic data, {bool allowNull = true}) {
    if (data is LookbackPeriodOptions) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'1d': return LookbackPeriodOptions.n1d;
        case r'14d': return LookbackPeriodOptions.n14d;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static LookbackPeriodOptionsTypeTransformer? _instance;
}

