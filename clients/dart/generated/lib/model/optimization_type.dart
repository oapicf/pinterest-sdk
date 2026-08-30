//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Optimization type for ad group delivery estimates. Supported types vary by objective.
enum OptimizationType {
  CLICKTHROUGH._(r'CLICKTHROUGH'),
  IMPRESSION._(r'IMPRESSION'),
  WEB_CONVERSION._(r'WEB_CONVERSION'),
  ROAS._(r'ROAS'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  ;

  /// Instantiate a new enum with the provided value.
  const OptimizationType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [OptimizationType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static OptimizationType? fromJson(dynamic value) => OptimizationTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [OptimizationType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<OptimizationType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OptimizationType] to String,
/// and [decode] dynamic data back to [OptimizationType].
class OptimizationTypeTypeTransformer {
  factory OptimizationTypeTypeTransformer() => _instance ??= const OptimizationTypeTypeTransformer._();

  const OptimizationTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(OptimizationType data) => data._value;

  /// Returns the instance of [OptimizationType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OptimizationType? decode(dynamic data, {bool allowNull = true}) {
    if (data is OptimizationType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CLICKTHROUGH': return OptimizationType.CLICKTHROUGH;
        case r'IMPRESSION': return OptimizationType.IMPRESSION;
        case r'WEB_CONVERSION': return OptimizationType.WEB_CONVERSION;
        case r'ROAS': return OptimizationType.ROAS;
        case r'OUTBOUND_CLICK': return OptimizationType.OUTBOUND_CLICK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static OptimizationTypeTypeTransformer? _instance;
}

