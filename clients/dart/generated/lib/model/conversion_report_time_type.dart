//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Conversion report time type
enum ConversionReportTimeType {
  TIME_OF_AD_ACTION._(r'TIME_OF_AD_ACTION'),
  TIME_OF_CONVERSION._(r'TIME_OF_CONVERSION'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionReportTimeType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionReportTimeType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionReportTimeType? fromJson(dynamic value) => ConversionReportTimeTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionReportTimeType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionReportTimeType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionReportTimeType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionReportTimeType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionReportTimeType] to String,
/// and [decode] dynamic data back to [ConversionReportTimeType].
class ConversionReportTimeTypeTypeTransformer {
  factory ConversionReportTimeTypeTypeTransformer() => _instance ??= const ConversionReportTimeTypeTypeTransformer._();

  const ConversionReportTimeTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionReportTimeType data) => data._value;

  /// Returns the instance of [ConversionReportTimeType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionReportTimeType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionReportTimeType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'TIME_OF_AD_ACTION': return ConversionReportTimeType.TIME_OF_AD_ACTION;
        case r'TIME_OF_CONVERSION': return ConversionReportTimeType.TIME_OF_CONVERSION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionReportTimeTypeTypeTransformer? _instance;
}

