//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsReportAllItemsFilter {
  /// Returns a new [CatalogsReportAllItemsFilter] instance.
  CatalogsReportAllItemsFilter({
    this.catalogId,
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

  CatalogsReportAllItemsFilterReportTypeEnum reportType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsReportAllItemsFilter &&
    other.catalogId == catalogId &&
    other.reportType == reportType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (reportType.hashCode);

  @override
  String toString() => 'CatalogsReportAllItemsFilter[catalogId=$catalogId, reportType=$reportType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'report_type'] = this.reportType;
    return json;
  }

  /// Returns a new [CatalogsReportAllItemsFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsReportAllItemsFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsReportAllItemsFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsReportAllItemsFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsReportAllItemsFilter(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        reportType: CatalogsReportAllItemsFilterReportTypeEnum.fromJson(json[r'report_type'])!,
      );
    }
    return null;
  }

  static List<CatalogsReportAllItemsFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportAllItemsFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportAllItemsFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsReportAllItemsFilter> mapFromJson(dynamic json) {
    final map = <String, CatalogsReportAllItemsFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsReportAllItemsFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsReportAllItemsFilter-objects as value to a dart map
  static Map<String, List<CatalogsReportAllItemsFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsReportAllItemsFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsReportAllItemsFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'report_type',
  };
}


class CatalogsReportAllItemsFilterReportTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsReportAllItemsFilterReportTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ALL_ITEMS = CatalogsReportAllItemsFilterReportTypeEnum._(r'ALL_ITEMS');

  /// List of all possible values in this [enum][CatalogsReportAllItemsFilterReportTypeEnum].
  static const values = <CatalogsReportAllItemsFilterReportTypeEnum>[
    ALL_ITEMS,
  ];

  static CatalogsReportAllItemsFilterReportTypeEnum? fromJson(dynamic value) => CatalogsReportAllItemsFilterReportTypeEnumTypeTransformer().decode(value);

  static List<CatalogsReportAllItemsFilterReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportAllItemsFilterReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportAllItemsFilterReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportAllItemsFilterReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportAllItemsFilterReportTypeEnum].
class CatalogsReportAllItemsFilterReportTypeEnumTypeTransformer {
  factory CatalogsReportAllItemsFilterReportTypeEnumTypeTransformer() => _instance ??= const CatalogsReportAllItemsFilterReportTypeEnumTypeTransformer._();

  const CatalogsReportAllItemsFilterReportTypeEnumTypeTransformer._();

  String encode(CatalogsReportAllItemsFilterReportTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsReportAllItemsFilterReportTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportAllItemsFilterReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ALL_ITEMS': return CatalogsReportAllItemsFilterReportTypeEnum.ALL_ITEMS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsReportAllItemsFilterReportTypeEnumTypeTransformer] instance.
  static CatalogsReportAllItemsFilterReportTypeEnumTypeTransformer? _instance;
}


