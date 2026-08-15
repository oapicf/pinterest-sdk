//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkUpsertRequest {
  /// Returns a new [BulkUpsertRequest] instance.
  BulkUpsertRequest({
    this.create,
    this.update,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BulkUpsertRequestCreate? create;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BulkUpsertRequestUpdate? update;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BulkUpsertRequest &&
    other.create == create &&
    other.update == update;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (create == null ? 0 : create!.hashCode) +
    (update == null ? 0 : update!.hashCode);

  @override
  String toString() => 'BulkUpsertRequest[create=$create, update=$update]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.create != null) {
      json[r'create'] = this.create;
    } else {
      json[r'create'] = null;
    }
    if (this.update != null) {
      json[r'update'] = this.update;
    } else {
      json[r'update'] = null;
    }
    return json;
  }

  /// Returns a new [BulkUpsertRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkUpsertRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BulkUpsertRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BulkUpsertRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BulkUpsertRequest(
        create: BulkUpsertRequestCreate.fromJson(json[r'create']),
        update: BulkUpsertRequestUpdate.fromJson(json[r'update']),
      );
    }
    return null;
  }

  static List<BulkUpsertRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkUpsertRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkUpsertRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkUpsertRequest> mapFromJson(dynamic json) {
    final map = <String, BulkUpsertRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkUpsertRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkUpsertRequest-objects as value to a dart map
  static Map<String, List<BulkUpsertRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkUpsertRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkUpsertRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

