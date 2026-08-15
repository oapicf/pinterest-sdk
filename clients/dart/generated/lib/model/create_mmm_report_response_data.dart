//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateMMMReportResponseData {
  /// Returns a new [CreateMMMReportResponseData] instance.
  CreateMMMReportResponseData({
    this.message,
    this.reportStatus,
    this.status,
    this.token,
  });

  String? message;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BulkReportingJobStatus? reportStatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? token;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateMMMReportResponseData &&
    other.message == message &&
    other.reportStatus == reportStatus &&
    other.status == status &&
    other.token == token;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (message == null ? 0 : message!.hashCode) +
    (reportStatus == null ? 0 : reportStatus!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (token == null ? 0 : token!.hashCode);

  @override
  String toString() => 'CreateMMMReportResponseData[message=$message, reportStatus=$reportStatus, status=$status, token=$token]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    if (this.reportStatus != null) {
      json[r'report_status'] = this.reportStatus;
    } else {
      json[r'report_status'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.token != null) {
      json[r'token'] = this.token;
    } else {
      json[r'token'] = null;
    }
    return json;
  }

  /// Returns a new [CreateMMMReportResponseData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateMMMReportResponseData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateMMMReportResponseData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateMMMReportResponseData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateMMMReportResponseData(
        message: mapValueOfType<String>(json, r'message'),
        reportStatus: BulkReportingJobStatus.fromJson(json[r'report_status']),
        status: mapValueOfType<String>(json, r'status'),
        token: mapValueOfType<String>(json, r'token'),
      );
    }
    return null;
  }

  static List<CreateMMMReportResponseData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateMMMReportResponseData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateMMMReportResponseData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateMMMReportResponseData> mapFromJson(dynamic json) {
    final map = <String, CreateMMMReportResponseData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateMMMReportResponseData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateMMMReportResponseData-objects as value to a dart map
  static Map<String, List<CreateMMMReportResponseData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateMMMReportResponseData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateMMMReportResponseData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

