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
class ConversionReportTimeType {
  /// Instantiate a new enum with the provided [value].
  const ConversionReportTimeType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TIME_OF_AD_ACTION = ConversionReportTimeType._(r'TIME_OF_AD_ACTION');
  static const TIME_OF_CONVERSION = ConversionReportTimeType._(r'TIME_OF_CONVERSION');

  /// List of all possible values in this [enum][ConversionReportTimeType].
  static const values = <ConversionReportTimeType>[
    TIME_OF_AD_ACTION,
    TIME_OF_CONVERSION,
  ];

  static ConversionReportTimeType? fromJson(dynamic value) => ConversionReportTimeTypeTypeTransformer().decode(value);

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

  String encode(ConversionReportTimeType data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionReportTimeType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionReportTimeType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [ConversionReportTimeTypeTypeTransformer] instance.
  static ConversionReportTimeTypeTypeTransformer? _instance;
}

