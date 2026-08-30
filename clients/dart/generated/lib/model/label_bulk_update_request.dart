//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabelBulkUpdateRequest {
  /// Returns a new [LabelBulkUpdateRequest] instance.
  LabelBulkUpdateRequest({
    required this.id,
    required this.parentId,
    required this.status,
  });

  /// Label ID.
  String id;

  /// Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  String parentId;

  LabelStatusBulkUpdate status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabelBulkUpdateRequest &&
    other.id == id &&
    other.parentId == parentId &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (parentId.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'LabelBulkUpdateRequest[id=$id, parentId=$parentId, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'parent_id'] = this.parentId;
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [LabelBulkUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabelBulkUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "LabelBulkUpdateRequest[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "LabelBulkUpdateRequest[id]" has a null value in JSON.');
        assert(json.containsKey(r'parent_id'), 'Required key "LabelBulkUpdateRequest[parent_id]" is missing from JSON.');
        assert(json[r'parent_id'] != null, 'Required key "LabelBulkUpdateRequest[parent_id]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "LabelBulkUpdateRequest[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "LabelBulkUpdateRequest[status]" has a null value in JSON.');
        return true;
      }());

      return LabelBulkUpdateRequest(
        id: mapValueOfType<String>(json, r'id')!,
        parentId: mapValueOfType<String>(json, r'parent_id')!,
        status: LabelStatusBulkUpdate.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<LabelBulkUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelBulkUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelBulkUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabelBulkUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, LabelBulkUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabelBulkUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabelBulkUpdateRequest-objects as value to a dart map
  static Map<String, List<LabelBulkUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabelBulkUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabelBulkUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'parent_id',
    'status',
  };
}

