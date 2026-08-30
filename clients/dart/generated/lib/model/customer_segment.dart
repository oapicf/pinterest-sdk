//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerSegment {
  /// Returns a new [CustomerSegment] instance.
  CustomerSegment({
    this.adAccountId,
    this.audienceIds = const [],
    this.createdTime,
    this.id,
    required this.name,
    this.status,
    this.updatedTime,
  });

  /// The ID of the ad account that this customer segment belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Audience IDs included in the customer segment.
  List<String> audienceIds;

  /// Customer segment created time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// Customer segment ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Customer segment name.
  String name;

  /// Indicates whether the customer segment is active or deleted.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingTemplateStatus? status;

  /// Customer segment updated time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerSegment &&
    other.adAccountId == adAccountId &&
    _deepEquality.equals(other.audienceIds, audienceIds) &&
    other.createdTime == createdTime &&
    other.id == id &&
    other.name == name &&
    other.status == status &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (audienceIds.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (name.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'CustomerSegment[adAccountId=$adAccountId, audienceIds=$audienceIds, createdTime=$createdTime, id=$id, name=$name, status=$status, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
      json[r'audience_ids'] = this.audienceIds;
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'name'] = this.name;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [CustomerSegment] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerSegment? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'audience_ids'), 'Required key "CustomerSegment[audience_ids]" is missing from JSON.');
        assert(json[r'audience_ids'] != null, 'Required key "CustomerSegment[audience_ids]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CustomerSegment[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CustomerSegment[name]" has a null value in JSON.');
        return true;
      }());

      return CustomerSegment(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        audienceIds: json[r'audience_ids'] is Iterable
            ? (json[r'audience_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        createdTime: mapValueOfType<int>(json, r'created_time'),
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name')!,
        status: TargetingTemplateStatus.fromJson(json[r'status']),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<CustomerSegment> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerSegment>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerSegment.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerSegment> mapFromJson(dynamic json) {
    final map = <String, CustomerSegment>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerSegment.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerSegment-objects as value to a dart map
  static Map<String, List<CustomerSegment>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerSegment>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerSegment.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'audience_ids',
    'name',
  };
}

