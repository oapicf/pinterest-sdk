//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsReportParameters {
  /// Returns a new [CatalogsReportParameters] instance.
  CatalogsReportParameters({
    required this.catalogType,
    required this.report,
  });

  CatalogsReportParametersCatalogTypeEnum catalogType;

  CatalogsHotelReportParametersReport report;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsReportParameters &&
    other.catalogType == catalogType &&
    other.report == report;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (report.hashCode);

  @override
  String toString() => 'CatalogsReportParameters[catalogType=$catalogType, report=$report]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'report'] = this.report;
    return json;
  }

  /// Returns a new [CatalogsReportParameters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsReportParameters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsReportParameters[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsReportParameters[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'report'), 'Required key "CatalogsReportParameters[report]" is missing from JSON.');
        assert(json[r'report'] != null, 'Required key "CatalogsReportParameters[report]" has a null value in JSON.');
        return true;
      }());

      return CatalogsReportParameters(
        catalogType: CatalogsReportParametersCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        report: CatalogsHotelReportParametersReport.fromJson(json[r'report'])!,
      );
    }
    return null;
  }

  static List<CatalogsReportParameters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportParameters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportParameters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsReportParameters> mapFromJson(dynamic json) {
    final map = <String, CatalogsReportParameters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsReportParameters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsReportParameters-objects as value to a dart map
  static Map<String, List<CatalogsReportParameters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsReportParameters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsReportParameters.listFromJson(entry.value, growable: growable,);
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


enum CatalogsReportParametersCatalogTypeEnum {
  HOTEL._(r'HOTEL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsReportParametersCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsReportParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsReportParametersCatalogTypeEnum? fromJson(dynamic value) => CatalogsReportParametersCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsReportParametersCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsReportParametersCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportParametersCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportParametersCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportParametersCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportParametersCatalogTypeEnum].
class CatalogsReportParametersCatalogTypeEnumTypeTransformer {
  factory CatalogsReportParametersCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsReportParametersCatalogTypeEnumTypeTransformer._();

  const CatalogsReportParametersCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsReportParametersCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsReportParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportParametersCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsReportParametersCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsReportParametersCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsReportParametersCatalogTypeEnumTypeTransformer? _instance;
}


