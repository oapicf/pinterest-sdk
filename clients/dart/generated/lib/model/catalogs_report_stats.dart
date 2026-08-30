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
    this.catalogId,
    this.code,
    this.codeLabel,
    this.message,
    this.occurrences,
    this.reportType,
    this.severity,
    this.ineligibleForAds,
    this.ineligibleForOrganic,
  });

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

  CatalogsReportStatsReportTypeEnum? reportType;

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
    other.catalogId == catalogId &&
    other.code == code &&
    other.codeLabel == codeLabel &&
    other.message == message &&
    other.occurrences == occurrences &&
    other.reportType == reportType &&
    other.severity == severity &&
    other.ineligibleForAds == ineligibleForAds &&
    other.ineligibleForOrganic == ineligibleForOrganic;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (code == null ? 0 : code!.hashCode) +
    (codeLabel == null ? 0 : codeLabel!.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (occurrences == null ? 0 : occurrences!.hashCode) +
    (reportType == null ? 0 : reportType!.hashCode) +
    (severity == null ? 0 : severity!.hashCode) +
    (ineligibleForAds == null ? 0 : ineligibleForAds!.hashCode) +
    (ineligibleForOrganic == null ? 0 : ineligibleForOrganic!.hashCode);

  @override
  String toString() => 'CatalogsReportStats[catalogId=$catalogId, code=$code, codeLabel=$codeLabel, message=$message, occurrences=$occurrences, reportType=$reportType, severity=$severity, ineligibleForAds=$ineligibleForAds, ineligibleForOrganic=$ineligibleForOrganic]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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
    if (this.reportType != null) {
      json[r'report_type'] = this.reportType;
    } else {
      json[r'report_type'] = null;
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
        return true;
      }());

      return CatalogsReportStats(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        code: mapValueOfType<int>(json, r'code'),
        codeLabel: mapValueOfType<String>(json, r'code_label'),
        message: mapValueOfType<String>(json, r'message'),
        occurrences: mapValueOfType<int>(json, r'occurrences'),
        reportType: CatalogsReportStatsReportTypeEnum.fromJson(json[r'report_type']),
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
  };
}


enum CatalogsReportStatsReportTypeEnum {
  DISTRIBUTION_ISSUES._(r'DISTRIBUTION_ISSUES'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsReportStatsReportTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsReportStatsReportTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsReportStatsReportTypeEnum? fromJson(dynamic value) => CatalogsReportStatsReportTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsReportStatsReportTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(CatalogsReportStatsReportTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsReportStatsReportTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportStatsReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsReportStatsReportTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DISTRIBUTION_ISSUES': return CatalogsReportStatsReportTypeEnum.DISTRIBUTION_ISSUES;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsReportStatsReportTypeEnumTypeTransformer? _instance;
}


/// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
enum CatalogsReportStatsSeverityEnum {
  WARN._(r'WARN'),
  ERROR._(r'ERROR'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsReportStatsSeverityEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsReportStatsSeverityEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsReportStatsSeverityEnum? fromJson(dynamic value) => CatalogsReportStatsSeverityEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsReportStatsSeverityEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(CatalogsReportStatsSeverityEnum data) => data._value;

  /// Returns the instance of [CatalogsReportStatsSeverityEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportStatsSeverityEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsReportStatsSeverityEnum) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static CatalogsReportStatsSeverityEnumTypeTransformer? _instance;
}


