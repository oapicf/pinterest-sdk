//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkJobData {
  /// Returns a new [BulkJobData] instance.
  BulkJobData({
    this.resultUrl,
    required this.status,
    this.workloadId,
  });

  /// Presigned s3 file url for the bulk request result.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? resultUrl;

  BulkRequestStatus status;

  /// Bulk Workload Id.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? workloadId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BulkJobData &&
    other.resultUrl == resultUrl &&
    other.status == status &&
    other.workloadId == workloadId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (resultUrl == null ? 0 : resultUrl!.hashCode) +
    (status.hashCode) +
    (workloadId == null ? 0 : workloadId!.hashCode);

  @override
  String toString() => 'BulkJobData[resultUrl=$resultUrl, status=$status, workloadId=$workloadId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.resultUrl != null) {
      json[r'result_url'] = this.resultUrl;
    } else {
      json[r'result_url'] = null;
    }
      json[r'status'] = this.status;
    if (this.workloadId != null) {
      json[r'workload_id'] = this.workloadId;
    } else {
      json[r'workload_id'] = null;
    }
    return json;
  }

  /// Returns a new [BulkJobData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkJobData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'status'), 'Required key "BulkJobData[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "BulkJobData[status]" has a null value in JSON.');
        return true;
      }());

      return BulkJobData(
        resultUrl: mapValueOfType<String>(json, r'result_url'),
        status: BulkRequestStatus.fromJson(json[r'status'])!,
        workloadId: mapValueOfType<int>(json, r'workload_id'),
      );
    }
    return null;
  }

  static List<BulkJobData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkJobData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkJobData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkJobData> mapFromJson(dynamic json) {
    final map = <String, BulkJobData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkJobData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkJobData-objects as value to a dart map
  static Map<String, List<BulkJobData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkJobData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkJobData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'status',
  };
}

