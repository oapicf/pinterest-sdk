//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeletePartnerAssetAccessBody {
  /// Returns a new [DeletePartnerAssetAccessBody] instance.
  DeletePartnerAssetAccessBody({
    this.accesses = const [],
  });

  List<DeletePartnerAssetAccessBodyAccessesInner> accesses;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeletePartnerAssetAccessBody &&
    _deepEquality.equals(other.accesses, accesses);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accesses.hashCode);

  @override
  String toString() => 'DeletePartnerAssetAccessBody[accesses=$accesses]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'accesses'] = this.accesses;
    return json;
  }

  /// Returns a new [DeletePartnerAssetAccessBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeletePartnerAssetAccessBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeletePartnerAssetAccessBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeletePartnerAssetAccessBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeletePartnerAssetAccessBody(
        accesses: DeletePartnerAssetAccessBodyAccessesInner.listFromJson(json[r'accesses']),
      );
    }
    return null;
  }

  static List<DeletePartnerAssetAccessBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePartnerAssetAccessBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePartnerAssetAccessBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeletePartnerAssetAccessBody> mapFromJson(dynamic json) {
    final map = <String, DeletePartnerAssetAccessBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeletePartnerAssetAccessBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeletePartnerAssetAccessBody-objects as value to a dart map
  static Map<String, List<DeletePartnerAssetAccessBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeletePartnerAssetAccessBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeletePartnerAssetAccessBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'accesses',
  };
}

