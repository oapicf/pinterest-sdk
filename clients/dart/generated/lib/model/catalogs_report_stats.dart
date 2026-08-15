//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsReportStats {
  /// Returns a new [CatalogsReportStats] instance.
  CatalogsReportStats({
    required this.reportType,
    this.catalogId,
    this.code,
    this.codeLabel,
    this.message,
    this.occurrences,
    this.severity,
    this.ineligibleForAds,
    this.ineligibleForOrganic,
  });

  CatalogsReportStatsReportTypeEnum reportType;

  /// ID of the catalog entity.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  /// The event code that a diagnostics aggregated number references
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? code;

  /// A human-friendly label for the event code (e.g, 'SPAM')
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? codeLabel;

  /// Title message describing the diagnostic issue
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  /// Number of occurrences of the issue
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? occurrences;

  /// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  CatalogsReportStatsSeverityEnum? severity;

  /// Indicates if issue makes items ineligible for ads distribution
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? ineligibleForAds;

  /// Indicates if issue makes items ineligible for organic distribution
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? ineligibleForOrganic;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsReportStats &&
    other.reportType == reportType &&
    other.catalogId == catalogId &&
    other.code == code &&
    other.codeLabel == codeLabel &&
    other.message == message &&
    other.occurrences == occurrences &&
    other.severity == severity &&
    other.ineligibleForAds == ineligibleForAds &&
    other.ineligibleForOrganic == ineligibleForOrganic;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (reportType.hashCode) +
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (code == null ? 0 : code!.hashCode) +
    (codeLabel == null ? 0 : codeLabel!.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (occurrences == null ? 0 : occurrences!.hashCode) +
    (severity == null ? 0 : severity!.hashCode) +
    (ineligibleForAds == null ? 0 : ineligibleForAds!.hashCode) +
    (ineligibleForOrganic == null ? 0 : ineligibleForOrganic!.hashCode);

  @override
  String toString() => 'CatalogsReportStats[reportType=$reportType, catalogId=$catalogId, code=$code, codeLabel=$codeLabel, message=$message, occurrences=$occurrences, severity=$severity, ineligibleForAds=$ineligibleForAds, ineligibleForOrganic=$ineligibleForOrganic]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'report_type'] = this.reportType;
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    if (this.codeLabel != null) {
      json[r'code_label'] = this.codeLabel;
    } else {
      json[r'code_label'] = null;
    }
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    if (this.occurrences != null) {
      json[r'occurrences'] = this.occurrences;
    } else {
      json[r'occurrences'] = null;
    }
    if (this.severity != null) {
      json[r'severity'] = this.severity;
    } else {
      json[r'severity'] = null;
    }
    if (this.ineligibleForAds != null) {
      json[r'ineligible_for_ads'] = this.ineligibleForAds;
    } else {
      json[r'ineligible_for_ads'] = null;
    }
    if (this.ineligibleForOrganic != null) {
      json[r'ineligible_for_organic'] = this.ineligibleForOrganic;
    } else {
      json[r'ineligible_for_organic'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsReportStats] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsReportStats? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsReportStats[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsReportStats[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsReportStats(
        reportType: CatalogsReportStatsReportTypeEnum.fromJson(json[r'report_type'])!,
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        code: mapValueOfType<int>(json, r'code'),
        codeLabel: mapValueOfType<String>(json, r'code_label'),
        message: mapValueOfType<String>(json, r'message'),
        occurrences: mapValueOfType<int>(json, r'occurrences'),
        severity: CatalogsReportStatsSeverityEnum.fromJson(json[r'severity']),
        ineligibleForAds: mapValueOfType<bool>(json, r'ineligible_for_ads'),
        ineligibleForOrganic: mapValueOfType<bool>(json, r'ineligible_for_organic'),
      );
    }
    return null;
  }

  static List<CatalogsReportStats> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportStats>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportStats.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsReportStats> mapFromJson(dynamic json) {
    final map = <String, CatalogsReportStats>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsReportStats.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsReportStats-objects as value to a dart map
  static Map<String, List<CatalogsReportStats>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsReportStats>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsReportStats.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'report_type',
  };
}


class CatalogsReportStatsReportTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsReportStatsReportTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FEED_INGESTION_ISSUES = CatalogsReportStatsReportTypeEnum._(r'FEED_INGESTION_ISSUES');
  static const DISTRIBUTION_ISSUES = CatalogsReportStatsReportTypeEnum._(r'DISTRIBUTION_ISSUES');

  /// List of all possible values in this [enum][CatalogsReportStatsReportTypeEnum].
  static const values = <CatalogsReportStatsReportTypeEnum>[
    FEED_INGESTION_ISSUES,
    DISTRIBUTION_ISSUES,
  ];

  static CatalogsReportStatsReportTypeEnum? fromJson(dynamic value) => CatalogsReportStatsReportTypeEnumTypeTransformer().decode(value);

  static List<CatalogsReportStatsReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportStatsReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportStatsReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportStatsReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportStatsReportTypeEnum].
class CatalogsReportStatsReportTypeEnumTypeTransformer {
  factory CatalogsReportStatsReportTypeEnumTypeTransformer() => _instance ??= const CatalogsReportStatsReportTypeEnumTypeTransformer._();

  const CatalogsReportStatsReportTypeEnumTypeTransformer._();

  String encode(CatalogsReportStatsReportTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsReportStatsReportTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportStatsReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FEED_INGESTION_ISSUES': return CatalogsReportStatsReportTypeEnum.FEED_INGESTION_ISSUES;
        case r'DISTRIBUTION_ISSUES': return CatalogsReportStatsReportTypeEnum.DISTRIBUTION_ISSUES;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsReportStatsReportTypeEnumTypeTransformer] instance.
  static CatalogsReportStatsReportTypeEnumTypeTransformer? _instance;
}


/// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
class CatalogsReportStatsSeverityEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsReportStatsSeverityEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const WARN = CatalogsReportStatsSeverityEnum._(r'WARN');
  static const ERROR = CatalogsReportStatsSeverityEnum._(r'ERROR');

  /// List of all possible values in this [enum][CatalogsReportStatsSeverityEnum].
  static const values = <CatalogsReportStatsSeverityEnum>[
    WARN,
    ERROR,
  ];

  static CatalogsReportStatsSeverityEnum? fromJson(dynamic value) => CatalogsReportStatsSeverityEnumTypeTransformer().decode(value);

  static List<CatalogsReportStatsSeverityEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportStatsSeverityEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportStatsSeverityEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportStatsSeverityEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportStatsSeverityEnum].
class CatalogsReportStatsSeverityEnumTypeTransformer {
  factory CatalogsReportStatsSeverityEnumTypeTransformer() => _instance ??= const CatalogsReportStatsSeverityEnumTypeTransformer._();

  const CatalogsReportStatsSeverityEnumTypeTransformer._();

  String encode(CatalogsReportStatsSeverityEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsReportStatsSeverityEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportStatsSeverityEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'WARN': return CatalogsReportStatsSeverityEnum.WARN;
        case r'ERROR': return CatalogsReportStatsSeverityEnum.ERROR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsReportStatsSeverityEnumTypeTransformer] instance.
  static CatalogsReportStatsSeverityEnumTypeTransformer? _instance;
}


