//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeletedMembersResponse {
  /// Returns a new [DeletedMembersResponse] instance.
  DeletedMembersResponse({
    this.deletedMembers = const [],
  });

  /// List of members whose business membership have been terminated.
  List<String> deletedMembers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeletedMembersResponse &&
    _deepEquality.equals(other.deletedMembers, deletedMembers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deletedMembers.hashCode);

  @override
  String toString() => 'DeletedMembersResponse[deletedMembers=$deletedMembers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'deleted_members'] = this.deletedMembers;
    return json;
  }

  /// Returns a new [DeletedMembersResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeletedMembersResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeletedMembersResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeletedMembersResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeletedMembersResponse(
        deletedMembers: json[r'deleted_members'] is Iterable
            ? (json[r'deleted_members'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<DeletedMembersResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletedMembersResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletedMembersResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeletedMembersResponse> mapFromJson(dynamic json) {
    final map = <String, DeletedMembersResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeletedMembersResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeletedMembersResponse-objects as value to a dart map
  static Map<String, List<DeletedMembersResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeletedMembersResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeletedMembersResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

