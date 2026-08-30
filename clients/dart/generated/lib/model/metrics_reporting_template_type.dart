//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reporting template type
enum MetricsReportingTemplateType {
  UNSPECIFIED._(r'UNSPECIFIED'),
  BULK._(r'BULK'),
  OVERVIEW._(r'OVERVIEW'),
  TABLE._(r'TABLE'),
  MMM._(r'MMM'),
  BRAND_CATEGORY._(r'BRAND_CATEGORY'),
  ;

  /// Instantiate a new enum with the provided value.
  const MetricsReportingTemplateType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MetricsReportingTemplateType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MetricsReportingTemplateType? fromJson(dynamic value) => MetricsReportingTemplateTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MetricsReportingTemplateType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MetricsReportingTemplateType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MetricsReportingTemplateType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MetricsReportingTemplateType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MetricsReportingTemplateType] to String,
/// and [decode] dynamic data back to [MetricsReportingTemplateType].
class MetricsReportingTemplateTypeTypeTransformer {
  factory MetricsReportingTemplateTypeTypeTransformer() => _instance ??= const MetricsReportingTemplateTypeTypeTransformer._();

  const MetricsReportingTemplateTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(MetricsReportingTemplateType data) => data._value;

  /// Returns the instance of [MetricsReportingTemplateType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MetricsReportingTemplateType? decode(dynamic data, {bool allowNull = true}) {
    if (data is MetricsReportingTemplateType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UNSPECIFIED': return MetricsReportingTemplateType.UNSPECIFIED;
        case r'BULK': return MetricsReportingTemplateType.BULK;
        case r'OVERVIEW': return MetricsReportingTemplateType.OVERVIEW;
        case r'TABLE': return MetricsReportingTemplateType.TABLE;
        case r'MMM': return MetricsReportingTemplateType.MMM;
        case r'BRAND_CATEGORY': return MetricsReportingTemplateType.BRAND_CATEGORY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MetricsReportingTemplateTypeTypeTransformer? _instance;
}

