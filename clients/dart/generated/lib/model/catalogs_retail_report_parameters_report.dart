//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailReportParametersReport {
  /// Returns a new [CatalogsRetailReportParametersReport] instance.
  CatalogsRetailReportParametersReport({
    required this.feedId,
    this.processingResultId,
    required this.reportType,
    this.catalogId,
    this.productGroupId,
  });

  /// ID of the feed entity.
  String feedId;

  /// Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? processingResultId;

  CatalogsRetailReportParametersReportReportTypeEnum reportType;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailReportParametersReport &&
    other.feedId == feedId &&
    other.processingResultId == processingResultId &&
    other.reportType == reportType &&
    other.catalogId == catalogId &&
    other.productGroupId == productGroupId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feedId.hashCode) +
    (processingResultId == null ? 0 : processingResultId!.hashCode) +
    (reportType.hashCode) +
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (productGroupId == null ? 0 : productGroupId!.hashCode);

  @override
  String toString() => 'CatalogsRetailReportParametersReport[feedId=$feedId, processingResultId=$processingResultId, reportType=$reportType, catalogId=$catalogId, productGroupId=$productGroupId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'feed_id'] = this.feedId;
    if (this.processingResultId != null) {
      json[r'processing_result_id'] = this.processingResultId;
    } else {
      json[r'processing_result_id'] = null;
    }
      json[r'report_type'] = this.reportType;
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
    return json;
  }

  /// Returns a new [CatalogsRetailReportParametersReport] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailReportParametersReport? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'feed_id'), 'Required key "CatalogsRetailReportParametersReport[feed_id]" is missing from JSON.');
        assert(json[r'feed_id'] != null, 'Required key "CatalogsRetailReportParametersReport[feed_id]" has a null value in JSON.');
        assert(json.containsKey(r'report_type'), 'Required key "CatalogsRetailReportParametersReport[report_type]" is missing from JSON.');
        assert(json[r'report_type'] != null, 'Required key "CatalogsRetailReportParametersReport[report_type]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailReportParametersReport(
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        processingResultId: mapValueOfType<String>(json, r'processing_result_id'),
        reportType: CatalogsRetailReportParametersReportReportTypeEnum.fromJson(json[r'report_type'])!,
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        productGroupId: mapValueOfType<String>(json, r'product_group_id'),
      );
    }
    return null;
  }

  static List<CatalogsRetailReportParametersReport> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportParametersReport>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportParametersReport.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailReportParametersReport> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailReportParametersReport>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailReportParametersReport.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailReportParametersReport-objects as value to a dart map
  static Map<String, List<CatalogsRetailReportParametersReport>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailReportParametersReport>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailReportParametersReport.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feed_id',
    'report_type',
  };
}


enum CatalogsRetailReportParametersReportReportTypeEnum {
  ALL_ITEMS._(r'ALL_ITEMS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailReportParametersReportReportTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailReportParametersReportReportTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailReportParametersReportReportTypeEnum? fromJson(dynamic value) => CatalogsRetailReportParametersReportReportTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailReportParametersReportReportTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailReportParametersReportReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportParametersReportReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportParametersReportReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailReportParametersReportReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailReportParametersReportReportTypeEnum].
class CatalogsRetailReportParametersReportReportTypeEnumTypeTransformer {
  factory CatalogsRetailReportParametersReportReportTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailReportParametersReportReportTypeEnumTypeTransformer._();

  const CatalogsRetailReportParametersReportReportTypeEnumTypeTransformer._();

  String encode(CatalogsRetailReportParametersReportReportTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailReportParametersReportReportTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailReportParametersReportReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailReportParametersReportReportTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ALL_ITEMS': return CatalogsRetailReportParametersReportReportTypeEnum.ALL_ITEMS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailReportParametersReportReportTypeEnumTypeTransformer? _instance;
}


