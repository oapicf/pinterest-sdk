//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkUpsertStatusResponse {
  /// Returns a new [BulkUpsertStatusResponse] instance.
  BulkUpsertStatusResponse({
    this.resultUrl,
    this.status,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? resultUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BulkUpsertStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BulkUpsertStatusResponse &&
    other.resultUrl == resultUrl &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (resultUrl == null ? 0 : resultUrl!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'BulkUpsertStatusResponse[resultUrl=$resultUrl, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.resultUrl != null) {
      json[r'result_url'] = this.resultUrl;
    } else {
      json[r'result_url'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [BulkUpsertStatusResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkUpsertStatusResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BulkUpsertStatusResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BulkUpsertStatusResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BulkUpsertStatusResponse(
        resultUrl: mapValueOfType<String>(json, r'result_url'),
        status: BulkUpsertStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<BulkUpsertStatusResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkUpsertStatusResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkUpsertStatusResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkUpsertStatusResponse> mapFromJson(dynamic json) {
    final map = <String, BulkUpsertStatusResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkUpsertStatusResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkUpsertStatusResponse-objects as value to a dart map
  static Map<String, List<BulkUpsertStatusResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkUpsertStatusResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkUpsertStatusResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

