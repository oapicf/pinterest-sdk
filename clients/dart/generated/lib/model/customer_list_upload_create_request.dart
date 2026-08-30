//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListUploadCreateRequest {
  /// Returns a new [CustomerListUploadCreateRequest] instance.
  CustomerListUploadCreateRequest({
    required this.operation,
    required this.totalParts,
  });

  UserListOperationType operation;

  /// Number of parts to upload the file in.
  ///
  /// Minimum value: 1
  /// Maximum value: 10
  int totalParts;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerListUploadCreateRequest &&
    other.operation == operation &&
    other.totalParts == totalParts;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (operation.hashCode) +
    (totalParts.hashCode);

  @override
  String toString() => 'CustomerListUploadCreateRequest[operation=$operation, totalParts=$totalParts]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'operation'] = this.operation;
      json[r'total_parts'] = this.totalParts;
    return json;
  }

  /// Returns a new [CustomerListUploadCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListUploadCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'operation'), 'Required key "CustomerListUploadCreateRequest[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CustomerListUploadCreateRequest[operation]" has a null value in JSON.');
        assert(json.containsKey(r'total_parts'), 'Required key "CustomerListUploadCreateRequest[total_parts]" is missing from JSON.');
        assert(json[r'total_parts'] != null, 'Required key "CustomerListUploadCreateRequest[total_parts]" has a null value in JSON.');
        return true;
      }());

      return CustomerListUploadCreateRequest(
        operation: UserListOperationType.fromJson(json[r'operation'])!,
        totalParts: mapValueOfType<int>(json, r'total_parts')!,
      );
    }
    return null;
  }

  static List<CustomerListUploadCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListUploadCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListUploadCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListUploadCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CustomerListUploadCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListUploadCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListUploadCreateRequest-objects as value to a dart map
  static Map<String, List<CustomerListUploadCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListUploadCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListUploadCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'operation',
    'total_parts',
  };
}

