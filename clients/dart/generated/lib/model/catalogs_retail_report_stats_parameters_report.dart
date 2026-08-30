//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailReportStatsParametersReport {
  /// Returns a new [CatalogsRetailReportStatsParametersReport] instance.
  CatalogsRetailReportStatsParametersReport({
    required this.feedId,
    this.processingResultId,
    required this.reportType,
    this.catalogId,
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

  CatalogsRetailReportStatsParametersReportReportTypeEnum reportType;

  /// Unique identifier of a catalog. If not given, oldest catalog will be used
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailReportStatsParametersReport &&
    other.feedId == feedId &&
    other.processingResultId == processingResultId &&
    other.reportType == reportType &&
    other.catalogId == catalogId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feedId.hashCode) +
    (processingResultId == null ? 0 : processingResultId!.hashCode) +
    (reportType.hashCode) +
    (catalogId == null ? 0 : catalogId!.hashCode);

  @override
  String toString() => 'CatalogsRetailReportStatsParametersReport[feedId=$feedId, processingResultId=$processingResultId, reportType=$reportType, catalogId=$catalogId]';

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
    return json;
  }

  /// Returns a new [CatalogsRetailReportStatsParametersReport] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailReportStatsParametersReport? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'feed_id'), 'Required key "CatalogsRetailReportStatsParametersReport[feed_id]" is missing from JSON.');
        assert(json[r'feed_id'] != null, 'Required key "CatalogsRetailReportStatsParametersReport[feed_id]" has a null value in JSON.');
        assert(json.containsKey(r'report_type'), 'Required key "CatalogsRetailReportStatsParametersReport[report_type]" is missing from JSON.');
        assert(json[r'report_type'] != null, 'Required key "CatalogsRetailReportStatsParametersReport[report_type]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailReportStatsParametersReport(
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        processingResultId: mapValueOfType<String>(json, r'processing_result_id'),
        reportType: CatalogsRetailReportStatsParametersReportReportTypeEnum.fromJson(json[r'report_type'])!,
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
      );
    }
    return null;
  }

  static List<CatalogsRetailReportStatsParametersReport> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportStatsParametersReport>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportStatsParametersReport.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailReportStatsParametersReport> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailReportStatsParametersReport>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailReportStatsParametersReport.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailReportStatsParametersReport-objects as value to a dart map
  static Map<String, List<CatalogsRetailReportStatsParametersReport>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailReportStatsParametersReport>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailReportStatsParametersReport.listFromJson(entry.value, growable: growable,);
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


enum CatalogsRetailReportStatsParametersReportReportTypeEnum {
  DISTRIBUTION_ISSUES._(r'DISTRIBUTION_ISSUES'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailReportStatsParametersReportReportTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailReportStatsParametersReportReportTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailReportStatsParametersReportReportTypeEnum? fromJson(dynamic value) => CatalogsRetailReportStatsParametersReportReportTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailReportStatsParametersReportReportTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailReportStatsParametersReportReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailReportStatsParametersReportReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailReportStatsParametersReportReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailReportStatsParametersReportReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailReportStatsParametersReportReportTypeEnum].
class CatalogsRetailReportStatsParametersReportReportTypeEnumTypeTransformer {
  factory CatalogsRetailReportStatsParametersReportReportTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailReportStatsParametersReportReportTypeEnumTypeTransformer._();

  const CatalogsRetailReportStatsParametersReportReportTypeEnumTypeTransformer._();

  String encode(CatalogsRetailReportStatsParametersReportReportTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailReportStatsParametersReportReportTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailReportStatsParametersReportReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailReportStatsParametersReportReportTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DISTRIBUTION_ISSUES': return CatalogsRetailReportStatsParametersReportReportTypeEnum.DISTRIBUTION_ISSUES;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailReportStatsParametersReportReportTypeEnumTypeTransformer? _instance;
}


