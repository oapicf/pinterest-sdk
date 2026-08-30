//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailReportStatsParameters {
  /// Returns a new [CatalogsRetailReportStatsParameters] instance.
  CatalogsRetailReportStatsParameters({
    required this.catalogType,
    required this.report,
  });

  CatalogsRetailReportStatsParametersCatalogTypeEnum catalogType;

  CatalogsRetailReportStatsParametersReport report;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailReportStatsParameters &&
    other.catalogType == catalogType &&
    other.report == report;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (report.hashCode);

  @override
  String toString() => 'CatalogsRetailReportStatsParameters[catalogType=$catalogType, report=$report]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'report'] = this.report;
    return json;
  }

  /// Returns a new [CatalogsRetailReportStatsParameters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailReportStatsParameters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsRetailReportStatsParameters[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsRetailReportStatsParameters[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'report'), 'Required key "CatalogsRetailReportStatsParameters[report]" is missing from JSON.');
        assert(json[r'report'] != null, 'Required key "CatalogsRetailReportStatsParameters[report]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailReportStatsParameters(
        catalogType: CatalogsRetailReportStatsParametersCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        report: CatalogsRetailReportStatsParametersReport.fromJson(json[r'report'])!,
      );
    }
    return null;
  }

  static List<CatalogsRetailReportStatsParameters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportStatsParameters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportStatsParameters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailReportStatsParameters> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailReportStatsParameters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailReportStatsParameters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailReportStatsParameters-objects as value to a dart map
  static Map<String, List<CatalogsRetailReportStatsParameters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailReportStatsParameters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailReportStatsParameters.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'report',
  };
}


enum CatalogsRetailReportStatsParametersCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailReportStatsParametersCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailReportStatsParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailReportStatsParametersCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailReportStatsParametersCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailReportStatsParametersCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailReportStatsParametersCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportStatsParametersCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportStatsParametersCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailReportStatsParametersCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailReportStatsParametersCatalogTypeEnum].
class CatalogsRetailReportStatsParametersCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailReportStatsParametersCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailReportStatsParametersCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailReportStatsParametersCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailReportStatsParametersCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailReportStatsParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailReportStatsParametersCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailReportStatsParametersCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailReportStatsParametersCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailReportStatsParametersCatalogTypeEnumTypeTransformer? _instance;
}


