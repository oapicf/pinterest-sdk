//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetMMMReportResponseData {
  /// Returns a new [GetMMMReportResponseData] instance.
  GetMMMReportResponseData({
    this.reportStatus,
    this.size,
    this.url,
  });

  GetMMMReportResponseDataReportStatusEnum? reportStatus;

  num? size;

  String? url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetMMMReportResponseData &&
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
  String toString() => 'GetMMMReportResponseData[reportStatus=$reportStatus, size=$size, url=$url]';

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

  /// Returns a new [GetMMMReportResponseData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetMMMReportResponseData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetMMMReportResponseData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetMMMReportResponseData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetMMMReportResponseData(
        reportStatus: GetMMMReportResponseDataReportStatusEnum.fromJson(json[r'report_status']),
        size: json[r'size'] == null
            ? null
            : num.parse('${json[r'size']}'),
        url: mapValueOfType<String>(json, r'url'),
      );
    }
    return null;
  }

  static List<GetMMMReportResponseData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetMMMReportResponseData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetMMMReportResponseData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetMMMReportResponseData> mapFromJson(dynamic json) {
    final map = <String, GetMMMReportResponseData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetMMMReportResponseData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetMMMReportResponseData-objects as value to a dart map
  static Map<String, List<GetMMMReportResponseData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetMMMReportResponseData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetMMMReportResponseData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class GetMMMReportResponseDataReportStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const GetMMMReportResponseDataReportStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DOES_NOT_EXIST = GetMMMReportResponseDataReportStatusEnum._(r'DOES_NOT_EXIST');
  static const FINISHED = GetMMMReportResponseDataReportStatusEnum._(r'FINISHED');
  static const IN_PROGRESS = GetMMMReportResponseDataReportStatusEnum._(r'IN_PROGRESS');
  static const EXPIRED = GetMMMReportResponseDataReportStatusEnum._(r'EXPIRED');
  static const FAILED = GetMMMReportResponseDataReportStatusEnum._(r'FAILED');
  static const CANCELLED = GetMMMReportResponseDataReportStatusEnum._(r'CANCELLED');

  /// List of all possible values in this [enum][GetMMMReportResponseDataReportStatusEnum].
  static const values = <GetMMMReportResponseDataReportStatusEnum>[
    DOES_NOT_EXIST,
    FINISHED,
    IN_PROGRESS,
    EXPIRED,
    FAILED,
    CANCELLED,
  ];

  static GetMMMReportResponseDataReportStatusEnum? fromJson(dynamic value) => GetMMMReportResponseDataReportStatusEnumTypeTransformer().decode(value);

  static List<GetMMMReportResponseDataReportStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetMMMReportResponseDataReportStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetMMMReportResponseDataReportStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [GetMMMReportResponseDataReportStatusEnum] to String,
/// and [decode] dynamic data back to [GetMMMReportResponseDataReportStatusEnum].
class GetMMMReportResponseDataReportStatusEnumTypeTransformer {
  factory GetMMMReportResponseDataReportStatusEnumTypeTransformer() => _instance ??= const GetMMMReportResponseDataReportStatusEnumTypeTransformer._();

  const GetMMMReportResponseDataReportStatusEnumTypeTransformer._();

  String encode(GetMMMReportResponseDataReportStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a GetMMMReportResponseDataReportStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GetMMMReportResponseDataReportStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DOES_NOT_EXIST': return GetMMMReportResponseDataReportStatusEnum.DOES_NOT_EXIST;
        case r'FINISHED': return GetMMMReportResponseDataReportStatusEnum.FINISHED;
        case r'IN_PROGRESS': return GetMMMReportResponseDataReportStatusEnum.IN_PROGRESS;
        case r'EXPIRED': return GetMMMReportResponseDataReportStatusEnum.EXPIRED;
        case r'FAILED': return GetMMMReportResponseDataReportStatusEnum.FAILED;
        case r'CANCELLED': return GetMMMReportResponseDataReportStatusEnum.CANCELLED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [GetMMMReportResponseDataReportStatusEnumTypeTransformer] instance.
  static GetMMMReportResponseDataReportStatusEnumTypeTransformer? _instance;
}


