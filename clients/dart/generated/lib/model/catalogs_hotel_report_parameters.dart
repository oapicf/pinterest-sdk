//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelReportParameters {
  /// Returns a new [CatalogsHotelReportParameters] instance.
  CatalogsHotelReportParameters({
    required this.catalogType,
    required this.report,
  });

  CatalogsHotelReportParametersCatalogTypeEnum catalogType;

  CatalogsHotelReportParametersReport report;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelReportParameters &&
    other.catalogType == catalogType &&
    other.report == report;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (report.hashCode);

  @override
  String toString() => 'CatalogsHotelReportParameters[catalogType=$catalogType, report=$report]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'report'] = this.report;
    return json;
  }

  /// Returns a new [CatalogsHotelReportParameters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelReportParameters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsHotelReportParameters[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsHotelReportParameters[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'report'), 'Required key "CatalogsHotelReportParameters[report]" is missing from JSON.');
        assert(json[r'report'] != null, 'Required key "CatalogsHotelReportParameters[report]" has a null value in JSON.');
        return true;
      }());

      return CatalogsHotelReportParameters(
        catalogType: CatalogsHotelReportParametersCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        report: CatalogsHotelReportParametersReport.fromJson(json[r'report'])!,
      );
    }
    return null;
  }

  static List<CatalogsHotelReportParameters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelReportParameters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelReportParameters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelReportParameters> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelReportParameters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelReportParameters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelReportParameters-objects as value to a dart map
  static Map<String, List<CatalogsHotelReportParameters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelReportParameters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelReportParameters.listFromJson(entry.value, growable: growable,);
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


enum CatalogsHotelReportParametersCatalogTypeEnum {
  HOTEL._(r'HOTEL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsHotelReportParametersCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsHotelReportParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsHotelReportParametersCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelReportParametersCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsHotelReportParametersCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsHotelReportParametersCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelReportParametersCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelReportParametersCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelReportParametersCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelReportParametersCatalogTypeEnum].
class CatalogsHotelReportParametersCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelReportParametersCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelReportParametersCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelReportParametersCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelReportParametersCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsHotelReportParametersCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelReportParametersCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsHotelReportParametersCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelReportParametersCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsHotelReportParametersCatalogTypeEnumTypeTransformer? _instance;
}


