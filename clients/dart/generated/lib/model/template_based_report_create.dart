//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TemplateBasedReportCreate {
  /// Returns a new [TemplateBasedReportCreate] instance.
  TemplateBasedReportCreate({
    this.message,
    required this.reportStatus,
    this.token,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  BulkReportingJobStatus reportStatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? token;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TemplateBasedReportCreate &&
    other.message == message &&
    other.reportStatus == reportStatus &&
    other.token == token;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (message == null ? 0 : message!.hashCode) +
    (reportStatus.hashCode) +
    (token == null ? 0 : token!.hashCode);

  @override
  String toString() => 'TemplateBasedReportCreate[message=$message, reportStatus=$reportStatus, token=$token]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
      json[r'report_status'] = this.reportStatus;
    if (this.token != null) {
      json[r'token'] = this.token;
    } else {
      json[r'token'] = null;
    }
    return json;
  }

  /// Returns a new [TemplateBasedReportCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TemplateBasedReportCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'report_status'), 'Required key "TemplateBasedReportCreate[report_status]" is missing from JSON.');
        assert(json[r'report_status'] != null, 'Required key "TemplateBasedReportCreate[report_status]" has a null value in JSON.');
        return true;
      }());

      return TemplateBasedReportCreate(
        message: mapValueOfType<String>(json, r'message'),
        reportStatus: BulkReportingJobStatus.fromJson(json[r'report_status'])!,
        token: mapValueOfType<String>(json, r'token'),
      );
    }
    return null;
  }

  static List<TemplateBasedReportCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateBasedReportCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateBasedReportCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TemplateBasedReportCreate> mapFromJson(dynamic json) {
    final map = <String, TemplateBasedReportCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TemplateBasedReportCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TemplateBasedReportCreate-objects as value to a dart map
  static Map<String, List<TemplateBasedReportCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TemplateBasedReportCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TemplateBasedReportCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'report_status',
  };
}

