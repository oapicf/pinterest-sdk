//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsReportDistributionStats {
  /// Returns a new [CatalogsReportDistributionStats] instance.
  CatalogsReportDistributionStats({
    this.catalogId,
    this.code,
    this.codeLabel,
    this.ineligibleForAds,
    this.ineligibleForOrganic,
    this.message,
    this.occurrences,
    this.reportType,
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

  CatalogsReportDistributionStatsReportTypeEnum? reportType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsReportDistributionStats &&
    other.catalogId == catalogId &&
    other.code == code &&
    other.codeLabel == codeLabel &&
    other.ineligibleForAds == ineligibleForAds &&
    other.ineligibleForOrganic == ineligibleForOrganic &&
    other.message == message &&
    other.occurrences == occurrences &&
    other.reportType == reportType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (code == null ? 0 : code!.hashCode) +
    (codeLabel == null ? 0 : codeLabel!.hashCode) +
    (ineligibleForAds == null ? 0 : ineligibleForAds!.hashCode) +
    (ineligibleForOrganic == null ? 0 : ineligibleForOrganic!.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (occurrences == null ? 0 : occurrences!.hashCode) +
    (reportType == null ? 0 : reportType!.hashCode);

  @override
  String toString() => 'CatalogsReportDistributionStats[catalogId=$catalogId, code=$code, codeLabel=$codeLabel, ineligibleForAds=$ineligibleForAds, ineligibleForOrganic=$ineligibleForOrganic, message=$message, occurrences=$occurrences, reportType=$reportType]';

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
    return json;
  }

  /// Returns a new [CatalogsReportDistributionStats] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsReportDistributionStats? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CatalogsReportDistributionStats(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        code: mapValueOfType<int>(json, r'code'),
        codeLabel: mapValueOfType<String>(json, r'code_label'),
        ineligibleForAds: mapValueOfType<bool>(json, r'ineligible_for_ads'),
        ineligibleForOrganic: mapValueOfType<bool>(json, r'ineligible_for_organic'),
        message: mapValueOfType<String>(json, r'message'),
        occurrences: mapValueOfType<int>(json, r'occurrences'),
        reportType: CatalogsReportDistributionStatsReportTypeEnum.fromJson(json[r'report_type']),
      );
    }
    return null;
  }

  static List<CatalogsReportDistributionStats> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportDistributionStats>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportDistributionStats.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsReportDistributionStats> mapFromJson(dynamic json) {
    final map = <String, CatalogsReportDistributionStats>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsReportDistributionStats.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsReportDistributionStats-objects as value to a dart map
  static Map<String, List<CatalogsReportDistributionStats>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsReportDistributionStats>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsReportDistributionStats.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


enum CatalogsReportDistributionStatsReportTypeEnum {
  DISTRIBUTION_ISSUES._(r'DISTRIBUTION_ISSUES'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsReportDistributionStatsReportTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsReportDistributionStatsReportTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsReportDistributionStatsReportTypeEnum? fromJson(dynamic value) => CatalogsReportDistributionStatsReportTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsReportDistributionStatsReportTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsReportDistributionStatsReportTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportDistributionStatsReportTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportDistributionStatsReportTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportDistributionStatsReportTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportDistributionStatsReportTypeEnum].
class CatalogsReportDistributionStatsReportTypeEnumTypeTransformer {
  factory CatalogsReportDistributionStatsReportTypeEnumTypeTransformer() => _instance ??= const CatalogsReportDistributionStatsReportTypeEnumTypeTransformer._();

  const CatalogsReportDistributionStatsReportTypeEnumTypeTransformer._();

  String encode(CatalogsReportDistributionStatsReportTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsReportDistributionStatsReportTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportDistributionStatsReportTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsReportDistributionStatsReportTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DISTRIBUTION_ISSUES': return CatalogsReportDistributionStatsReportTypeEnum.DISTRIBUTION_ISSUES;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsReportDistributionStatsReportTypeEnumTypeTransformer? _instance;
}


