//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteAssetsSummaryAdAccountsInner {
  /// Returns a new [InviteAssetsSummaryAdAccountsInner] instance.
  InviteAssetsSummaryAdAccountsInner({
    this.id,
    this.permissions = const [],
  });

  /// Unique identifier of a business ad account.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Permission levels member or partner has on an asset.
  List<String> permissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteAssetsSummaryAdAccountsInner &&
    other.id == id &&
    _deepEquality.equals(other.permissions, permissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (permissions.hashCode);

  @override
  String toString() => 'InviteAssetsSummaryAdAccountsInner[id=$id, permissions=$permissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'permissions'] = this.permissions;
    return json;
  }

  /// Returns a new [InviteAssetsSummaryAdAccountsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteAssetsSummaryAdAccountsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteAssetsSummaryAdAccountsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteAssetsSummaryAdAccountsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteAssetsSummaryAdAccountsInner(
        id: mapValueOfType<String>(json, r'id'),
        permissions: json[r'permissions'] is Iterable
            ? (json[r'permissions'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<InviteAssetsSummaryAdAccountsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteAssetsSummaryAdAccountsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteAssetsSummaryAdAccountsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteAssetsSummaryAdAccountsInner> mapFromJson(dynamic json) {
    final map = <String, InviteAssetsSummaryAdAccountsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteAssetsSummaryAdAccountsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteAssetsSummaryAdAccountsInner-objects as value to a dart map
  static Map<String, List<InviteAssetsSummaryAdAccountsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteAssetsSummaryAdAccountsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteAssetsSummaryAdAccountsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

