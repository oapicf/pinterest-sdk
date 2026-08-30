//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsAnalyticsGetAsyncResponse {
  /// Returns a new [AdsAnalyticsGetAsyncResponse] instance.
  AdsAnalyticsGetAsyncResponse({
    this.reportStatus,
    this.size,
    this.url,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BulkReportingJobStatus? reportStatus;

  num? size;

  String? url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsAnalyticsGetAsyncResponse &&
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
  String toString() => 'AdsAnalyticsGetAsyncResponse[reportStatus=$reportStatus, size=$size, url=$url]';

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

  /// Returns a new [AdsAnalyticsGetAsyncResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsAnalyticsGetAsyncResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdsAnalyticsGetAsyncResponse(
        reportStatus: BulkReportingJobStatus.fromJson(json[r'report_status']),
        size: json[r'size'] == null
            ? null
            : num.parse('${json[r'size']}'),
        url: mapValueOfType<String>(json, r'url'),
      );
    }
    return null;
  }

  static List<AdsAnalyticsGetAsyncResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsGetAsyncResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsGetAsyncResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsAnalyticsGetAsyncResponse> mapFromJson(dynamic json) {
    final map = <String, AdsAnalyticsGetAsyncResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsAnalyticsGetAsyncResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsAnalyticsGetAsyncResponse-objects as value to a dart map
  static Map<String, List<AdsAnalyticsGetAsyncResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsAnalyticsGetAsyncResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsAnalyticsGetAsyncResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

