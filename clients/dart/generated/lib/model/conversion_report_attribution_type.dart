//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Attribution type. Refers to the Pinterest Tag endpoints
enum ConversionReportAttributionType {
  INDIVIDUAL._(r'INDIVIDUAL'),
  HOUSEHOLD._(r'HOUSEHOLD'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionReportAttributionType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionReportAttributionType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionReportAttributionType? fromJson(dynamic value) => ConversionReportAttributionTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionReportAttributionType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionReportAttributionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionReportAttributionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionReportAttributionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionReportAttributionType] to String,
/// and [decode] dynamic data back to [ConversionReportAttributionType].
class ConversionReportAttributionTypeTypeTransformer {
  factory ConversionReportAttributionTypeTypeTransformer() => _instance ??= const ConversionReportAttributionTypeTypeTransformer._();

  const ConversionReportAttributionTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionReportAttributionType data) => data._value;

  /// Returns the instance of [ConversionReportAttributionType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionReportAttributionType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionReportAttributionType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'INDIVIDUAL': return ConversionReportAttributionType.INDIVIDUAL;
        case r'HOUSEHOLD': return ConversionReportAttributionType.HOUSEHOLD;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionReportAttributionTypeTypeTransformer? _instance;
}

