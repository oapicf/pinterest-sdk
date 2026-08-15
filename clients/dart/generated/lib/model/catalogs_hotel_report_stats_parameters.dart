//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelReportStatsParameters {
  /// Returns a new [CatalogsHotelReportStatsParameters] instance.
  CatalogsHotelReportStatsParameters({
    required this.catalogType,
    required this.report,
  });

  CatalogsHotelReportStatsParametersCatalogTypeEnum catalogType;

  CatalogsHotelReportStatsParametersReport report;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelReportStatsParameters &&
    other.catalogType == catalogType &&
    other.report == report;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (report.hashCode);

  @override
  String toString() => 'CatalogsHotelReportStatsParameters[catalogType=$catalogType, report=$report]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'report'] = this.report;
    return json;
  }

  /// Returns a new [CatalogsHotelReportStatsParameters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelReportStatsParameters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelReportStatsParameters[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelReportStatsParameters[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelReportStatsParameters(
        catalogType: CatalogsHotelReportStatsParametersCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        report: CatalogsHotelReportStatsParametersReport.fromJson(json[r'report'])!,
      );
    }
    return null;
  }

  static List<CatalogsHotelReportStatsParameters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelReportStatsParameters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelReportStatsParameters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelReportStatsParameters> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelReportStatsParameters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelReportStatsParameters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelReportStatsParameters-objects as value to a dart map
  static Map<String, List<CatalogsHotelReportStatsParameters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelReportStatsParameters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelReportStatsParameters.listFromJson(entry.value, growable: growable,);
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


class CatalogsHotelReportStatsParametersCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelReportStatsParametersCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HOTEL = CatalogsHotelReportStatsParametersCatalogTypeEnum._(r'HOTEL');

  /// List of all possible values in this [enum][CatalogsHotelReportStatsParametersCatalogTypeEnum].
  static const values = <CatalogsHotelReportStatsParametersCatalogTypeEnum>[
    HOTEL,
  ];

  static CatalogsHotelReportStatsParametersCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelReportStatsParametersCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsHotelReportStatsParametersCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelReportStatsParametersCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelReportStatsParametersCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelReportStatsParametersCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelReportStatsParametersCatalogTypeEnum].
class CatalogsHotelReportStatsParametersCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelReportStatsParametersCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelReportStatsParametersCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelReportStatsParametersCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelReportStatsParametersCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelReportStatsParametersCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelReportStatsParametersCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelReportStatsParametersCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelReportStatsParametersCatalogTypeEnumTypeTransformer] instance.
  static CatalogsHotelReportStatsParametersCatalogTypeEnumTypeTransformer? _instance;
}


