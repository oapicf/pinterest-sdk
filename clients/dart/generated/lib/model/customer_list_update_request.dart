//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListUpdateRequest {
  /// Returns a new [CustomerListUpdateRequest] instance.
  CustomerListUpdateRequest({
    required this.operationType,
    required this.records,
  });

  UserListOperationType operationType;

  /// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  String records;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerListUpdateRequest &&
    other.operationType == operationType &&
    other.records == records;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (operationType.hashCode) +
    (records.hashCode);

  @override
  String toString() => 'CustomerListUpdateRequest[operationType=$operationType, records=$records]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'operation_type'] = this.operationType;
      json[r'records'] = this.records;
    return json;
  }

  /// Returns a new [CustomerListUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CustomerListUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CustomerListUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CustomerListUpdateRequest(
        operationType: UserListOperationType.fromJson(json[r'operation_type'])!,
        records: mapValueOfType<String>(json, r'records')!,
      );
    }
    return null;
  }

  static List<CustomerListUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, CustomerListUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListUpdateRequest-objects as value to a dart map
  static Map<String, List<CustomerListUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'operation_type',
    'records',
  };
}

