//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListCreate {
  /// Returns a new [CustomerListCreate] instance.
  CustomerListCreate({
    this.isNca,
    this.listType = UserListType.EMAIL,
    required this.name,
    this.records,
    this.recordsV2 = const [],
  });

  /// Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isNca;

  /// Type of customer list (e.g., EMAIL, IDFA, MAID).
  UserListType listType;

  /// Customer list name.
  String name;

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
  bool operator ==(Object other) => identical(this, other) || other is CustomerListCreate &&
    other.isNca == isNca &&
    other.listType == listType &&
    other.name == name &&
    other.records == records &&
    _deepEquality.equals(other.recordsV2, recordsV2);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isNca == null ? 0 : isNca!.hashCode) +
    (listType.hashCode) +
    (name.hashCode) +
    (records == null ? 0 : records!.hashCode) +
    (recordsV2.hashCode);

  @override
  String toString() => 'CustomerListCreate[isNca=$isNca, listType=$listType, name=$name, records=$records, recordsV2=$recordsV2]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.isNca != null) {
      json[r'is_nca'] = this.isNca;
    } else {
      json[r'is_nca'] = null;
    }
      json[r'list_type'] = this.listType;
      json[r'name'] = this.name;
    if (this.records != null) {
      json[r'records'] = this.records;
    } else {
      json[r'records'] = null;
    }
      json[r'records_v2'] = this.recordsV2;
    return json;
  }

  /// Returns a new [CustomerListCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "CustomerListCreate[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CustomerListCreate[name]" has a null value in JSON.');
        return true;
      }());

      return CustomerListCreate(
        isNca: mapValueOfType<bool>(json, r'is_nca'),
        listType: UserListType.fromJson(json[r'list_type']) ?? UserListType.EMAIL,
        name: mapValueOfType<String>(json, r'name')!,
        records: mapValueOfType<String>(json, r'records'),
        recordsV2: CustomerListRecordRow.listFromJson(json[r'records_v2']),
      );
    }
    return null;
  }

  static List<CustomerListCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListCreate> mapFromJson(dynamic json) {
    final map = <String, CustomerListCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListCreate-objects as value to a dart map
  static Map<String, List<CustomerListCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

