//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerList {
  /// Returns a new [CustomerList] instance.
  CustomerList({
    this.adAccountId,
    this.createdTime,
    this.exceptions,
    required this.id,
    this.isNca,
    required this.name,
    this.numBatches,
    this.numRemovedUserRecords,
    this.numUploadedUserRecords,
    this.status,
    this.type,
    this.updatedTime,
  });

  /// Associated ad account ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Creation time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? createdTime;

  /// Customer list errors.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? exceptions;

  /// Customer list ID.
  String id;

  /// Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isNca;

  /// Customer list name.
  String name;

  /// Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? numBatches;

  /// Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? numRemovedUserRecords;

  /// Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? numUploadedUserRecords;

  /// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CustomerListStatus? status;

  /// Always `customerlist`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  /// Last update time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerList &&
    other.adAccountId == adAccountId &&
    other.createdTime == createdTime &&
    other.exceptions == exceptions &&
    other.id == id &&
    other.isNca == isNca &&
    other.name == name &&
    other.numBatches == numBatches &&
    other.numRemovedUserRecords == numRemovedUserRecords &&
    other.numUploadedUserRecords == numUploadedUserRecords &&
    other.status == status &&
    other.type == type &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (exceptions == null ? 0 : exceptions!.hashCode) +
    (id.hashCode) +
    (isNca == null ? 0 : isNca!.hashCode) +
    (name.hashCode) +
    (numBatches == null ? 0 : numBatches!.hashCode) +
    (numRemovedUserRecords == null ? 0 : numRemovedUserRecords!.hashCode) +
    (numUploadedUserRecords == null ? 0 : numUploadedUserRecords!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'CustomerList[adAccountId=$adAccountId, createdTime=$createdTime, exceptions=$exceptions, id=$id, isNca=$isNca, name=$name, numBatches=$numBatches, numRemovedUserRecords=$numRemovedUserRecords, numUploadedUserRecords=$numUploadedUserRecords, status=$status, type=$type, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.exceptions != null) {
      json[r'exceptions'] = this.exceptions;
    } else {
      json[r'exceptions'] = null;
    }
      json[r'id'] = this.id;
    if (this.isNca != null) {
      json[r'is_nca'] = this.isNca;
    } else {
      json[r'is_nca'] = null;
    }
      json[r'name'] = this.name;
    if (this.numBatches != null) {
      json[r'num_batches'] = this.numBatches;
    } else {
      json[r'num_batches'] = null;
    }
    if (this.numRemovedUserRecords != null) {
      json[r'num_removed_user_records'] = this.numRemovedUserRecords;
    } else {
      json[r'num_removed_user_records'] = null;
    }
    if (this.numUploadedUserRecords != null) {
      json[r'num_uploaded_user_records'] = this.numUploadedUserRecords;
    } else {
      json[r'num_uploaded_user_records'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [CustomerList] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerList? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "CustomerList[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "CustomerList[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CustomerList[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CustomerList[name]" has a null value in JSON.');
        return true;
      }());

      return CustomerList(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        createdTime: num.parse('${json[r'created_time']}'),
        exceptions: mapValueOfType<Object>(json, r'exceptions'),
        id: mapValueOfType<String>(json, r'id')!,
        isNca: mapValueOfType<bool>(json, r'is_nca'),
        name: mapValueOfType<String>(json, r'name')!,
        numBatches: num.parse('${json[r'num_batches']}'),
        numRemovedUserRecords: num.parse('${json[r'num_removed_user_records']}'),
        numUploadedUserRecords: num.parse('${json[r'num_uploaded_user_records']}'),
        status: CustomerListStatus.fromJson(json[r'status']),
        type: mapValueOfType<String>(json, r'type'),
        updatedTime: num.parse('${json[r'updated_time']}'),
      );
    }
    return null;
  }

  static List<CustomerList> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerList>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerList.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerList> mapFromJson(dynamic json) {
    final map = <String, CustomerList>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerList.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerList-objects as value to a dart map
  static Map<String, List<CustomerList>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerList>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerList.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
  };
}

