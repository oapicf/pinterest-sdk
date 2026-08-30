//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListUpdateWithRequiredBody {
  /// Returns a new [CustomerListUpdateWithRequiredBody] instance.
  CustomerListUpdateWithRequiredBody({
    required this.operationType,
    this.records,
    this.recordsV2 = const [],
  });

  /// Customer list update operation type (add or remove). Only valid in update request body.
  UserListOperationType operationType;

  /// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? records;

  /// Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
  List<CustomerListRecordRow> recordsV2;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerListUpdateWithRequiredBody &&
    other.operationType == operationType &&
    other.records == records &&
    _deepEquality.equals(other.recordsV2, recordsV2);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (operationType.hashCode) +
    (records == null ? 0 : records!.hashCode) +
    (recordsV2.hashCode);

  @override
  String toString() => 'CustomerListUpdateWithRequiredBody[operationType=$operationType, records=$records, recordsV2=$recordsV2]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'operation_type'] = this.operationType;
    if (this.records != null) {
      json[r'records'] = this.records;
    } else {
      json[r'records'] = null;
    }
      json[r'records_v2'] = this.recordsV2;
    return json;
  }

  /// Returns a new [CustomerListUpdateWithRequiredBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListUpdateWithRequiredBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'operation_type'), 'Required key "CustomerListUpdateWithRequiredBody[operation_type]" is missing from JSON.');
        assert(json[r'operation_type'] != null, 'Required key "CustomerListUpdateWithRequiredBody[operation_type]" has a null value in JSON.');
        return true;
      }());

      return CustomerListUpdateWithRequiredBody(
        operationType: UserListOperationType.fromJson(json[r'operation_type'])!,
        records: mapValueOfType<String>(json, r'records'),
        recordsV2: CustomerListRecordRow.listFromJson(json[r'records_v2']),
      );
    }
    return null;
  }

  static List<CustomerListUpdateWithRequiredBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListUpdateWithRequiredBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListUpdateWithRequiredBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListUpdateWithRequiredBody> mapFromJson(dynamic json) {
    final map = <String, CustomerListUpdateWithRequiredBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListUpdateWithRequiredBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListUpdateWithRequiredBody-objects as value to a dart map
  static Map<String, List<CustomerListUpdateWithRequiredBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListUpdateWithRequiredBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListUpdateWithRequiredBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'operation_type',
  };
}

