//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailReportAllItemsFilter {
  /// Returns a new [CatalogsRetailReportAllItemsFilter] instance.
  CatalogsRetailReportAllItemsFilter({
    this.catalogId,
    this.productGroupId,
    required this.reportType,
  });

  /// Unique identifier of a catalog. If not given, oldest catalog will be used
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  /// Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? productGroupId;

  CatalogsRetailReportAllItemsFilterReportTypeEnum reportType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailReportAllItemsFilter &&
    other.catalogId == catalogId &&
    other.productGroupId == productGroupId &&
    other.reportType == reportType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (productGroupId == null ? 0 : productGroupId!.hashCode) +
    (reportType.hashCode);

  @override
  String toString() => 'CatalogsRetailReportAllItemsFilter[catalogId=$catalogId, productGroupId=$productGroupId, reportType=$reportType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
    if (this.productGroupId != null) {
      json[r'product_group_id'] = this.productGroupId;
    } else {
      json[r'product_group_id'] = null;
    }
      json[r'report_type'] = this.reportType;
    return json;
  }

  /// Returns a new [CatalogsRetailReportAllItemsFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailReportAllItemsFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'report_type'), 'Required key "CatalogsRetailReportAllItemsFilter[report_type]" is missing from JSON.');
        assert(json[r'report_type'] != null, 'Required key "CatalogsRetailReportAllItemsFilter[report_type]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailReportAllItemsFilter(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        productGroupId: mapValueOfType<String>(json, r'product_group_id'),
        reportType: CatalogsRetailReportAllItemsFilterReportTypeEnum.fromJson(json[r'report_type'])!,
      );
    }
    return null;
  }

  static List<CatalogsRetailReportAllItemsFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportAllItemsFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportAllItemsFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailReportAllItemsFilter> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailReportAllItemsFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailReportAllItemsFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailReportAllItemsFilter-objects as value to a dart map
  static Map<String, List<CatalogsRetailReportAllItemsFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailReportAllItemsFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailReportAllItemsFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'report_type',
  };
}


enum CatalogsRetailReportAllItemsFilterReportTypeEnum {
  ALL_ITEMS._(r'ALL_ITEMS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailReportAllItemsFilterReportTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailReportAllItemsFilterReportTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailReportAllItemsFilterReportTypeEnum? fromJson(dynamic value) => CatalogsRetailReportAllItemsFilterReportTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailReportAllItemsFilterReportTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailReportAllItemsFilterReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportAllItemsFilterReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportAllItemsFilterReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailReportAllItemsFilterReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailReportAllItemsFilterReportTypeEnum].
class CatalogsRetailReportAllItemsFilterReportTypeEnumTypeTransformer {
  factory CatalogsRetailReportAllItemsFilterReportTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailReportAllItemsFilterReportTypeEnumTypeTransformer._();

  const CatalogsRetailReportAllItemsFilterReportTypeEnumTypeTransformer._();

  String encode(CatalogsRetailReportAllItemsFilterReportTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailReportAllItemsFilterReportTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailReportAllItemsFilterReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailReportAllItemsFilterReportTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ALL_ITEMS': return CatalogsRetailReportAllItemsFilterReportTypeEnum.ALL_ITEMS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailReportAllItemsFilterReportTypeEnumTypeTransformer? _instance;
}


