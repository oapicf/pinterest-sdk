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
class IngestionSourceOptions {
  /// Instantiate a new enum with the provided [value].
  const IngestionSourceOptions._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TAG = IngestionSourceOptions._(r'TAG');
  static const MMP = IngestionSourceOptions._(r'MMP');
  static const FILE_UPLOAD = IngestionSourceOptions._(r'FILE_UPLOAD');
  static const CONVERSIONS_API = IngestionSourceOptions._(r'CONVERSIONS_API');
  static const NATIVE = IngestionSourceOptions._(r'NATIVE');

  /// List of all possible values in this [enum][IngestionSourceOptions].
  static const values = <IngestionSourceOptions>[
    TAG,
    MMP,
    FILE_UPLOAD,
    CONVERSIONS_API,
    NATIVE,
  ];

  static IngestionSourceOptions? fromJson(dynamic value) => IngestionSourceOptionsTypeTransformer().decode(value);

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

  String encode(IngestionSourceOptions data) => data.value;

  /// Decodes a [dynamic value][data] to a IngestionSourceOptions.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  IngestionSourceOptions? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [IngestionSourceOptionsTypeTransformer] instance.
  static IngestionSourceOptionsTypeTransformer? _instance;
}

