//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsReportFeedIngestionFilter {
  /// Returns a new [CatalogsReportFeedIngestionFilter] instance.
  CatalogsReportFeedIngestionFilter({
    required this.feedId,
    this.processingResultId,
    required this.reportType,
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

  CatalogsReportFeedIngestionFilterReportTypeEnum reportType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsReportFeedIngestionFilter &&
    other.feedId == feedId &&
    other.processingResultId == processingResultId &&
    other.reportType == reportType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feedId.hashCode) +
    (processingResultId == null ? 0 : processingResultId!.hashCode) +
    (reportType.hashCode);

  @override
  String toString() => 'CatalogsReportFeedIngestionFilter[feedId=$feedId, processingResultId=$processingResultId, reportType=$reportType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'feed_id'] = this.feedId;
    if (this.processingResultId != null) {
      json[r'processing_result_id'] = this.processingResultId;
    } else {
      json[r'processing_result_id'] = null;
    }
      json[r'report_type'] = this.reportType;
    return json;
  }

  /// Returns a new [CatalogsReportFeedIngestionFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsReportFeedIngestionFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsReportFeedIngestionFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsReportFeedIngestionFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsReportFeedIngestionFilter(
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        processingResultId: mapValueOfType<String>(json, r'processing_result_id'),
        reportType: CatalogsReportFeedIngestionFilterReportTypeEnum.fromJson(json[r'report_type'])!,
      );
    }
    return null;
  }

  static List<CatalogsReportFeedIngestionFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportFeedIngestionFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportFeedIngestionFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsReportFeedIngestionFilter> mapFromJson(dynamic json) {
    final map = <String, CatalogsReportFeedIngestionFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsReportFeedIngestionFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsReportFeedIngestionFilter-objects as value to a dart map
  static Map<String, List<CatalogsReportFeedIngestionFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsReportFeedIngestionFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsReportFeedIngestionFilter.listFromJson(entry.value, growable: growable,);
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


class CatalogsReportFeedIngestionFilterReportTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsReportFeedIngestionFilterReportTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FEED_INGESTION_ISSUES = CatalogsReportFeedIngestionFilterReportTypeEnum._(r'FEED_INGESTION_ISSUES');

  /// List of all possible values in this [enum][CatalogsReportFeedIngestionFilterReportTypeEnum].
  static const values = <CatalogsReportFeedIngestionFilterReportTypeEnum>[
    FEED_INGESTION_ISSUES,
  ];

  static CatalogsReportFeedIngestionFilterReportTypeEnum? fromJson(dynamic value) => CatalogsReportFeedIngestionFilterReportTypeEnumTypeTransformer().decode(value);

  static List<CatalogsReportFeedIngestionFilterReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportFeedIngestionFilterReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportFeedIngestionFilterReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportFeedIngestionFilterReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportFeedIngestionFilterReportTypeEnum].
class CatalogsReportFeedIngestionFilterReportTypeEnumTypeTransformer {
  factory CatalogsReportFeedIngestionFilterReportTypeEnumTypeTransformer() => _instance ??= const CatalogsReportFeedIngestionFilterReportTypeEnumTypeTransformer._();

  const CatalogsReportFeedIngestionFilterReportTypeEnumTypeTransformer._();

  String encode(CatalogsReportFeedIngestionFilterReportTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsReportFeedIngestionFilterReportTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportFeedIngestionFilterReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FEED_INGESTION_ISSUES': return CatalogsReportFeedIngestionFilterReportTypeEnum.FEED_INGESTION_ISSUES;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsReportFeedIngestionFilterReportTypeEnumTypeTransformer] instance.
  static CatalogsReportFeedIngestionFilterReportTypeEnumTypeTransformer? _instance;
}


