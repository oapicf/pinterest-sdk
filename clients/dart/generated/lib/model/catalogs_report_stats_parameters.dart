//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsReportStatsParameters {
  /// Returns a new [CatalogsReportStatsParameters] instance.
  CatalogsReportStatsParameters({
    required this.catalogType,
    required this.report,
  });

  CatalogsReportStatsParametersCatalogTypeEnum catalogType;

  CatalogsHotelReportStatsParametersReport report;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsReportStatsParameters &&
    other.catalogType == catalogType &&
    other.report == report;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (report.hashCode);

  @override
  String toString() => 'CatalogsReportStatsParameters[catalogType=$catalogType, report=$report]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'report'] = this.report;
    return json;
  }

  /// Returns a new [CatalogsReportStatsParameters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsReportStatsParameters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsReportStatsParameters[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsReportStatsParameters[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'report'), 'Required key "CatalogsReportStatsParameters[report]" is missing from JSON.');
        assert(json[r'report'] != null, 'Required key "CatalogsReportStatsParameters[report]" has a null value in JSON.');
        return true;
      }());

      return CatalogsReportStatsParameters(
        catalogType: CatalogsReportStatsParametersCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        report: CatalogsHotelReportStatsParametersReport.fromJson(json[r'report'])!,
      );
    }
    return null;
  }

  static List<CatalogsReportStatsParameters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportStatsParameters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportStatsParameters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsReportStatsParameters> mapFromJson(dynamic json) {
    final map = <String, CatalogsReportStatsParameters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsReportStatsParameters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsReportStatsParameters-objects as value to a dart map
  static Map<String, List<CatalogsReportStatsParameters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsReportStatsParameters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsReportStatsParameters.listFromJson(entry.value, growable: growable,);
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


enum CatalogsReportStatsParametersCatalogTypeEnum {
  HOTEL._(r'HOTEL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsReportStatsParametersCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsReportStatsParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsReportStatsParametersCatalogTypeEnum? fromJson(dynamic value) => CatalogsReportStatsParametersCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsReportStatsParametersCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsReportStatsParametersCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportStatsParametersCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportStatsParametersCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportStatsParametersCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportStatsParametersCatalogTypeEnum].
class CatalogsReportStatsParametersCatalogTypeEnumTypeTransformer {
  factory CatalogsReportStatsParametersCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsReportStatsParametersCatalogTypeEnumTypeTransformer._();

  const CatalogsReportStatsParametersCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsReportStatsParametersCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsReportStatsParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportStatsParametersCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsReportStatsParametersCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsReportStatsParametersCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsReportStatsParametersCatalogTypeEnumTypeTransformer? _instance;
}


