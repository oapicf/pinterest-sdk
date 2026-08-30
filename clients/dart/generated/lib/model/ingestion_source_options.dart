//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// List of ingestion sources for a conversion event.
enum IngestionSourceOptions {
  TAG._(r'TAG'),
  MMP._(r'MMP'),
  FILE_UPLOAD._(r'FILE_UPLOAD'),
  CONVERSIONS_API._(r'CONVERSIONS_API'),
  NATIVE._(r'NATIVE'),
  ;

  /// Instantiate a new enum with the provided value.
  const IngestionSourceOptions._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [IngestionSourceOptions] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static IngestionSourceOptions? fromJson(dynamic value) => IngestionSourceOptionsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [IngestionSourceOptions]
  /// that were successfully decoded from the passed [JSON][json].
  static List<IngestionSourceOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IngestionSourceOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IngestionSourceOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [IngestionSourceOptions] to String,
/// and [decode] dynamic data back to [IngestionSourceOptions].
class IngestionSourceOptionsTypeTransformer {
  factory IngestionSourceOptionsTypeTransformer() => _instance ??= const IngestionSourceOptionsTypeTransformer._();

  const IngestionSourceOptionsTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(IngestionSourceOptions data) => data._value;

  /// Returns the instance of [IngestionSourceOptions] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  IngestionSourceOptions? decode(dynamic data, {bool allowNull = true}) {
    if (data is IngestionSourceOptions) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'TAG': return IngestionSourceOptions.TAG;
        case r'MMP': return IngestionSourceOptions.MMP;
        case r'FILE_UPLOAD': return IngestionSourceOptions.FILE_UPLOAD;
        case r'CONVERSIONS_API': return IngestionSourceOptions.CONVERSIONS_API;
        case r'NATIVE': return IngestionSourceOptions.NATIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static IngestionSourceOptionsTypeTransformer? _instance;
}

