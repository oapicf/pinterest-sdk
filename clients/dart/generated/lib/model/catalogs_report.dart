//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsReport {
  /// Returns a new [CatalogsReport] instance.
  CatalogsReport({
    this.reportStatus,
    this.size,
    this.url,
  });

  CatalogsReportReportStatusEnum? reportStatus;

  /// Size of the report in bytes
  num? size;

  /// URL to download the report
  String? url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsReport &&
    other.reportStatus == reportStatus &&
    other.size == size &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (reportStatus == null ? 0 : reportStatus!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (url == null ? 0 : url!.hashCode);

  @override
  String toString() => 'CatalogsReport[reportStatus=$reportStatus, size=$size, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.reportStatus != null) {
      json[r'report_status'] = this.reportStatus;
    } else {
      json[r'report_status'] = null;
    }
    if (this.size != null) {
      json[r'size'] = this.size;
    } else {
      json[r'size'] = null;
    }
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsReport] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsReport? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsReport[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsReport[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsReport(
        reportStatus: CatalogsReportReportStatusEnum.fromJson(json[r'report_status']),
        size: json[r'size'] == null
            ? null
            : num.parse('${json[r'size']}'),
        url: mapValueOfType<String>(json, r'url'),
      );
    }
    return null;
  }

  static List<CatalogsReport> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReport>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReport.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsReport> mapFromJson(dynamic json) {
    final map = <String, CatalogsReport>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsReport.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsReport-objects as value to a dart map
  static Map<String, List<CatalogsReport>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsReport>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsReport.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class CatalogsReportReportStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsReportReportStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FINISHED = CatalogsReportReportStatusEnum._(r'FINISHED');
  static const IN_PROGRESS = CatalogsReportReportStatusEnum._(r'IN_PROGRESS');

  /// List of all possible values in this [enum][CatalogsReportReportStatusEnum].
  static const values = <CatalogsReportReportStatusEnum>[
    FINISHED,
    IN_PROGRESS,
  ];

  static CatalogsReportReportStatusEnum? fromJson(dynamic value) => CatalogsReportReportStatusEnumTypeTransformer().decode(value);

  static List<CatalogsReportReportStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsReportReportStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsReportReportStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsReportReportStatusEnum] to String,
/// and [decode] dynamic data back to [CatalogsReportReportStatusEnum].
class CatalogsReportReportStatusEnumTypeTransformer {
  factory CatalogsReportReportStatusEnumTypeTransformer() => _instance ??= const CatalogsReportReportStatusEnumTypeTransformer._();

  const CatalogsReportReportStatusEnumTypeTransformer._();

  String encode(CatalogsReportReportStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsReportReportStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsReportReportStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FINISHED': return CatalogsReportReportStatusEnum.FINISHED;
        case r'IN_PROGRESS': return CatalogsReportReportStatusEnum.IN_PROGRESS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsReportReportStatusEnumTypeTransformer] instance.
  static CatalogsReportReportStatusEnumTypeTransformer? _instance;
}


