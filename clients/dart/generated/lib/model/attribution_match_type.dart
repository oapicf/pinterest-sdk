//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
enum AttributionMatchType {
  P._(r'P'),
  D._(r'D'),
  NA._(r'NA'),
  ;

  /// Instantiate a new enum with the provided value.
  const AttributionMatchType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AttributionMatchType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AttributionMatchType? fromJson(dynamic value) => AttributionMatchTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AttributionMatchType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AttributionMatchType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AttributionMatchType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AttributionMatchType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AttributionMatchType] to String,
/// and [decode] dynamic data back to [AttributionMatchType].
class AttributionMatchTypeTypeTransformer {
  factory AttributionMatchTypeTypeTransformer() => _instance ??= const AttributionMatchTypeTypeTransformer._();

  const AttributionMatchTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AttributionMatchType data) => data._value;

  /// Returns the instance of [AttributionMatchType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AttributionMatchType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AttributionMatchType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'P': return AttributionMatchType.P;
        case r'D': return AttributionMatchType.D;
        case r'NA': return AttributionMatchType.NA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AttributionMatchTypeTypeTransformer? _instance;
}

