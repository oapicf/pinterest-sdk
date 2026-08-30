//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The file format of a feed.
enum CatalogsFormat {
  TSV._(r'TSV'),
  CSV._(r'CSV'),
  XML._(r'XML'),
  INTEGRATION._(r'INTEGRATION'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsFormat._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsFormat] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsFormat? fromJson(dynamic value) => CatalogsFormatTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsFormat]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsFormat> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFormat>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFormat.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsFormat] to String,
/// and [decode] dynamic data back to [CatalogsFormat].
class CatalogsFormatTypeTransformer {
  factory CatalogsFormatTypeTransformer() => _instance ??= const CatalogsFormatTypeTransformer._();

  const CatalogsFormatTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CatalogsFormat data) => data._value;

  /// Returns the instance of [CatalogsFormat] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsFormat? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsFormat) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'TSV': return CatalogsFormat.TSV;
        case r'CSV': return CatalogsFormat.CSV;
        case r'XML': return CatalogsFormat.XML;
        case r'INTEGRATION': return CatalogsFormat.INTEGRATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsFormatTypeTransformer? _instance;
}

