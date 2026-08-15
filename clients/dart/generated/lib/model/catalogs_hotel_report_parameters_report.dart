//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelReportParametersReport {
  /// Returns a new [CatalogsHotelReportParametersReport] instance.
  CatalogsHotelReportParametersReport({
    this.reportType,
    required this.feedId,
    this.processingResultId,
    this.catalogId,
  });

  CatalogsHotelReportParametersReportReportTypeEnum? reportType;

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

  /// Unique identifier of a catalog. If not given, oldest catalog will be used
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelReportParametersReport &&
    other.reportType == reportType &&
    other.feedId == feedId &&
    other.processingResultId == processingResultId &&
    other.catalogId == catalogId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (reportType == null ? 0 : reportType!.hashCode) +
    (feedId.hashCode) +
    (processingResultId == null ? 0 : processingResultId!.hashCode) +
    (catalogId == null ? 0 : catalogId!.hashCode);

  @override
  String toString() => 'CatalogsHotelReportParametersReport[reportType=$reportType, feedId=$feedId, processingResultId=$processingResultId, catalogId=$catalogId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.reportType != null) {
      json[r'report_type'] = this.reportType;
    } else {
      json[r'report_type'] = null;
    }
      json[r'feed_id'] = this.feedId;
    if (this.processingResultId != null) {
      json[r'processing_result_id'] = this.processingResultId;
    } else {
      json[r'processing_result_id'] = null;
    }
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelReportParametersReport] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelReportParametersReport? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelReportParametersReport[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelReportParametersReport[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelReportParametersReport(
        reportType: CatalogsHotelReportParametersReportReportTypeEnum.fromJson(json[r'report_type']),
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        processingResultId: mapValueOfType<String>(json, r'processing_result_id'),
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
      );
    }
    return null;
  }

  static List<CatalogsHotelReportParametersReport> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelReportParametersReport>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelReportParametersReport.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelReportParametersReport> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelReportParametersReport>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelReportParametersReport.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelReportParametersReport-objects as value to a dart map
  static Map<String, List<CatalogsHotelReportParametersReport>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelReportParametersReport>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelReportParametersReport.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feed_id',
  };
}


class CatalogsHotelReportParametersReportReportTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelReportParametersReportReportTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FEED_INGESTION_ISSUES = CatalogsHotelReportParametersReportReportTypeEnum._(r'FEED_INGESTION_ISSUES');
  static const DISTRIBUTION_ISSUES = CatalogsHotelReportParametersReportReportTypeEnum._(r'DISTRIBUTION_ISSUES');
  static const ALL_ITEMS = CatalogsHotelReportParametersReportReportTypeEnum._(r'ALL_ITEMS');

  /// List of all possible values in this [enum][CatalogsHotelReportParametersReportReportTypeEnum].
  static const values = <CatalogsHotelReportParametersReportReportTypeEnum>[
    FEED_INGESTION_ISSUES,
    DISTRIBUTION_ISSUES,
    ALL_ITEMS,
  ];

  static CatalogsHotelReportParametersReportReportTypeEnum? fromJson(dynamic value) => CatalogsHotelReportParametersReportReportTypeEnumTypeTransformer().decode(value);

  static List<CatalogsHotelReportParametersReportReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelReportParametersReportReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelReportParametersReportReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelReportParametersReportReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelReportParametersReportReportTypeEnum].
class CatalogsHotelReportParametersReportReportTypeEnumTypeTransformer {
  factory CatalogsHotelReportParametersReportReportTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelReportParametersReportReportTypeEnumTypeTransformer._();

  const CatalogsHotelReportParametersReportReportTypeEnumTypeTransformer._();

  String encode(CatalogsHotelReportParametersReportReportTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelReportParametersReportReportTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelReportParametersReportReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FEED_INGESTION_ISSUES': return CatalogsHotelReportParametersReportReportTypeEnum.FEED_INGESTION_ISSUES;
        case r'DISTRIBUTION_ISSUES': return CatalogsHotelReportParametersReportReportTypeEnum.DISTRIBUTION_ISSUES;
        case r'ALL_ITEMS': return CatalogsHotelReportParametersReportReportTypeEnum.ALL_ITEMS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelReportParametersReportReportTypeEnumTypeTransformer] instance.
  static CatalogsHotelReportParametersReportReportTypeEnumTypeTransformer? _instance;
}


