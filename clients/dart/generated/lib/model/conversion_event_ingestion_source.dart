//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The source of conversion events ingestion
enum ConversionEventIngestionSource {
  TAG._(r'TAG'),
  MMP._(r'MMP'),
  FILE_UPLOAD._(r'FILE_UPLOAD'),
  CONVERSIONS_API._(r'CONVERSIONS_API'),
  NATIVE._(r'NATIVE'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionEventIngestionSource._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionEventIngestionSource] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionEventIngestionSource? fromJson(dynamic value) => ConversionEventIngestionSourceTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionEventIngestionSource]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionEventIngestionSource> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventIngestionSource>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventIngestionSource.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionEventIngestionSource] to String,
/// and [decode] dynamic data back to [ConversionEventIngestionSource].
class ConversionEventIngestionSourceTypeTransformer {
  factory ConversionEventIngestionSourceTypeTransformer() => _instance ??= const ConversionEventIngestionSourceTypeTransformer._();

  const ConversionEventIngestionSourceTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionEventIngestionSource data) => data._value;

  /// Returns the instance of [ConversionEventIngestionSource] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionEventIngestionSource? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionEventIngestionSource) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'TAG': return ConversionEventIngestionSource.TAG;
        case r'MMP': return ConversionEventIngestionSource.MMP;
        case r'FILE_UPLOAD': return ConversionEventIngestionSource.FILE_UPLOAD;
        case r'CONVERSIONS_API': return ConversionEventIngestionSource.CONVERSIONS_API;
        case r'NATIVE': return ConversionEventIngestionSource.NATIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionEventIngestionSourceTypeTransformer? _instance;
}

