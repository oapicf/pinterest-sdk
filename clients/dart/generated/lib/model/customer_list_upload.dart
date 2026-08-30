//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListUpload {
  /// Returns a new [CustomerListUpload] instance.
  CustomerListUpload({
    required this.adAccountId,
    required this.creationTime,
    required this.customerListId,
    this.errorCounts = const [],
    required this.id,
    required this.operation,
    this.recordCounts,
    required this.state,
    required this.updatedTime,
  });

  /// Advertiser ID.
  String adAccountId;

  /// Customer List Upload creation_time. Epoch (seconds).
  int creationTime;

  /// ID of the customer list associated with this upload.
  String customerListId;

  /// Error counts by error code
  List<ErrorDetail>? errorCounts;

  /// Customer List Upload ID.
  String id;

  UserListOperationType operation;

  /// Record processing counts
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RecordCounts? recordCounts;

  WorkloadState state;

  /// Customer List Upload updated_time. Epoch (seconds).
  int updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerListUpload &&
    other.adAccountId == adAccountId &&
    other.creationTime == creationTime &&
    other.customerListId == customerListId &&
    _deepEquality.equals(other.errorCounts, errorCounts) &&
    other.id == id &&
    other.operation == operation &&
    other.recordCounts == recordCounts &&
    other.state == state &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId.hashCode) +
    (creationTime.hashCode) +
    (customerListId.hashCode) +
    (errorCounts == null ? 0 : errorCounts!.hashCode) +
    (id.hashCode) +
    (operation.hashCode) +
    (recordCounts == null ? 0 : recordCounts!.hashCode) +
    (state.hashCode) +
    (updatedTime.hashCode);

  @override
  String toString() => 'CustomerListUpload[adAccountId=$adAccountId, creationTime=$creationTime, customerListId=$customerListId, errorCounts=$errorCounts, id=$id, operation=$operation, recordCounts=$recordCounts, state=$state, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_account_id'] = this.adAccountId;
      json[r'creation_time'] = this.creationTime;
      json[r'customer_list_id'] = this.customerListId;
    if (this.errorCounts != null) {
      json[r'error_counts'] = this.errorCounts;
    } else {
      json[r'error_counts'] = null;
    }
      json[r'id'] = this.id;
      json[r'operation'] = this.operation;
    if (this.recordCounts != null) {
      json[r'record_counts'] = this.recordCounts;
    } else {
      json[r'record_counts'] = null;
    }
      json[r'state'] = this.state;
      json[r'updated_time'] = this.updatedTime;
    return json;
  }

  /// Returns a new [CustomerListUpload] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListUpload? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_account_id'), 'Required key "CustomerListUpload[ad_account_id]" is missing from JSON.');
        assert(json[r'ad_account_id'] != null, 'Required key "CustomerListUpload[ad_account_id]" has a null value in JSON.');
        assert(json.containsKey(r'creation_time'), 'Required key "CustomerListUpload[creation_time]" is missing from JSON.');
        assert(json[r'creation_time'] != null, 'Required key "CustomerListUpload[creation_time]" has a null value in JSON.');
        assert(json.containsKey(r'customer_list_id'), 'Required key "CustomerListUpload[customer_list_id]" is missing from JSON.');
        assert(json[r'customer_list_id'] != null, 'Required key "CustomerListUpload[customer_list_id]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "CustomerListUpload[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "CustomerListUpload[id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CustomerListUpload[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CustomerListUpload[operation]" has a null value in JSON.');
        assert(json.containsKey(r'state'), 'Required key "CustomerListUpload[state]" is missing from JSON.');
        assert(json[r'state'] != null, 'Required key "CustomerListUpload[state]" has a null value in JSON.');
        assert(json.containsKey(r'updated_time'), 'Required key "CustomerListUpload[updated_time]" is missing from JSON.');
        assert(json[r'updated_time'] != null, 'Required key "CustomerListUpload[updated_time]" has a null value in JSON.');
        return true;
      }());

      return CustomerListUpload(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id')!,
        creationTime: mapValueOfType<int>(json, r'creation_time')!,
        customerListId: mapValueOfType<String>(json, r'customer_list_id')!,
        errorCounts: ErrorDetail.listFromJson(json[r'error_counts']),
        id: mapValueOfType<String>(json, r'id')!,
        operation: UserListOperationType.fromJson(json[r'operation'])!,
        recordCounts: RecordCounts.fromJson(json[r'record_counts']),
        state: WorkloadState.fromJson(json[r'state'])!,
        updatedTime: mapValueOfType<int>(json, r'updated_time')!,
      );
    }
    return null;
  }

  static List<CustomerListUpload> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListUpload>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListUpload.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListUpload> mapFromJson(dynamic json) {
    final map = <String, CustomerListUpload>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListUpload.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListUpload-objects as value to a dart map
  static Map<String, List<CustomerListUpload>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListUpload>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListUpload.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_account_id',
    'creation_time',
    'customer_list_id',
    'id',
    'operation',
    'state',
    'updated_time',
  };
}

