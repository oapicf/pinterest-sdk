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
class CatalogsFormat {
  /// Instantiate a new enum with the provided [value].
  const CatalogsFormat._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TSV = CatalogsFormat._(r'TSV');
  static const CSV = CatalogsFormat._(r'CSV');
  static const XML = CatalogsFormat._(r'XML');

  /// List of all possible values in this [enum][CatalogsFormat].
  static const values = <CatalogsFormat>[
    TSV,
    CSV,
    XML,
  ];

  static CatalogsFormat? fromJson(dynamic value) => CatalogsFormatTypeTransformer().decode(value);

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

  String encode(CatalogsFormat data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsFormat.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsFormat? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'TSV': return CatalogsFormat.TSV;
        case r'CSV': return CatalogsFormat.CSV;
        case r'XML': return CatalogsFormat.XML;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsFormatTypeTransformer] instance.
  static CatalogsFormatTypeTransformer? _instance;
}

